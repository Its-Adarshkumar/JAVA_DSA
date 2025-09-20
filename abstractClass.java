public class abstractClass {
    public static void main(String[] args) {
        Horse h= new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);

        Chicken c =new Chicken();
        c.eat();
        c.walk();


      //  Mustang myhorse=new Mustang();

        //animal>horse>mustang
    
    }
}
abstract class Animal{
    String color;
    Animal(){
        color="brown";
        System.out.println("Animal constructor is called");
    }
    void eat(){
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse costructor is called");
    }

    void changeColor(){
        color="dark brown";
    }
    void walk(){ // complasory
        System.out.println("Walks on 4 legs");
    }
}

class Mustang  extends Horse{
    Mustang (){
        System.out.println("Mustang consructor is called");
    }
}

class Chicken extends Animal{

    Chicken (){
        System.out.println("Chicken constructor is called");
    }
    void changeColor(){
        color="deep brown";
    }
    void walk(){  // complusary
        System.out.println("walk on 2 legs");
    }
}