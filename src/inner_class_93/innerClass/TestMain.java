package inner_class_93.innerClass;

public class TestMain {

	public static void main(String[] args) {
		
		InnerDuly duly = new InnerDuly();
		
		duly.hoi();
		
		InnerDuly.Friends micol = duly.new Friends("마이콜"); 
		micol.hello();

	}

}
