package br.com.fiap.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import br.com.fiap.bo.CotacaoBO;

public class Client {

	public static void main(String[] args) {

		try {
			CotacaoBO bo = (CotacaoBO) Naming.lookup("rmi://127.0.0.1:1234/churros");
			
			double real = bo.converterBitCoinParaReal(20);
			
			System.out.println("R$ "+real);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
