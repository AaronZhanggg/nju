package dataservice.financedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import po.CollectionReceiptPO;

public interface CollectionReceiptDataService extends Remote {
    int createCollection(CollectionReceiptPO po) throws RemoteException;

    ArrayList<CollectionReceiptPO> getAllCollection() throws RemoteException;

    //
    //获取经营情况表需要
    ArrayList<CollectionReceiptPO> getCollection_right(String beginTime, String endTime) throws RemoteException;

    //获取未审批的合计收款单(审批单据需要)
    ArrayList<CollectionReceiptPO> getUnapprovedCollectionReceipt() throws RemoteException;

    //供总经理调用来存储已经审批结束的单据
    int saveSubmittedCollectionReceiptInfo(CollectionReceiptPO po) throws RemoteException;

}
