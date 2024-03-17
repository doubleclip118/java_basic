package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        Parent poly = new Child();
        //자식기능 호출불가
        Child child = (Child)poly;
        child.ChildMethod();
    }
}
