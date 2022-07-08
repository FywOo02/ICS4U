package Study.Unit2Test.PartD;

/**
 * @Author: Cho
 * @Date: 2022/04/29/21:08
 * @Description:
 */
public class Manager extends Employee{
    private double sales;

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    @Override
    public double calculatePay() {
        double salary = 50000+getSales()*0.01;
        return salary;
    }
}
