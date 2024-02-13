package generic_140.method30;

public class CalArea {
	
	//제너릭 클래스가 아니어도 제너릭 메소드를 선언할 수 있다.
	public static <T,V> double makeRectangle(Point<T, V> p1, Point<T,V> p2) {
		double x1 = ((Number)p1.getX()).doubleValue();
		double x2 = ((Number)p2.getX()).doubleValue();
		double y1 = ((Number)p1.getY()).doubleValue();
		double y2 = ((Number)p2.getY()).doubleValue();
		
		double width = x2 - x1;
		double height = y2 - y1;
		
		return width * height;
	}

	public static void main(String[] args) {
		
		Point<Integer, Double> p1 = new Point<>(0,0.0);
		Point<Integer, Double> p2 = new Point<>(10,10.0);
		
		//double rect = CalArea.<Integer, Double>makeRectangle(p1, p2);
		double rect = CalArea.makeRectangle(p1, p2);//호출시 제너릭 기호 생략가능 
		
		System.out.printf("두 점으로 만들어진 사각형이 넓이는 %.1f 입니다.\n", rect);

	}

}
