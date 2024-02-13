package exception_110;

//RuntimeException을 상속받은 사용자정의 익셉션 만들기
import exception_110.components.Calculator10;
import exception_110.components.음수가되는예외;
import exception_110.components.천을넘는예외;

public class Ex80_ExceptionLogic {
  public static void main(String[] args) {
    
    int result = 0;
    
    //예외처리를 안하면 컴파일시 오류발생
    try {
      result = Calculator10.add(3, -4);
      System.out.printf("add : %d\n",result);
    } catch (천을넘는예외 e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (음수가되는예외 e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    result = Calculator10.sub(3, 4);
    System.out.printf("sub : %d\n",result);
    

    result = Calculator10.multi(3, 4);
    System.out.printf("multi : %d\n",result);
    

    result = Calculator10.div(3, 4);
    System.out.printf("div : %d\n",result);
  }
}
