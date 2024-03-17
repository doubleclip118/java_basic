package extends1.access.parent;

public class Parent {
    public int publicValue;
    protected int protectedValue;
    int defaultValue;
    private int pri;

    public void setPublicValue(){
        System.out.println("부모 공용");
    }

    void setDefaultValue() {

        System.out.println("부모 디폴트");
    }

    private void setPri() {
        System.out.println("부모 프라이빗");
    }
    protected void setProtectedValue(){
        System.out.println("부모 프로텍티드");
    }

    public void printParent(){
        System.out.println("==메서드안 ==");
        System.out.println("Public"+publicValue);
        System.out.println("proted"+protectedValue);
        System.out.println("default"+defaultValue);
        System.out.println("private"+pri);

        setDefaultValue();
        setPri();
    }
}
