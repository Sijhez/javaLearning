package moduloTres;

import java.util.Scanner;

public class OperadorTernarioNumeroMayor {
    public static void main(String[] args) {
        int max = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("INgrese un numero");
        int num1 = scanner.nextInt();

        System.out.println("INgrese un segundo numero");
        int num2 = scanner.nextInt();

        System.out.println("INgrese un tercer numero");
        int num3 = scanner.nextInt();

        System.out.println("INgrese un cuarto numero");
        int num4 = scanner.nextInt();

        // comparamos cual de los números es el mayor, aprovechando que se sobreescribe el valor sucesivo.
        max = (num1>num2) ? num1 : num2;
        max = (max>num3) ? max : num3;
        max = (max>num4) ? max : num4;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("El numero mayor es " + max);

    }
}
