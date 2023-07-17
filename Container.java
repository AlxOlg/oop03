import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Container implements Comparable<Container>, Iterable<Box> {

    //* индекс для ID */
    protected static int indexContainer;
    static {
        indexContainer = 1;
    }

    private List<Box> boxes; // список ящиков в контейнере
    private final String containerID; // ID контейнера

    //* конструктор Container */
    public Container() {
        this.containerID = String.format("ID_%d", indexContainer++);
        boxes = new ArrayList<>();
    }

    //* добавить ящик */
    public void addBox(Box box) {
        boxes.add(box);
    }

    //* получить количество ящиков */
    public int getNumberOfBoxes() {
        return boxes.size();
    }

    //* получить массу контейнера (всех ящиков) */
    public int getContainerWeight() {
        int containerWeight = 0;
        for (Box box : boxes) {
            containerWeight += box.getBoxWeight();
        }
        return containerWeight;
    }

    //* сравнение масс */
    @Override
    public int compareTo(Container other) {
        return getContainerWeight() - other.getContainerWeight();
    }

    //* итератор контейнера */
    @Override
    public Iterator<Box> iterator() {
        return boxes.iterator();
    }

    //* вывод информации */
    @Override
    public String toString() {
        return 
            containerID 
            + "/ящиков=" + getNumberOfBoxes() 
            + "/масса=" + getContainerWeight();
    }
}
