
import java.util.ArrayList;
import java.util.function.BiConsumer;

class MyBiConsumer implements BiConsumer {

    @Override
    public void accept(Object o, Object o2) {

        Integer price = 0;
        for ( Object s: (ArrayList)o2) {

               price += Split.hashMap.get(s);

        }
        System.out.println(o+" ==> "+o2 + " = " +price);
        System.out.println();

    }
}
