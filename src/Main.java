public class Main {
    public static void main(String[] args) {

        // Задание 2 — обязательное

        int startCounter = 100;
        int bonusCounter = 1000;

        int additiveSum = 1100;
        int resultSum = startCounter + additiveSum;

        if (resultSum > bonusCounter) {
            int bonus = additiveSum / 100;
            System.out.println("Итоговый счёт: " + (resultSum + bonus));
            System.out.println("Количество бонусных рублей: " + bonus);
        } else {
            System.out.println("Итоговый счёт: " + resultSum);
        }

    }
}