package dataservice.repertorydataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import po.EnterRepertoryReceiptPO;

public interface EnterRepertoryReceiptDataService extends Remote {

    int addEnterRepertoryReceipt(EnterRepertoryReceiptPO errpo) throws RemoteException;

    int deleteEnterRepertoryReceipt(String receiptID) throws RemoteException;

    int sendEnterRepertoryReceipt(String receiptID) throws RemoteException;

    int approveEnterRepertoryReceipt(String receiptID) throws RemoteException;

    int disapproveEnterRepertoryReceipt(String receiptID) throws RemoteException;

    EnterRepertoryReceiptPO findEnterRepertoryReceiptByReceiptID(String receiptID) throws RemoteException;

    ArrayList<EnterRepertoryReceiptPO> findEnterRepertoryReceiptByCreatorID(String creatorID) throws RemoteException;

    ArrayList<EnterRepertoryReceiptPO> findEnterRepertoryReceiptByCreatorAndKeyword(String creator, String keyword) throws RemoteException;

    ArrayList<EnterRepertoryReceiptPO> getAllSubmitedEnterRepertoryReceipts() throws RemoteException;

    ArrayList<EnterRepertoryReceiptPO> getAllEnterRepertoryReceipts() throws RemoteException;

    String getEnterRepertoryReceiptPost() throws RemoteException;

}
