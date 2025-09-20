public class copycons {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Adarsh";
        s1.roll=123;
        s1.password="abc";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;
        Student s2=new Student(s1);
        // s1.marks[2]=100;
        // s2.password="xyz";
        // for(int i=0;i<3;i++){
        //     System.out.println(s2.marks[i]);
        // }
       // System.out.println(s2.name);
    }
}
class Student{
    String name;
    int roll;
    String password;
    int marks[];

    //shallow copy constructor
    // Student(Student s1){
    //     marks=new int[3];
    //     this.name=s1.name;
    //     this.roll=s1.roll;
    //     this.marks=s1.marks;
    // }


    //deep copy 
// Student(Student s1){
//     marks=new int[3];
//          this.name=s1.name;
//         this.roll=s1.roll;
//         for(int i=0;i<marks.length;i++){
//             this.marks[i]=s1.marks[i];
//         }
// }


//copy constructor
    Student(Student s1){
        this.name=s1.name;
        this.roll=s1.roll;
    }


    Student(){
        System.out.println("Constructor is called");
    }

    Student(String name){
        this.name=name;
    }
    Student(int roll){
        this.roll=roll;
    }
}