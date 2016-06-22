
package hk.neware.mvne.portal.soap.bss4mvno;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for feeInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="feeInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cutFee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="feeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="feeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opFee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payFee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "feeInfoType", propOrder = {
    "cutFee",
    "feeCode",
    "feeType",
    "opFee",
    "payFee"
})
public class FeeInfoType {

    protected String cutFee;
    protected String feeCode;
    protected String feeType;
    protected String opFee;
    protected String payFee;

    /**
     * Gets the value of the cutFee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCutFee() {
        return cutFee;
    }

    /**
     * Sets the value of the cutFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCutFee(String value) {
        this.cutFee = value;
    }

    /**
     * Gets the value of the feeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeCode() {
        return feeCode;
    }

    /**
     * Sets the value of the feeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeCode(String value) {
        this.feeCode = value;
    }

    /**
     * Gets the value of the feeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeType() {
        return feeType;
    }

    /**
     * Sets the value of the feeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeType(String value) {
        this.feeType = value;
    }

    /**
     * Gets the value of the opFee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpFee() {
        return opFee;
    }

    /**
     * Sets the value of the opFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpFee(String value) {
        this.opFee = value;
    }

    /**
     * Gets the value of the payFee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayFee() {
        return payFee;
    }

    /**
     * Sets the value of the payFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayFee(String value) {
        this.payFee = value;
    }

}
