/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tudien;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DictionaryManagement extends Dictionary {

    //thêm dữ liệu vào từ điển bằng cách nhập từ bàn phím.
    public void insertFromCommandline() {

        Scanner s = new Scanner(System.in);

        int n;
        System.out.print("nhap so tu muon them n: ");
        n = Integer.parseInt(s.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("nhap tu thu " + i + " :");
            Word str = new Word();
            
            System.out.print("nhap tu: ");
            String x1 = s.nextLine();
            str.setWord_target(x1);
            
            System.out.print("nhap nghia: ");
            String x = s.nextLine();
            str.setWord_explain(x);

            super.ar.add(str);
        }

    }

    // đọc dữ liệu từ diển từ file .
    public void insertFromFile() throws FileNotFoundException, IOException {
        FileReader fr = new FileReader("dictionaries.txt");
        BufferedReader br = new BufferedReader(fr);
        String s = "";

        while ((s = br.readLine()) != null) {
            Word str = new Word();
            String[] w = s.split("\t", 2);
            str.setWord_target(w[0]);
            str.setWord_explain(w[1]);
            super.ar.add(str);
        }

        br.close();
        fr.close();
    }

    // tra từ có trong từ diển
    public void dictionaryLookup() {
        Scanner s = new Scanner(System.in);
        System.out.print("nhap tu can tra:");
        String str = s.nextLine();
        int kt = 0;
        for (int i = 0; i < ar.size(); i++) {

            if (str.equalsIgnoreCase(ar.get(i).getWord_target())) {
                kt = 1;
                System.out.println(ar.get(i).getWord_target() + " |\t" + ar.get(i).getWord_explain());
            }

        }
        if (kt == 0) {
            System.out.println("ko tim thay tu can tra!");
        }

    }

    //  xuất dữ liệu từ điển ra file.
    public void dictionaryExportToFile() throws FileNotFoundException, IOException {
        FileOutputStream fi = new FileOutputStream("dictionaries.txt", true);
        PrintWriter pw = new PrintWriter(fi);
        //xóa dữ liệu trong file dictionariesNow.txt 
        new FileWriter("dictionaries.txt").close();

        for (int i = 0; i < ar.size(); i++) {
            pw.println(ar.get(i).getWord_target() + " \t" + ar.get(i).getWord_explain());

        }
        System.out.println("xuat tu thanh cong.");
        pw.close();
        fi.close();

    }

    // xóa 1 từ trong từ diển nhập từ bàn phím.
    public void deleteWord() {
        Scanner s = new Scanner(System.in);
        System.out.print("nhap tu can xoa:");
        String str = s.nextLine();
        int kt = 0;
        for (int i = 0; i < ar.size(); i++) {

            if (str.equalsIgnoreCase(ar.get(i).getWord_target())) {
                kt = 1;
                ar.remove(i);

            }

        }
        if (kt == 0) {
            System.out.println("ko tim thay tu can xoa!");
        } else {
            System.out.println("da xoa thanh cong .");
        }
    }

    // sửa nghĩa của từ đã có.
    public void repairWord() {
        Scanner s = new Scanner(System.in);
        System.out.print("nhap tu can sua:");
        String str = s.nextLine();
        System.out.print("nhap nghia thay the:");
        String str1 = s.nextLine();
        int kt = 0;
        for (int i = 0; i < ar.size(); i++) {

            if (str.equalsIgnoreCase(ar.get(i).getWord_target())) {
                kt = 1;
                ar.get(i).setWord_explain(str1);

            }

        }
        if (kt == 0) {
            System.out.println("ko tim thay tu can sua!");
        } else {
            System.out.println("da sua thanh cong .");
        }
    }

}
