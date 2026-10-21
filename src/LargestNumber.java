public class LargestNumber {
    int number;

    LargestNumber(int n){
       this.number=n;
    }
void Checklargenumber() {
    if (number<= 10) {
        System.out.println(number+ ":is a small number");
    } else if (number <= 20) {
        System.out.println(number+ ":is a medium number");
    } else {
        System.out.println(number+ ":is a large number");
    }
}
    public static void main(String[]args){
            LargestNumber lm= new LargestNumber(40);
                lm.Checklargenumber();
    }

}
