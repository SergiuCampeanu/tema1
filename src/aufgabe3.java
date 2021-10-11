import java.util.Arrays;

public class aufgabe3 {
    public static void main(String[] args) {

        int[] Number1 = {1, 7, 0, 0, 0, 0, 0, 0, 0};
        int[] Number2 = {8, 7, 0, 0, 0, 0, 0, 0, 0};

        System.out.println("Addition: " + Arrays.toString(add(Number1, Number2)));

    }

    private static int[] add(int[] arr1, int[] arr2) {
        //ArrayList<Integer> num3 = new ArrayList<Integer>();
        int[] num3 = new int[arr1.length];
        int next=0;
        for (int i = arr1.length-1; i > 0; i--)
        {
            if(arr1[i] + arr2[i]+ next > 9)
            {
                num3[i] = (arr1[i]+arr2[i]+next)%10;
                next=(arr1[i]+arr2[i]+next)/10;
                System.out.println(next);  //debug

                if( num3[i+1] != 0) //aici ii problema, nu stiu cand ajung la ultimul element ca sa fac resize-ul si sa copiez next
                {

                    num3 = Arrays.copyOf(num3,num3.length + 1);
                    num3[i+1]=(arr1[i]+arr2[i]+next)/10;
                }

            }
            else
            {
                num3[i]=arr1[i]+arr2[i]+next;
                next=0;
            }
        }
        return num3;
    }

}


/*
import java.util.*;
public class aufgabe3 {
    public static void main(String[] args) {

        int[] Number1 = {1, 4, 0, 0, 0, 0, 7, 0, 0};
        List<Integer> intList1 = new ArrayList<Integer>(Number1.length);
        for (int i : Number1)
        {
            intList1.add(i);
        }

        int[] Number2 = {8, 7, 0, 0, 0, 0, 7, 0, 0};
        List<Integer> intList2 = new ArrayList<Integer>(Number2.length);
        for (int i : Number2)
        {
            intList2.add(i);
        }


        System.out.println("Addition: " + add(intList1, intList2));

    }

    private static ArrayList<Integer> add( List<Integer> arr1,  List<Integer> arr2) {
        ArrayList<Integer> num3 = new ArrayList<Integer>();
        // int[] num3 = new int[arr1.length];
        int next=0;
        for (int i = arr1.size()-1; i > 0; i--)
        {
            if(arr1.get(i) + arr2.get(i)+ next > 9)
            {
                num3.add((arr1.get(i) + arr2.get(i)+ next)%10);
                next=(arr1.get(i) + arr2.get(i)+ next)/10;
                System.out.println(next);  //debug
            }
            else
            {
                num3.add(arr1.get(i) + arr2.get(i)+ next);
                next=0;
            }
        }
        return num3;
    }

}
*/
