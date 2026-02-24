import java.util.Scanner;

public class MathToolkit {

        public static void MathMenu() {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("\n====== MATH TOOLKIT ======");
                System.out.println("1. Even or Odd");
                System.out.println("2. Square");
                System.out.println("3. Cube");
                System.out.println("4. Square Root");
                System.out.println("5. Count Divisors");
                System.out.println("6. GCD / HCF");
                System.out.println("7. LCM");
                System.out.println("8. Percentage");
                System.out.println("9. Average");
                System.out.println("0. Exit");
                System.out.print("Choose option: ");

                int choice = scanner.nextInt();

                switch (choice) {

                    case 1 -> {
                        System.out.print("Enter number: ");
                        int n = scanner.nextInt();
                        evenOdd(n);
                    }

                    case 2 -> {
                        System.out.print("Enter number: ");
                        int n = scanner.nextInt();
                        square(n);
                    }

                    case 3 -> {
                        System.out.print("Enter number: ");
                        int n = scanner.nextInt();
                        cube(n);
                    }

                    case 4 -> {
                        System.out.print("Enter number: ");
                        double n = scanner.nextDouble();
                        squareRoot(n);
                    }

                    case 5 -> {
                        System.out.print("Enter number: ");
                        int n = scanner.nextInt();
                        countDivisors(n);
                    }

                    case 6 -> {
                        System.out.print("Enter two numbers: ");
                        int a = scanner.nextInt();
                        int b = scanner.nextInt();
                        gcd(a, b);
                    }

                    case 7 -> {
                        System.out.print("Enter two numbers: ");
                        int a = scanner.nextInt();
                        int b = scanner.nextInt();
                        lcm(a, b);
                    }

                    case 8 -> {
                        System.out.print("Enter obtained marks: ");
                        double obtained = scanner.nextDouble();
                        System.out.print("Enter total marks: ");
                        double total = scanner.nextDouble();
                        percentage(obtained, total);
                    }

                    case 9 -> {
                        System.out.print("Enter count of numbers: ");
                        int count = scanner.nextInt();
                        double[] arr = new double[count];
                        for (int i = 0; i < count; i++) {
                            arr[i] = scanner.nextDouble();
                        }
                        average(arr);
                    }

                    case 0 -> {
                        System.out.println("Exit");
                        return;
                    }

                    default -> System.out.println("Invalid choice");
                }
            }
        }



        static void evenOdd(int n) {
            System.out.println(n % 2 == 0 ? "Even" : "Odd");
        }

        static void square(int n) {
            System.out.println("Square: " + (n * n));
        }

        static void cube(int n) {
            System.out.println("Cube: " + (n * n * n));
        }

        static void squareRoot(double n) {
            System.out.println("Square Root: " + Math.sqrt(n));
        }

        static void countDivisors(int n) {
            int count = 0;
            System.out.print("Divisors: ");
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    System.out.print(i + " ");
                    count++;
                }
            }
            System.out.println("\nTotal Divisors: " + count);
        }

        static void gcd(int a, int b) {
            int x = a, y = b;
            while (y != 0) {
                int r = x % y;
                x = y;
                y = r;
            }
            System.out.println("GCD : " + x);
        }

        static void lcm(int a, int b) {
            int g = gcdReturn(a, b);
            int l = (a * b) / g;
            System.out.println("LCM: " + l);
        }

        static int gcdReturn(int a, int b) {
            while (b != 0) {
                int r = a % b;
                a = b;
                b = r;
            }
            return a;
        }

        static void percentage(double obtained, double total) {
            double p = (obtained / total) * 100;
            System.out.println("Percentage: " + p + "%");
        }

        static void average(double[] arr) {
            double sum = 0;
            for (double v : arr) sum += v;
            System.out.println("Average: " + (sum / arr.length));
        }
    }

