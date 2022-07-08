package Study.Unit2Test.PartD;

/**
 * @Author: Cho
 * @Date: 2022/04/29/21:04
 * @Description:
 */
public class Employee {
    private String idNo;
    private String employeeName;
    private double salary;

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double calculatePay(){
        return 0;
    }
}
