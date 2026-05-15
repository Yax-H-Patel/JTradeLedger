public class Trade {

    private int quantity;
    private Stock stock;
    private Action action;

    public Trade(Stock stock, int quantity,  Action action) {
        this.quantity = quantity;
        this.stock = stock;
        this.action = action;
    }

    @Override
    public String  toString() {
        return action + " " + quantity + " " + stock.getTicker() + " @ $" + stock.getPrice();
    }
}
