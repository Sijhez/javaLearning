package MiEventoAgendado;
//correr esta linea de codigo para entender como funciona la interfaz EventoAgenda
public class EventoAgendado {
    //este es nuestro principal que reune las variables y da salida
    public static void main(String[] args) {
        Evento evento = new Evento("Martes", "Abril");
        Autor autor = new Autor("Pancho", "Pantera");

        AgendarEvento eventoAgendado = new AgendarEvento(evento, autor);
        eventoAgendado.muestraEvento();

    }
}
