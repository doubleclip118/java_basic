package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {
    public void call(){
        publicValue = 1;
        protectedValue = 1; //상속이기때문에 사용가능
        //default 다른패키지라 오류
        //pri 당연히 접근불가
        setPublicValue();
        setProtectedValue(); //상속관계
        //setDefaultValue();
        //setPri();

        printParent();
    }
}
