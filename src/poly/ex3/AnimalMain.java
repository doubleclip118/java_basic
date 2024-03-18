package poly.ex3;

import poly.ex2.Animal;

public class AnimalMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        cat.sound();
        cat.move();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
    }

    private static void soundAnimal(AbstractAnimal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 시작");
    }

    private static void moveAnimal(AbstractAnimal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.move();
        System.out.println("동물 소리 테스트 시작");
    }
}
