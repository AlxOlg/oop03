public class Box {

    //* индекс для меток */
    protected static int indexBox;
    static {
        indexBox = 1;
    }

    private final String boxLabel; // метка ящика
    private final int boxWeight; // масса ящика

    //* конструктор ящика */
    public Box(int boxWeight) {
        this.boxLabel = String.format("box_%d", indexBox++);
        this.boxWeight = boxWeight;
    }

    //* получить массу ящика */
    public int getBoxWeight() {
        return boxWeight;
    }

    //* вывод информации */
    @Override
    public String toString() {
        return 
            boxLabel 
            + "/масса=" + boxWeight;
    }
}
