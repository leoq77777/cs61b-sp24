public class Dessert {
    static int numDesserts = 0;
    private final int flavor;
    private final int price;
    public Dessert(int flavor, int price) {
        numDesserts++;
        this.flavor = flavor;
        this.price = price;
    }
    public void printDessert() {
        System.out.println(this.flavor + " "
                + this.price + " "
                + numDesserts + "\n");
    }
    public static void main(String[] args) {
        System.out.println("I love dessert!\n");
    }
}
