package bt01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Rectangle Info:");
        System.out.print("width = ");
        double w = Double.parseDouble(sc.nextLine());
        System.out.print("height = ");
        double h = Double.parseDouble(sc.nextLine());
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(w);
        rectangle.setHeight(h);
        rectangle.printInfo();
    }
}
