package controller;

import model.InvoiceHeader;
import model.InvoiceLine;

import java.io.*;
import java.util.Scanner;

public class FileOperations {

    InvoiceLine invoiceLine = new InvoiceLine();
    InvoiceHeader invoiceHeader = new InvoiceHeader();
        //to write the header of invoice in the "InvoiceHeader.csv "file
    public void writeHeader(InvoiceHeader invoiceHeader) {

        BufferedWriter bw = null;
        String invoiceNum = Integer.toString(invoiceHeader.getInvoiceNumber());
        try {
            FileWriter fr = new FileWriter("src/resources/InvoiceHeader.csv", true);
            fr.append(invoiceNum);
            fr.append(",");
            fr.append(invoiceHeader.getInvoiceDate());
            fr.append(",");
            fr.append(invoiceHeader.getCustomerName());
            fr.append("\n");
            fr.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (bw != null) {
                    bw.flush();
                    bw.close();
                }
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }

        }
    }
    //to write the lines of invoice in the "InvoiceLine.csv " file
    public void writeLine(InvoiceLine invoiceLine) {

        BufferedWriter bw = null;
        String invoiceNum = Integer.toString(invoiceLine.getInvoiceNum());
        String itemPrice = Double.toString(invoiceLine.getItemPrice());
        String count = Integer.toString(invoiceLine.getCount());
        try {
            FileWriter fr = new FileWriter("src/resources/InvoiceLine.csv", true);
            fr.append(invoiceNum);
            fr.append(",");
            fr.append(invoiceLine.getItemName());
            fr.append(",");
            fr.append(itemPrice);
            fr.append(",");
            fr.append(count);
            fr.append("\n");
            fr.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (bw != null) {
                    bw.flush();
                    bw.close();
                }
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }

        }
    }
    // to read a specific invoice from 2 csv files
    public void readSpecificInvoice() {
        FileReader fr = null;
        String filePath = "src/resources/InvoiceHeader.csv";
        String invoiceNum, line;
        String[] arr = {};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the invoice number :  ");
        invoiceNum = scanner.next();
        try {
            fr = new FileReader(new File(filePath));
            BufferedReader br = new BufferedReader(fr);
            while ((line = br.readLine()) != null) {
                arr = line.split("\n");
                // arr = line.split(",");

                for (int i = 0; i < arr.length; i++) {
                    if (arr[i].startsWith(invoiceNum)) {
                        System.out.println(arr[i]);
                        readLineCsV(invoiceNum);
                    } else {
                        break;
                    }
                }

            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    // to read the lines of invoice
    public void readLineCsV(String invoiceNum) {

        FileReader fr = null;
        String filePath = "src/resources/InvoiceLine.csv";
        String line;
        String[] arr = {};
        try {
            fr = new FileReader(new File(filePath));
            BufferedReader br = new BufferedReader(fr);
            while ((line = br.readLine()) != null) {
                arr = line.split("\n");


                for (int i = 0; i < arr.length; i++) {
                    if (arr[i].startsWith(invoiceNum)) {
                        System.out.println(arr[i]);
                    } else {
                        break;
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
















