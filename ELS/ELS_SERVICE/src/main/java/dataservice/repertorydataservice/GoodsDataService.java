package dataservice.repertorydataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import po.GoodsPO;

public interface GoodsDataService extends Remote {

    int addGoods(GoodsPO goodspo) throws RemoteException;

    int deleteGoods(String orderID) throws RemoteException;

    int modifyGoods(GoodsPO goodspo) throws RemoteException;

    int modifyGoodsEnterTime(String goodsID, String enterTime) throws RemoteException;

    int modifyGoodsEnterRepertoryID(String goodsID, String enterRepertoryID) throws RemoteException;

    int modifyGoodsLeaveTime(String goodsID, String leaveTime) throws RemoteException;

    int modifyGoodsLeaveRepertoryID(String goodsID, String leaveRepertoryID) throws RemoteException;

    int modifyGoodsState(String goodsID, boolean isInRepertory) throws RemoteException;

    GoodsPO findGoodsByID(String orderID) throws RemoteException;

    ArrayList<GoodsPO> findGoodsByKeyword(String keyword) throws RemoteException;

    ArrayList<GoodsPO> showAllGoods() throws RemoteException;

    ArrayList<GoodsPO> getAllFreeGoods() throws RemoteException;

    ArrayList<GoodsPO> findFreeGoodsByKeyword(String keyword) throws RemoteException;

}
