package com.johnny.designpatterns.agentmode.candymachinermi;

import java.rmi.Remote;
import java.rmi.RemoteException;

import com.johnny.designpatterns.agentmode.candymachine.State;

public interface CandyMachineRemote extends Remote{
	public String  getLocation() throws RemoteException;
	public int getCount() throws RemoteException;
	public State getstate() throws RemoteException;
}
