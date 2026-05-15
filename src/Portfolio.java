import java.util.ArrayList;
import java.util.HashMap;

public class Portfolio {

    private double cashBalance;
    private ArrayList<Trade> ledger;
    private HashMap<String, Integer> holdings;

    public Portfolio(double initialBalance) {
        cashBalance = initialBalance;
        ledger = new ArrayList<>();
        holdings = new HashMap<>();
    }

    public void buy(Stock stock, int quantity) {
        double bill = stock.getPrice() * quantity;
        if (bill > cashBalance) {
            System.out.println("Not enough money");
            return;
        }
        cashBalance -= bill;
        ledger.add(new Trade(stock, quantity, Action.BUY));
        try {
            holdings.put(stock.getTicker(), holdings.get(stock.getTicker()) + quantity);
        } catch (NullPointerException e) {
            holdings.put(stock.getTicker(), quantity);
        }
        System.out.println("Transaction Successful");
    }

    public void sell(Stock stock, int quantity) {
        try {
            if (quantity > holdings.get(stock.getTicker())) {
                System.out.println("Cannot sell more than holding");
                return;
            }
        } catch (NullPointerException e) {
            System.out.println("Account does not contain any " + stock.getTicker() + " stock.");
            return;
        }
        double amount = stock.getPrice() * quantity;
        cashBalance += amount;
        ledger.add(new Trade(stock, quantity, Action.SELL));
        if (holdings.get(stock.getTicker()) - quantity > 0) {
            holdings.put(stock.getTicker(), holdings.get(stock.getTicker()) - quantity);
        } else {
            holdings.remove(stock.getTicker());
        }
    }

    public double getCashBalance() {
        return cashBalance;
    }

    public void printLedger() {
        for (Trade trade : ledger) {
            System.out.println(trade.toString());
        }
    }
}
