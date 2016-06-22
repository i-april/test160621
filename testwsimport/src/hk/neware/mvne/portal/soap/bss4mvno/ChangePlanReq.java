
package hk.neware.mvne.portal.soap.bss4mvno;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for changePlanReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="changePlanReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.neware.hk}mvnoReq">
 *       &lt;sequence>
 *         &lt;element name="IMSI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newTemplateInfoType" type="{http://webservice.neware.hk}templateInfoType" minOccurs="0"/>
 *         &lt;element name="oldTemplateInfoType" type="{http://webservice.neware.hk}templateInfoType" minOccurs="0"/>
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "changePlanReq", propOrder = {
    "imsi",
    "newTemplateInfoType",
    "oldTemplateInfoType",
    "remark"
})
public class ChangePlanReq
    extends MvnoReq
{

    @XmlElement(name = "IMSI")
    protected String imsi;
    protected TemplateInfoType newTemplateInfoType;
    protected TemplateInfoType oldTemplateInfoType;
    protected String remark;

    /**
     * Gets the value of the imsi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMSI() {
        return imsi;
    }

    /**
     * Sets the value of the imsi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMSI(String value) {
        this.imsi = value;
    }

    /**
     * Gets the value of the newTemplateInfoType property.
     * 
     * @return
     *     possible object is
     *     {@link TemplateInfoType }
     *     
     */
    public TemplateInfoType getNewTemplateInfoType() {
        return newTemplateInfoType;
    }

    /**
     * Sets the value of the newTemplateInfoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemplateInfoType }
     *     
     */
    public void setNewTemplateInfoType(TemplateInfoType value) {
        this.newTemplateInfoType = value;
    }

    /**
     * Gets the value of the oldTemplateInfoType property.
     * 
     * @return
     *     possible object is
     *     {@link TemplateInfoType }
     *     
     */
    public TemplateInfoType getOldTemplateInfoType() {
        return oldTemplateInfoType;
    }

    /**
     * Sets the value of the oldTemplateInfoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemplateInfoType }
     *     
     */
    public void setOldTemplateInfoType(TemplateInfoType value) {
        this.oldTemplateInfoType = value;
    }

    /**
     * Gets the value of the remark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Sets the value of the remark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

}
