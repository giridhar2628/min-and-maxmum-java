package javatectraining;
import java.util.*;
public class maximumarray {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] arr = {10, 25, 8, 30, 13, 16, 18, 20};

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }

            if (arr[i] < min) {
                secondMin = min;
                min = arr[i];
            } else if (arr[i] < secondMin && arr[i] != min) {
                secondMin = arr[i];
            }
        }

        System.out.println("Second maximum value in the array: " + secondMax);
        System.out.println("Second minimum value in the array: " + secondMin);
    }
}

