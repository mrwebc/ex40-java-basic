package lib_basic_api_90;

//String 객체에서 원하는 값 추출
public class Ex70_StringMethod {
  // -------------------------------------------
  // D:/photo/2014/travel/food.jpg 라는 파일이 있습니다.
  // 이 파일의 경로를 "data"라는 객체로 생성한 뒤에, 다음의 형태로 출력하시오.
  // (split() 메서드 사용 금지)
  // -------------------------------------------
  // 파일이름: food
  // 확장자: jpg
  // 폴더명: D:/photo/2014/travel
  // -------------------------------------------
    public static void main(String[] args) {
        String data = "D:/photo/2014/travel/food.jpg";
        
        // 파일이름 추출
        String name = data.substring(data.lastIndexOf("/") + 1, data.lastIndexOf("."));
        System.out.println("파일이름: " + name);
        
        // 확장자 추출
        String ext = data.substring(data.lastIndexOf(".") + 1);
        System.out.println("확장자: " + ext);
        
        // 소스파일의 폴더이름 추출
        System.out.println("폴더명: " + data.substring(0, data.lastIndexOf("/")));
    }
}

