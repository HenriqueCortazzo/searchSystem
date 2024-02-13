package SearchSystem;

import javax.swing.*;
import java.util.ArrayList;

public class SearchMode {
 private ArrayList <String> list = new ArrayList<>();
 private String itemAdd;
 
 private void addItem(){
     itemAdd = JOptionPane.showInputDialog(null,"Digite um nome: ");
     list.add(itemAdd);
 }
}
