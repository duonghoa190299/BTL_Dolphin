/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tudien;

import java.util.ArrayList;

public class Dictionary extends Word {

    protected ArrayList<Word> ar = new ArrayList<>();

    

    public Word getAr(int i) {
        return ar.get(i);
    }

}
