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
        int biggest = arr[0];//cream un int care este primul element din arr
        for (int x : arr) {//cautam cel mai mare numar din arr
            if (x > biggest) {
                biggest = x;
            }
        }
        return biggest; //returnam cel mai mare numar
    }

    private static int Smallest(int[] arr) {
        int smallest = arr[0];//cream un int care este primul element din arr
        for (int x : arr) {//cautam cel mai mic numar din arr
            if (x < smallest) {
                smallest = x;
            }
        }
        return smallest; //returnam cel mai mic numar
    }

    private static int MaxSum(int[] arr) {
        int sum=0;
        for (int x : arr)
        {
            sum=sum+x; //adunam toate numerele
        }
        return sum-Smallest(arr); //returnam suma - cel mai mic numar
    }

    private static int MinSum(int[] arr) {
        int sum=0;
        for (int x : arr)
        {
            sum=sum+x; //adunam toate numerele
        }
        return sum-Biggest(arr); //returnam suma - cel mai mare numar
    }
}


