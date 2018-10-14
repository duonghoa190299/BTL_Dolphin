package tudien;

import java.io.IOException;
import java.util.Scanner;

public class DictionaryCommandline extends DictionaryManagement {

    //  hiển thị kết quả danh sách dữ liệu từ điển 
    public void showAllWords() {
        System.out.println("so tu:" + ar.size());
        System.out.println("in tu:");
        System.out.println("No |\t English |\t Vietnamese ");
        for (int i = 0; i < ar.size(); i++) {
            System.out.println(i + 1 + " |\t" + ar.get(i).getWord_target() + "|\t" + ar.get(i).getWord_explain());
        }
    }

    public void dictionaryBasic() {
        DictionaryCommandline dt = new DictionaryCommandline();
        dt.insertFromCommandline();

        dt.showAllWords();
    }

    public void dictionaryAdvanced() throws IOException {
        DictionaryCommandline dt = new DictionaryCommandline();
        dt.insertFromFile();
        dt.showAllWords();
        dt.dictionaryLookup();
    }

    // tra du lieu tu dien.
    public void dictionarySearcher() {
        Scanner s = new Scanner(System.in);
        System.out.print("nhap tu can tra:");
        String str = s.nextLine();

        for (int i = 0; i < ar.size(); i++) {
            String st = ar.get(i).getWord_target().substring(0, str.length());
            int kt = 0;
            st = st.toUpperCase();
            str = str.toUpperCase();
            if (st.equals(str)) {
                kt = 1;
                System.out.println(ar.get(i).getWord_target() + " |\t" + ar.get(i).getWord_explain());
            }
            if (kt == 1) {
                System.out.println("ko co tu phu hop!");
            }
        }
    }

}
