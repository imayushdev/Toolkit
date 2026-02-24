import java.util.Scanner;

public class MainToolkit {



        static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            while (true) {
                System.out.println("\n==== JAVA NUMBER & LOGIC TOOLKIT ====");
                System.out.println("1. Number Toolkit");
                System.out.println("2. Arithmetic Toolkit");
                System.out.println("3. Finance Toolkit");
                System.out.println("4. Conversion Toolkit");
                System.out.println("5. Math Toolkit");
                System.out.println("0. Exit");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1 -> NumberToolkit.numberMenu();

                    case 2 -> ArithmeticToolkit.ArithmeticMenu();

                    case 3 -> FinanceToolkit.financeMenu();

                    case 4 -> ConversionToolkit.ConversionMenu();

                    case 5->MathToolkit.MathMenu();

                    case 0 -> {
                        System.out.println("Exiting Toolkit...");
                        return;
                    }
                    default-> System.out.println("Invalid Choice");
                }
            }
        }
    }


