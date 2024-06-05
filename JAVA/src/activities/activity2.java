package activities;

import java.lang.reflect.Array;
import java.util.Arrays;

public class activity2 {
    public static void main(){
        int arr[] = {10, 77, 10, 54, -11, 10};
        System.out.println("Array = "+" "+ Arrays.toString(arr));
        int search = 10;
        int checkVal = 30;

        //checklist c = new checklist();
        System.out.println(check);
    }
    public static boolean check(int arr[], int search, int checkVal) {
        boolean test = false;
        int sum = 0;
        for (int element : arr) {
            if (element == search) {
                test = true;
                sum = sum + search;
            }

            if (sum > checkVal) {
                break;
            }

        System.out.println(sum);
        }
        return sum == checkVal;
    }
}
