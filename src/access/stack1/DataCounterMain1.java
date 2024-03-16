package access.stack1;

public class DataCounterMain1 {
    public static void main(String[] args) {
        Data1 data1 = new Data1("A");
        System.out.println("data1.count = " + data1.count);
        
        Data1 data2 = new Data1("B");
        System.out.println("data2.count = " + data2.count);

        Data1 data3 = new Data1("C");
        System.out.println("data3.count = " + data3.count);
        //이렇게만들면 인스턴스마다 다르니까 새로 할당이 다따로된다.
    }
}
