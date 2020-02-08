package todo.core.common.dto;

import java.util.HashMap;
import java.util.Map;

public class AppCtxCache {

	private Map<String, Object> ctxData = new HashMap<>();

	public Map<String, Object> getCtxData() {
		return ctxData;
	}

	public void setCtxData(Map<String, Object> ctxData) {
		this.ctxData = ctxData;
	}

	public void addCtxData(String key, Object value) {
		this.ctxData.put(key, value);
	}

	public void addCtxData(Map<String, Object> ctxData) {
		this.ctxData.putAll(ctxData);
	}

	public Object getCtxDataByKey(String key) {
		return this.ctxData.get(key);
	}

	public String getCtxDataByKeyAsStr(String key) {
		return (String) this.ctxData.get(key);
	}

}
