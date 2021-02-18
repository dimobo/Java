/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp06uf4pt1test;

import JavaBean.ProducteJavaBean;
import java.beans.*;

/**
 *
 * @author dimobo
 */
public class Receptor implements PropertyChangeListener {
    
    

    @Override
    public void propertyChange(PropertyChangeEvent list) {
        if (ProducteJavaBean.PROP_STOCKACTUAL.equals(list.getPropertyName())) {

            System.out.format("%nHa Canviat la propietat %s del valor %s al %s\n",
                    list.getPropertyName(),
                    list.getOldValue(),
                    list.getNewValue());
        }
    }
    

}
