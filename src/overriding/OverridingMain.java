package overriding;

public class OverridingMain {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println("Child -> child");
        System.out.println(child.value);
        child.method();

        Parent parent = new Parent();
        System.out.println("parent -> parent");
        System.out.println(parent.value);
        parent.method();

        Parent parent1 = new Child();
        System.out.println("parent -> child");
        System.out.println(parent1.value);
        parent1.method();
    }

}
