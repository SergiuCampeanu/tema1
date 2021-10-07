import java.util.*;
public class Aufgabe2 {

    public static void main(String[] args) {

        int[] listNumbers = {4, 8, 3, 10, 17};
        System.out.println("max: " + Biggest(listNumbers));
        System.out.println("min: " + Smallest(listNumbers));
        System.out.println("sum max: " + MaxSum(listNumbers));
        System.out.println("sum max: " + MinSum(listNumbers));
    }

    private static int Biggest(int[] arr) {
        int biggest = arr[0];
        for (int x : arr) {
            if (x > biggest) {
                biggest = x;
            }
        }
        return biggest;
    }

    private static int Smallest(int[] arr) {
        int smallest = arr[0];
        for (int x : arr) {
            if (x < smallest) {
                smallest = x;
            }
        }
        return smallest;
    }

    private static int MaxSum(int[] arr) {
        int sum=0;
        for (int x : arr)
        {
            sum=sum+x;
        }
        return sum-Smallest(arr);
    }

    private static int MinSum(int[] arr) {
        int sum=0;
        for (int x : arr)
        {
            sum=sum+x;
        }
        return sum-Biggest(arr);
    }
}


