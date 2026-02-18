//class BirthMonth
//	main()
//		num birthMonth
//		output “Enter your birth month [1-12]”
//		input birthMonth
//		if birthMonth >= 1 and birthMonth =< 12 then
//			output “Your birth month is:” + birthMonth
//		else
//			output “You entered an incorrect month:” + birthMonth
//		endIf
//	return
//endClass

import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int birthMonth = 0;
        String trash ="";

        System.out.println("Enter your birth month [1-12]");

        if(in.hasNextInt())
        {
            birthMonth = in.nextInt();
            in.nextLine();

            if(birthMonth >= 1 && birthMonth <= 12)
            {
                System.out.println("Your birth month is: " + birthMonth);
            }
            else
            {
                System.out.println("You entered an incorrect month: " + birthMonth);
            }
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You said your month was: " + trash);
            System.out.println("Run again and enter a number value");
        }
    }
}
