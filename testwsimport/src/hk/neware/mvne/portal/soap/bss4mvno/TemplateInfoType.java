
package hk.neware.mvne.portal.soap.bss4mvno;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for templateInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="templateInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cycle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="freeUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maxCycleFee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maxCycleUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maxDailyFee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maxDailyUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="qosRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rentFee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="templateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitFee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitVol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usageLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "templateInfoType", propOrder = {
    "cycle",
    "freeUsage",
    "maxCycleFee",
    "maxCycleUsage",
    "maxDailyFee",
    "maxDailyUsage",
    "qosRule",
    "rentFee",
    "templateCode",
    "unitFee",
    "unitVol",
    "usageLocation"
})
public class TemplateInfoType {

    protected String cycle;
    protected String freeUsage;
    protected String maxCycleFee;
    protected String maxCycleUsage;
    protected String maxDailyFee;
    protected String maxDailyUsage;
    protected String qosRule;
    protected String rentFee;
    protected String templateCode;
    protected String unitFee;
    protected String unitVol;
    protected String usageLocation;

    /**
     * Gets the value of the cycle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCycle() {
        return cycle;
    }

    /**
     * Sets the value of the cycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCycle(String value) {
        this.cycle = value;
    }

    /**
     * Gets the value of the freeUsage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreeUsage() {
        return freeUsage;
    }

    /**
     * Sets the value of the freeUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreeUsage(String value) {
        this.freeUsage = value;
    }

    /**
     * Gets the value of the maxCycleFee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxCycleFee() {
        return maxCycleFee;
    }

    /**
     * Sets the value of the maxCycleFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxCycleFee(String value) {
        this.maxCycleFee = value;
    }

    /**
     * Gets the value of the maxCycleUsage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxCycleUsage() {
        return maxCycleUsage;
    }

    /**
     * Sets the value of the maxCycleUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxCycleUsage(String value) {
        this.maxCycleUsage = value;
    }

    /**
     * Gets the value of the maxDailyFee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxDailyFee() {
        return maxDailyFee;
    }

    /**
     * Sets the value of the maxDailyFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxDailyFee(String value) {
        this.maxDailyFee = value;
    }

    /**
     * Gets the value of the maxDailyUsage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxDailyUsage() {
        return maxDailyUsage;
    }

    /**
     * Sets the value of the maxDailyUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxDailyUsage(String value) {
        this.maxDailyUsage = value;
    }

    /**
     * Gets the value of the qosRule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQosRule() {
        return qosRule;
    }

    /**
     * Sets the value of the qosRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQosRule(String value) {
        this.qosRule = value;
    }

    /**
     * Gets the value of the rentFee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRentFee() {
        return rentFee;
    }

    /**
     * Sets the value of the rentFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRentFee(String value) {
        this.rentFee = value;
    }

    /**
     * Gets the value of the templateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateCode() {
        return templateCode;
    }

    /**
     * Sets the value of the templateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateCode(String value) {
        this.templateCode = value;
    }

    /**
     * Gets the value of the unitFee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitFee() {
        return unitFee;
    }

    /**
     * Sets the value of the unitFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitFee(String value) {
        this.unitFee = value;
    }

    /**
     * Gets the value of the unitVol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitVol() {
        return unitVol;
    }

    /**
     * Sets the value of the unitVol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitVol(String value) {
        this.unitVol = value;
    }

    /**
     * Gets the value of the usageLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsageLocation() {
        return usageLocation;
    }

    /**
     * Sets the value of the usageLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsageLocation(String value) {
        this.usageLocation = value;
    }

}
