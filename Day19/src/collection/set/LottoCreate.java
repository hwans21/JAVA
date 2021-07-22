package collection.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class LottoCreate {

	public static void main(String[] args) {
		Set<Integer> lotto = new HashSet<Integer>();
		Random r = new Random();
		
		while(true) {
			int num = r.nextInt(45)+1;
			lotto.add(num);
			if(lotto.size()==6)break;
			
		}
		System.out.println(lotto);
		
		List<Integer> list = new ArrayList<Integer>(lotto);
		Collections.sort(list);
		System.out.println(list);
	}
}
