package dataservice.managedataservice;

import po.PerWagePO;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import type.ProfessionType;

public interface PerWageDataService extends Remote {

    int addPerWage(PerWagePO perwagepo) throws RemoteException;

    int modifyPerWage(PerWagePO perwagepo) throws RemoteException;

    PerWagePO findPerWage(ProfessionType profession) throws RemoteException;

    ArrayList<PerWagePO> showAllPerWages() throws RemoteException;

}
