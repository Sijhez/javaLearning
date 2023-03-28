package moduloTres;

import java.util.Scanner;

public class TareaNumerosOrdenados {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;

        System.out.println("Ingresar primer numero:");
        Scanner scanner1 = new Scanner(System.in);
        num1 = Integer.parseInt(scanner1.nextLine());

        System.out.println("Ingresar segundo numero:");
        Scanner scanner2 = new Scanner(System.in);
        num2 = Integer.parseInt(scanner2.nextLine());

        System.out.println("El número mayor es " + (num1 > num2 ? num1 : num2) + " y el menor es " + (num1 > num2 ? num2 : num1) );


    }
}
