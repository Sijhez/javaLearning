public class PrimitivosFloat {
    // se accede a una variable fuera del metodo estático main usando el método static
    static float varFlotante;
    public static void main(String[] args) {
        //variables de punto flotante: variables que admiten numeros muy precisos en decimales

        //float realFLoat = 2.12e3f; //2.12 exponencial 3, de tipo flotante === 2120.0
        float realFLoat = 0.00000000015f; //1.5e-10f; elevado a la potencia -10
        System.out.println("realFLoat = " + realFLoat);
        System.out.println("float corresponde en byte a  = " + Float.BYTES);
        System.out.println("float corresponde en bITES a  = " + Float.SIZE);
        System.out.println("Máximo valor para float  = " + Float.MAX_VALUE);
        System.out.println("Mínimo valor para float  = " + Float.MIN_VALUE);
        //variable de doble precision, si el número es mas grande que un float, usar double, específico para mayor longitud
        double realDouble = 3.4028235E39;
        System.out.println("realDouble = " + realDouble);
        System.out.println("double corresponde en byte a  = " + Double.BYTES);
        System.out.println("double corresponde en bITES a  = " + Double.SIZE);
        System.out.println("Máximo valor para double  = " + Double.MAX_VALUE);
        System.out.println("Mínimo valor para double  = " + Double.MIN_VALUE);
        //el valor específico de la variable float es cero
        varFlotante = 45.45f;
        System.out.println("varFlotante = " + varFlotante);
    }
}
