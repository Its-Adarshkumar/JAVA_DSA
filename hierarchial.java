public class hierarchial {
    public static void main(String[] args) {
        Mammals m1= new Mammals();
        m1.eat();

        Bird b1= new Bird();
        b1.breathe();
    }
}


class Animal{
    String color;

    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breathes");
    }
}

class Mammals extends Animal{
    void walk(){
        System.out.println("Walks");
    }
}

class Fish extends Animal{
    void swim (){
        System.out.println("swim");
    }
}

class  Bird extends Animal{
    void fly(){
        System.out.println("Fly");
    }
}