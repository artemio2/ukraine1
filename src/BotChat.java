import java.util.Scanner;

public class BotChat {
    final static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args)
    {
        first();
        second();
        third();
        fourth();
        fifth();
        end();
    }

    static void first()
    {
        System.out.println("Hello! My name is " + "Aid" + ".");
        System.out.println("I was created in " + "2018" + ".");
        System.out.println("Please, remind me your name.");
    }



    static void second()
    {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }


    static void third()
    {
        System.out.println("Let me guess your age.");
        System.out.println("Say me remainders of dividing your age by 3, 5 and 7.");
        int r3 = scanner.nextInt();
        int r5 = scanner.nextInt();
        int r7 = scanner.nextInt();
        int age = (r3 * 70 + r5 * 21 + r7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }//guess end

    static void fourth()
    {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++)
        {
            System.out.printf("%d!\n", i);
        }
    }

    static void fifth()
    {   System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println ("1. To repeat a statement multiple times.\n" +
                    "2. To decompose a program into several small subroutines.\n" +
                    "3. To determine the execution time of a program.\n" +
                    "4. To interrupt the execution of a program.");
        while (true)
        {
            Scanner in = new Scanner(System.in);
            System.out.print("");
            int num = Integer.parseInt(in.next());

            if (num == 2)
            {
                break;
            }
            else System.out.println("Please, try again.");
        }//while end
    }//test end

    static void end()
    {
        System.out.println("Great,you right!");
        System.out.println("Goodbye,have a nice day!");
    }

}