
package hk.neware.mvne.portal.soap.bss4mvno;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mvnoReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mvnoReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mvnoId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="staffId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mvnoReq", propOrder = {
    "mvnoId",
    "sessionId",
    "staffId"
})
@XmlSeeAlso({
    HssStateQueryReq.class,
    FupOffReq.class,
    DeleteReq.class,
    SuspendReq.class,
    FupOnReq.class,
    ActiveReq.class,
    RechargeReq.class,
    ChangeMsisdnReq.class,
    ProvisionReq.class,
    InfoQueryReq.class,
    ResetHssSpeedReq.class,
    ChangeSimReq.class,
    ChangePlanReq.class,
    ModHssSpeedReq.class,
    RecoverReq.class
})
public class MvnoReq {

    protected String mvnoId;
    protected String sessionId;
    protected String staffId;

    /**
     * Gets the value of the mvnoId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMvnoId() {
        return mvnoId;
    }

    /**
     * Sets the value of the mvnoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMvnoId(String value) {
        this.mvnoId = value;
    }

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the staffId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaffId() {
        return staffId;
    }

    /**
     * Sets the value of the staffId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaffId(String value) {
        this.staffId = value;
    }

}
