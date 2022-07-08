package Study.Assignment3B.Question2;

import java.util.Arrays;

/**
 * @Author: Cho
 * @Date: 2022/05/08/13:54
 * @Description:
 */
public class BinarySearch {
        public static void main(String[] args) {
            int[] arr= {1,2,3,4,5,6,7,8,9,10};
            System.out.println(Arrays.toString(arr));
            System.out.println(binarySearch(arr,4));
        }

        public static int binarySearch(int[] arr,int value) {
            int low=0;
            int high=arr.length-1;
            while(low<=high) {
                int mid=(low+high)/2;
                if(value==arr[mid]) {
                    return mid;
                }
                if(value>arr[mid]) {
                    low=mid+1;
                }
                if(value<arr[mid]) {
                    high=mid-1;
                }

            }
            return -1;
        }
}
