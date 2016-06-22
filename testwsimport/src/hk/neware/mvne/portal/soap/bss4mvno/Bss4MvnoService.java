
package hk.neware.mvne.portal.soap.bss4mvno;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Bss4MvnoService", targetNamespace = "http://webservice.neware.hk")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Bss4MvnoService {


    /**
     * 
     * @param request
     * @return
     *     returns hk.neware.mvne.portal.soap.bss4mvno.DeleteRsp
     */
    @WebMethod
    @WebResult(name = "response", partName = "response")
    public DeleteRsp delete(
        @WebParam(name = "request", partName = "request")
        DeleteReq request);

    /**
     * 
     * @param request
     * @return
     *     returns hk.neware.mvne.portal.soap.bss4mvno.RecoverRsp
     */
    @WebMethod
    @WebResult(name = "response", partName = "response")
    public RecoverRsp recover(
        @WebParam(name = "request", partName = "request")
        RecoverReq request);

    /**
     * 
     * @param request
     * @return
     *     returns hk.neware.mvne.portal.soap.bss4mvno.ProvisionRsp
     */
    @WebMethod
    @WebResult(name = "response", partName = "response")
    public ProvisionRsp provisioning(
        @WebParam(name = "request", partName = "request")
        ProvisionReq request);

    /**
     * 
     * @param request
     * @return
     *     returns hk.neware.mvne.portal.soap.bss4mvno.SuspendRsp
     */
    @WebMethod
    @WebResult(name = "response", partName = "response")
    public SuspendRsp suspend(
        @WebParam(name = "request", partName = "request")
        SuspendReq request);

    /**
     * 
     * @param request
     * @return
     *     returns hk.neware.mvne.portal.soap.bss4mvno.ModHssSpeedRsp
     */
    @WebMethod
    @WebResult(name = "response", partName = "response")
    public ModHssSpeedRsp modHssSpeed(
        @WebParam(name = "request", partName = "request")
        ModHssSpeedReq request);

    /**
     * 
     * @param request
     * @return
     *     returns hk.neware.mvne.portal.soap.bss4mvno.InfoQueryRsp
     */
    @WebMethod
    @WebResult(name = "response", partName = "response")
    public InfoQueryRsp query(
        @WebParam(name = "request", partName = "request")
        InfoQueryReq request);

    /**
     * 
     * @param request
     * @return
     *     returns hk.neware.mvne.portal.soap.bss4mvno.ResetHssSpeedRsp
     */
    @WebMethod
    @WebResult(name = "response", partName = "response")
    public ResetHssSpeedRsp resetHssSpeed(
        @WebParam(name = "request", partName = "request")
        ResetHssSpeedReq request);

    /**
     * 
     * @param request
     * @return
     *     returns hk.neware.mvne.portal.soap.bss4mvno.ChangeSimRsp
     */
    @WebMethod
    @WebResult(name = "response", partName = "response")
    public ChangeSimRsp chgcard(
        @WebParam(name = "request", partName = "request")
        ChangeSimReq request);

    /**
     * 
     * @param request
     * @return
     *     returns hk.neware.mvne.portal.soap.bss4mvno.FupOffRsp
     */
    @WebMethod
    @WebResult(name = "response", partName = "response")
    public FupOffRsp turnoffFUP(
        @WebParam(name = "request", partName = "request")
        FupOffReq request);

    /**
     * 
     * @param request
     * @return
     *     returns hk.neware.mvne.portal.soap.bss4mvno.ChangePlanRsp
     */
    @WebMethod
    @WebResult(name = "response", partName = "response")
    public ChangePlanRsp chgplan(
        @WebParam(name = "request", partName = "request")
        ChangePlanReq request);

    /**
     * 
     * @param request
     * @return
     *     returns hk.neware.mvne.portal.soap.bss4mvno.ChangeMsisdnRsp
     */
    @WebMethod
    @WebResult(name = "response", partName = "response")
    public ChangeMsisdnRsp chgnum(
        @WebParam(name = "request", partName = "request")
        ChangeMsisdnReq request);

    /**
     * 
     * @param request
     * @return
     *     returns hk.neware.mvne.portal.soap.bss4mvno.RechargeRsp
     */
    @WebMethod
    @WebResult(name = "response", partName = "response")
    public RechargeRsp recharge(
        @WebParam(name = "request", partName = "request")
        RechargeReq request);

    /**
     * 
     * @param request
     * @return
     *     returns hk.neware.mvne.portal.soap.bss4mvno.ActiveRsp
     */
    @WebMethod
    @WebResult(name = "response", partName = "response")
    public ActiveRsp active(
        @WebParam(name = "request", partName = "request")
        ActiveReq request);

    /**
     * 
     * @param request
     * @return
     *     returns hk.neware.mvne.portal.soap.bss4mvno.HssStateQueryRsp
     */
    @WebMethod
    @WebResult(partName = "return")
    public HssStateQueryRsp hssStateQuery(
        @WebParam(name = "request", partName = "request")
        HssStateQueryReq request);

    /**
     * 
     * @param request
     * @return
     *     returns hk.neware.mvne.portal.soap.bss4mvno.FupOnRsp
     */
    @WebMethod
    @WebResult(name = "response", partName = "response")
    public FupOnRsp turnonFUP(
        @WebParam(name = "request", partName = "request")
        FupOnReq request);

}
