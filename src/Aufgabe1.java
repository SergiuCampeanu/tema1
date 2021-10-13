import java.util.*;
public class Aufgabe1 {

    public static void main(String[] args)
    {

        int[] grade = {26, 87, 48, 25, 94, 3, 100, 51, 75};

        System.out.println("Grades that failed: " + smallGrade(grade));
        System.out.println("The arithmetic mean is: " + Arithmetic(grade));
        System.out.println("Grades rounded: " + Rounded(grade));
        System.out.println("The best grade rounded: " + MaxRoundedGrade(grade));
    }

    private static ArrayList<Integer> smallGrade(int[] arr)
    {
        ArrayList<Integer> NotPass = new ArrayList<Integer>(); //cream un arraylist
        int j = 0;
        for (int x : arr)
        {
            if (x < 40) //daca nota este mai mica decat 40
            {
                NotPass.add(x); //punem in arraylist  not pass
                j++;
            }
        }
        return NotPass; //returnam arraylistul
    }

    private static float Arithmetic(int[] arr)
    {
        float total = 0;
        for (int x : arr)
        {
            total = total + x; //adunam toate notele
        }
        return total / arr.length; //returnam rezultatul impartit la nr de note
    }

    private static ArrayList<Integer> Rounded(int[] arr)
    {
        ArrayList<Integer> roundedGrade = new ArrayList<Integer>(); //cream un arraylist
        for (int x : arr)
        {
            if(x<38) //verificam daca nota este mai mica decat 38
            {
                roundedGrade.add(x); //adaugam nota la arraylist fara sa o rotujim
            }
           else
            {
                if (x < ( ((x / 5)*5) + 5) ) //daca nota este mai mica decat nota impartita la 5, inmultita cu 5 + 5
                {
                    if( ( ((x / 5)*5) +5) - x < 3) // daca nota impartita la 5, inmultita cu 5 + 5 - nota este mai mica decat 3
                    {
                        roundedGrade.add((x / 5)*5 + 5); //adaugam nota rotunjita in sus la arraylist
                    }
                    else
                    {
                        roundedGrade.add((x/5) * 5); //adaugam nota  rotunjita in jos la arraylist
                    }
                }
                else
                {
                    if(x - (((x / 5)*5)+5) < 3)// daca nota - nota impartita la 5, inmultita cu 5 + 5 este mai mica decat 3
                    {
                        roundedGrade.add(((x / 5)*5) + 5);//adaugam nota rotunjita in sus la arraylist
                    }
                    else
                    {
                        roundedGrade.add((x/5) * 5);//adaugam nota rotunjita in jos la arraylist
                    }
                }
            }
        }
        return roundedGrade; //returnam arraylist
    }


    private static int MaxRoundedGrade(int[] arr)
    {
        ArrayList<Integer> grades = Rounded(arr); //cream un arraylist cu notele rotunjite
        int max = 0; //cream un int
        for (Integer grade : grades) //cautam nota cea mai mare
        {
            if (grade > max)
            {
                max = grade;
            }
        }
        return max; //returnam max
    }
}
