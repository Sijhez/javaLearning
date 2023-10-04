package moduloCuatro;

public class SentenciaIfElse {
    public static void main(String[] args) {
        // las estructuras de control permiten validar varias condiciones y presentar diversos casos de aplicación.
        // Existe el if-else o el switch.
        float promedio = 6.6f;

        if(promedio >= 6.5 ) {
            System.out.println("Felicidades! excelente promedio");
        }  else if(promedio >=6.0 ) {
            System.out.println("Buen promedio jaja");
        } else if (promedio >= 5.5) {
            System.out.println("regulinchi...");
        } else if (promedio >= 5.0 ){
            System.out.println("necesitas esforzarte mas prro");
        } else if (promedio >= 4.0 ){
            System.out.println("insuficiente, necesitas estudiar mas!");
        } else {
            System.out.println("Reprobado alv!");
        }
        System.out.println("Tu promedio es " + promedio );
    }
}
