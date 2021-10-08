import java.util.*;
import java.util.Scanner;
public class aufgabe4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] KeyBoardPrice = {40, 35, 70, 15, 45};
        int[] USBCablePrice = {20, 15, 40, 75};
        System.out.println("Hello to the Store!");
        System.out.println("KeyBoard's Price" + Arrays.toString(KeyBoardPrice));
        System.out.println("USB Cable's Price" + Arrays.toString(USBCablePrice));
        System.out.println(" "); //new line

        System.out.println("Cheapest Keyboard: " + CheapKeyBoard(KeyBoardPrice));
        System.out.println("The most expensive Keyboard: " + ExpKeyBoard(KeyBoardPrice)+", and the most expensive USB Cable: " + ExpUSBCable(USBCablePrice));
        System.out.println(" ");

        System.out.print("Enter Markus's Budget: ");
        int budget = scan.nextInt();
        System.out.println("The most expensive USB Cable that Markus can afford is: " + MarkusUSBEXP(USBCablePrice, budget));
        System.out.println("The best set up that Markus can afford is: " + BestSetUP(KeyBoardPrice, USBCablePrice, budget));

    }


    private static int CheapKeyBoard(int[] arr) {
        int ChKB = arr[0];
        for (int x : arr) {
            if (x < ChKB) {
                ChKB = x;
            }
        }
        return ChKB;
    }

    private static int ExpKeyBoard(int[] arr) {
        int exp = arr[0];
        for (int x : arr) {
            if (x > exp) {
                exp = x;
            }
        }
        return exp;
    }

    private static int ExpUSBCable(int[] arr) {
        int exp = arr[0];
        for (int x : arr) {
            if (x > exp) {
                exp = x;
            }
        }
        return exp;
    }

    private static int MarkusUSBEXP(int[] arr, int budget) {
        int exp = arr[0];
        boolean found = false;
        for (int x : arr) {
            if(x<budget)
            {
                if (x > exp) {
                    exp = x;
                    found = true;
                }
            }
        }
        if (!found) //found == false
        {
            return -1;
        }
        else
        {
            return exp;
        }
    }

    private static Object BestSetUP(int[] arr1, int[] arr2, int budget)
    {
        int sum = 0;
        ArrayList<Integer> bsp = new ArrayList<Integer>();
        boolean found = false;
        int expK = arr1[0];
        int expU = arr2[0];
        for (int i : arr1)
        {
            for (int j : arr2)
            {
                if (i + j <= budget)
                {
                    if (i + j > sum)
                    {
                        sum = i + j;
                        found = true;
                        bsp.clear();
                        bsp.add(i);
                        bsp.add(j);
                    }
                }
            }
        }
        if (!found) //found == false
        {
            return -1;
        }
        else
        {
            return bsp;
        }
    }

}
