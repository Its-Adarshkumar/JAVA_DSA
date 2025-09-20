public class constructure {
    public static void main(String[] args) {
        Student s1=new Student();
       // System.out.println(s1.name);
       Student s2= new Student("Adarsh");
       Student s3= new Student(123);
    }
}
class Student{
    String name;
    int roll;

    Student(){
       // this.name=name;
        System.out.println("Constuctor is called");
    }


//paramatrized constructor
  Student (String name){
    this.name=name;
  }
  Student (int roll){
    this.roll=roll;
  }
}