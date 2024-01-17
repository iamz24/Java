package pkg.section16.map.imp;

import java.util.Scanner;

import pkg.section16.map.model.ModelDictionary;
import pkg.section16.map.service.ServiceDictionary;

public class ImpDic implements ServiceDictionary {

	@Override
	public void input(ModelDictionary dic) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap tu khoa: ");
		dic.setKeyWord(sc.nextLine());
		System.out.println("Nhap loai tu: ");
		dic.setWordType(sc.nextLine());
		System.out.println("Nhap nghia cua tu: ");
		dic.setDecription(sc.nextLine());
	}

	@Override
	public void info(ModelDictionary dic) {
		// TODO Auto-generated method stub
		System.out.println(dic.getKeyWord() +" ("+dic.getWordType()+")"+": "+dic.getDecription());
	}

}
