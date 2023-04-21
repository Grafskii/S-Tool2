public class Main {
    public static void main(String[] args) {

        int startingScore = 100; // начальные данные
        int price = 100; // цена за каждые 100 рублей
        int x = 1500;
        int y = 500;

        int bonus = 0;
        if (x > 1000) {
            bonus = x / price;
        }
        int score = startingScore + x;

        int bonus2 = 0;
        if (y < 1000) {
            bonus2 = 0;
        }
        int score2 = startingScore + y;

        System.out.println("Пополнение > 1000");
        System.out.println("Бонус: " + bonus);
        System.out.println("Итоговый счет: " + score);
        System.out.println("Пополнение < 1000");
        System.out.println("Бонус: " + bonus2);
        System.out.println("Итоговый счет: " + score2);

    }
}