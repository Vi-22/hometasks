package ru.victoria.homeworks.hw6.task1;
import ru.victoria.homeworks.hw6.task1.products.Product;
import ru.victoria.homeworks.hw6.task1.products.MyProducts;

public class Application {
    public static void main(String[] args) {
        //объекты
        Product product[] = new Product[5];
        product[0] = new Product("Помидор", 23, 1.1, 0.2, 3.8);
        product[1] = new Product("Огурец", 14, 0.8, 0.1, 2.5);
        product[2] = new Product("Туалетная бумага");
        product[3] = new Product("Вода", 0);
        product[4] = new Product("Мороженное", 232, 3.7, 15, 20.4);
        MyProducts productsList = new MyProducts();
        productsList.getProductToList(product);
        productsList.printList();
    }
}
