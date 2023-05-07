// import java.lang.Math.*;
import static java.lang.Math.*;

/* static import란?
* 일반적인 import와 달리 메소드나 변수를 패키지, 클래스명 없이 접근하도록 해준다.
*/

public class StaticImportCase {
  public static void main(String[] args) {
      //Double pi = Math.PI; 일반적인 import 시
      Double pi = PI; // static import를 한 경우에 Math.PI를 PI로 사용할 수 있다.
  }
}
