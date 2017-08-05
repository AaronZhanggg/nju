package dataservice.managedataservice;

import po.OrganizationPO;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface OrganizationDataService extends Remote {

    int addOrganization(OrganizationPO organizationpo) throws RemoteException;

    int deleteOrganization(String OrganizationID) throws RemoteException;

    int modifyOrganization(OrganizationPO organizationpo) throws RemoteException;

    OrganizationPO findOrganizationByID(String OrganizationID) throws RemoteException;

    ArrayList<OrganizationPO> findOrganizationByKeyword(String keyword) throws RemoteException;

    ArrayList<OrganizationPO> showAllOrganizations() throws RemoteException;

    ArrayList<String> getBelongingPlaces(String city) throws RemoteException;

}
