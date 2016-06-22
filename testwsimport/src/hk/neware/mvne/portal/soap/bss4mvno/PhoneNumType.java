
package hk.neware.mvne.portal.soap.bss4mvno;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for phoneNumType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="phoneNumType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="attrFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="netCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "phoneNumType", propOrder = {
    "addrCode",
    "attrFlag",
    "netCode",
    "phoneNum"
})
public class PhoneNumType {

    protected String addrCode;
    protected String attrFlag;
    protected String netCode;
    protected String phoneNum;

    /**
     * Gets the value of the addrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrCode() {
        return addrCode;
    }

    /**
     * Sets the value of the addrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrCode(String value) {
        this.addrCode = value;
    }

    /**
     * Gets the value of the attrFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttrFlag() {
        return attrFlag;
    }

    /**
     * Sets the value of the attrFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttrFlag(String value) {
        this.attrFlag = value;
    }

    /**
     * Gets the value of the netCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetCode() {
        return netCode;
    }

    /**
     * Sets the value of the netCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetCode(String value) {
        this.netCode = value;
    }

    /**
     * Gets the value of the phoneNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNum() {
        return phoneNum;
    }

    /**
     * Sets the value of the phoneNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNum(String value) {
        this.phoneNum = value;
    }

}
