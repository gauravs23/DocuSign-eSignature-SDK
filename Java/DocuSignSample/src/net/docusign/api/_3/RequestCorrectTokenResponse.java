
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
 *         &lt;element name="RequestCorrectTokenResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "requestCorrectTokenResult"
})
@XmlRootElement(name = "RequestCorrectTokenResponse")
public class RequestCorrectTokenResponse {

    @XmlElement(name = "RequestCorrectTokenResult")
    protected String requestCorrectTokenResult;

    /**
     * Gets the value of the requestCorrectTokenResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestCorrectTokenResult() {
        return requestCorrectTokenResult;
    }

    /**
     * Sets the value of the requestCorrectTokenResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestCorrectTokenResult(String value) {
        this.requestCorrectTokenResult = value;
    }

}
