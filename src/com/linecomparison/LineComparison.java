package com.linecomparison;
import java.util.Scanner;

public class LineComparison {
        public static void main(String[] args) {
            int x1, x2, y1, y2;
            double length;
            System.out.println("Welcome to Line Comparison Computation Program");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first two co-ordinates:");
            x1=sc.nextInt();
            y1=sc.nextInt();
            System.out.println("Enter second two co-ordinates:");
            x2=sc.nextInt();
            y2=sc.nextInt();
            length = Math.sqrt( (x2 - x1) ^ 2 + (y2- y1) ^ 2);
            System.out.println("Length of the line:" + length);
            sc.close();
        }
}
