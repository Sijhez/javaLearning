package moduloDos.Tarea;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramaManejoDeNombres {

    public static void main(String[] args) {
        String names = new String("");

          System.out.println("Ingresar nombre1");
          Scanner scanner = new Scanner(System.in);
          String nombre1 = scanner.nextLine();
          if(nombre1.isBlank()){
              System.out.println("Intente de nuevo");
          } else {
              System.out.println("Ingresar nombre2");
              Scanner scanner2 = new Scanner(System.in);
              String nombre2 = scanner2.nextLine();
              if(nombre2.isBlank()){
                  System.out.println("Intente de nuevo");
              } else {
                  System.out.println("Ingresar nombre3");
                  Scanner scanner3 = new Scanner(System.in);
                  String nombre3 = scanner3.nextLine();
                  if(nombre3.isBlank()){
                      System.out.println("Intente de nuevo");
                  }else {
                     String allNames = names.concat(nombre1.substring(1,2).toUpperCase()).concat(".").concat(nombre1.substring(nombre1.length()-2)).concat("_")
                             .concat(nombre2.substring(1,2).toUpperCase()).concat(".").concat(nombre2.substring(nombre2.length()-2)).concat("_")
                             .concat(nombre3.substring(1,2).toUpperCase()).concat(".").concat(nombre3.substring(nombre3.length()-2));
                     System.out.println(allNames);
                  }
             }
         }
    }
}
