import java.util.Scanner;

public class ConversionToolkit {

    public static void ConversionMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n====== CONVERSION TOOLKIT ======");
            System.out.println("1. Temperature Conversion");
            System.out.println("2. Length Conversion");
            System.out.println("3. Weight Conversion");
            System.out.println("4. Time Conversion");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1 -> {
                    System.out.println("1. Celsius to Fahrenheit");
                    System.out.println("2. Fahrenheit to Celsius");
                    System.out.print("Choose: ");
                    int ch = scanner.nextInt();
                    System.out.print("Enter value: ");
                    double val = scanner.nextDouble();
                    temperatureConvert(ch, val);
                }

                case 2 -> {
                    System.out.println("1. Meter to Kilometer");
                    System.out.println("2. Kilometer to Meter");
                    System.out.print("Choose: ");
                    int ch = scanner.nextInt();
                    System.out.print("Enter value: ");
                    double val = scanner.nextDouble();
                    lengthConvert(ch, val);
                }

                case 3 -> {
                    System.out.println("1. Kilogram to Gram");
                    System.out.println("2. Gram to Kilogram");
                    System.out.print("Choose: ");
                    int ch = scanner.nextInt();
                    System.out.print("Enter value: ");
                    double val = scanner.nextDouble();
                    weightConvert(ch, val);
                }

                case 4 -> {
                    System.out.println("1. Seconds to Minutes");
                    System.out.println("2. Minutes to Hours");
                    System.out.print("Choose: ");
                    int ch = scanner.nextInt();
                    System.out.print("Enter value: ");
                    double val = scanner.nextDouble();
                    timeConvert(ch, val);
                }

                case 0 -> {
                    System.out.println("Exit");
                    scanner.close();
                    return;
                }

                default -> System.out.println("Invalid option");
            }
        }
    }

    // Temperature
    static void temperatureConvert(int choice, double v) {
        if (choice == 1) {
            double f = (v * 9 / 5) + 32;
            System.out.println("Result: " + f + " F");
        }
        else if (choice == 2) {
            double c = (v - 32) * 5 / 9;
            System.out.println("Result: " + c + " C");
        }
        else {
            System.out.println("Invalid option");
        }
    }

    // Length
    static void lengthConvert(int choice, double v) {
        if (choice == 1)
            System.out.println("Result: " + (v / 1000) + " km");
        else if (choice == 2)
            System.out.println("Result: " + (v * 1000) + " m");
        else
            System.out.println("Invalid option");
    }

    // Weight
    static void weightConvert(int choice, double v) {
        if (choice == 1)
            System.out.println("Result: " + (v * 1000) + " g");
        else if (choice == 2)
            System.out.println("Result: " + (v / 1000) + " kg");
        else
            System.out.println("Invalid option");
    }

    // Time
    static void timeConvert(int choice, double v) {
        if (choice == 1)
            System.out.println("Result: " + (v / 60) + " minutes");
        else if (choice == 2)
            System.out.println("Result: " + (v / 60) + " hours");
        else
            System.out.println("Invalid option");
    }
}