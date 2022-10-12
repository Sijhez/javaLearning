package moduloDos;

public class EjemploString {
    public static void main(String[] args) {
        // creacion de una referencia al objeto String
        String curso = "Programación Java";
        String cursoDos = new String("programación java");
        
        boolean esIgual = cursoDos == curso;
        System.out.println("esIgual = " + esIgual); //comparando el objeto string, como son diferentes es false
        
        esIgual = curso.equals(cursoDos);
        System.out.println("esIgual = " + esIgual);//comparando el valor de texto
        
     //   esIgual = curso.equalsIgnoreCase(cursoDos);  //comparacion de valor ignorando mayúsculas y minúsculas
        //  System.out.println("esIgual?? = " + esIgual);

        String cursoTres = "Programación Java";
        esIgual = curso == cursoTres; //es el mismo objeto, pero se guarda con distinta variable.
        System.out.println("es igual = " + esIgual);

    }
}
