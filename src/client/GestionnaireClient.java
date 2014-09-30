package client;

import java.io.*;

import client.Communication.Client;

public class GestionnaireClient {

	/**
	 * @param args
	 */
	
	public static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) {
		System.out.println("Initialisation du client");
		System.out.println("Specifiez l'adresse IP (127.0.0.1 par defaut): ");
		String ip ="";
		int port1 = 9876,
			port2 = 9877;

		try
		{
			ip = bufferedReader.readLine();
			if(null ==ip || "" == ip)
			{
				ip = "127.0.0.1";
			}
			
			Client client = new Client(ip, port1);	
		}
		catch(IOException ioe)
		{
			System.out.println(ioe);
			ioe.printStackTrace();			
		}
		
	}

}
