import java.util.Scanner;
import java.util.ArrayList;

public class AnimalMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<>();

        System.out.println("Animal Menu");
        System.out.println("Entering nothing will stop the loop \n");

        while (true) {
            System.out.print("Enter your animals name: ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.print("Is it a dog? (true/false): ");
            boolean isDog = scanner.nextBoolean();
            scanner.nextLine();

            animals.add(new Animal(name, isDog));
        }

        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }
    }
}
