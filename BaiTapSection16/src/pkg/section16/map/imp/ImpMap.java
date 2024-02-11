package pkg.section16.map.imp;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import pkg.section16.map.model.ModelDictionary;
import pkg.section16.map.service.ServiceMap;

public class ImpMap implements ServiceMap {
	ImpDic impDic = new ImpDic();

	@Override
	public Map<String, ModelDictionary> inputDic() {
		// TODO Auto-generated method stub
		System.out.println("Nhap du lieu: ");
		Map<String, ModelDictionary> mapDic = new HashMap<String, ModelDictionary>();
		while(true) {
			ModelDictionary dic = new ModelDictionary();
			impDic.input(dic);
			mapDic.put(dic.getKeyWord(), dic);
			System.out.println("Press any key to continue or q to exit");
			String choice = new Scanner(System.in).nextLine();
			if (choice.equals("q")) {
				break;
			}	
		}
	
		return mapDic;
	}

	@Override
	public void infoDic(Map<String, ModelDictionary> mapDic) {
		// TODO Auto-generated method stub
		System.out.println("Danh sach:");
		for(Entry<String, ModelDictionary> s:mapDic.entrySet()) {
			impDic.info(s.getValue());
		}
	}

	@Override
	public void filterDic(Map<String, ModelDictionary> mapDic) {
		// TODO Auto-generated method stub
		System.out.println("Nhap tu can tim: ");
		String find = new Scanner(System.in).nextLine();
		ModelDictionary checkDic = mapDic.get(find);
		if (checkDic != null) {
			impDic.info(checkDic);
		} else {
			System.out.println("Khong co, tien hanh them vao tu dien");
			ModelDictionary add = new ModelDictionary();
			impDic.input(add);
			mapDic.put(find, add);
			System.out.println("Them thanh cong!");
			infoDic(mapDic);
		}
	}

	@Override
	public void deleteDic(Map<String, ModelDictionary> mapDic) {
		// TODO Auto-generated method stub
		System.out.println("Nhap tu muon xoa: ");
		String del = new Scanner(System.in).nextLine();
		if (del != null) {
			mapDic.remove(del);
			System.out.println("Xoa thanh cong!");
			infoDic(mapDic);
		} else {
			System.out.println("Khong ton tai, khong can xoa");
		}
		
	}
	
}
