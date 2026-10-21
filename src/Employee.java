public class Employee {
    String name;
    int salary;
    Employee(String n,int s){
        this.name= n;
        this.salary=s;
    }

    void DisplaySalary(){
        System.out.println("name:"+name);
        System.out.println("salary:"+salary);
    }
    void CalculateAnnualSalary() {
        int AnnualSalary = salary * 12;
        {
            System.out.println("AnnualSalary:" + AnnualSalary);
        }
    }
        public static void main(String[]args){
        Employee em = new Employee("sanjay",18000);
       // em.name="sanjay";
        //em.salary=18000;
        em.DisplaySalary();
        em.CalculateAnnualSalary();


        }

}
