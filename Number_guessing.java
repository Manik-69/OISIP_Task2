import java.util.*;

public class Number_guessing
{
    public static void main(String[] args) 
    {
         Random rand = new Random();
        int max=100, min=0;
        int r_number = rand.nextInt(max - min + 1) + min;

        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter Number Between 1-100");
        for (int i=0; i<=5; i++) 
        {
            int n = sc.nextInt();
            if (n==r_number) {
                System.out.println("You win in " + count + " try");
                break;
            } else if (n > r_number) {
                System.out.println("Too big number");
            } else {
                System.out.println("Too Small number");
            }
            count++;
        }
        sc.close();
    }
}