
package hk.neware.mvne.portal.soap.bss4mvno;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for infoQueryRsp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="infoQueryRsp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.neware.hk}mvnoRsp">
 *       &lt;sequence>
 *         &lt;element name="balance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="balanceDetailTypeList" type="{http://webservice.neware.hk}balanceDetailTypeArray" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="expiryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userStateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "infoQueryRsp", propOrder = {
    "balance",
    "balanceDetailTypeList",
    "expiryDate",
    "userState",
    "userStateName"
})
public class InfoQueryRsp
    extends MvnoRsp
{

    protected String balance;
    @XmlElement(nillable = true)
    protected List<BalanceDetailTypeArray> balanceDetailTypeList;
    protected String expiryDate;
    protected String userState;
    protected String userStateName;

    /**
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalance(String value) {
        this.balance = value;
    }

    /**
     * Gets the value of the balanceDetailTypeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the balanceDetailTypeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalanceDetailTypeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BalanceDetailTypeArray }
     * 
     * 
     */
    public List<BalanceDetailTypeArray> getBalanceDetailTypeList() {
        if (balanceDetailTypeList == null) {
            balanceDetailTypeList = new ArrayList<BalanceDetailTypeArray>();
        }
        return this.balanceDetailTypeList;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiryDate(String value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the userState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserState() {
        return userState;
    }

    /**
     * Sets the value of the userState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserState(String value) {
        this.userState = value;
    }

    /**
     * Gets the value of the userStateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserStateName() {
        return userStateName;
    }

    /**
     * Sets the value of the userStateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserStateName(String value) {
        this.userStateName = value;
    }

}
