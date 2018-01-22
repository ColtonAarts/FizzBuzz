import java.util.Scanner;

/**
 * Created by colton on 2018-01-20.
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int number = -1;
        while(number < 0) {
            System.out.println("Please enter a number greater than 0.");
            if(scanner.hasNextInt()) {
                number = scanner.nextInt();
            }
            else
            {
                System.out.println("Please enter the number as an integer. Example 5");
                scanner.next();
            }
        }
        fizzBuzz(number);
    }

    private static void fizzBuzz(int num)
    {
        for(int i = 1; i<=num; i++)
        {
            int fizz = i % 3;
            int buzz = i % 5;
            if(fizz == 0)
            {
                System.out.print("Fizz ");
            }
            if(buzz == 0)
            {
                System.out.print("Buzz");
            }
            if(fizz != 0 && buzz != 0)
            {
                System.out.print(i);
            }

            System.out.println();
        }
    }
}
