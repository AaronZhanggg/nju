package dataservice.managedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import po.CostPO;
import type.ExpressType;

public interface CostDataService extends Remote {

    int addCost(CostPO costpo) throws RemoteException;

    int modifyCost(CostPO costpo) throws RemoteException;

    CostPO findCost(ExpressType expressType) throws RemoteException;

    ArrayList<CostPO> showAllCosts() throws RemoteException;

}
