public class StudentDetial {
    String name;
   int age;
   String college;
  StudentDetial(String n,int  a,String c){
       name=n;
        age=a;
        college=c;
  }

    void Display(){
        System.out.println("name: "+name);
        System.out.println("age: "+age);
        System.out.println("college: "+college);
    }
    public static void main(String[] args){
        StudentDetial sd= new StudentDetial("sanjay",21,"ace");
        //sd.name="sanjay";
        //sd.age=20;
        //sd.college="ace";
        sd.Display();
    }
}
