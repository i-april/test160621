
package hk.neware.mvne.portal.soap.bss4mvno;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for changeMsisdnReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="changeMsisdnReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.neware.hk}mvnoReq">
 *       &lt;sequence>
 *         &lt;element name="feeInfoTypeList" type="{http://webservice.neware.hk}feeInfoTypeList" minOccurs="0"/>
 *         &lt;element name="IMSI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newMSISDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldMSISDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "changeMsisdnReq", propOrder = {
    "feeInfoTypeList",
    "imsi",
    "newMSISDN",
    "oldMSISDN",
    "payway",
    "remark"
})
public class ChangeMsisdnReq
    extends MvnoReq
{

    protected FeeInfoTypeList feeInfoTypeList;
    @XmlElement(name = "IMSI")
    protected String imsi;
    protected String newMSISDN;
    protected String oldMSISDN;
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
     * Gets the value of the newMSISDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewMSISDN() {
        return newMSISDN;
    }

    /**
     * Sets the value of the newMSISDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewMSISDN(String value) {
        this.newMSISDN = value;
    }

    /**
     * Gets the value of the oldMSISDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldMSISDN() {
        return oldMSISDN;
    }

    /**
     * Sets the value of the oldMSISDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldMSISDN(String value) {
        this.oldMSISDN = value;
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
