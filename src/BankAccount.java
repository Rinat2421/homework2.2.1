public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum){
        amount += sum;
    }

    public void withDraw(int sum) throws LimitException{
        if (sum>amount){
            amount-=amount;
            throw new LimitException("Недостаточно средств сняты все оставшиеся деньги", amount);
        }
        amount -= sum;
    }
    }
