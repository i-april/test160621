
package hk.neware.mvne.portal.soap.bss4mvno;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for changeSimReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="changeSimReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.neware.hk}mvnoReq">
 *       &lt;sequence>
 *         &lt;element name="feeInfoTypeList" type="{http://webservice.neware.hk}feeInfoTypeList" minOccurs="0"/>
 *         &lt;element name="IMSI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newIMSI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newSIM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payway" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "changeSimReq", propOrder = {
    "feeInfoTypeList",
    "imsi",
    "newIMSI",
    "newSIM",
    "payway",
    "remark"
})
public class ChangeSimReq
    extends MvnoReq
{

    protected FeeInfoTypeList feeInfoTypeList;
    @XmlElement(name = "IMSI")
    protected String imsi;
    protected String newIMSI;
    protected String newSIM;
    protected String payway;
    protected String remark;

    /**
     * Gets the value of the feeInfoTypeList property.
     * 
     * @return
     *     possible object is
     *     {@link FeeInfoTypeList }
     *     
     */
    public FeeInfoTypeList getFeeInfoTypeList() {
        return feeInfoTypeList;
    }

    /**
     * Sets the value of the feeInfoTypeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeInfoTypeList }
     *     
     */
    public void setFeeInfoTypeList(FeeInfoTypeList value) {
        this.feeInfoTypeList = value;
    }

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
     * Gets the value of the newIMSI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewIMSI() {
        return newIMSI;
    }

    /**
     * Sets the value of the newIMSI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewIMSI(String value) {
        this.newIMSI = value;
    }

    /**
     * Gets the value of the newSIM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewSIM() {
        return newSIM;
    }

    /**
     * Sets the value of the newSIM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewSIM(String value) {
        this.newSIM = value;
    }

    /**
     * Gets the value of the payway property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayway() {
        return payway;
    }

    /**
     * Sets the value of the payway property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayway(String value) {
        this.payway = value;
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
