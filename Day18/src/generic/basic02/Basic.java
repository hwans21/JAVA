package generic.basic02;


// 멀티 제네릭(key, value)
public class Basic<K, V> {

	private K key;
	private V value;
	
	public void put(K key, V value) { // set 메서드 대용
		// TODO Auto-generated method stub
		this.key = key;
		this.value = value;
		

	}
	
	public V get(K key) {
		return value;
	}
	
	@Override
	public String toString() {
		return "{"+key+"="+value+"}";
	}
	
	
	
}
