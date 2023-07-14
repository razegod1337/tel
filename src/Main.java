public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int result;
        int replenishment = 1100;
        int bonus;
        if (replenishment > 1000) {
            bonus = replenishment / 100;
            result = replenishment + balance + bonus;
            System.out.println("Ваш баланс состовляет: " + result + " Бонусов начислено " + bonus);
        } else {
            result = balance + replenishment;

            System.out.println("Ваш баланс состовляет " + result);

        }

    }
}