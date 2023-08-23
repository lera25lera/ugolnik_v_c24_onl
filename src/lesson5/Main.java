package lesson5;

public class Main {
    public static void main(String[] args) {

        CreditCard creditCard = new CreditCard();
        creditCard.accountNumber = "BY55ALFA5465465464";
        creditCard.balance = 10000000;
        creditCard.income(2);
        creditCard.outcome(3);
        creditCard.info();
//Напишите программу, которая создает три
//объекта класса CreditCard у которых заданы номер счета и начальная сумма.
//Тестовый сценарий для проверки: Положите деньги на первые две карточки и снимите с
//третьей. Выведите на экран текущее состояние всех трех карточек

        CreditCard creditCard1 = new CreditCard();
        creditCard1.accountNumber = "BY10BLBB6465454546";
        creditCard1.balance = 5;

        CreditCard creditCard2 = new CreditCard();
        creditCard2.accountNumber = "BY00BLBB6465454547";
        creditCard2.balance = 100;

        CreditCard creditCard3 = new CreditCard();
        creditCard3.accountNumber = "BY40BLBB6465454546";
        creditCard3.balance = 501;

        creditCard1.income(10);
        creditCard2.income(50);
        creditCard3.outcome(10);
        creditCard1.info();
        creditCard2.info();
        creditCard3.info();
    }
}
