package dataservice.financedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import po.CostIncomeReceiptPO;

public interface CostIncomeReceiptDataService extends Remote {
    int creatCostIncomeList(CostIncomeReceiptPO po) throws RemoteException;

    //按ID或者是日期获取(总经理要按时间查询)
    CostIncomeReceiptPO getCostIncomeReceipt(String time) throws RemoteException;
}
