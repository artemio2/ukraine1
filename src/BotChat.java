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

    static void first() // 1 stage
    {
        System.out.println("Hello! My name is Artem.");
        System.out.println("I was created in 2021.");
        System.out.println("Please, remind me your name.");
    }



    static void second() // 2 stage
    {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }


    static void third() // 3 stage
    {
        System.out.println("Let me guess your age.");
        System.out.println("Say me remainders of dividing your age by 3, 5 and 7.");
        int r3 = scanner.nextInt();
        int r5 = scanner.nextInt();
        int r7 = scanner.nextInt();
        int age = (r3 * 70 + r5 * 21 + r7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }//guess end

    static void fourth() //4 stage
    {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++)
        {
            System.out.printf("%d!\n", i);
        }
    }

    static void fifth() //5 stage
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
            int number = Integer.parseInt(in.next());

            if (number == 2)
            {
                break;
            }
            else System.out.println("Please, try again.");
        }
    }

    static void end()
    {
        System.out.println("Great,you right!");
        System.out.println("Goodbye,have a nice day!");
    }

}