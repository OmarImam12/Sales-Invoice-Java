import controller.FileOperations;
import controller.InvoiceHeaderData;
import controller.InvoiceLineData;
import model.InvoiceHeader;
import model.InvoiceLine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* 1.The program flow is : the user will be asked if he wants to write an invoice
            or read an invoice he must write read or write
           2.If the user chose "write"  he will be asked to enter the head of the invoice
            then the content of it and after finishing he will be asked if he wants to repeat
           3. If the user chose read he will be asked to insert the invoice number, and he will be
            asked if he wants to read another one
         */







        FileOperations fileOperations = new FileOperations();
        InvoiceLineData invoiceLineData = new InvoiceLineData();
        InvoiceHeaderData invoiceHeaderData = new InvoiceHeaderData();
        InvoiceLine invoiceLine = new InvoiceLine();
        InvoiceHeader invoiceHeader = new InvoiceHeader();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to write an invoice or read ?");
        String answer = scanner.next();
        if (answer.equalsIgnoreCase("write")) {
            int i = 0;
            String ans;
            do {
                System.out.println("*****************************");
                System.out.println("Enter the Head of he invoice ");
                System.out.println("*****************************");
                invoiceHeader = invoiceHeaderData.getInvoiceHeaderData();
                fileOperations.writeHeader(invoiceHeader);
                System.out.println("*********************************");
                System.out.println("Enter the content of the invoice ");
                System.out.println("*********************************");
                invoiceLine = invoiceLineData.getLineData();
                fileOperations.writeLine(invoiceLine);
                System.out.println("Do you want write another invoice ? Y/N ");
                ans = scanner.next();
                // i++;

            } while (!ans.equals("N") && !ans.equals("n"));

        } else if (answer.equalsIgnoreCase("read")) {
            System.out.println("Do you want read a");

            String answer3;
            do {
                fileOperations.readSpecificInvoice();
                System.out.println("Do you want to read another invoice ? (Y/N)");
                answer3 = scanner.next();
            } while (!answer3.equals("N") && !answer3.equals("n"));

            scanner.close();

        }


    }


}
