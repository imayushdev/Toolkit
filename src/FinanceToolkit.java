import java.util.Scanner;

public class FinanceToolkit {
   static Scanner scanner= new Scanner(System.in);


        public static void financeMenu() {

            while (true) {
                System.out.println("\n--- FINANCE TOOLKIT ---");
                System.out.println("1. Simple Interest");
                System.out.println("2. Compound Interest");
                System.out.println("3. EMI Calculator");
                System.out.println("4. Profit / Loss");
                System.out.println("5. Percentage Calculator");
                System.out.println("0. Back");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1 -> simpleInterest();
                    case 2 -> compoundInterest();
                    case 3 -> emiCalculator();
                    case 4 -> profitLoss();
                    case 5 -> percentageCalculator();
                    case 0 -> { return; }
                    default -> System.out.println("Invalid Choice");
                }
            }
        }

        static void simpleInterest() {
            System.out.print("Enter Principal: ");
            double p = scanner.nextDouble();
            System.out.print("Enter Rate (%): ");
            double r = scanner.nextDouble();
            System.out.print("Enter Time (years): ");
            double t = scanner.nextDouble();

            double si = (p * r * t) / 100;
            System.out.println("Simple Interest = " + si);
        }

        static void compoundInterest() {
            System.out.print("Enter Principal: ");
            double p = scanner.nextDouble();
            System.out.print("Enter Rate (%): ");
            double r = scanner.nextDouble();
            System.out.print("Enter Time (years): ");
            double t = scanner.nextDouble();

            double amount = p * Math.pow((1 + r / 100), t);
            double ci = amount - p;

            System.out.println("Compound Interest = " + ci);
            System.out.println("Total Amount = " + amount);
        }

        static void emiCalculator() {
            System.out.print("Enter Loan Amount: ");
            double p = scanner.nextDouble();
            System.out.print("Enter Annual Interest Rate (%): ");
            double annualRate = scanner.nextDouble();
            System.out.print("Enter Time (years): ");
            int years = scanner.nextInt();

            double r = annualRate / 12 / 100;
            int n = years * 12;

            double emi = (p * r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1);
            System.out.println("Monthly EMI = " + emi);
        }

        static void profitLoss() {
            System.out.print("Enter Cost Price (CP): ");
            double cp = scanner.nextDouble();
            System.out.print("Enter Selling Price (SP): ");
            double sp = scanner.nextDouble();

            if (sp > cp) {
                System.out.println("Profit = " + (sp - cp));
            } else if (cp > sp) {
                System.out.println("Loss = " + (cp - sp));
            } else {
                System.out.println("No Profit No Loss");
            }
        }

        static void percentageCalculator() {
            System.out.print("Enter Value: ");
            double value = scanner.nextDouble();
            System.out.print("Enter Total: ");
            double total = scanner.nextDouble();

            double percent = (value / total) * 100;
            System.out.println("Percentage = " + percent + "%");
        }
    }

