public class Main {
    public static void main(String[] args) {

        BankAccount client = new BankAccount();
        client.deposit(15000);
        while (true){
            System.out.println(client.getAmount());
            try{client.withDraw(6000);}
            catch (LimitException e){
                System.out.println(e.getMessage()+" Текущий счет = " + e.getRemainingAmount());
                break;

            }
        }
    }
}