import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fr = new FileReader("path of file");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a command : ");
        int command = scanner.nextInt();
        switch (command) {
            case 0 -> {

            }
        }
    }
}
