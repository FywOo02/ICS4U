package Study.Unit2Test.PartD;

/**
 * @Author: Cho
 * @Date: 2022/04/29/21:13
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        Manager employee = new Manager();
        employee.setSales(20000);
        System.out.println(employee.calculatePay());
    }
}
