package extends_60;

import extends_60.components.AirForce;
import extends_60.components.Army;
import extends_60.components.Navy;

//오버라이딩 한 부모의 메소드 호출

public class Ex70_MilitaryClass {

  public static void main(String[] args) {
    Army army = new Army("육군");
    // army.setName("육군");
    army.attack();// Overrding 메소드 호출
    army.tank();

    System.out.println("------------------------------");

    AirForce air = new AirForce("공군");
    air.attack();
    air.bombing();

    System.out.println("------------------------------");

    Navy navy = new Navy("해군");
    navy.attack();
    navy.nucleus();
  }

}
