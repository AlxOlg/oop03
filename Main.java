import java.util.ArrayList;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    //* "генератор" контейнеров */
    public static Container genContainer(int amt) {
        Random random = new Random();
        Container container = new Container();
        for (int i = 0; i < amt; i++) { // атозаполнение контейнера ящиками
            int weight = random.nextInt(1, 10); // случайная масса ящика
            container.addBox(new Box(weight)); // добавление нового ящика в контейнер
        }
        System.out.println(container);
        return container;
    }

    public static void main(String[] args) {

        System.out.println("КОНТЕЙНЕРЫ С ЯЩИКАМИ:");
        ArrayList<Container> c0 = new ArrayList<>();
        c0.add(genContainer(4));
        c0.add(genContainer(5));
        c0.add(genContainer(3));
        System.out.println();

        for (Container container : c0) {
            System.out.println("ДЕМО ИТЕРАЦИИ:");
            for (Box box : container) {
                System.out.println(box);
            }
            System.out.println();
        }

        System.out.println("СОРТИРОВКА ПО МАССЕ:");
        Set<Container> c1 = new TreeSet<>();
        c1.addAll(c0);
        System.out.println(c1);
        System.out.println();

        System.out.println("СОРТИРОВКА ПО КОЛИЧЕСТВУ ЯЩИКОВ:");
        Set<Container> c2 = new TreeSet<>(new ContainerCountComparator());
        c2.addAll(c0);
        System.out.println(c2);
    }
}
