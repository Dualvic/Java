//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.18 at 12:02:11 PM CEST 
//


package org.foobarspam.main;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Carrera complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Carrera">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conductor" type="{https://api.mobipalma.mobi/docs/}Conductor"/>
 *         &lt;element name="tarjetaCredito" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="origen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destino" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tiempoEsperadoMinutos" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="distancia" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="costeTotal" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="propina" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Carrera", propOrder = {
    "conductor",
    "tarjetaCredito",
    "origen",
    "destino",
    "tiempoEsperadoMinutos",
    "distancia",
    "costeTotal",
    "propina"
})
public class Carrera {

    @XmlElement(required = true)
    protected Conductor conductor;
    @XmlElement(required = true)
    protected String tarjetaCredito;
    @XmlElement(required = true)
    protected String origen;
    @XmlElement(required = true)
    protected String destino;
    protected int tiempoEsperadoMinutos;
    protected double distancia;
    protected double costeTotal;
    protected double propina;

    /**
     * Gets the value of the conductor property.
     * 
     * @return
     *     possible object is
     *     {@link Conductor }
     *     
     */
    public Conductor getConductor() {
        return conductor;
    }

    /**
     * Sets the value of the conductor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Conductor }
     *     
     */
    public void setConductor(Conductor value) {
        this.conductor = value;
    }

    /**
     * Gets the value of the tarjetaCredito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarjetaCredito() {
        return tarjetaCredito;
    }

    /**
     * Sets the value of the tarjetaCredito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarjetaCredito(String value) {
        this.tarjetaCredito = value;
    }

    /**
     * Gets the value of the origen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * Sets the value of the origen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigen(String value) {
        this.origen = value;
    }

    /**
     * Gets the value of the destino property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestino() {
        return destino;
    }

    /**
     * Sets the value of the destino property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestino(String value) {
        this.destino = value;
    }

    /**
     * Gets the value of the tiempoEsperadoMinutos property.
     * 
     */
    public int getTiempoEsperadoMinutos() {
        return tiempoEsperadoMinutos;
    }

    /**
     * Sets the value of the tiempoEsperadoMinutos property.
     * 
     */
    public void setTiempoEsperadoMinutos(int value) {
        this.tiempoEsperadoMinutos = value;
    }

    /**
     * Gets the value of the distancia property.
     * 
     */
    public double getDistancia() {
        return distancia;
    }

    /**
     * Sets the value of the distancia property.
     * 
     */
    public void setDistancia(double value) {
        this.distancia = value;
    }

    /**
     * Gets the value of the costeTotal property.
     * 
     */
    public double getCosteTotal() {
        return costeTotal;
    }

    /**
     * Sets the value of the costeTotal property.
     * 
     */
    public void setCosteTotal(double value) {
        this.costeTotal = value;
    }

    /**
     * Gets the value of the propina property.
     * 
     */
    public double getPropina() {
        return propina;
    }

    /**
     * Sets the value of the propina property.
     * 
     */
    public void setPropina(double value) {
        this.propina = value;
    }

}