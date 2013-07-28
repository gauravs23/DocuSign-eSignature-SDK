
package net.docusign.api._3;

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
 *         &lt;element name="RequestPDFWithOptionsResult" type="{http://www.docusign.net/API/3.0}EnvelopePDF" minOccurs="0"/>
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
    "requestPDFWithOptionsResult"
})
@XmlRootElement(name = "RequestPDFWithOptionsResponse")
public class RequestPDFWithOptionsResponse {

    @XmlElement(name = "RequestPDFWithOptionsResult")
    protected EnvelopePDF requestPDFWithOptionsResult;

    /**
     * Gets the value of the requestPDFWithOptionsResult property.
     * 
     * @return
     *     possible object is
     *     {@link EnvelopePDF }
     *     
     */
    public EnvelopePDF getRequestPDFWithOptionsResult() {
        return requestPDFWithOptionsResult;
    }

    /**
     * Sets the value of the requestPDFWithOptionsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvelopePDF }
     *     
     */
    public void setRequestPDFWithOptionsResult(EnvelopePDF value) {
        this.requestPDFWithOptionsResult = value;
    }

}
