package MiEventoAgendado;

public class Autor implements EventoAgenda{
    //tipos de variables
    private String Name;
    private String LastName;

    //constructor
    public Autor ( String Name, String LastName ){
        this.LastName = LastName;
        this.Name = Name;
    }

    //metodos get y set


    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String AgendaEvento() {
        return "El autor del evento es " + this.Name + this.LastName;
    }

}
