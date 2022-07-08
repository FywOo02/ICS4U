package Study.Unit2Test;

/**
 * @Author: Cho
 * @Date: 2022/04/29/20:35
 * @Description:
 */
public class PartA {
    public static void main(String[] args) {
        PartA test = new PartA();
        test.calRevenue(20,30);
        test.calRevenue(11.22,33.5);
    }
    // the first overloading method returned data in integer
    public int calRevenue(int price, int qSold){
        return price * qSold;
    }
    // the second overloading method returned data in double
    public double calRevenue(double price, double qSold){
        return price * qSold;
    }
}
