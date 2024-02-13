package generic_140.extends20;

public class GenericPrinterTest {

	public static void main(String[] args) {
		
		//활용1. 자료형을 제한한 클래스와 인스턴스 생성  
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
		
		powderPrinter.setMaterial(new Powder());
		powderPrinter.printing();
		
		
		//활용2. 자료형을 제한한 클래스와 인스턴스 생성 
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
		
		plasticPrinter.setMaterial(new Plastic());
		plasticPrinter.printing();
		

	}

}
