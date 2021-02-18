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
public class Vetador implements VetoableChangeListener {

    @Override
    public void vetoableChange(PropertyChangeEvent list) throws PropertyVetoException {

        if (list.getPropertyName().equals(ProducteJavaBean.PROP_PREUPUBLIC)) {

            if ((float) list.getNewValue() <= 0) {

                throw new PropertyVetoException("",list);

            } else {
                System.out.format("S'ha canviat correctement el preu del producte a: %s\n",
                        list.getNewValue()
                );
            }

        }

    }

}
