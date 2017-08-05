package dataservice.financedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import po.LogDiaryPO;

public interface LogDiaryDataService extends Remote {

    /**
     * 添加日志信息
     */
    int addLogDiary(LogDiaryPO po, String time) throws RemoteException;

    /**
     * 依据时间获取日志信息
     */
    ArrayList<LogDiaryPO> getLogDiaryPO(String time) throws RemoteException;

    /**
     * 读取所有日志信息
     */
    ArrayList<LogDiaryPO> getAllLogDiaryPOs() throws RemoteException;
}
