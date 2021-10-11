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
        ArrayList<Integer> NotPass = new ArrayList<Integer>();
        int j = 0;
        for (int x : arr)
        {
            if (x < 40)
            {
                NotPass.add(x);
                j++;
            }
        }
        return NotPass;
    }

    private static float Arithmetic(int[] arr)
    {
        float total = 0;
        for (int x : arr)
        {
            total = total + x;
        }
        return total / arr.length;
    }

    private static ArrayList<Integer> Rounded(int[] arr)
    {
        ArrayList<Integer> roundedGrade = new ArrayList<Integer>();
        for (int x : arr)
        {
            if(x<38)
            {
                roundedGrade.add(x);
            }
           else
            {
                if (x < ( ((x / 5)*5) + 5) )
                {
                    if( ( ((x / 5)*5) +5) - x < 3)
                    {
                        roundedGrade.add((x / 5)*5 + 5);
                    }
                    else
                    {
                        roundedGrade.add((x/5) * 5);
                    }
                }
                else
                {
                    if(x - (((x / 5)*5)+5) < 3)
                    {
                        roundedGrade.add(((x / 5)*5) + 5);
                    }
                    else
                    {
                        roundedGrade.add((x/5) * 5);
                    }
                }
            }
        }
        return roundedGrade;
    }


    private static int MaxRoundedGrade(int[] arr)
    {
        ArrayList<Integer> grades = Rounded(arr);
        int max = 0;
        for (Integer grade : grades)
        {
            if (grade > max)
            {
                max = grade;
            }
        }
        return max;
    }
}
