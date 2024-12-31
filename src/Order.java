

import java.text.SimpleDateFormat;
import java.util.*;

final class Order {

    private static int countID = 0;
    private final int ID;
    private final Shopper shopper;
    private final ArrayList<Product> products = new ArrayList<Product>();
    List<ListShops> listShops;

    private float amount;
    private final String date;
    private int countProduct = 1;


    public Order(Shopper shopper, Product product) {
        this.ID = ++countID;
        this.amount = amount;
        this.shopper = Objects.requireNonNull(shopper);
        addProducts(product);
        this.date = new SimpleDateFormat("dd.MM.yyyy").format(Calendar.getInstance().getTime());
    }

    public Order(Shopper shopper, List<ListShops> listShops) {
        this.listShops = listShops;
        this.ID = ++countID;
        this.amount = amount;
        this.shopper = Objects.requireNonNull(shopper);
        this.date = new SimpleDateFormat("dd.MM.yyyy").format(Calendar.getInstance().getTime());
    }

    public Order(Shopper shopper) {
        this.ID = ++countID;
        this.shopper = Objects.requireNonNull(shopper);
        this.date = new SimpleDateFormat("dd.MM.yyyy").format(Calendar.getInstance().getTime());

    }

    public int getID() {
        return ID;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void addProducts(Product product) {
        if (products.isEmpty()) {
            products.add(product);
        } else {
            for (Product pr : products) {
                if (product != pr) {
                    products.add(product);
                    break;
                } else {
                    countProduct++;
                    System.out.println(countProduct);
                    return;
                }
            }
        }
    }


    public void setCountProduct(int p, int i) {
        countProduct = i;
    }


    public Shopper getShopper() {
        return shopper;
    }

    public float sumShops() {
        float sumShops = 0;
        for (ListShops listShops1 : listShops) {
            sumShops = listShops1.getAmount(getShopper()) + sumShops;
        }
        return sumShops;
    }


    @Override
    public String toString() {
        return "Заказ № " + ID + "\n" + "Покупатель:" + shopper.getName() +
                ", дата заказа:" + date + '\n' + listShops + "\nОбщая сумма покупок: " + sumShops();
    }

}
