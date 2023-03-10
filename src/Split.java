
import java.util.*;
import java.util.function.BiConsumer;

public class Split {

    Scanner scanner = new Scanner(System.in);
    Hashtable<String, ArrayList> hashtable = new Hashtable<>();
    static HashMap<String, Integer> hashMap = new HashMap<>();

    public void addDish(){
        System.out.println("Enter the dish");
        String dish = scanner.nextLine();
        System.out.println("Enter the dish price");
        Integer price = scanner.nextInt();
        hashMap.put(dish, price);
        scanner.nextLine();
    }

    public void addPeople(){
        System.out.println("Enter the name");
        String name = scanner.nextLine();
        ArrayList<String> al = new ArrayList<>();
        System.out.println(hashMap);
        System.out.println("Enter the dishes had   Note: Type X when done");

        while(true){
            String dish = scanner.nextLine();
            if(dish.equalsIgnoreCase("X")){
                break;
            }
            else if(!hashMap.containsKey(dish)){
                System.err.println("dish not available in the added dishes menu...please retype");
                continue;      // will work the same without continue statement
            }
            else{
                al.add(dish);
                System.out.println(dish + " added");
                hashtable.put(name, al);

            }
        }
    }

    public void showSplit(){

        System.out.println(hashMap);
        System.out.println();

        BiConsumer<String, ArrayList> action = new MyBiConsumer();

        hashtable.forEach(action);

        Iterator itr = hashtable.values().iterator();

    }

}
