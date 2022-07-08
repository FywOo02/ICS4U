package Study.Assignment2B;

/**
 * @Author: Cho
 * @Date: 2022/04/24/14:39
 * @Description:
 */
public class HourlyEmployee extends Employee{
    private double hours;
    private double pay_rate;

    public HourlyEmployee(String id_no, String name, String postition, double hours, double pay_rate) {
        // call the parent class first when we init data
        super(id_no, name, postition);
        this.hours = hours;
        this.pay_rate = pay_rate;
    }
    // few get method and set method
    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getPay_rate() {
        return pay_rate;
    }

    public void setPay_rate(double pay_rate) {
        this.pay_rate = pay_rate;
    }

    /**
     * A override method for calculate the payment of hourly employees
     */
    @Override
    public void calculatePay() {
        System.out.println("ID\t\tName\t\tPosition\t\tHourly Payment");
        if(getHours()<=40 && getHours()>=0){
            System.out.println(getId_no()+"\t\t"+getName()+"\t\t\t"+getPostition()+"\t\t"+(getHours()*getPay_rate()));
        }else if(getHours()>40){
            System.out.println(getId_no()+"\t\t"+getName()+"\t\t\t"+getPostition()+"\t\t"+(getHours()*getPay_rate()*1.5));
        }
    }
}
