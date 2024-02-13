package generic_140.generic_class10;

//T타입의 제너릭 클래스   
public class GenericPrinter<T> {
	private T material;
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public T getMeterial() {
		return material;
	}
	
	public String toString() {
		return material.toString();
	}
}

/*
	문제) 멤버변수 fruit를 갖는 T타입의 제너릭 클래스 Box를 작성하시오. 
*/