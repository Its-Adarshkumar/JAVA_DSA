public class multilevel {
    public static void main(String[] args) {
      Dogs   dobby =new Dogs();
      dobby.eat();
      dobby.legs=4;

      System.out.println("Legs are " + dobby.legs);
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
    int  legs;
}

class Dogs extends Mammals{
    String bread;
}