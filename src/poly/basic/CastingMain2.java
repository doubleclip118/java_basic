package poly.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        Parent poly = new Child();
        //자식기능 호출불가
        Child child = (Child)poly;
        child.ChildMethod();

        ((Child) poly).ChildMethod();

    }
}
