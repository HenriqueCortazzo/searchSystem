package SearchSystem;

import javax.swing.*;
import java.util.ArrayList;

public class SearchMode {
    private ArrayList<String> list = new ArrayList<>();
    private String itemAdd;

    private String converted;
    private String search;

    public SearchMode() {
        operations();
    }

    private void operations() {
        Object[] options = {"Adicionar nome", "Buscar nomes", "Sair"};
        int n = JOptionPane.showOptionDialog(null,
                "Selecione o que deseja:",
                "Options",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                options,
                options[0]);
        switch (n) {
            case 0:
                addItem();
                break;
            case 1:
                search();
                break;
            case 2:
                System.exit(0);
        }
    }

    private void addItem() {
        itemAdd = JOptionPane.showInputDialog(null, "Digite um nome: ");
        itemAdd.trim().replaceAll("\\s", "");
        list.add(itemAdd);
    }

    private void search() {
        search = JOptionPane.showInputDialog(null, "Digite o nome de quem está procurando: ");
        converted = String.valueOf(search.charAt(0));
        for (int i = 0; i < list.size(); i++) {
            if (String.valueOf(list.get(i).charAt(0)).equals(converted)) {
                JOptionPane.showMessageDialog(null, list.get(i));
            }
        }
    }

}
