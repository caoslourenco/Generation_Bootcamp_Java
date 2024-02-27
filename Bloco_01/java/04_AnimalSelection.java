import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the characteristics of an animal (vertebrate/invertebrate, mammal/insect, omnivorous/herbivorous): ");
        String characteristic1 = scanner.next();
        String characteristic2 = scanner.next();
        String characteristic3 = scanner.next();

        String animal;

        if (characteristic1.equals("vertebrate") && characteristic2.equals("mammal") && characteristic3.equals("omnivorous")) {
            animal = "Human";
        } else if (characteristic1.equals("invertebrate") && characteristic2.equals("insect") && characteristic3.equals("herbivorous")) {
            animal = "Caterpillar";
        } else {
            animal = "Unknown";
        }

        System.out.println("The selected animal is: " + animal);
    }
}