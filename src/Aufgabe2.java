import java.util.*;
public class Aufgabe2 {

    public static void main(String[] args) {

        int[] listNumbers = {4, 8, 3, 10, 17, 3};
        System.out.println("max: " + biggest(listNumbers));
        System.out.println("min: " + smallest(listNumbers));
        System.out.println("sum max: " + maxSum(listNumbers));
        System.out.println("sum min: " + minSum(listNumbers));
    }

    private static int biggest(int[] arr) {
        int biggest = arr[0];//cream un int care este primul element din arr
        for (int x : arr) {//cautam cel mai mare numar din arr
            if (x > biggest) {
                biggest = x;
            }
        }
        return biggest; //returnam cel mai mare numar
    }

    private static int smallest(int[] arr) {
        int smallest = arr[0];//cream un int care este primul element din arr
        for (int x : arr) {//cautam cel mai mic numar din arr
            if (x < smallest) {
                smallest = x;
            }
        }
        return smallest; //returnam cel mai mic numar
    }

    private static int maxSum(int[] arr) {
        int sum=0;
        for (int x : arr)
        {
            sum=sum+x; //adunam toate numerele
        }
        return sum-smallest(arr); //returnam suma - cel mai mic numar
    }

    private static int minSum(int[] arr) {
        int sum=0;
        for (int x : arr)
        {
            sum=sum+x; //adunam toate numerele
        }
        return sum-biggest(arr); //returnam suma - cel mai mare numar
    }
}


