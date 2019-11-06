/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.components.table.model;

import model.Math;
import model.MathOperator;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author student1
 */
public class ProductTableModel extends AbstractTableModel{
    
    private final List<Math> maths;
    private final String[] columns= new String[]{"a:","b:","Result","Operation"};
    private final Class[] columnsType= new Class[]{Long.class,String.class,Double.class,MathOperator.class};
    public ProductTableModel(List<model.Math> maths) {
        this.maths = maths;
    }
    
    @Override
    public int getRowCount() {
        if(maths==null) return 0;
        return maths.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Math math = maths.get(row);
        switch(column){
            case 0:return math.getA();
            case 1:return math.getB();
            case 2:return math.getResult();
            case 3:return math.getMathOperator();
            default: return "n/a";
        }
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return column==3 || column==2;
    }

    @Override
    public void setValueAt(Object value, int row, int column) {
//        Math product = maths.get(row);
//        switch(column){
//            case 2:
//                product.setManufacturer((Manufacturer)value);
//                break;
//            case 3:
//                product.setPrice(new BigDecimal(value.toString()));
//                break;
//            
//        }
    }

    @Override
    public Class<?> getColumnClass(int column) {
        return columnsType[column];
    }
    
    
    
    
    
}
