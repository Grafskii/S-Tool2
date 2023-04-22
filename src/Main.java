public class Main {
    public static void main(String[] args) {

        int startingScore = 100; // начальные данные
        int price = 100; // цена за каждые 100 рублей
        int amount = 1500;
        int amount2 = 500;

        int bonus = 0;
        if (amount > 1000) {
            bonus = amount / price;
        }
        int score = startingScore + amount;

        int bonus2 = 0;
        if (amount2 < 1000) {
            bonus2 = 0;
        }
        int score2 = startingScore + amount2;

        System.out.println("Пополнение > 1000");
        System.out.println("Бонус: " + bonus);
        System.out.println("Итоговый счет: " + score);
        System.out.println("Пополнение < 1000");
        System.out.println("Бонус: " + bonus2);
        System.out.println("Итоговый счет: " + score2);

    }
}