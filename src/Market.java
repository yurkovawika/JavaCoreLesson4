import java.io.*;
import java.util.List;

final class Market {


    final File productsF = new File("products.txt");
    final File shoppersF = new File("shoppers.txt");
    final File ordersF = new File("orders.txt");

    enum ObjectType {
        PRODUCT, SHOPPER, ORDER;
    }

    public Market() {
        readData(shoppersF);
        readData(productsF);
        readData(ordersF);
    }


    void readData(File file) {
        switch (file.getName()) {
            case "products.txt":
                loadData(file, DataStorage.products, ObjectType.PRODUCT);
                break;
            case "shoppers.txt":
                loadData(file, DataStorage.shoppers, ObjectType.SHOPPER);
                break;
            case "orders.txt":
                loadData(file, DataStorage.orders, ObjectType.ORDER);
                break;
            default:
                System.out.println("Incorrect file name");
                break;
        }
    }

    void loadData(File file, List list, ObjectType type) {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String[] product;
            String str;
            while ((str = br.readLine()) != null) {
                product = str.split(";");
                switch (type) {
                    case PRODUCT -> {
                        list.add(new Product(Integer.parseInt(product[0]), String.format(product[1]), Integer.parseInt(product[2])));
                    }

                    case SHOPPER -> {
                        Shopper shopper = new Shopper(Integer.parseInt(product[0]), product[1], Integer.parseInt(product[2]),
                                product[3],product[4].equals("m") ? Gender.MALE : Gender.FEMALE);
                        list.add(shopper);
                    }
                    case ORDER ->
                            list.add(new Order((new Shopper(Integer.parseInt(product[0]), String.format(product[1]), Integer.parseInt(product[2]), String.format(product[3]), Gender.valueOf(product[4])))));

                    default -> System.out.println("Некорректный тип");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Ошибка при создании заказа. Незаполнены обязательные поля. Заказ отменён!");
        }
    }
}


