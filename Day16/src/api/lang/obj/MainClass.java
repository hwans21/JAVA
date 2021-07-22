package api.lang.obj;

public class MainClass {

	public static void main(String[] args) {

		/*
		 # Object클래스(최상위 부모)
		 - equals: 동일객체인지 확인
		 - hashCode: 객체의 주소값(10진수 정수)
		 - toString: 객체의 정보를 문자열로 반환(오버라이딩해서 많이 사용)
		 - clone: 객체 복사
		 - finalize: 객체가 소멸되기 직전에 실행(권장x)
		 
		 */
		Person park = new Person("박복제인간", 100);

		try {
			Person clonePerson = (Person) park.clone();
			System.out.println("복사된 객체정보: "+ clonePerson);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Person hong = new Person("홍길동", 30);
		Person kim = new Person("홍길동", 24);

//		hong.personInfo();
//		kim.personInfo();
//		
		System.out.println(hong);
		System.out.println(kim);

		System.out.println(hong.toString());
		System.out.println(kim.toString());

		if (hong.equals(kim))
			System.out.println("이름이 같습니다.");
		else
			System.out.println("이름이 다릅니다.");

		// finalize는 gc가 호출되는 순서를 보장하지 않기 때문에
		// 사용이 권장되지 않습니다.

		hong = null;
		kim = null;

		System.gc(); // 가비지 컬랙터(gc)를 호출. (부른다고 바로 안올 수도 있습니다.)

	}

}
