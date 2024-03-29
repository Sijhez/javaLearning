package MiEventoAgendado;

import java.io.*;
import java.util.Arrays;

public class EjemploCsvReader {
    public static final String delimiter = ",";
    public static void read(String csvFile) {
        try {
            File file = new File(csvFile);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = " ";
            String [] tempArr;
            while ((line = br.readLine() ) != null ) {
             tempArr = line.split(delimiter);
                String [] arrNuevo = new String[0];
             for (  String tempStr : tempArr) {
                 System.out.print(tempStr + " ");
             }
                System.out.println();

            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        //add csv file to read
        String csvFile = "/home/sjardinez/Desktop/sjh/javaLearning/src/MiEventoAgendado/pruebaArchivo.csv";
        EjemploCsvReader.read(csvFile);
    }
}
