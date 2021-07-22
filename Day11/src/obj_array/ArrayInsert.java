package obj_array;

import java.util.Arrays;

public class ArrayInsert {

	public static void main(String[] args) {

//		Person kim = new Person("고구마", 5, "중성");
//		Person lee = new Person("산삼", 15, "남자");
//		Person hong = new Person("홍길동", 28, "여성");
//		
//		kim.personinfo();
//		lee.personinfo();
//		hong.personinfo();
		
		
//		int[] arr = new int[5];
		
//		Person[] people = new Person[3];
//		people[0] = new Person("고구마", 5, "중성");
		
//		int[] arr = {1,2,3,4,5};
		
		Person[] people = {
				new Person("고구마", 5, "중성"),
				new Person("산삼", 15, "남자"),
				new Person("홍길동", 28, "여성")};
		
//		System.out.println(Arrays.toString());
		
//		for(int i=0; i<people.length;i++)
//			people[i].personinfo();
		
		for(Person t : people)
			t.personinfo();
		
	}
}
