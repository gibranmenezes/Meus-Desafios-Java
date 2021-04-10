package SistemaPesquisaLista;

import java.util.ArrayList;
import java.util.List;

public class SearchLanguage {


    List<String> list;
    Language lang = new Language();


    public SearchLanguage(List<String> list) {
        this.list = list;
    }

    /*public String containLang(){ precisa criar uma tratamento de erro caso o item não esteja na lista.
        if(list.contains(lang)){
            return "Procurando item: ";
        } else {
            return "Item não consta na lista";
        }
    }*/

    public int times() {
        int size = 0;
        String item = "";
        for (int i = 0; i < list.size(); i++) {
            item = list.get(i);
            if (lang.getName().equals(item)) {
                size++;
            }
        }
        return size;

    }
}



