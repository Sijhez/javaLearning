package moduloTres;

public class OperadoresAsignacion {
    public static void main(String[] args) {
        int i = 5;
        int j = i + 4;
        //operador de suma asignacion

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        i += 4;
        System.out.println("i = " + i);

        i += 5;
        System.out.println("i = " + i);
        //operador de resta asignacion
        j -= 4;
        System.out.println("j = " + j);
        //asi mismo se le puede incluir cualquiera de los operadores básicos para generar estos operadores compuestos

        //CONCATENANDO STRINGS: generando una busqueda SQL dinámica :P
        String sqlString = "select * from clientes as c";
        sqlString += " where c.nombre='Sinuhe' ";
        sqlString += " and c.activo=1 ";
        System.out.println("sqlString = " + sqlString);



    }




}
