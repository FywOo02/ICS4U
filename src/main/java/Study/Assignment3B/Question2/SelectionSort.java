package Study.Assignment3B.Question2;

import java.util.Arrays;

/**
 * @Author: Cho
 * @Date: 2022/05/08/13:39
 * @Description:
 */
public class SelectionSort {
    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if(arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }
                }
                swap(arr, i, minIndex);
            }
        return arr;
        }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
       int[] sortedArray = selectionSort(new int[]{1, 3, 7, 4, 23, 99});
        System.out.println(Arrays.toString(sortedArray));
    }
}

