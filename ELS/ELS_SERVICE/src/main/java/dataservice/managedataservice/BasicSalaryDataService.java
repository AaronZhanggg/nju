package dataservice.managedataservice;

import po.BasicSalaryPO;
import type.ProfessionType;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface BasicSalaryDataService extends Remote {

    int addBasicSalary(BasicSalaryPO basicsalarypo) throws RemoteException;

    int modifyBasicSalary(BasicSalaryPO basicsalarypo) throws RemoteException;

    BasicSalaryPO findBasicSalary(ProfessionType profession) throws RemoteException;

    ArrayList<BasicSalaryPO> showAllBasicSalarys() throws RemoteException;

}
