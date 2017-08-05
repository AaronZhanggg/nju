package dataservice.repertorydataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import po.LeaveRepertoryReceiptPO;

public interface LeaveRepertoryReceiptDataService extends Remote {

    int addLeaveRepertoryReceipt(LeaveRepertoryReceiptPO lrrpo) throws RemoteException;

    int sendLeaveRepertoryReceipt(String receiptID) throws RemoteException;

    int approveLeaveRepertoryReceipt(String receiptID) throws RemoteException;

    int disapproveLeaveRepertoryReceipt(String receiptID) throws RemoteException;

    LeaveRepertoryReceiptPO findLeaveRepertoryReceiptByReceiptID(String receiptID) throws RemoteException;

    ArrayList<LeaveRepertoryReceiptPO> findLeaveRepertoryReceiptByCreatorID(String creatorID) throws RemoteException;

    ArrayList<LeaveRepertoryReceiptPO> findLeaveRepertoryReceiptByCreatorAndKeyword(String creator, String keyword) throws RemoteException;

    ArrayList<LeaveRepertoryReceiptPO> getAllSubmitedLeaveRepertoryReceipts() throws RemoteException;

    ArrayList<LeaveRepertoryReceiptPO> getAllLeaveRepertoryReceipts() throws RemoteException;

    String getLeaveRepertoryReceiptPost() throws RemoteException;

}
