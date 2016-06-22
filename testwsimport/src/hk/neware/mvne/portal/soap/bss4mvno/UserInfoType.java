
package hk.neware.mvne.portal.soap.bss4mvno;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="encryptInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imsiNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="languageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="simNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userPwd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userInfoType", propOrder = {
    "encryptInfo",
    "imsiNum",
    "languageCode",
    "simNum",
    "userPwd"
})
public class UserInfoType {

    protected String encryptInfo;
    protected String imsiNum;
    protected String languageCode;
    protected String simNum;
    protected String userPwd;

    /**
     * Gets the value of the encryptInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptInfo() {
        return encryptInfo;
    }

    /**
     * Sets the value of the encryptInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptInfo(String value) {
        this.encryptInfo = value;
    }

    /**
     * Gets the value of the imsiNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImsiNum() {
        return imsiNum;
    }

    /**
     * Sets the value of the imsiNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImsiNum(String value) {
        this.imsiNum = value;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
    }

    /**
     * Gets the value of the simNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSimNum() {
        return simNum;
    }

    /**
     * Sets the value of the simNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSimNum(String value) {
        this.simNum = value;
    }

    /**
     * Gets the value of the userPwd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPwd() {
        return userPwd;
    }

    /**
     * Sets the value of the userPwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPwd(String value) {
        this.userPwd = value;
    }

}
