import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        String file = "src/main/resources/airports.csv";
        String line;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово:");
        String str = sc.nextLine().toString();
        long time = System.currentTimeMillis();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while((line = br.readLine()) != null){
                String[] cols = line.split(",");
                System.out.println(cols[1].startsWith(sc.toString()));
//                System.out.println(line);
            }
        } catch (Exception e){
            System.out.println(e);
        }
        System.out.println(System.currentTimeMillis() - time);
    }
}
