import java.util.ArrayList;
import java.util.List;

public class SublistMethod {
    public static void main(String[] args) {
        try {
            ArrayList<String> arrList = new ArrayList<>();
            arrList.add("A");
            arrList.add("B");
            arrList.add("C");
            arrList.add("D");

            System.out.println("original arrList = " + arrList);
            List<String> sublista = arrList.subList(1,2);
            System.out.println("sublista = " + sublista);

            int listSize = arrList.size();
            System.out.println("listSize = " + listSize);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("e = " + e);
        } catch (IllegalArgumentException e) {
            System.out.println("e = " + e);
        }
    }
}