package access.a;

public class AccessData {
    public int publicField;
    private int privateField;
    int defaultFied;
    public void publivMethod(){
        System.out.println("publicField 호출"+publicField);
    }

    void defaultMethod(){
        System.out.println("defaultFied 호출"+defaultFied);
    }

    private void privateMethod(){
        System.out.println("privateField 호출"+privateField);
    }

    public void innerAccese(){
        publicField = 100;
        defaultFied =200;
        privateField = 300;
        publivMethod();
        defaultMethod();
        privateMethod();
    }
}
