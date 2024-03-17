package extends1.super1;

public class Child extends Parent{

    public String value = "child";

    @Override
    public void hello(){
        System.out.println("자식 안녕");
    }

    public void call(){
        System.out.println(this.value);
        System.out.println(super.value);

        this.hello();
        super.hello();
    }
}
