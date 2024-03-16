package access.stack1;

public class Data1 {
    public String name;
    public int count;

    public Data1(String name) {
        this.name = name;
        count++;//몇번 생성되었는지 확인
    }
}
