public class Main {
    public static void main(String[] args) {

        int startingScore = 100; // начальные данные
        int price = 100; // цена за каждые 100 рублей
        boolean replenishment = true;

        int amount;
        if (replenishment) {
            amount = 1500;
        } else {
            amount = 500;
        }

        int bonus = startingScore + amount + (amount / price);

        if (bonus < 1000) {
            bonus = startingScore + amount;
        };

        System.out.println("Сумма бонуса: " + bonus);

    }
}