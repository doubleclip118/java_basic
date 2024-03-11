package class1;

public class ClassStart1 {
    public static void main(String[] args) {
        String student1Name = "학생1" ;
        int student1Age = 15;
        int student1Grade = 90;

        String student2Name = "학생2";
        int student2Age = 20;
        int student2Grade = 80;


        // 위 코드의 문제는 학생추가시마다 계속 추가해줘야한다. 같은 데이터타입을 배열로 묶을수있다.

        String[] studentName = {"학생1","학생2"};
        int[] studentAge = {15,20};
        int[] studentGrade = {90,80};

        //데이터를 제거할때 정확히 인덱스로해서 삭제해줘야한다 3개의 배열에 따로따로 들어있기때문이다.
        //이코드는 사람이 관리하기 좋은 코드는 아니다. 학생개념을 묶어서 관리하는게 편하다.
        //이때문에 클래스를 사용한ㄷ.


    }
}
