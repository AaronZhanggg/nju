package dataservice.financedataservice;

import java.rmi.RemoteException;
import java.util.ArrayList;

import po.BusinessStatementReceiptPO;

public interface BusinessstatementReceiptDataService {
    //返回一个BusinessstatementReceiptPO记录
    BusinessStatementReceiptPO showBSL(String beginTime, String endTime) throws RemoteException;

    //返回BusinessstatementReceiptPO的ArrayList
    ArrayList<BusinessStatementReceiptPO> showAllBSList() throws RemoteException;

    //导出excel
    int export(BusinessStatementReceiptPO po) throws RemoteException;
}
