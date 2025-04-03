import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) throws FileNotFoundException{
        File file;
        Scanner input;
        try {
            file = new File("scores5.txt");
            input = new Scanner(file);
            while (input.hasNext()) {
                String firstName = input.next();
                String lastName = input.next();
                String IQ = input.next();
                System.out.println(firstName +  " " + lastName + " " + IQ);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}
