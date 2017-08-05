package dataservice.userdataservice;

import po.UserPO;
import type.ProfessionType;
import type.AuthorityType;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface UserDataService extends Remote {

    int addUser(UserPO userpo) throws RemoteException;

    int deleteUser(String userID) throws RemoteException;

    int modifyUserPassword(String userID, String newPassword) throws RemoteException;

    int modifyUserAuthority(String userID, AuthorityType authority) throws RemoteException;

    int modifyUserOrganization(String userID, String newOrganization) throws RemoteException;

    UserPO findUserByID(String userID) throws RemoteException;

    ArrayList<UserPO> findUserByKeyword(String keyword) throws RemoteException;

    ArrayList<UserPO> showAllUsers() throws RemoteException;

    String getUserIDPost(ProfessionType profession) throws RemoteException;

}
