import java.math.BigInteger;
import java.util.Scanner;

public class NumberToolkit {
    static Scanner scanner= new Scanner(System.in);

    public static void numberMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- NUMBER TOOLKIT ---");
            System.out.println("1. Prime Check");
            System.out.println("2. Palindrome Number");
            System.out.println("3. Armstrong Number");
            System.out.println("4. Factorial");
            System.out.println("5. Perfect Number");
            System.out.println("6. Sum of Digits ");
            System.out.println("7. Table of Number");
            System.out.println("0. Back");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1-> primeCheck();
                case 2-> palindromeCheck();
                case 3-> armstrongCheck();
                case 4-> factorial();
                case 5-> perfect ();
                case 6-> sumOfDigits();
                case 7-> tableOfNumber();
                case 0-> {
                    return;
                }
                default-> System.out.println("Invalid Choice");
            }
        }
    }
    static void primeCheck() {
        Scanner scanner = new Scanner(System.in);
        int flag=0;
        System.out.println("Enter the number which you want to check prime num or not");
        int num = scanner.nextInt();
        double sqrt = Math.sqrt(num);

        for (int i =2; i<sqrt;i++) //optimized like till num/2 or sqrt of that num(best)
        {
            if (num % i == 0) {
                flag = 1;
                break;

            }
        }
        if(flag==1){
            System.out.println("Number is not prime");
        }
        else{
            System.out.println("The num "+ num +" is an prime num");
        }
    }
    static void palindromeCheck() {
        System.out.println("Enter the num you want to check weather palindrome or not?");
        int num = scanner.nextInt();
        int x = num;
        int rev=0;
        for (;num!=0;){
            int d = num%10;
            rev = rev*10+d;
            num = num/10;

        }
        if(rev == x){
            System.out.println("The number "+ x + " is an palindrome number");
        }
        else {
            System.out.println("The number "+ x + " is not  an palindrome number");
        }

    }
    static void armstrongCheck() {
        System.out.println("Enter the number you want to check");
        int num = scanner.nextInt();
        int x = num;
        int power=0 ;
        while(num>0){
            num = num/10;
            power++;
        }
        num = x;
        int sum =0;
        while( num!=0){
            int digit = num%10;
            sum+= (int) Math.pow(digit,power);
            num = num/10;

        }
        if(sum==x){
            System.out.println("The num "+ x + " is an Armstrong number"  );
        }
        else {
            System.out.println("The num "+ x + " is not an Armstrong number");
        }


    }
    static void factorial() {
        BigInteger fact=BigInteger.ONE;
        System.out.println("Enter number whose factorial you want to find");
        int num = scanner.nextInt();
        for (int i =1;i<=num;i++){
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Factorial of the "+num + " is : "+ fact);

    }
    static void perfect () {
        System.out.println("Enter the number you want to check ");
        int num = scanner.nextInt();
        int x = num, sum = 0;
        for (int i = 1; i < num; i++)//till half optimized and universal
        {

            if (num % i == 0) {
                sum += i;

            }

        }
        if (sum == x) {
            System.out.println("The number is perfect number.");
        } else {
            System.out.println("The number is not perfect number.");
        }

    }
    static void sumOfDigits() {
        int sum =0;
        int  num;
        System.out.println("Enter the number");
        num = scanner.nextInt();
        int x = num;
        for(;num!=0;){
            int d = num%10;
            sum +=d;
            num=num/10;

        }
        System.out.println("The sum of digits of num "+ x + " is : "+sum);

    }
    static void tableOfNumber() {
        System.out.println("Enter number whose table you want to print");
        int num = scanner.nextInt();
        for(int i =0; i<=10;i++){
            System.out.println(num+" * "+i+" = "+num*i);
        }

    }
}



