package programmers;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class Multilevel {
	public static void main(String[] args) {
		Solution solution = new Solution();
		String[] enroll = {"john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"};
		String[] referral = {"-", "-", "mary", "edward", "mary", "mary", "jaimie", "sam"};
		String[] seller = {"young", "young", "tod", "emily", "mary"};
		int[] amount = {15, 15, 2, 5, 10};
		int[] result = solution.solution(enroll, referral, seller, amount);
		int[] answer = {0,949,28,270,450,18,180,2700};
		System.out.println(Arrays.toString(result));
		System.out.println(Arrays.equals(result, answer));
	}
}

class Solution {
    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        int[] answer = new int[enroll.length];
        
        Map<String, Node> tree = new HashMap<>();
        for(int i=0;i<enroll.length;i++) {
        	tree.put(enroll[i],new Node(referral[i],0));
        } // Map으로 모든직원의 이름, 수익은 0으로 초기화
        for(int i=0; i<seller.length; i++) {
        	String refer = ""; //상사
        	String subordinate = seller[i]; // 부하직원
        	int profit = 100*amount[i]; // 초기수익
  
    		while(true) { 
    			int commision = (int) Math.floor(profit*0.1);
				if(commision==0) { // 수수료가 없을 경우 안내도 됨
//    				tree.put(subordinate, tree.get(subordinate)+profit);
					tree.get(subordinate).setProfit(tree.get(subordinate).getProfit()+profit);
					break;
				} else if(tree.get(subordinate).getRefer().equals("-")) { // 상사가 회장일 경우 돈을 지불하고 반복문 끝내기
//    				tree.put(subordinate, tree.get(subordinate)+profit-commision); 
					tree.get(subordinate).setProfit(tree.get(subordinate).getProfit()+profit-commision);
					break;    					
				} else {
//    				tree.put(subordinate, tree.get(subordinate)+profit-commision); // 부하직원이 가지고 있던 돈에 이번 수익에서 수수료를 뺀 금액을 더함
					tree.get(subordinate).setProfit(tree.get(subordinate).getProfit()+profit-commision);
					subordinate = tree.get(subordinate).getRefer(); // 상사가 이제 부하직원으로 됨
					profit = commision; // 상사는 수수료가 수익임
					continue;
				}
    				
    				
    			
    		}
        	
    	}
        for(int i=0;i<enroll.length;i++) {
        	answer[i] = tree.get(enroll[i]).getProfit();
        }
       
        return answer;
    }
}
class Node{
	private String refer;
	private int profit;
	public Node(String refer, int profit) {
		// TODO Auto-generated constructor stub
		this.refer = refer;
		this.profit = profit;
	}
	public void setProfit(int profit) {
		this.profit = profit;
		
	}
	public int getProfit() {
		return this.profit;
	}
	public String getRefer() {
		return this.refer;
	}
}