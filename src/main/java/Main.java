import javax.imageio.metadata.IIOMetadataFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("jaki to ma być kwadrat? (2 - 2x2, 4 - 4x4, 6 - 6x6, 10 - 10x10):");
        int size = scanner.nextInt();
        if (size == 2 || size == 4 || size == 6 || size == 10) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Invalid size entered. Please enter 2, 4, 6, or 10.");
        }
    }
}