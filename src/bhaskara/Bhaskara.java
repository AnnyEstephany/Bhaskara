package bhaskara;

import java.util.Scanner;

public class Bhaskara {

    public static void main(String[] args) {
        //entrada
        Scanner console = new Scanner(System.in);
        System.out.print(" Digite x1: ");
        double x1 = console.nextDouble();
        System.out.print(" Digite x2: ");
        double x2 = console.nextDouble();
        System.out.print(" Digite c: ");
        double c = console.nextDouble();
        // processamento
        double s = x1 + x2 ;
        double p = x1 * x2;
        double a = c/p;
        double b = -(s*a);
        
        
        //saida
        System.out.println("A equação que tem como raizes " + x1 + " e " + x2 + " é " + a + " x² + " + b + " x + " + c );
    }

}
