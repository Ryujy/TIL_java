import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        String str;
        
        while ((str=br.readLine()) != null) {
          // while 조건문에 br.readLine을 str에 대입하지 않고 null과 비교하니 nullPointException이 발생했다.
          // 지금생각해보니 당연하다. br.readLine()은 입력을 받는 Reader일 뿐이고, 입력받은 값을 어딘가에 저장을 해주어야한다.
          // 따라서 readLine()을 통해 str에 저장된 데이터가 null일 경우를 조건문에 써주어야 한다.
            st = new StringTokenizer(str," ");
            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
            sb.append('\n');
        }
        System.out.println(sb);
        
    }
}
