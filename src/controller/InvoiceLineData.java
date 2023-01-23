package controller;

import model.InvoiceLine;

import java.util.Scanner;

public class InvoiceLineData extends InvoiceLine {

    Scanner scanner = new Scanner(System.in);
    // to get the data of lines from user
    public InvoiceLine getLineData() {

        System.out.println("Please, Enter the Invoice Number : ");
        int invoiceNumber = Integer.parseInt(scanner.next());
        setInvoiceNumber(invoiceNumber);
        System.out.println("Please, Enter the Item Name  : ");
        String itemName = scanner.next();
        setItemName(itemName);
        System.out.println("Please, Enter the item price  : ");
        double itemPrice = scanner.nextDouble();
        setItemPrice(itemPrice);
        System.out.println("Please, Enter the count : ");
        int Count = scanner.nextInt();
        setCount(Count);
        //scanner.close();


        return new InvoiceLine(invoiceNumber, itemName, itemPrice, Count);
    }
     // to display the data in the console direct
    public void displayData() {

        System.out.println("the Invoice Number : " + getInvoiceNum());
        System.out.println("the Item Name : " + getItemName());
        System.out.println("the the item price : " + getItemPrice());
        System.out.println("the the count  : " + getCount());
        //   System.out.println("the total price : " + (getItemPrice() * getCount()));


    }


}
