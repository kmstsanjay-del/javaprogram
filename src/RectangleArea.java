
public class RectangleArea {
 int length;
 int breath;
 RectangleArea(int l,int b){
     length =l;
     breath =b;

 }

 void CalculateArea() {

     int area = length * breath; {
         System.out.println(area);

     }
 }
     public static void main(String[]args){
     RectangleArea ra= new RectangleArea(5,20);
    // ra.length=5;
     //ra.breath=20;
     ra.CalculateArea();
     }


}
