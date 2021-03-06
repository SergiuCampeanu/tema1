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

        System.out.println("Cheapest Keyboard: " + cheapKeyBoard(KeyBoardPrice));
        System.out.println("The most expensive Keyboard: " + expKeyBoard(KeyBoardPrice)+
                ", and the most expensive USB Cable: " + expUSBCable(USBCablePrice)); //returnam doua functii
        System.out.println(" "); //new line

        System.out.print("Enter Markus's Budget: ");
        int budget = scan.nextInt(); //citim bugetul de la tastatura
        System.out.println("The most expensive USB Cable that Markus can afford is: " + markusUSBEXP(USBCablePrice, budget));
        System.out.println("The best set up that Markus can afford is: " + bestSetUP(KeyBoardPrice, USBCablePrice, budget));

    }

    private static int cheapKeyBoard(int[] arr) {
        int ChKB = arr[0]; //cream un int care este primul element din arr
        for (int x : arr) { //cautam cel mai mic produs din arr
            if (x < ChKB) {
                ChKB = x;
            }
        }
        return ChKB;//returnam cel mai mic
    }

    private static int expKeyBoard(int[] arr) {
        int exp = arr[0]; //cream un int care este primul element din arr
        for (int x : arr) {//cautam cel mai mare produs din arr
            if (x > exp) {
                exp = x;
            }
        }
        return exp;//returnam cel mai mare
    }

    private static int expUSBCable(int[] arr) {
        int exp = arr[0];//cream un int care este primul element din arr
        for (int x : arr) {//cautam cel mai mare produs din arr
            if (x > exp) {
                exp = x;
            }
        }
        return exp;//returnam cel mai mare
    }

    private static int markusUSBEXP(int[] arr, int budget) {
        int exp = 0;//cream un int care este primul element din arr
        boolean found = false;
        for (int x : arr) {
            if(x<=budget && x >= exp) //verificam daca x este mai mic sau egal decat bugetul
            {
                exp = x;
                found = true;
            }
        }
        if (!found) //found == false
        {
            return -1; //daca nu a gasit returnam -1
        }
        else
        {
            return exp;
        }
    }

    private static Object bestSetUP(int[] arr1, int[] arr2, int budget)
    {
        int sum = 0;
        ArrayList<Integer> bsp = new ArrayList<Integer>();  //cream un arraylist de integer
        boolean found = false;
        int expK = arr1[0];
        int expU = arr2[0];
        for (int i : arr1)
        {
            for (int j : arr2)
            {
                if (i + j <= budget && i+j>sum) //verificam daca suma produsului este mai mic sau egal decat bugetul si verificam sa fie mai mare decat suma
                {
                    sum = i + j;
                    found = true;
                    bsp.clear(); //stergem arraylistul
                    bsp.add(i); //adaugam noile sugestii
                    bsp.add(j);
                }
            }
        }
        if (!found) //found == false
        {
            return -1; //daca  nu a gasit returnam -1
        }
        else
        {
            return bsp;
        }
    }

}
