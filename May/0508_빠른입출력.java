/*  BufferedReader, StringTokenizer, StringBuilder 에 대해 학습했다.
* => BufferedReader로 값을 받고, StringTokenizer로 한 줄에 여러 개인 문자열을 분리하고, StringBuilder에 계산한 식을 넣어준 뒤 System.out으로 한 번에 출력해주었다.
* 자세한 개념 정리는 블로그.
*/

// A+B의 결과값을 한 줄씩 출력.
// 첫째줄에 테스트케이스의 수 T가 주어진다.
// 두번째줄 부터 각 줄에 A와 B가 공백으로 구분되어 T개 주어진다.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
		public static void main(String[] args) throws IOException{
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼 객체, 그 안에 InputStreamReader 객체도 생성
				
				int T = Integer.parseInt(br.readLine()); // BufferedReader는 문자열로 받아들이므로 Int로 파싱해서 int T에 대입.
				
				StringTokenizer st; // StringTokenizer 선언
				StringBuilder sb = new StringBuilder();
				
				for (i=0; i<T; i++){
						st = new StringTokenizer(br.readLine(), " "); // BufferedReader의 메서드 readLine()은 한 줄씩 읽어오므로 StringTokenizer로 받아 공백을 기준으로 분리.
						sb.append( Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) ); //그렇게 받아준 Token 들을 int형태로 파싱까지 해주어야 한다.
						sb.append('\n');
				}
				System.out.println(sb);
		}
}
