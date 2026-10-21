public class PrimeNumber {
    int number;

    PrimeNumber(int n){
        this.number= n;

    }
void CheckPrime(){
    if (number <= 1) {
        System.out.println("Not a prime number");
        return;
    }

    for (int i = 2; i < number; i++) {
        if (number % i == 0) {
            System.out.println("Not a prime number");
            return;
        }

        System.out.println("Prime number");
    }


}
public static void main(String[]args){
        PrimeNumber pn= new PrimeNumber(10);
        pn.CheckPrime();
}
}
