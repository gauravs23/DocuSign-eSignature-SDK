
package net.docusign.api._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfConnectFailure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfConnectFailure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConnectFailure" type="{http://www.docusign.net/API/3.0}ConnectFailure" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfConnectFailure", propOrder = {
    "connectFailure"
})
public class ArrayOfConnectFailure {

    @XmlElement(name = "ConnectFailure", nillable = true)
    protected List<ConnectFailure> connectFailure;

    /**
     * Gets the value of the connectFailure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectFailure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectFailure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConnectFailure }
     * 
     * 
     */
    public List<ConnectFailure> getConnectFailure() {
        if (connectFailure == null) {
            connectFailure = new ArrayList<ConnectFailure>();
        }
        return this.connectFailure;
    }

}
