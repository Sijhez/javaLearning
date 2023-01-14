package moduloTres;

import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {
        // introduccion de arreglos: los arreglos permiten almacenar una serie de datos del mismo tipo, por ejemplo, array de numeros, o de strings, etc.
       /* String[] usernames = new String[3]; //dentro de los corchetes integramos el numero de elementos que van a ser
        String[] passwords = new String[3];

        usernames[0] = "Sinuhé";
        passwords[0] = "HolaMundo123";
        //String username = "Sinuhé";
        //String password = "HolaMundo123";
        usernames[1] = "admin";
        passwords[1] = "12345";

        usernames[2] = "pepe";
        passwords[2] = "huevos";
        */

        String[] usernames = {"Sinuhé", "admin", "pepe"}; //dentro de los corchetes integramos el numero de elementos que van a ser
        String[] passwords = {"HolaMundo123", "12345", "huevos" };



        //String username2 = "admin";
        //String password2 = "12345";

       Scanner scanner = new Scanner(System.in); //entrada de string por parte del usuario
        System.out.println("Ingrese el username");
        String u = scanner.next();

        System.out.println("Ingrese el password");
        String p = scanner.next();

        boolean esAutenticado = false;

        for(int i = 0; i< usernames.length; i++) {
            //ejemplo usando el ternario en vez de usar el if()
            esAutenticado = (usernames[i].equals(u) && passwords[i].equals(p)) ? true : esAutenticado; //usamos el valor por default (que es false), ya que si no, siempre estaría iterando por que no tenemos el brak para detener la iteración

            /*if( usernames[i].equals(u) && passwords[i].equals(p) ){
                esAutenticado = true;
                break; //sirve para salirse del for, o romper la iteracion
            }*/
        }
/*
        if( username.equals(u) && password.equals(p) || username2.equals(u) && password2.equals(p)  ){
            esAutenticado = true;
        } else {
            System.out.println("Username o password incorrecto");
        }
*/
        String mensaje = esAutenticado ? "Bienvenido usuario ".concat(u).concat("!") : "Username o password incorrecto \n Lo siento, requiere autenticacion";
        System.out.println("mensaje = " + mensaje);
        /*
        if(esAutenticado){
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        } else {
            System.out.println("Username o password incorrecto");
            System.out.println("Lo siento, requiere autenticacion");
        }
         */


    }
}
