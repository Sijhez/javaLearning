package moduloDos;

public class EjemploStringMetodos {
    public static void main(String[] args) {
       
        String nombre = "Sinuhé";
        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Sinuhé\") = " + nombre.equals("Sinuhé"));
        System.out.println("nombre.equals(\"Sinuhé\") = " + nombre.equals("sinuhé"));
        System.out.println("nombre.equalsIgnoreCase(\"Sinuhé\") = " + nombre.equalsIgnoreCase("Sinuhé"));
        System.out.println("nombre.compareTo(\"Sinuhé\") = " + nombre.compareTo("Sinuhé"));//comparando a nivel de orden alfabético léxico gráfico, segun la tabla unicode
                                                             //retorna un intiger, si es cero, los dos valores son idénticos
        //usar equals y usar compareTo sirven para lo mismo, uno retorna un boolean, y el otro retorna un numero, si es cero ambos valores son iguales
        System.out.println("nombre.compareTo(\"An drés\") = " + nombre.compareTo("Andrés"));//si retorna un numero, es el ordenamiento de cada caracter en la tabla unicode
        System.out.println("nombre.charAt(3) = " + nombre.charAt(3));//retorna el caracter con respecto al índice que se le esta proporcionando
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));
        System.out.println("nombre.substring(1) = " + nombre.substring(1)); //devuelve un fragmento del string, indicando el índice de donde lo va a tomar
        System.out.println("nombre.substring(1,4) = " + nombre.substring(1,4)); //devuelve el fragmento indicado con un indice de inicio y un indice final, pero sin retornar este ultimo
        System.out.println("nombre.substring(0,6) = " + nombre.substring(0,6)); //retorna el orden completo, por que el 6 no existe y devuelve el anterior a este
        System.out.println("nombre.substring(nombre.length()-1) = " + nombre.substring(nombre.length()-1));
        
        //más metodos
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"a\",\".\") = " + trabalenguas.replace("a",".")); //se altera el string de salida, pero no el inicial
        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas.indexOf(\"a\") = " + trabalenguas.indexOf("a")); //retorna el index del PRIMER caracter de coincidencia
        System.out.println("trabalenguas.lastIndexOf(\"a\") = " + trabalenguas.lastIndexOf("a")); //retorna el index del último caracter de coincidencia
        System.out.println("trabalenguas.indexOf('z') = " + trabalenguas.indexOf('z')); //cuando retorna -1 es por que el caracter no existe
        System.out.println("trabalenguas.contains(\"lengu\") = " + trabalenguas.contains("lengu")); //retorna un booleano, pregiuntando si el string esta contenido en el elemento
        System.out.println("trabalenguas.startsWith(\"lenguas\") = " + trabalenguas.startsWith("lenguas")); //retorna un booleano preguntando si el string comienza con esa variable
        System.out.println("trabalenguas.endsWith(\"s\") = " + trabalenguas.endsWith("s"));
        System.out.println(" trabalenguas ");
        System.out.println(" trabalenguas ".trim());//este método elimina los espacios a los lados del string

    }
}
