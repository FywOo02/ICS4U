package Study.Unit1Test;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

/**
 * @Author: Cho
 * @Date: 2022/04/17/14:37
 * @Description:
 */
public class Sale implements Comparable<Sale>{
    String item_Name;
    double price;
    double quantity_sold;
    double inCome;

    /**
     * A method use for save the data of every items
     * @param sales
     */
    public static void dataStorage(Sale[] sales){
        for (int i=0; i<sales.length; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("The name of this item is: ");
            sales[i].item_Name = sc.next();
            System.out.println("The price of this item is: ");
            sales[i].price = sc.nextDouble();
            System.out.println("The quantity sold of this item is: ");
            sales[i].quantity_sold = sc.nextDouble();
        }
    }

    /**
     * A method for calculating the income of per items and show them
     * @param sales
     * @return
     */
    public static String[] inComeCalculator(Sale[] sales){
        String[] inComeList = new String[sales.length];
        for (int i=0; i<sales.length; i++){
            sales[i].inCome = Math.round(sales[i].price * sales[i].quantity_sold*100)/100.0;
            inComeList[i] = "Item: "+sales[i].item_Name + " InCome: "+sales[i].inCome;
        }
        return inComeList;
}

    /**
     * A method for finding out the lowest income item
     * @param sales
     */
    public static void findLowest(Sale[] sales){
        Sale temp = null;
        for(int i=0; i< sales.length; i++){
            for (int j=i+1; j< sales.length; j++){
                if(sales[i].compareTo(sales[j])<0) {
                    temp = sales[i];
                    sales[i] = sales[j];
                    sales[j] = temp;
                }
            }
        }
        System.out.println("The lowest income item is "+sales[sales.length-1].item_Name+
                " with income about "+sales[sales.length-1].inCome);
    }
    @Override
    public int compareTo(Sale o) {
        if(this.inCome > o.inCome)
            return 1;
        else if(this.inCome < o.inCome)
            return -1;
        else
            return 0;
    }
}
