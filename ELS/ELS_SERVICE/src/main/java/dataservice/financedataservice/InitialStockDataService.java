package dataservice.financedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import po.InitInfoPO;

public interface InitialStockDataService extends Remote {

    //初始化信息
    int initInfo(InitInfoPO po, String time) throws RemoteException;

    //获得初始信息
    InitInfoPO getInitInfo(String time) throws RemoteException;

    //获取所有初始信息
    ArrayList<InitInfoPO> getAllInitInfo() throws RemoteException;
}
