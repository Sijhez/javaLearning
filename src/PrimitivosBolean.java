public class PrimitivosBolean {
    public static void main(String[] args) {
        
        boolean datoLogico = true;//creación de instancia del objeto
        System.out.println("datoLogico = " + datoLogico);

        double d = 98765.43e-3; // 98.76543 exponente menos 3 se recorre hacia la izquierda
        System.out.println("d = " + d);

        float f = 1.2345e2f; //123.45
        System.out.println("f = " + f);

        datoLogico = d < f ; //comparacion para generar un valor lógico (true o false)
        System.out.println("datoLogico = " + datoLogico);

        boolean esIgual = (3-3 ==1);
        System.out.println("esIgual = " + esIgual);

    }
}
