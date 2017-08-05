package dataservice.financedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import po.AccountPO;

public interface AccountDataService extends Remote {
    //增加一条AccountPO
    int addAccount(AccountPO po) throws RemoteException;

    //删除一条AccountPO
    int deleteAccount(AccountPO po) throws RemoteException;

    //修改某个AccountPO
    int modifyAccount(AccountPO po, String name) throws RemoteException;

    //通过账户名查找某个AccountPO
    AccountPO findbyName(String name) throws RemoteException;

    //通过关键字查找某个AccountPO
    ArrayList<AccountPO> findByKeyword(String s) throws RemoteException;

    //输出所有的AccountPO记录
    ArrayList<AccountPO> showAll() throws RemoteException;

    //金额++
    int addMoney(String name, double m) throws RemoteException;

    //金额--
    int delMoney(String name, double m) throws RemoteException;

}
