package pkg.section16.map.service;

import java.util.Dictionary;
import java.util.Map;

import pkg.section16.map.model.ModelDictionary;

public interface ServiceMap {
	Map<String, ModelDictionary> inputDic();
	void infoDic(Map<String, ModelDictionary> mapDic);
	void filterDic(Map<String, ModelDictionary> mapDic);
	void deleteDic(Map<String, ModelDictionary> mapDic);
}
