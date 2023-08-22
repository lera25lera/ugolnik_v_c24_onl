package lesson5;

//Создать класс CreditCard c полями номер счета, текущая сумма на счету. Добавьте
//метод, который позволяет начислять сумму на кредитную карточку. Добавьте метод,
//который позволяет снимать с карточки некоторую сумму. Добавьте метод, который
//выводит текущую информацию о карточке.

public class CreditCard {
    String accountNumber;
    long balance;

    CreditCard() {
        accountNumber = "BY45ALFA456854654654654";
        balance = 0;
    }

    public long income(long sum) {
        this.balance += sum;
        System.out.println("Текущий баланс: " + this.balance);
        return this.balance;
    }

    public long outcome(long sum) {
        this.balance -= sum;
        System.out.println("Текущий баланс: " + this.balance);
        return this.balance;
    }

    public void info() {
        System.out.println("Номер счета: " + this.accountNumber);
        System.out.println("Текущий баланс: " + this.balance);
    }

}
