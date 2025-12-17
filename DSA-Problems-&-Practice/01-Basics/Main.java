import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double pi = Math.PI;
        System.out.println(pi);
        System.out.println("Perimeter of Rectangle: " + rectanglePerimeter(5, 10));
        System.out.println("Perimeter of Square: " + squarePerimeter(5));
        System.out.println("Perimeter of Rhombus: " + rhombusPerimeter(5));
        System.out.println("Volume of Cone: " + coneVolume(pi, 5, 10));
        System.out.println("Volume of Prism: " + prismVolume(234, 10));
        System.out.println("Volume of Cylinder: " + cylinderVolume(pi, 4, 15));
        System.out.println("Volume of Sphere: " + sphereVolume(pi, 4));
        System.out.println("Volume of Pyramid: " + pyramidVolume(30, 15));
        System.out.println("Curved Surface Area of Cylinder: " + cylinderCSA(pi, 5, 10));
        System.out.println("Total Surface Area of Cube: " + cubeTSA(5));
        fibonacciSeries(10);
        System.out.println("Diffrence between sum and product of 234" + productSumDiff(234));
        numFactors(12);
        // System.out.println(sumOfNumbers(num, in));
        // System.out.println(largestNum(in));
        System.out.println(add(45, 45));


    }

    static int rectanglePerimeter(int length, int breadth) {
        return 2 * (length + breadth);
    }
    static int squarePerimeter(int side) {
        return 4 * side;
    }  
    static int rhombusPerimeter(int side) {
        return 4 * side;
    }
    static double coneVolume(double pi, int radius, int height) {
        return (1.0/3)*pi* (radius*radius) * height;
    }
    static int prismVolume(int bA, int height) {
        return bA * height;
    }
    static double cylinderVolume(double pi, int radius, int height) {
        return pi * (radius*radius) * height;
    }
    static double sphereVolume(double pi, int radius) {
        return (4.0/3)*pi*(Math.pow(radius, 3));
    }
    static double pyramidVolume(int bA, int height) {
        return (1.0/3) * bA * height;
    }
    static double cylinderCSA(double pi, int radius, int height) {
        return 2 * pi * radius * height;
    }
    static double cubeTSA(int side) {
        return 6 * Math.pow(side, 2);
    }
    static void fibonacciSeries(int n) {
        int first = 0;
        int second = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }

    // https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/description/
    static int productSumDiff(int num) {
        int sum = 0;
        int product = 1;
        int digit = 0;

        while (num > 0) {
            digit = num % 10;
            sum += digit;
            product *= digit;
            num = num / 10; 
        }
        return product - sum;
    }
    static void numFactors(int num) {
        System.out.print("Factors of " + num + ": ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.err.print(i + " ");
            }
        }
        System.out.println();
    }
    // Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
    static int sumOfNumbers(Scanner in) {
        int num = in.nextInt();
        int sum = 0;
        while (num != 0) {
            sum += num;
            num = in.nextInt();
        }
        return sum;
    }
    // Take integer inputs till the user enters 0 and print the largest number from all.
    static int largestNum(Scanner in) {
        int num = in.nextInt();
        int max = num;
        while (num != 0) {
            if (num > max) {
                max = num;
            }
            num = in.nextInt();
        }
        return max;
    }
    static int add(int num1, int num2) {
        return num1 + num2;
    }

}
