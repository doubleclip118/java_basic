package static2;

public class DecoMain1 {
    public static void main(String[] args) {
        String s = "Hello Java";
        DecoUtil1 Deco = new DecoUtil1();
        String result = Deco.deco(s);
        System.out.println("result = " + result);
    }
}
