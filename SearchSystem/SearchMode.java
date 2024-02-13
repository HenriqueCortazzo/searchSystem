package SearchSystem;

import javax.swing.*;
import java.util.ArrayList;

public class SearchMode {
    private ArrayList<String> list = new ArrayList<>();
    private String itemAdd;

    private String converted;
    private String search;

    public SearchMode() {
        addItem();
    }

    private void addItem() {
        itemAdd = JOptionPane.showInputDialog(null, "Digite um nome: ");
        itemAdd.trim().replaceAll("\\s", "");
        list.add(itemAdd);
        search();
    }

    private void search() {
        search = JOptionPane.showInputDialog(null, "Digite o nome de quem está procurando: ");
        converted = String.valueOf(search.charAt(0));
        for (int i = 0; i < list.size(); i++) {
            if (String.valueOf(list.get(i).charAt(0)).equals(converted)) {
                JOptionPane.showMessageDialog(null, converted);
            }
        }
    }

}
