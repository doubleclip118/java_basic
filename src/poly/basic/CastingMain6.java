package poly.basic;

public class CastingMain6 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        call(parent1);
        Parent parent2 = new Child();
        call(parent2);
    }

    private static void call(Parent parent){
        if(parent instanceof Child child){
            System.out.println("자식");
            ((Child) parent).ChildMethod();
            child.ChildMethod();
        }
        else{
            System.out.println("부모");
        }
    }
}
