
package hk.neware.mvne.portal.soap.bss4mvno;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hssStateQueryRsp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hssStateQueryRsp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.neware.hk}mvnoRsp">
 *       &lt;sequence>
 *         &lt;element name="hssState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hssStateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hssStateQueryRsp", propOrder = {
    "hssState",
    "hssStateName"
})
public class HssStateQueryRsp
    extends MvnoRsp
{

    protected String hssState;
    protected String hssStateName;

    /**
     * Gets the value of the hssState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHssState() {
        return hssState;
    }

    /**
     * Sets the value of the hssState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHssState(String value) {
        this.hssState = value;
    }

    /**
     * Gets the value of the hssStateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHssStateName() {
        return hssStateName;
    }

    /**
     * Sets the value of the hssStateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHssStateName(String value) {
        this.hssStateName = value;
    }

}
