import java.util.Comparator;

public class ContainerCountComparator implements Comparator<Container> {
    
    //* сравнение количества ящиков */
    @Override
    public int compare(Container o1, Container o2) {
        return o1.getNumberOfBoxes() - o2.getNumberOfBoxes();
    }
}
