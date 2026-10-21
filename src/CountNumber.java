public class CountNumber {
    int number;
    CountNumber(int n){
        this.number=n;

    }
    void Countdec() {
        for (number = 100; number >=0; number--) {
            System.out.println(number);


        }
    }
        public static void main(String[]args){
            CountNumber cn = new CountNumber(8);
                    cn.Countdec();
        }

}
