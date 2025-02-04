import java.util.Scanner;
import java.util.Random;

public class Loops {

    public static void while_operation()
    {
        Scanner scanner = new Scanner(System.in);
        int age = 0;

        System.err.print("Please enter your age: ");
        age = scanner.nextInt();

        while(age < 0){
            System.err.println("Your age can not be negative number!!");
            System.err.print("Please enter your age: ");
            age = scanner.nextInt();
        };

        System.err.println("You are " + age + " old buddy");
        scanner.close();
    }
    public static void do_while()
    {

        Scanner scanner = new Scanner(System.in);
        int age = 0;

        System.err.print("Please enter your age: ");
        age = scanner.nextInt();

        do{
            System.err.println("Your age can not be negative number!!");
            System.err.print("Please enter your age: ");
            age = scanner.nextInt();
        }while(age < 0);

        System.err.println("You are " + age + " old buddy");
        scanner.close();
    }

    public static void random_game()
    {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int random_numer = random.nextInt(1,11);

        System.err.println("Welcome to the guess number game");
        System.err.println("Please enter the number between 1-10: ");

        do{
            System.err.print("Please enter the guessed number: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < random_numer) {
                System.err.println("Too low");
            }else if(guess > random_numer){
                System.err.println("Too high");
            }else{
                System.err.println("Kudos you won the game in " + attempts + " attempts");
            }

        }while(guess != random_numer);

        scanner.close();
    }
    public static void for_loop() throws InterruptedException
    {
        for(int i = 0; i <= 10;i++){
            System.err.println(i);
            Thread.sleep(1000);
        }
    }

    public static void break_continue()
    {
        for(int i = 0; i <= 10; i++){
            if(i == 5){
                break;
            }
            System.err.println(i);
        }

        for(int i = 0; i <= 10; i++){
            if(i == 5){
                continue;
            }
            System.err.println(i);
        }
    }

    static void instead_loop()
    {
        System.err.println("Wow cool bro");
        System.err.println("It is so amazing");
        System.err.println("I am stupid bro");
    }

    static void giving_parametres(String name , int age)
    {
        System.err.println("My name is " + name);
        System.err.println("I am " + age + " years old");
    }

    static double returning_statements(double number)
    {
        return number * number;
    }

    static int add(int a , int b)
    {
        return a + b;
    }

    static int add(int a, int b , int c)
    {
        return a + b + c;
    }
    public static void main(String[] args) throws InterruptedException
    {

        System.err.println(add(1, 1 , 1));
        // double result = returning_statements(5);
        // System.err.println(result);
        // giving_parametres(name, age);
        // instead_loop();
        // break_continue();
        // for_loop();
        // random_game();
        // while_operation();
        // do_while();
    }
}