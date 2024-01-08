package pkg.section13.ddos.main;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainDdos extends Thread {
	public void dDos() throws Exception {
		URL url = new URL("http://www.vulnweb.com/");
		HttpURLConnection urlCon = (HttpURLConnection) url.openConnection();
		for(int i =0; i < urlCon.getHeaderFields().size(); i++) {
			System.out.println(urlCon.getHeaderFieldKey(i) + "=" + urlCon.getHeaderField(i));
		}
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			dDos();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		MainDdos mainDos = new MainDdos();
		mainDos.start();
	}
}
