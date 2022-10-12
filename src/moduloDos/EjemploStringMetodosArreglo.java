package moduloDos;

public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {
       
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.length() = " + trabalenguas.length()); //cuando se le pide la extensión del String, se pide a través del método
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());//.toCharArray convierte el string en un arreglo de tipo Char

        char[] arreglo = trabalenguas.toCharArray();// genera un array de characters
        int largo = arreglo.length;//cuando se pide la extensión del array del string, se solicita a través de una propiedad
        System.out.println("largo = " + largo);
        for(int i=0; i < largo; i++){
            char letra =  arreglo[i];
            
            System.out.print(letra);
        }
        System.out.println();
        System.out.println("trabalenguas.split(\"a\") = " + trabalenguas.split("a"));
        String[] arreglo2 = trabalenguas.split("a");
        //devuelve un arreglo de string donde cada elemento se compone de las letras separadas por el regex dentro de .split("separador")

        int l = arreglo2.length;
        for (int j = 0; j < l; j++){
            System.out.println("arreglo2[j] = " + arreglo2[j]);
        }

        String archivo = "mi.foto.preciosa.js";
        String[] archivoArr = archivo.split("\\."); //el regex no permite usar punto solamente, por lo que se debe usar el doble caracter de escape o backslash, o corchetes []
        int largo2 = archivoArr.length;
        for (int j = 0; j < largo2; j++){
            System.out.println("archivoArr[j] = " + archivoArr[j]);
        }

        System.out.println("extension = "+ archivoArr[largo2-1]);
    }
}
