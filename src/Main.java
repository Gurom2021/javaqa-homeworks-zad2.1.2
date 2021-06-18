import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int balans;
        int refill;
        int bonus;
        int amount;

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите началный баланс счета");
        balans = sc.nextInt();//Считываем начальный баланс

        System.out.println("Введите сумму пополнения");
        refill = sc.nextInt();//Считываем сумму пополнения

        if (refill > 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }

        amount = balans + refill + bonus;
        System.out.println("Всего бонусных рублей: " + bonus);
        System.out.println("Баланс счета после поплнения: " + amount + " рублей");


    }
}