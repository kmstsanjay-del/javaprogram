public class PrintNumber {
    int n;
    PrintNumber(int n){
        this.n=n;
    }
    void Print() {
        for (n = 0; n <= 20; n++) {
            System.out.println(n);
        }
    }
        public static void main(String[]args){
            PrintNumber pn= new PrintNumber(5);
            pn.Print();

        }

}
