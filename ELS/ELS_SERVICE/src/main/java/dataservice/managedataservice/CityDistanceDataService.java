package dataservice.managedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import po.CityDistancePO;

public interface CityDistanceDataService extends Remote {

    int addCityDistance(CityDistancePO cityDistancepo) throws RemoteException;

    int deleteCityDistance(String cityA, String cityB) throws RemoteException;

    int modifyCityDistance(CityDistancePO cityDistancepo) throws RemoteException;

    ArrayList<CityDistancePO> findCityDistanceBySingle(String city) throws RemoteException;

    ArrayList<CityDistancePO> findCityDistanceByBoth(String cityA, String cityB) throws RemoteException;

    ArrayList<CityDistancePO> showAllCityDistances() throws RemoteException;

    ArrayList<String> getAllCitys() throws RemoteException;

}
