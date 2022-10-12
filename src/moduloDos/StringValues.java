package moduloDos;

public class StringValues {

    public static void main(String[] args) {
        //para concatenar string solamente se usa el operador +

        //podemos realizar comparaciones por referencia usando equals()
        String str1 = "Hola Sinuhé";
        String str2 = new String("Hola Sinuhé");
        //spermite checar si son el mismo objeto
        System.out.println("SOn el mismo objeto? = " + (str1 == str2));
        // resulta falso por que son distintas instancias, o son objetos distintos por que se construyen diferente

        //usando .equals() podemos averiguar si ambos strings contienen el mismo valor
        System.out.println("Tienen el mismo valor? ="+ str1.equals(str2));

    }
    //Metodos de string:


}
