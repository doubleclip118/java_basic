package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        //부모변수가 부모 인스턴스 참조
        System.out.println("부모변수가 부모 인스턴스 참조");
        Parent parent = new Parent();
        parent.ParentMethod();

        //자식변수가 자식 인스턴스 참조
        Child child = new Child();
        child.ParentMethod();
        child.ChildMethod();

        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        poly.ParentMethod();
    }
}
