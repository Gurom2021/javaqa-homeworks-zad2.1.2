import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Текущий баланс счета: 100 руб");

        Scanner sc = new Scanner(System.in);

        int refill;
        int bonus;
        int amount;

        System.out.println("Введите сумму пополнения");
        refill = sc.nextInt();//Считываем сумму пополнения
        if (refill > 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        amount = refill + bonus + 100;
        System.out.println("Всего бонусных рублей:" + bonus);
        System.out.println("Баланс счета после поплнения:" + amount);


    }
}