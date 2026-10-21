public class Calculator {
    int a;
    int b;
Calculator(int a,int b){
   this.a=a;
    this.b=b;
}
    void Add() {
        int add = a + b;
        {
            System.out.println("add:"+add);
        }
    }
        void sub () {
            int sub = a - b;
            {
                System.out.println("sub:"+sub);
            }
        }
        void Multiply(){
        int multiply= a * b;{
            System.out.println("multiply:"+multiply);
            }
        }
         void Divede(){
        int divide = a % b;{
            System.out.println("divide:"+divide);
             }
         }
         public static void main(String[] args){
        Calculator cn = new Calculator(5,7);
      //  cn.a=5;
        //cn.b=7;
        cn.Add();
        cn.sub();
        cn.Multiply();
        cn.Divede();
         }

}