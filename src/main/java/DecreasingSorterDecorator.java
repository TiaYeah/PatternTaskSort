public class DecreasingSorterDecorator extends ASorter {
    ASorter sorter;

    public DecreasingSorterDecorator(ASorter sorter) {
        this.sorter = sorter;
    }

    @Override
    public boolean compare(int a, int b) {
        return !sorter.compare(a, b);
    }
}
