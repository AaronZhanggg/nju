package dataservice.repertorydataservice;

import java.util.ArrayList;
import java.rmi.Remote;
import java.rmi.RemoteException;

import po.GoodsPO;
import po.InventoryPO;
import po.RepertoryPO;
import po.InventoryCheckPO;

public interface RepertoryDataService extends Remote {

    int modifyRepertory(RepertoryPO repertorypo) throws RemoteException;  //对仓库信息做修改，比如库存信息初始化工作

    RepertoryPO findRepertory(String repertoryID) throws RemoteException;

    RepertoryPO findRepertoryByOwnerID(String ownerID) throws RemoteException;

    ArrayList<RepertoryPO> showAllRepertorys() throws RemoteException;

    int addInventory(String repertoryID, InventoryPO inventorypo) throws RemoteException;//增加库存（某商品入库）

    int deleteInventory(String repertoryID, String orderID) throws RemoteException;//删除库存（某商品出库）

    int modifyInventory(String repertoryID, InventoryPO inventorypo) throws RemoteException;//修改库存信息（暂时还没用到这个方法，不过还是先留着他吧）

    InventoryPO findInventorybyID(String repertoryID, String orderID) throws RemoteException;  //（通过寄件单号和仓库编号（因为有多个仓库）寻找库存信息）

    InventoryCheckPO findInventorybyDate(String repertoryID, String beginDate, String endDate) throws RemoteException;  //（通过起始日期和仓库编号寻找库存信息）

    ArrayList<InventoryPO> findInventorybyTime(String repertoryID, String time) throws RemoteException;  //（通过截止时间和仓库编号寻找库存信息）

    String getLastCreateEnterReceiptTime(String repertoryID) throws RemoteException;

    String getLastCreateLeaveReceiptTime(String repertoryID) throws RemoteException;

    int setLastCreateEnterReceiptTime(String repertoryID, String newEnterTime) throws RemoteException;

    int setLastCreateLeaveReceiptTime(String repertoryID, String newLeaveTime) throws RemoteException;

    ArrayList<GoodsPO> getEnterRepertoryGoods(String repertoryID) throws RemoteException;

    ArrayList<GoodsPO> getLeaveRepertoryGoods(String repertoryID) throws RemoteException;

}
