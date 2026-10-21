public class ProductDiscount {
    String productname;
    int price;
    int percentage;
    double finalprice;
ProductDiscount(String n,int p,int i){
    this.productname=n;
    this.price=p;
    this.percentage=i;
}

    void CalculatorDiscount() {
        double discount = price * percentage / 100;
        finalprice = price - discount;
       // System.out.println();

    }
        void DisplayFinalPrice () {
        System.out.println("productname:"+productname);
        System.out.println("price:"+price);
        System.out.println("percentage:"+percentage+"%");
            System.out.println("Final Price: " + finalprice);

        }

    public static void main(String[] args){
        ProductDiscount pd=new ProductDiscount("tv",15000,15);
       // pd.productname="tv";
        //pd.price=15000;
        //pd.percentage=15;
        pd.CalculatorDiscount();
        pd.DisplayFinalPrice();
    }
}