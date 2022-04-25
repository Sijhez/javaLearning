package MiEventoAgendado;

public class Evento implements EventoAgenda {
    //tipos de variables
    private String Dia;
    private String Mes;

    //constructor
    public Evento (String Dia, String Mes){
        this.Dia = Dia;
        this.Mes = Mes;
    }

    //GEt y set para obtener y setear valores:

    public String getMes() {
        return Mes;
    }

    public void setMes(String mes) {
        Mes = mes;
    }

    public String getDia() {
        return Dia;
    }

    public void setDia(String dia) {
        Dia = dia;
    }

    //conseguimos el metodo y override para modificarlo
    @Override
    public String AgendaEvento() {
        return "El evento será el día " + this.Dia + " del mes " + this.Mes;
    }


}
