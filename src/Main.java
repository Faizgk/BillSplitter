import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Split split = new Split();


        while(true){
            System.out.println("1 -----> add Dish");
            System.out.println("2 -----> add person");
            System.out.println("3 -----> show Split bill");
            System.out.println("Press any other key to exit");
            int choice = 0;
            try {
                choice = new Scanner(System.in).nextInt();
            }catch (InputMismatchException e){
                choice = 0;
            }
            switch(choice){
                case 1: split.addDish();
                break;
                case 2 : split.addPeople();
                break;
                case 3 : split.showSplit();
                break;
                default:
                    System.out.println("Exiting....");
                    System.exit(0);
            }

        }

    }
}