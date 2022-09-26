package hw2;

public class Task2 {
    public static void main(String[] args) {
        double sum = 150_000;
        double totalSum;
        int saleCode = 9011;
        switch (saleCode) {
            case 2525:
                totalSum = sum * 0.7;
                break;
            case 6424:
            case 7012:
                totalSum = sum * 0.8;
                break;
            case 7647:
            case 9011:
            case 6612:
                totalSum = sum * 0.9;
                break;
            default:
                totalSum = sum;
        }
        System.out.println(totalSum);
    }
}

