package poly.car0;

public class Driver {
    private K3Car k3Car;

    public void setK3Car(K3Car k3Car){
        this.k3Car = k3Car;
    }
    public void drive(){
        System.out.println("자동차운전");
        k3Car.startEngine();
        k3Car.pressAccelerator();
        k3Car.offEngine();
    }
}
