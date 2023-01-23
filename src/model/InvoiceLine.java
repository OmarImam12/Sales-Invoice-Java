package model;

public class InvoiceLine {

    private int invoiceNumber;
    private String itemName;
    private double itemPrice;
    private int Count;

    public InvoiceLine(int invoiceNumber, String itemName, double itemPrice, int count) {
        this.invoiceNumber = invoiceNumber;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        Count = count;
    }

    public InvoiceLine() {
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;

    }

    public int getInvoiceNum() {
        return invoiceNumber;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getCount() {
        return Count;
    }

    public void setCount(int count) {
        Count = count;
    }

    @Override
    public String toString() {
        return "InvoiceLine{" + "invoiceNumber=" + invoiceNumber + ", itemName='" + itemName + '\'' + ", itemPrice=" + itemPrice + ", Count=" + Count + '}';
    }

}
