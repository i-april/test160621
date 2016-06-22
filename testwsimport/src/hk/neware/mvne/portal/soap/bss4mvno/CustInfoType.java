
package hk.neware.mvne.portal.soap.bss4mvno;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for custInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="custInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contactAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactEmaill" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactFax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactMailAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactPost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idIccid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idValiddate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "custInfoType", propOrder = {
    "contactAddr",
    "contactEmaill",
    "contactFax",
    "contactMailAddr",
    "contactPerson",
    "contactPhone",
    "contactPost",
    "idAddr",
    "idIccid",
    "idType",
    "idValiddate"
})
public class CustInfoType {

    protected String contactAddr;
    protected String contactEmaill;
    protected String contactFax;
    protected String contactMailAddr;
    protected String contactPerson;
    protected String contactPhone;
    protected String contactPost;
    protected String idAddr;
    protected String idIccid;
    protected String idType;
    protected String idValiddate;

    /**
     * Gets the value of the contactAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactAddr() {
        return contactAddr;
    }

    /**
     * Sets the value of the contactAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactAddr(String value) {
        this.contactAddr = value;
    }

    /**
     * Gets the value of the contactEmaill property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactEmaill() {
        return contactEmaill;
    }

    /**
     * Sets the value of the contactEmaill property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactEmaill(String value) {
        this.contactEmaill = value;
    }

    /**
     * Gets the value of the contactFax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactFax() {
        return contactFax;
    }

    /**
     * Sets the value of the contactFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactFax(String value) {
        this.contactFax = value;
    }

    /**
     * Gets the value of the contactMailAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactMailAddr() {
        return contactMailAddr;
    }

    /**
     * Sets the value of the contactMailAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactMailAddr(String value) {
        this.contactMailAddr = value;
    }

    /**
     * Gets the value of the contactPerson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPerson() {
        return contactPerson;
    }

    /**
     * Sets the value of the contactPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPerson(String value) {
        this.contactPerson = value;
    }

    /**
     * Gets the value of the contactPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * Sets the value of the contactPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPhone(String value) {
        this.contactPhone = value;
    }

    /**
     * Gets the value of the contactPost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPost() {
        return contactPost;
    }

    /**
     * Sets the value of the contactPost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPost(String value) {
        this.contactPost = value;
    }

    /**
     * Gets the value of the idAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdAddr() {
        return idAddr;
    }

    /**
     * Sets the value of the idAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdAddr(String value) {
        this.idAddr = value;
    }

    /**
     * Gets the value of the idIccid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdIccid() {
        return idIccid;
    }

    /**
     * Sets the value of the idIccid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdIccid(String value) {
        this.idIccid = value;
    }

    /**
     * Gets the value of the idType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdType() {
        return idType;
    }

    /**
     * Sets the value of the idType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdType(String value) {
        this.idType = value;
    }

    /**
     * Gets the value of the idValiddate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdValiddate() {
        return idValiddate;
    }

    /**
     * Sets the value of the idValiddate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdValiddate(String value) {
        this.idValiddate = value;
    }

}
