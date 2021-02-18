/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBean;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author dimobo
 */
public class ProducteJavaBean implements Serializable {

    private int numSerie;

    /**
     * Get the value of numSerie
     *
     * @return the value of numSerie
     */
    public int getNumSerie() {
        return numSerie;
    }

    /**
     * Set the value of numSerie
     *
     * @param numSerie new value of numSerie
     */
    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }

    private String denominacio;

    /**
     * Get the value of denominacio
     *
     * @return the value of denominacio
     */
    public String getDenominacio() {
        return denominacio;
    }

    /**
     * Set the value of denominacio
     *
     * @param denominacio new value of denominacio
     */
    public void setDenominacio(String denominacio) {
        this.denominacio = denominacio;
    }

    private String fabricant;

    /**
     * Get the value of fabricant
     *
     * @return the value of fabricant
     */
    public String getFabricant() {
        return fabricant;
    }

    /**
     * Set the value of fabricant
     *
     * @param fabricant new value of fabricant
     */
    public void setFabricant(String fabricant) {
        this.fabricant = fabricant;
    }

    private int stockActual;

    public static final String PROP_STOCKACTUAL = "stockActual";

    /**
     * Get the value of stockActual
     *
     * @return the value of stockActual
     */
    public int getStockActual() {
        return stockActual;
    }

    /**
     * Set the value of stockActual
     *
     * @param stockActual new value of stockActual
     * @throws java.beans.PropertyVetoException
     */
    public void setStockActual(int stockActual) throws PropertyVetoException {
        int oldStockActual = this.stockActual;
        vetoableChangeSupport.fireVetoableChange(PROP_STOCKACTUAL, oldStockActual, stockActual);
        this.stockActual = stockActual;
        propertySupport.firePropertyChange(PROP_STOCKACTUAL, oldStockActual, stockActual);
    }

    private int stockMinim;

    public static final String PROP_STOCKMINIM = "stockMinim";

    /**
     * Get the value of stockMinim
     *
     * @return the value of stockMinim
     */
    public int getStockMinim() {
        return stockMinim;
    }

    /**
     * Set the value of stockMinim
     *
     * @param stockMinim new value of stockMinim
     * @throws java.beans.PropertyVetoException
     */
    public void setStockMinim(int stockMinim) throws PropertyVetoException {
        int oldStockMinim = this.stockMinim;
        vetoableChangeSupport.fireVetoableChange(PROP_STOCKMINIM, oldStockMinim, stockMinim);
        this.stockMinim = stockMinim;
        propertySupport.firePropertyChange(PROP_STOCKMINIM, oldStockMinim, stockMinim);
    }
    private float preuPublic;

    public static final String PROP_PREUPUBLIC = "preuPublic";

    /**
     * Get the value of preuPublic
     *
     * @return the value of preuPublic
     */
    public float getPreuPublic() {
        return preuPublic;
    }

    /**
     * Set the value of preuPublic
     *
     * @param preuPublic new value of preuPublic
     * @throws java.beans.PropertyVetoException
     */
    public void setPreuPublic(float preuPublic) throws PropertyVetoException {
        float oldPreuPublic = this.preuPublic;
        vetoableChangeSupport.fireVetoableChange(PROP_PREUPUBLIC, oldPreuPublic, preuPublic);
        this.preuPublic = preuPublic;
        propertySupport.firePropertyChange(PROP_PREUPUBLIC, oldPreuPublic, preuPublic);
    }

    private transient final VetoableChangeSupport vetoableChangeSupport = new VetoableChangeSupport(this);

    /**
     * Add VetoableChangeListener.
     *
     * @param listener
     */
    public void addVetoableChangeListener(VetoableChangeListener listener) {
        vetoableChangeSupport.addVetoableChangeListener(listener);
    }

    /**
     * Remove VetoableChangeListener.
     *
     * @param listener
     */
    public void removeVetoableChangeListener(VetoableChangeListener listener) {
        vetoableChangeSupport.removeVetoableChangeListener(listener);
    }

    private int anyFabricacio;

    /**
     * Get the value of anyFabricacio
     *
     * @return the value of anyFabricacio
     */
    public int getAnyFabricacio() {
        return anyFabricacio;
    }

    /**
     * Set the value of anyFabricacio
     *
     * @param anyFabricacio new value of anyFabricacio
     */
    public void setAnyFabricacio(int anyFabricacio) {
        this.anyFabricacio = anyFabricacio;
    }

    private String[] caracTecniques;

    /**
     * Get the value of caracTecniques
     *
     * @return the value of caracTecniques
     */
    public String[] getCaracTecniques() {
        return caracTecniques;
    }

    /**
     * Set the value of caracTecniques
     *
     * @param caracTecniques new value of caracTecniques
     */
    public void setCaracTecniques(String[] caracTecniques) {
        this.caracTecniques = caracTecniques;
    }

    /**
     * Get the value of caracTecniques at specified index
     *
     * @param index the index of caracTecniques
     * @return the value of caracTecniques at specified index
     */
    public String getCaracTecniques(int index) {
        return this.caracTecniques[index];
    }

    /**
     * Set the value of caracTecniques at specified index.
     *
     * @param index the index of caracTecniques
     * @param caracTecniques new value of caracTecniques at specified index
     */
    public void setCaracTecniques(int index, String caracTecniques) {
        this.caracTecniques[index] = caracTecniques;
    }

    public static final String PROP_SAMPLE_PROPERTY = "sampleProperty";

    private String sampleProperty;

    private PropertyChangeSupport propertySupport;

    public ProducteJavaBean() {
        propertySupport = new PropertyChangeSupport(this);
    }

    public String getSampleProperty() {
        return sampleProperty;
    }

    public void setSampleProperty(String value) {
        String oldValue = sampleProperty;
        sampleProperty = value;
        propertySupport.firePropertyChange(PROP_SAMPLE_PROPERTY, oldValue, sampleProperty);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }

}
