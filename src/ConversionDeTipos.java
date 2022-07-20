public class ConversionDeTipos {
    public static void main(String[] args) {

        String numeroStr = "50";

        int numeroInt = Integer.parseInt(numeroStr);//conversion de strings en numeros enteros
        System.out.println("numeroInt = " + numeroInt);

        String realStr = "12231.24"; //conversion de string en numero flotante
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);
    }
}
