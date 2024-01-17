package pkg.section16.map.main;

import java.util.Map;

import pkg.section16.map.imp.ImpMap;
import pkg.section16.map.model.ModelDictionary;

public class MainDic {
	public static void main(String[] args) {
		ImpMap impMap = new ImpMap();
		Map<String, ModelDictionary> mapDic = impMap.inputDic();
		impMap.infoDic(mapDic);
		impMap.filterDic(mapDic);
		impMap.deleteDic(mapDic);
	}
}
