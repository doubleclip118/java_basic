package extends1.super2;

public class ClassB extends ClassA{
    public ClassB(int a){
        //super(); 부모도 첫줄에 생성해야하는데 매개변수없는 기본생성자는 생략가능
        System.out.println("ClassB 생성자 a="+a);
    }
    public ClassB(int a,int b){
        super();
        System.out.println(a+"  "+b);
    }
}
