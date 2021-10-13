import java.util.Arrays;

public class aufgabe3 {
    public static void main(String[] args) {

        int[] Number1 = {8, 7, 0, 0, 0, 0, 0, 0, 0};
        int[] Number2 = {1, 3, 0, 0, 0, 0, 0, 0, 0};

        System.out.println("Addition: " + Arrays.toString(add(Number1, Number2)));
        System.out.println("Substraction: " + Arrays.toString(sub(Number1, Number2)));

    }

    private static int[] add(int[] arr1, int[] arr2) {
        int[] num3 = new int[arr1.length];  //cream un nou array pentru rezultat cu marimea la arr1
        int next=0;
        for (int i = arr1.length-1; i >= 0; i--) //incepem cu ultima pozitie de la dreapta la stanga
        {
            if(arr1[i] + arr2[i]+ next > 9) //verifiam daca este suma este mai mare decat 9
            {
                num3[i] = (arr1[i]+arr2[i]+next)%10; //punem restul pe pozitia i
                next=(arr1[i]+arr2[i]+next)/10; //salvam catul in next
            }
            else
            {
                num3[i]=arr1[i]+arr2[i]+next; //punem suma pe pozitia i
                next=0;
            }
            if(i == 0 && next != 0) //facem resize la array
            {
                num3 = Arrays.copyOf(num3, num3.length + 1); //ii adaugam o valoare
                num3[i]=next;
            }
        }
        return num3; //returnam rezultatul
    }

    private static int[] sub(int[] arr1, int[] arr2) {
        int[] num3 = new int[arr1.length]; //cream un nou array pentru rezultat cu marimea la arr1
        int min=0;
        for (int i = arr1.length - 1; i >= 0; i--) //incepem cu ultima pozitie de la dreapta la stanga
        {
            if(arr1[i] - (arr2[i] + min) < 0) //verificam daca rezultatul este mai mic decat 0
            {
                    num3[i] = (10 + arr1[i]) - (arr2[i] + min); // adaugam 10 si facem scaderea
                    min = 1; //setam min cu 1
            }
            else
            {
                num3[i]=arr1[i]-(arr2[i]+min); //facem scaderea
                min=0;
            }
        }
        return num3; //returnam rezultatul
    }
}
