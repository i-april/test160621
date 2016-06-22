
package hk.neware.mvne.portal.soap.bss4mvno;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for provisionReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="provisionReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.neware.hk}mvnoReq">
 *       &lt;sequence>
 *         &lt;element name="accountInfoType" type="{http://webservice.neware.hk}accountInfoType" minOccurs="0"/>
 *         &lt;element name="custFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custInfoType" type="{http://webservice.neware.hk}custInfoType" minOccurs="0"/>
 *         &lt;element name="feeInfoTypeList" type="{http://webservice.neware.hk}feeInfoTypeList" minOccurs="0"/>
 *         &lt;element name="payway" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneNumTypeList" type="{http://webservice.neware.hk}phoneNumTypeList" minOccurs="0"/>
 *         &lt;element name="templateInfoTypeList" type="{http://webservice.neware.hk}templateInfoTypeList" minOccurs="0"/>
 *         &lt;element name="userInfoType" type="{http://webservice.neware.hk}userInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "provisionReq", propOrder = {
    "accountInfoType",
    "custFlag",
    "custInfoType",
    "feeInfoTypeList",
    "payway",
    "phoneNumTypeList",
    "templateInfoTypeList",
    "userInfoType"
})
public class ProvisionReq
    extends MvnoReq
{

    protected AccountInfoType accountInfoType;
    protected String custFlag;
    protected CustInfoType custInfoType;
    protected FeeInfoTypeList feeInfoTypeList;
    protected String payway;
    protected PhoneNumTypeList phoneNumTypeList;
    protected TemplateInfoTypeList templateInfoTypeList;
    protected UserInfoType userInfoType;

    /**
     * Gets the value of the accountInfoType property.
     * 
     * @return
     *     possible object is
     *     {@link AccountInfoType }
     *     
     */
    public AccountInfoType getAccountInfoType() {
        return accountInfoType;
    }

    /**
     * Sets the value of the accountInfoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountInfoType }
     *     
     */
    public void setAccountInfoType(AccountInfoType value) {
        this.accountInfoType = value;
    }

    /**
     * Gets the value of the custFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustFlag() {
        return custFlag;
    }

    /**
     * Sets the value of the custFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustFlag(String value) {
        this.custFlag = value;
    }

    /**
     * Gets the value of the custInfoType property.
     * 
     * @return
     *     possible object is
     *     {@link CustInfoType }
     *     
     */
    public CustInfoType getCustInfoType() {
        return custInfoType;
    }

    /**
     * Sets the value of the custInfoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustInfoType }
     *     
     */
    public void setCustInfoType(CustInfoType value) {
        this.custInfoType = value;
    }

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
     * Gets the value of the phoneNumTypeList property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneNumTypeList }
     *     
     */
    public PhoneNumTypeList getPhoneNumTypeList() {
        return phoneNumTypeList;
    }

    /**
     * Sets the value of the phoneNumTypeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneNumTypeList }
     *     
     */
    public void setPhoneNumTypeList(PhoneNumTypeList value) {
        this.phoneNumTypeList = value;
    }

    /**
     * Gets the value of the templateInfoTypeList property.
     * 
     * @return
     *     possible object is
     *     {@link TemplateInfoTypeList }
     *     
     */
    public TemplateInfoTypeList getTemplateInfoTypeList() {
        return templateInfoTypeList;
    }

    /**
     * Sets the value of the templateInfoTypeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemplateInfoTypeList }
     *     
     */
    public void setTemplateInfoTypeList(TemplateInfoTypeList value) {
        this.templateInfoTypeList = value;
    }

    /**
     * Gets the value of the userInfoType property.
     * 
     * @return
     *     possible object is
     *     {@link UserInfoType }
     *     
     */
    public UserInfoType getUserInfoType() {
        return userInfoType;
    }

    /**
     * Sets the value of the userInfoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserInfoType }
     *     
     */
    public void setUserInfoType(UserInfoType value) {
        this.userInfoType = value;
    }

}
