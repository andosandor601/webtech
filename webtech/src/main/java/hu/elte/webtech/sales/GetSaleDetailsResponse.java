//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.14 at 03:13:35 PM CET 
//


package hu.elte.webtech.sales;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SaleDetails" type="{http://elte.hu/webtech/sales}SaleDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "saleDetails"
})
@XmlRootElement(name = "GetSaleDetailsResponse")
public class GetSaleDetailsResponse {

    @XmlElement(name = "SaleDetails", required = true)
    protected SaleDetails saleDetails;

    /**
     * Gets the value of the saleDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SaleDetails }
     *     
     */
    public SaleDetails getSaleDetails() {
        return saleDetails;
    }

    /**
     * Sets the value of the saleDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleDetails }
     *     
     */
    public void setSaleDetails(SaleDetails value) {
        this.saleDetails = value;
    }

}
