
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
 *         &lt;element name="EnvelopeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PDFOptions" type="{http://www.docusign.net/API/3.0}PDFOptions" minOccurs="0"/>
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
    "envelopeID",
    "pdfOptions"
})
@XmlRootElement(name = "RequestPDFWithOptions")
public class RequestPDFWithOptions {

    @XmlElement(name = "EnvelopeID")
    protected String envelopeID;
    @XmlElement(name = "PDFOptions")
    protected PDFOptions pdfOptions;

    /**
     * Gets the value of the envelopeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnvelopeID() {
        return envelopeID;
    }

    /**
     * Sets the value of the envelopeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnvelopeID(String value) {
        this.envelopeID = value;
    }

    /**
     * Gets the value of the pdfOptions property.
     * 
     * @return
     *     possible object is
     *     {@link PDFOptions }
     *     
     */
    public PDFOptions getPDFOptions() {
        return pdfOptions;
    }

    /**
     * Sets the value of the pdfOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PDFOptions }
     *     
     */
    public void setPDFOptions(PDFOptions value) {
        this.pdfOptions = value;
    }

}
