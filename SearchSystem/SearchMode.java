package SearchSystem;

import javax.swing.*;
import java.util.ArrayList;

public class SearchMode {
    private final ArrayList<String> list = new ArrayList<>();
    private final ArrayList<String> resultList = new ArrayList<>();

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
        String itemAdd = JOptionPane.showInputDialog(null, "Digite um nome: ");
        list.add(itemAdd);
        JOptionPane.showMessageDialog(null,"Operação realizada com sucesso.");
        operations();
    }
    private void search() {
        if (!list.isEmpty()) {
            String search = JOptionPane.showInputDialog(null, "Digite o nome de quem está procurando: ");
            for (int i = 0; i < list.size(); i++) {
                if ((list.get(i).substring(0, search.length())).equals(search)) {
                    String value = list.get(i);
                    if (resultList.isEmpty()){
                       resultList.add(i,value);
                    }
                }
                JOptionPane.showMessageDialog(null, resultList);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não há nomes na lista.");
            operations();
        }
    }

}
