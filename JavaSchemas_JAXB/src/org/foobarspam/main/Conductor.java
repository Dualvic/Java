//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.18 at 12:02:11 PM CEST 
//


package org.foobarspam.main;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Conductor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Conductor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="modeloCoche" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="matricula" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="valoracionMedia" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ocupado" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="valoraciones" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Conductor", propOrder = {
    "nombre",
    "modeloCoche",
    "matricula",
    "valoracionMedia",
    "ocupado",
    "valoraciones"
})
public class Conductor {

    @XmlElement(required = true)
    protected String nombre;
    @XmlElement(required = true)
    protected String modeloCoche;
    @XmlElement(required = true)
    protected String matricula;
    protected double valoracionMedia;
    protected boolean ocupado;
    @XmlElement(type = Double.class)
    protected List<Double> valoraciones;

    /**
     * Gets the value of the nombre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets the value of the nombre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Gets the value of the modeloCoche property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModeloCoche() {
        return modeloCoche;
    }

    /**
     * Sets the value of the modeloCoche property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModeloCoche(String value) {
        this.modeloCoche = value;
    }

    /**
     * Gets the value of the matricula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Sets the value of the matricula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatricula(String value) {
        this.matricula = value;
    }

    /**
     * Gets the value of the valoracionMedia property.
     * 
     */
    public double getValoracionMedia() {
        return valoracionMedia;
    }

    /**
     * Sets the value of the valoracionMedia property.
     * 
     */
    public void setValoracionMedia(double value) {
        this.valoracionMedia = value;
    }

    /**
     * Gets the value of the ocupado property.
     * 
     */
    public boolean isOcupado() {
        return ocupado;
    }

    /**
     * Sets the value of the ocupado property.
     * 
     */
    public void setOcupado(boolean value) {
        this.ocupado = value;
    }

    /**
     * Gets the value of the valoraciones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valoraciones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValoraciones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getValoraciones() {
        if (valoraciones == null) {
            valoraciones = new ArrayList<Double>();
        }
        return this.valoraciones;
    }

}