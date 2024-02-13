package class_50;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
class Books
{
  private String subject;
  private int count;
}

public class LomBokTest {

  public static void main(String[] args) {
    
    Books kor = new Books();
    Books math = new Books();
    
    //@EqualsAndHashCode 롬복을 사용하면 
    //equals()는 필드값들을 토대로 비교해서 동일한 객체인지 판단
    System.out.println(kor.equals(math));
    

    System.out.println("kor = "+kor);
    
    //원래는 .hashCode()가 객체의 고유번호를 얻어오므로 두 객체의 hashCode 값은 무조건 일치하지 않는다.
    //equals와 hashCode의 오버라이딩 규칙 - 두 객체의 equals() 비교결과가 동등하다면 hashCode값이 일치해야 한다
    System.out.println("kor.hashCode() = "+kor.hashCode());
    
    //math.setCount(1);
    System.out.println("math = "+math);
    System.out.println("math.hashCode() = "+math.hashCode());
    
    System.out.println(kor.equals(math));//true
    

  }

}
