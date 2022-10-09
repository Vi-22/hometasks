package ru.victoria.homeworks.hw6.task1.products;

public class MyProducts {
    private double caloriesMaxCount = 20;
    private double proteinsMaxCount = 1.2;
    private double fatsMaxCount = 0.2;
    private double carbohydratesMaxCount = 1.1;
    private Product[] productsList;

    public boolean isOkProduct(Product product) {
        if (product.getCalories() <= caloriesMaxCount && product.getProteins() <= proteinsMaxCount &&
                product.getFats() <= fatsMaxCount && product.getCarbohydrates() <= carbohydratesMaxCount) {
            return true;
        } else {
            return false;
        }
    }

    public void getProductToList (Product product[]) {
        int elementsSum = 0;
        for (Product element: product) {
            if (isOkProduct(element)) {
                elementsSum++;
            }
        }
        productsList = new Product[elementsSum];
        for (int i1=0, i2=0; i1<=product.length-1; i1++) {
            if (isOkProduct(product[i1])) {
                productsList[i2] = product[i1];
                i2++;
                System.out.println("В список добавлен товар: " + product[i1].getName() + "!");
            } else {
                System.out.println("Товар " + product[i1].getName() + " не может быть добавлен в список, " +
                        "потому что вы " +
                        "будете слишком жирненьким!");
            }
        }
    }
    public void printList() {
        System.out.println("В вашем списке: ");
        String List = null;
        for (Product element: productsList) {
            System.out.println(element.getName());
            }
    }

}
