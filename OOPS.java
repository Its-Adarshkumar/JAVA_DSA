public class OOPS {
    public static void main(String args[]){
        Pen p1 =new Pen();// created a pen object p1
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);

        BankAccount myAcc= new BankAccount();
        myAcc.username="adarsh ";
        myAcc.setPassword("shjkhkg");
        System.out.println(myAcc.username);
        //System.out.println();

    }
}

class BankAccount{
    public String username;
    private String password;
    public void setPassword(String newpassword){
        password=newpassword;
    }
}

class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percantage;

    void calPercentage(int phy , int math ,int chem){
        percantage=(phy+chem+math)/3;
    }
}
