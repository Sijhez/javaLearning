package moduloTres;

import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {
        //generando un array de elementos tipo string
        String[] usernames = new String[2];
        String[] passwords = new String[2];
        // si quisieramos validar el login de uno o mas usuarios usando valores booleanos:
        usernames[0] = "Sinuhé";
        passwords[0] = "HolaMundo123";

        usernames[1] = "admin";
        passwords[1] = "holaTodos123";

        Scanner scanner = new Scanner(System.in); //generamos instancia para un scanner para que el usuario tipee
        System.out.println("INgrese el username");
        String u = scanner.next();

        System.out.println("INgrese el password");
        String p = scanner.next();

        boolean esAutenticado = false;

        for()

        if( username.equals(u) && password.equals(p) || username2.equals(u) && password2.equals(p) ){
            esAutenticado = true;
        } else {
            System.out.println("Username o contraseña incorrectos!");
        }

        if(esAutenticado){
            System.out.println( "Bienvenido usuario ".concat(u).concat("!"));
        }else {
            System.out.println("Lo siento, se requiere autenticación");
        }


    }
}
