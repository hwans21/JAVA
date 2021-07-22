package lambda.basic;

public class Person {

	public void greeting(Say01 say) {
		say.talking();
	}
	public void greeting(Say02 say) {
		say.talking();
	}
	public void greeting(Say03 say) {
		say.talking("헬로");
		
	}
	public String greeting(Say04 say) {
		String result = say.talking("HI",3);
		return result;
	}
	
	
}
