package vista;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class ColorCelda extends JTable{

    @Override
    public Component prepareRenderer(TableCellRenderer renderer, int rowIndex, int ColumnIndex){

       Component componente = super.prepareRenderer(renderer, rowIndex, ColumnIndex);
       
       if(getValueAt(rowIndex, ColumnIndex).getClass().equals(Integer.class)){
           
           int valor = Integer.parseInt(this.getValueAt(rowIndex, ColumnIndex).toString());
           
           if (valor > 5) { 
           
               componente.setBackground(Color.red);
               componente.setForeground(Color.BLACK);
               
           }
       }else{
           
           componente.setBackground(Color.WHITE);
           componente.setForeground(Color.BLACK);
           
       }
       return componente;
    }
}
