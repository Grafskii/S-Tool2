public class Main {
    public static void main(String[] args) {

        int startingScore = 100; // начальные данные
        int price = 100; // цена за каждые 100 рублей
        int amount = 1500;

        int bonus = 0;
        if (amount > 1000) {
            bonus = amount / price;
        }
        int score = startingScore + amount + bonus;

        System.out.println("Пополнение > 1000");
        System.out.println("Бонус: " + bonus);
        System.out.println("Итоговый счет: " + score);

    }
}