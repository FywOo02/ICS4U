package Study.Assignment2A.question2;

import java.util.Scanner;

/**
 * @Author: Cho
 * @Date: 2022/04/21/12:22
 * @Description:
 */
public class RevenueCal {
    double inCome = 0.0;
    int num = 0;
    Sale[] sales = new Sale[999];

    public void revenue(){

    }
    public void revenue(Sale sales[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many items you want to input");
        num = sc.nextInt();
        for(int i=0; i<num; i++){
            sales[i] = new Sale();
            System.out.println("Please, enter the id of item");
            sales[i].setItemId(sc.next());
            System.out.println("Please, enter the price of item");
            sales[i].setPrice(sc.nextDouble());
            System.out.println("Please, enter the quantity that sold of item");
            sales[i].setQtySold(sc.nextInt());
        }
        System.out.println("Item Id\t\tItem Price\t\tItem Sold\t\tItem income\n");
        for (int j=0; j<num; j++){
            inCome = sales[j].getPrice()*sales[j].getQtySold();
            System.out.println(""+sales[j].getItemId()+"\t\t\t"+sales[j].getPrice()
                    +"\t\t\t"+sales[j].getQtySold()+"\t\t\t\t"+inCome);
        }
    }

}
