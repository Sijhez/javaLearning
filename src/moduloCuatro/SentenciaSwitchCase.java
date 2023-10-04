package moduloCuatro;

public class SentenciaSwitchCase {
    public static void main(String[] args) {
        // manejo de flujos de control con el Switch
        // switch acepta integer, short, byte, char, y String como clase wrapper

        int mes = 12;
        String nombreMes = null;

        switch (mes) {
            case 1:
                nombreMes = "enero";
                break;
            case 2:
                nombreMes = "febrero";
                break;
            case 3:
                nombreMes = "marzo";
                break;
            case 4:
                nombreMes = "abril";
                break;
            case 5:
                nombreMes = "mayo";
                break;
            case 6:
                nombreMes = "junio";
                break;
            case 7:
                nombreMes = "julio";
                break;
            case 8:
                nombreMes = "agosto";
                break;
            case 9:
                nombreMes = "septiembre";
                break;
            case 10:
                nombreMes = "octubre";
                break;
            case 11:
                nombreMes = "noviembre";
                break;
            case 12:
                nombreMes = "diciembre";
                break;
            default:
                nombreMes = "indefinido";

        }
        System.out.println("NOmbre del mes =" + nombreMes);

        char num = 'd';

        switch (num){
            case 0:
                System.out.println("EL num es cero");
                break;
            case 1:
                System.out.println("El num es uno");
                break;
            case 2:
                System.out.println("El num es dos");
                break;
            case 3:
                System.out.println("El num es tres");
                break;
            case 'a':
                System.out.println("el num es a ");
                break;
                //en caso de no coincidir con ningún caracter entonces se ejecuta un código default
            default:
                System.out.println("numnero o caracter desconocido");
        }

        String nombre = "Sinuhé";
        switch (nombre){
            case "admin":
                System.out.println("Hola Admin, bienvenido!");
                break;
            case "Sinuhé":
                System.out.println("Hola SInuhe, bienvenido!");
                break;
            case "Pepe":
                System.out.println("Hola Pepe, bienvenido!");
                break;
            default:
                System.out.println("Usuario desconocido");
        }

    }
}
