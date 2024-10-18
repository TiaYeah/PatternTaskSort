public class Mod2Decorator extends ASorter {
    ASorter sorter;

    public Mod2Decorator(ASorter sorter) {
        this.sorter = sorter;
    }

    @Override
    public boolean compare(int a, int b) {
        return a % 2 == 0 ? b % 2 == 0 && sorter.compare(a, b) : b % 2 == 0 || !sorter.compare(a, b);
        //return a % 2 != 0 && b % 2 == 0;
    }
}
