package MiEventoAgendado;

public class AgendarEvento {
    //generamos el objeto a imprimir, en este caso el evento:
    private Evento objetoEvento; //este ultimo es el nombre del objeto
    private Autor objetoAutor;

    //constructor del objeto
    public AgendarEvento (Evento objetoEvento, Autor objetoAutor) {
        this.objetoEvento = objetoEvento;
        this.objetoAutor = objetoAutor;
    }


    //metodo del objeto:
    public void muestraEvento(){
        //codigo relacionado con la salida
        System.out.println(this.objetoEvento.AgendaEvento() + " creado por "+ this.objetoAutor.AgendaEvento() );
    }
}
