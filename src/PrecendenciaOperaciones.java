public class PrecendenciaOperaciones {
    public static void main(String[] args) {
        int i = 14;
        int j = 8;
        int k = 20;

        double promedio =( i + j +k ) / 3d; //sin los parentesis, primero divide, y luego hace la suma de izquierda a derecha

        System.out.println("Promedio : " +promedio );

        // promedio = i + j + k / 3d * 10; sin los parentesis, primero divide(empieza de izquierda a derecha), luego multiplica y al final ejecuta la suma, esto por que la division y multiplicacion tienen prioridad sobre la suma y resta
        promedio = (i + j + k) / 3d * 10; //si agregamos mas parentesis encapsulamos mas la operacion, es decir, que primero suma y multiplica y al final divide
        System.out.println("promedio = " + promedio);
        //promedio = i + j + k / (3d * 10); //si agregamos estos parentesis entonces se realiza la multiplicacion primero, luego efectua la división y al final las sumas
        //System.out.println("promedio = " + promedio);
        promedio = (i + j + k) / (3d * 10); //aqui hace cada operacion y al final divide
        System.out.println("promedio = " + promedio);
       //usando pre-incremento y post-decremento
        promedio = ++i + j-- + k / 3d * 10; //primero ejecuta la multiplicacion, luego la division,
        System.out.println("promedio = " + promedio);
        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }
}
