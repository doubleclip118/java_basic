package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        data.publicField = 1;
        data.publivMethod();

        data.defaultFied =2;
        data.defaultMethod();
        //data.privateFied =3; 에러
        //data.privateMethod(); 에러

        data.innerAccese();

    }
}
