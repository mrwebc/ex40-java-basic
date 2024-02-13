package generic_140.extends20;

//T타입의 제너릭 클래스 => 사용가능한 자료형을 제한   
public class GenericPrinter<T extends Material> {
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
	
	public void printing() {
		material.doPrinting();
	}
}

/*
	문제) 멤버변수 fruit를 갖는 T타입의 제너릭 클래스 Box를 작성하시오.
	 	 단, 사용가능한 자료형은 반드시 추상클래스 Tree를 상속받아야 한다. 
*/