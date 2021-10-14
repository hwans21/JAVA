package programmers;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Multilevel {
	public static void main(String[] args) {
		Solution solution = new Solution();
		String[] enroll = {"john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"};
		String[] referral = {"-", "-", "mary", "edward", "mary", "mary", "jaimie", "sam"};
		String[] seller = {"young", "young", "tod", "emily", "mary"};
		int[] amount = {15, 15, 2, 5, 10};
		int[] result = solution.solution(enroll, referral, seller, amount);
		System.out.println(Arrays.toString(result)); 
	}
}

class Solution {
    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        int[] answer = new int[enroll.length];
        
        Map<String, Node> tree = new HashMap<>();
        
        // 키 : enroll
        Node[] node = new Node[enroll.length];  
        for(int i=0;i<enroll.length;i++){
            int profit = 0;
            for(int j=0;j<seller.length;j++){
                if(seller[j].equals(enroll[i])){
                    profit += amount[j]*100;
                    
                } 
            }
            node[i] = new Node();
            node[i].setNode(referral[i], profit);
            tree.put(enroll[i], node[i]);
        } // 사람들 원 수익 초기화
        
        List<String> end_list = new ArrayList<>();
        
        // 하위 노드(부하직원)이 있는지 판단 후 
        // 없으면 상사한테 10% 보내주고 탐색에서 제외
        // 탐색에서 제외된 리스트의 수가 직원수랑 같아진다면
        // 반복문 종료
        // 상사가 "-"는 제외함
        while(true){
            int rootCount = 0;
            
            for(int i=0; i<enroll.length; i++){
                if(referral[i].equals("-")) rootCount++;
            }
            if(end_list.size() == enroll.length-rootCount) break; // 최상위 직원을 제외한 직원수가 제외 리스트의 수와 같아진다면 반복문 종료
            
            for(int i=0; i<enroll.length; i++){
                if(end_list.contains(enroll[i])){
                    continue;
                } // 제외 리스트에 포함되어있다면 다음으로 넘어감
                int commision = 0;
                String refer = "";
                if((!Arrays.asList(referral).contains(enroll[i])) && !referral[i].equals("-")){ // 상사 배열에 해당 직원이 포함되어 있지 않음 && 해당상사가 최상위 노드가 아님 => 최하위 노드임
                    
                    referral[i] = ""; // 상사 배열에서 해당 값 없애기
                    commision = (int) Math.floor(tree.get(enroll[i]).getProfit()*0.1); // 수수료 확인
                    if(commision == 0){ // 수수료가 0원이면 상사에게 줄 필요없이 종료
                        end_list.add(enroll[i]);
                        continue;
                        
                    }
                    tree.get(enroll[i]).setProfit(tree.get(enroll[i]).getProfit()-commision); // 해당 직원의 수익에서 수수료 차감
                    tree.get(tree.get(enroll[i]).getReferral()).setProfit(tree.get(tree.get(enroll[i]).getReferral()).getProfit()+commision); // 해당 직원의 상사에 수익에 수수료 더함
                    
                    
                    end_list.add(enroll[i]); // 수식 끝났으니 제외리스트에 해당 직원 추가
                    
                }
            }
        }
        
        for(int i=0;i<enroll.length;i++){
            int commision = 0;
            if(tree.get(enroll[i]).getReferral().equals("-")){ // 최상위 직원 수수료 차감
                commision = (int) Math.floor(tree.get(enroll[i]).getProfit()*0.1);
                tree.get(enroll[i]).setProfit(tree.get(enroll[i]).getProfit()-commision);
            }
        } // 사장이 가지는 수익은 출력하지 않으므로 필요없음
        
        System.out.println("--------------------------------");
                
        for(int i=0;i<enroll.length;i++){
            answer[i] = tree.get(enroll[i]).getProfit();
        }
        
        return answer;
    }
}
//노드 생성문
class Node{
    // 값 : List<List>
    // List(0 : referral, 1 : amount, 2 : 이익금)
    private String referral;
    private int profit;
    public void setNode(String referral, int profit){
        this.referral = referral;
        this.profit = profit;
    }
    public void setProfit(int profit){
        this.profit = profit;
    }
    public String getReferral(){
        return this.referral;
    }
    public int getProfit(){
        return this.profit;
        
    }
}
// 6번빼고 테스트 실패 11번부터는 시간초과
// seller가 같은사람인 경우
// 만약 a 라는 사람이 15원의 이익을 두번 냈다고 치면 윗 사람한테 (1원+1원=)2원의 이익이 가야하지만
// 30원으로 합해서 계산을 하면 3원의 이익이 감
// 시간초과 :?