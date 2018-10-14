/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tudien;

import java.io.IOException;
import java.util.Scanner;

public class main {

    public static void main(String[] args) throws IOException {

        DictionaryCommandline dt = new DictionaryCommandline();
        dt.insertFromFile();
         System.out.println("nhap gia tri tuong ung voi cac class muon test:");
        System.out.println("1-insertFromCommandline()");
        System.out.println("2-insertFromFile()");
        System.out.println("3-showAllWords()");
        System.out.println("4-dictionaryBasic()");
        System.out.println("5-dictionaryLookup()");
        System.out.println("6-dictionarySearcher()");
        System.out.println("7-dictionaryExportToFile()");
        System.out.println("8-deleteWord()");
        System.out.println("9-dictionaryAdvanced()");
        System.out.println("10-ket thuc nhap.");
        int choice;
        Scanner s = new Scanner(System.in);
        choice = s.nextInt();

        while (choice != 10) {
            switch (choice) {
                case 1: {
                    dt.insertFromCommandline();
                    break;
                }
                case 2: {
                    dt.insertFromFile();
                    break;
                }
                case 3: {
                    dt.showAllWords();
                    break;
                }
                case 4: {
                    dt.dictionaryBasic();
                    break;
                }
                case 5: {
                    dt.dictionaryLookup();
                    break;
                }
                case 6: {
                    dt.dictionarySearcher();
                    break;
                }
                case 7: {
                    dt.dictionaryExportToFile();
                    break;
                }
                case 8: {
                    dt.deleteWord();
                    break;
                }
                case 9: {
                    dt.dictionaryAdvanced();
                    break;
                }
                default: {
                    while (true) {
                        System.out.println("ban nhap sai , moi nhap lai :0");

                    }
                }
            }
             System.out.println("nhap gia tri tuong ung voi cac class muon test:");
            choice = s.nextInt();
        }
        if(choice == 10){
            System.out.println("ket thuc.");
        }
    }
}
