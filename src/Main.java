import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr[] = { 11, 54, 23, 32, 15, 24, 31, 12 };
        System.out.print("Original Array: [ ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
        Arrays.parallelSort(arr);
        System.out.print("Sorted Array: [ ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]\n");


// 2
        int arr2[] = { 11, 54, 23, 32, 15, 24, 31, 12 };
        System.out.print("Original Array: [ ");

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println("]");
        Arrays.parallelSort(arr2, 0, arr2.length);
        System.out.print("Sorted Array: [ ");

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println("]\n");


// 3
        int arr3[] = { 11, 54, 23, 32, 15, 24, 31, 12 };
        System.out.print("Original Array: [ ");

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
        System.out.println("]");
        Arrays.parallelSort(arr3, 0, 5);
        System.out.print("Sorted Array: [ ");

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
        System.out.println("]");
    }
}