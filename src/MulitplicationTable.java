public class MulitplicationTable {
    int n;
    MulitplicationTable(int n){
        this.n=n;
    }
    void Mulitplication() {
        for (int i=1;i<=10;i++) {
            System.out.println(n*i);

        }
    }
        public static void main(String[]agrs){
            MulitplicationTable mt=new MulitplicationTable(2);
            mt.Mulitplication();
        }

}
