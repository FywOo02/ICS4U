package Study.Unit1Test;

import java.util.Arrays;

/**
 * @Author: Cho
 * @Date: 2022/04/17/14:57
 * @Description:
 */
public class SaleTest {
    public static void main(String[] args) {
        Sale Apple = new Sale();
        Sale Banana = new Sale();
        Sale Orange = new Sale();
        Sale[] sales = {
                Apple,
                Banana,
                Orange
        };
        Sale.dataStorage(sales);
        System.out.println(Arrays.toString(Sale.inComeCalculator(sales)));
        Sale.findLowest(sales);
    }
}
