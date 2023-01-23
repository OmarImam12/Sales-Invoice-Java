package controller;

import model.InvoiceHeader;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InvoiceHeaderData extends InvoiceHeader {


    List<InvoiceHeader> invoiceHeadersList = new ArrayList();

    public InvoiceHeaderData() {
        super();
    }

    public InvoiceHeaderData(int invoiceNumber, String invoiceDate, String customerName) {
        super(invoiceNumber, invoiceDate, customerName);
    }

    public List<InvoiceHeader> getInvoiceHeadersList() {
        return invoiceHeadersList;
    }
        // to get the data of header from user
    public InvoiceHeader getInvoiceHeaderData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, Enter the Invoice Number : ");
        int invoiceNumber = scanner.nextInt();
        setInvoiceNumber(invoiceNumber);
        System.out.println("Please, Enter the Invoice Date  : ");
        String invoiceDate = scanner.next();
        setInvoiceDate(invoiceDate);
        System.out.println("Please, Enter the customer name  : ");
        String customerName = scanner.next();
        setCustomerName(customerName);

        return new InvoiceHeader(invoiceNumber, invoiceDate, customerName);

    }

            // to display the data in the console direct
    public void displayHeaderData() {

        for (int i = 0; i < invoiceHeadersList.size(); i++) {
            System.out.println(invoiceHeadersList.get(i).getInvoiceNumber() + ","
                    + invoiceHeadersList.get(i).getInvoiceDate() + ","
                    + invoiceHeadersList.get(i).getCustomerName());

        }
    }


}
