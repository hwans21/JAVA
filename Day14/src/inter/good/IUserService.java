package inter.good;


/*
 - 회원관리에 대한 모든 로직을 같은 이름의 메서드를 이용하여
 일괄 처리하기 위한 인터페이스를 선언합니다.
 - 또한, 객체를 생성할 때, 인터페이스 타입 하나로
 여러가지의 객체를 상황에 맞게 교체할 수 있는 장점도 있습니다.
 
 */
public interface IUserService {
	
	void execute(); // 추상메서드 선언!
	

}