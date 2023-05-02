public class CodingTest {

    public static void main(String[] args) {
        int answer = 0;
        String my_string = "aAb1B2cC34oOp";
        String[] strArr = my_string.split("[a-zA-Z]");
        for(String str: strArr){
            answer += str.isEmpty() ? 0 : Integer.parseInt(str);
        }
        System.out.println(answer);

    }

}
