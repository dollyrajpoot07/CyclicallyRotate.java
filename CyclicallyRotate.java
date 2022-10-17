// Given an array, cyclically rotate the array clockwise by one. 
// Examples:  
// Input:  arr[] = {1, 2, 3, 4, 5}
// Output: arr[] = {5, 1, 2, 3, 4}

import java.util.Arrays;

public class CyclicallyRotate {
    static int arr[] = new int[] { 1, 2, 3, 4, 5 };

    static void rotate() {
        int i = 0, j = arr.length - 1;
        while (i != j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
        }
    }
    public static void main(String[] args) {
        System.out.println("Given Array is");
        System.out.println(Arrays.toString(arr));
        rotate();
        System.out.println("Rotated Array is");
        System.out.println(Arrays.toString(arr));
    }
}
