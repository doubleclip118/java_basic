package extends1.super2;

public class ClassC extends ClassB{
    public ClassC(){
        super(10,20);
        System.out.println("classB 생성자 만듬");
    }
    public void hello(){
        System.out.println();
    }
}
