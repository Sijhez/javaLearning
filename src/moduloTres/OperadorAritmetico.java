package moduloTres;

import javax.swing.*;

public class OperadorAritmetico {
    public static void main(String[] args) {
        //tambien podemos declarar dos o mas variables asi cuando son del mismo tipo
        int i = 5, j = 4, suma = i + j;

        System.out.println(suma);

        System.out.println("i + j = " + i + j); //aqui resulta en 54, es decir, esta concatenando los numeros, para sumarlos hay que invertir el orden, o usar ()

        System.out.println( i + j + "i + j = ");
        
        int resta = i - j;
        System.out.println("resta = " + resta);

        int multi = i * j;
        System.out.println("multiplicacion = " + multi);
        
        
        int divi = i / j;
        float div2 = (float) i /j ; // aunque es flotante, las variables no lo son, asi que casteamos para realizar la division correctamente
        System.out.println("divi = " + divi);
        System.out.println("div2 = " + div2);
        
        int resto = i % j; //modulo
        System.out.println("resto = " + resto);

        resto = 8 % 5; //es tres por que sobran 3 al realizar la division
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero:"));//parseamos el input para que cambie el valor a numero integer con .parseInt

        if(numero%2 == 0){
            System.out.println("numero par = "+numero);
        } else {
            System.out.println("numero impar = "+numero);
        }

    }
}
