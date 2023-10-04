package MiEventoAgendado;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CsvReader {
    public static void main(String[] args) {
        String line = "";
        String splitBy = ",";
        try {
            BufferedReader br =  new BufferedReader(new FileReader("/home/sjardinez/Desktop/sjh/javaLearning/src/MiEventoAgendado/pruebaArchivo.csv"));
            while ((line = br.readLine()) != null){
                String[] employee = line.split(splitBy);
                // usando coma como separador
                System.out.println("URL = " + employee[0] + ", name = " + employee[1] + ", string = " + employee[2] );
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
