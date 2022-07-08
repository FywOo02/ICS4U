package Study.Assignment2B;

/**
 * @Author: Cho
 * @Date: 2022/04/24/15:00
 * @Description:
 */
public class EmployeeSystem {
    public static void main(String[] args) {
        // utilize the concept of polymorphism to create object
        Employee employee1 = new HourlyEmployee("01","Cho","developer",45,20);
        employee1.calculatePay();
        System.out.println("---------------------------------------------");
        Employee employee2 = new SalariedEmployee("02","Owen","Engineering",20000,50000);
        employee2.calculatePay();
        System.out.println("---------------------------------------------");
        Employee employee3 = new SalariedEmployee("03","Jason","Manager",40000,20000);
        employee3.calculatePay();
    }
}
