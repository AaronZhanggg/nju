package dataservice.financedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import po.PaymentReceiptPO;

public interface PaymentReceiptDataService extends Remote {
    int creatPaymentReceipt(PaymentReceiptPO po) throws RemoteException;

    ArrayList<PaymentReceiptPO> getAllPaymentReceipt() throws RemoteException;

//	//当天存储的持久化对象个数
//	public int getNum() throws RemoteException;
    //根据ID查找持久化对象
//	public PaymentReceiptPO findByID(String ID) throws RemoteException;
//	//修改持久化对象
//	public  PaymentReceiptPO modify(PaymentReceiptPO po) throws RemoteException;

    //获取经营情况表需要
    ArrayList<PaymentReceiptPO> getPayment_right(String beginTime, String endTime) throws RemoteException;

    //获取未审批的入款单
    ArrayList<PaymentReceiptPO> getUnapprovedPaymentReceipt() throws RemoteException;

    //存储审批后的单据信息（总经理调用）
    int saveSubmittedPaymentReceiptInfo(PaymentReceiptPO po) throws RemoteException;
}
