
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
 *         &lt;element name="EnvelopeStatusFilter" type="{http://www.docusign.net/API/3.0}EnvelopeStatusFilter" minOccurs="0"/>
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
    "envelopeStatusFilter"
})
@XmlRootElement(name = "RequestStatusesEx")
public class RequestStatusesEx {

    @XmlElement(name = "EnvelopeStatusFilter")
    protected EnvelopeStatusFilter envelopeStatusFilter;

    /**
     * Gets the value of the envelopeStatusFilter property.
     * 
     * @return
     *     possible object is
     *     {@link EnvelopeStatusFilter }
     *     
     */
    public EnvelopeStatusFilter getEnvelopeStatusFilter() {
        return envelopeStatusFilter;
    }

    /**
     * Sets the value of the envelopeStatusFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvelopeStatusFilter }
     *     
     */
    public void setEnvelopeStatusFilter(EnvelopeStatusFilter value) {
        this.envelopeStatusFilter = value;
    }

}
