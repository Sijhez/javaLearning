package moduloDos;

public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = "c";

        StringBuilder sb = new StringBuilder(a);// el stringBuilder es mutable, a diferencia del string que es inmutable
        //este método es mucho mas rápido que el de concat y el de suma de strings

        //generamos un numero long para tomar el tiempo de inicio
        long inicio = System.currentTimeMillis();
        //el objeto system ya tiene un sistema para tomar el tiempo

        //iniicializando un contador de tipo for para iteración
        for (int i =0; i<10000; i++){

             // c=c.concat(a).concat(b).concat("\n"); //la concatenacion se da en 3ms
           // c += a + b + "\n"; // este metodo se demoró 28ms
         // métodos encadenados, usamos la misma referencia y le sumamos métodos

            //stringBuilder es el más rápido y eficiente al momento de concatenar strings, solo tardó 1ms
         sb.append(a).append(b).append("\n"); //concatenamos elementos string con el método .append
        }

        //generamos un long para el tiempo final cuando termine el proceso
        long fin = System.currentTimeMillis();


        System.out.println(fin -inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString() );//generar el string completo

    }
}
