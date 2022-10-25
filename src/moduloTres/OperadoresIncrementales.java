package moduloTres;

public class OperadoresIncrementales {
    public static void main(String[] args) {

        //Pre incremento
        int i = 1;
        int j = ++i; // i = i+1;
        System.out.println("j = " + j);
        System.out.println("i = " + i);

        //post incremento: primero se asigna a la variable, y despues se incrementa
        i = 2;
        System.out.println("inicial de i = " + i);
        j = i++; //j se mantiene en 2 y i se incrementa
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Pre decremento
        i = 3;
        j = --i; //i= i-1 = 2
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //post decremento
        i = 4;
        j = i--; // primero se efectua la resta, y luego se asigna, por ello j sigue conservando el primer valor
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("++j = " + (++j));
        System.out.println("j++ = " + (j++)); //se incrementa pero hasta la siguiente asignacion
        System.out.println("j = " + j);

    }
}
