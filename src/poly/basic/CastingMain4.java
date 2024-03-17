package poly.basic;

public class CastingMain4 {
    public static void main(String[] args) {
        Parent parent1 = new Child();
        //Child child1 = new parent();
        Child child1 = (Child) parent1;
        child1.ChildMethod();
        //문제없음
        Parent parent2 = new Parent();
        Child child2 = (Child) parent2;
        //child2.ChildMethod(); 이것은 안되는 이유가 부모만 만들어서 차일드가 없다.

    }
}
