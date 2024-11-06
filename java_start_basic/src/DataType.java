public class DataType {

    public static void main(String[] args) {
    /* 기본형(Primitive Type)과 참조형(Reference Type)
    자바의 변수 데이터 타입은 가장 크게 기본형과 참조형으로 분류됨.
    - Primitive Type : 크기가 정해져 있음. int, long, double, boolean 처럼 변수에 사용할 값을 직접 넣을 수 있는 데이터 타입
    - Reference Type : int[] 와 같이 데이터에 접근하기 위한 참조주소를 저장하는 데이터 타입. 객체나 클래스를 담을 수 있는 변수들도 모두 참조형.

    🌳 <배열은 왜 복잡하게 참조형을 사용할까?> 🌳
    - 기본형은 모두 사이즈가 명확한 반면 배열은 동적으로 사이즈 변경 가능.
    - 기본형은 선언과 동시에 크기가 정해짐. 따라서 크기를 동적으로 변경할 수 없음.
        int = 4bytes
        long = 8bytes

        float = 4bytes
        double = 8bytes

        char = 2bytes
        boolean = 1byte

    - 참조형은 사용자에 따라 변수의 값과 배열의 크기가 달라질 수 있음 (=> 동적 메모리 할당)
        int size = 1000;
        new int[size];    // 이 코드가 실행되는 시점에 배열의 크기가 정해짐.

    - 참조형은 유연하므로 더 복잡한 데이터 구조를 만들고 관리할 수 있음.
    - 기본형은 더 빠르고 메모리를 효율적으로 처리함.
    * */
    }

}
