package static2;

public class DecoData {
    private int instantValue;
    private static int staticValue;

    public static void staticCall(){
        staticValue++;//정적변수접근
        setStaticValue();
        // instanceMethod(); 이거안됨 인스턴스벨류랑 메서드에 접근이 불가능하기때문이다.
    }

    private void instanceMethod(){
        System.out.println("instantValue = " + instantValue);
    }
    private static void setStaticValue(){
        System.out.println("staticValue = " + staticValue);
    }
    public void instanceCall(){
        instantValue++;
        instanceMethod();

    }
}
