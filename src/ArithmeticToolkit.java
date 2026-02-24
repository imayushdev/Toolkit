
import java.util.Scanner;

    public class ArithmeticToolkit {
       static Scanner scanner=new Scanner(System.in);

        int  num1,num2;
        static int choice;
        int add (int num1,int num2 ) {
            System.out.println("Enter the First number");
            num1 = scanner.nextInt();
            System.out.println("Enter second number");
            num2=scanner.nextInt();
            int sum = num1 + num2;
            return sum;
        }
        int subtraction (int num1,int num2)
        {System.out.println("Enter the First number");
            num1 = scanner.nextInt();
            System.out.println("Enter second number");
            num2=scanner.nextInt();
            int subtraction = num1-num2;
            return  subtraction;

        }
        int multiplication (int num1,int num2)
        {System.out.println("Enter the First number");
            num1 = scanner.nextInt();
            System.out.println("Enter second number");
            num2=scanner.nextInt();
            int multiplication= num1*num2;
            return  multiplication;

        }
        int division (int num1,int num2) {
            System.out.println("Enter the First number");
            num1 = scanner.nextInt();
            System.out.println("Enter second number");
            num2 = scanner.nextInt();
            int divsion = 0;
            if (num2 == 0) {
                System.out.println("Undefined behaviour");
            } else {
                divsion = num1 / num2;

            }
            return divsion;
        }
        int modulus (int num1,int num2)
        {
            System.out.println("Enter the First number");
            num1 = scanner.nextInt();
            System.out.println("Enter second number");
            num2 = scanner.nextInt();
            int modulus = num1 % num2;
            return modulus;
        }
        int calculator(int choice) {
            return switch (choice) {
                case 1 -> add(num1, num2);
                case 2 -> subtraction(num1, num2);
                case 3 -> multiplication(num1, num2);
                case 4 -> division(num1, num2);
                case 5 -> modulus(num1, num2);
                default -> 0;
            };



        }

        public static void ArithmeticMenu(){
            do {
                System.out.println("*****************Calculator******************");
                System.out.println("Press 1 for Addition");
                System.out.println("Press 2 for Subtraction");
                System.out.println("Press 3 for multiplication");
                System.out.println("Press 4 for Division");
                System.out.println("Press 5 for Modulus");
                System.out.println("Enter your choice");
                System.out.println("Press 0 for exit");
                Scanner scanner = new Scanner(System.in);
                int choice = scanner.nextInt();
//
                ArithmeticToolkit obj = new  ArithmeticToolkit();
                int result = obj.calculator(choice);
                System.out.println("Result = " + result);
                if(choice==6){
                    System.out.println("exiting.......");
                    break;
                }
            }
            while(choice<6);


        }
    }


