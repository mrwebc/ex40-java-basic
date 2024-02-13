package generic_140.generic_class10;

public class GenericPrinterTest {

	public static void main(String[] args) {
		
		//활용1. Powder 타입의 클래스와 인스턴스 생성  
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
		
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMeterial();
		System.out.println(powderPrinter);
		
		//활용2. Plastic 타입의 클래스와 인스턴스 생성 
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
		
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMeterial();
		System.out.println(plasticPrinter);

	}

}
