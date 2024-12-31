
//
final class Product {
    private static int countID = 0;
    private final int ID;
    private final String name;
    private final int price;
    private int count = 1;



    public Product(String name, int price, int count) {
        this.ID = ++countID;
        this.name = name;
        this.price = price;
        this.count = ++count;
    }
    public Product(int ID, String name, int price) {
        this.ID = ID;
        this.name = name;
        this.price = price;

    }


    @Override
    public String toString() {
        return  "ID ТП: " + ID +
                ", название: '" + name +
                ", цена: " + price ;
    }



    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int countProduct() {
        return count;
    }

    public void setCount(int i) {
        count = i;
    }

}

