package de.fearlessdeveloper.moneyexample;

abstract public class Money {
    protected int amount;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return amount == money.amount;
    }

    static Money dollar(int amount) {
        return new Dollar(5);
    }

    abstract Money times(int multiplier);
}
