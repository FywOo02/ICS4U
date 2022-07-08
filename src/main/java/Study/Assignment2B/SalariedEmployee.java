package Study.Assignment2B;

/**
 * @Author: Cho
 * @Date: 2022/04/24/14:51
 * @Description:
 */
public class SalariedEmployee extends Employee{
    private double salary;
    private double sales;
    private double bonus;

    public SalariedEmployee(String id_no, String name, String postition, double salary, double sales) {
        // call the parent class first when we init data
        super(id_no, name, postition);
        this.salary = salary;
        this.sales = sales;
    }
    // few get method and set method
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        salary = salary;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    /**
     * A override method for calculate the payment of monthly employees
     */
    @Override
    public void calculatePay() {
        System.out.println("ID\t\tName\t\tPosition\t\tMonthly Payment");
        if(getSales() > 40000){
            this.bonus = 0.01*getSales();
            System.out.println(getId_no()+"\t\t"+getName()+"\t\t"+getPostition()+"\t\t"+(getSalary()+getBonus()));
        }else
            System.out.println(getId_no()+"\t\t"+getName()+"\t\t"+getPostition()+"\t\t"+getSalary());
    }
}
