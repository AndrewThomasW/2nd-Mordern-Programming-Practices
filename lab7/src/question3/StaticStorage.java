package question3;
import java.time.LocalTime;
import java.util.*;


public enum StaticStorage implements Cache {
	
	//singleton
	INSTANCE; 
	
	//storage
	private HashMap<String, List<Pair>> data = new HashMap<>();
	
	//class Pair
	private class Pair {
		Object dataVal;
		LocalTime time;
	}
	
	//methods
	public void add(String key, Object value) {
		List<Pair> list = null;
		if(!data.containsKey(key)) {
			list = new ArrayList<Pair>();
		} else {
			list = data.get(key);
		}
		Pair p = new Pair();
		p.dataVal = value;
		p.time = LocalTime.now().plusSeconds(timeout());
		list.add(p);
		
		data.put(key, list);
		  
	}
	
	public List<Pair> getList(String key) {
		return data.get(key);
	}
	
	public Object get(String key) {
		List<Pair> list = getList(key);
		if(list == null) {
			return null;
		} else { //obtain those values that have not timed out
			List<Object> retval =  new ArrayList<>();
			Iterator<Pair> it = list.iterator();
			while(it.hasNext()) {
				Pair p = it.next();
				LocalTime time = p.time;
				LocalTime now = LocalTime.now();
				//if time has not expired, return value
				if(!(now.isAfter(time))) {
					retval.add(p.dataVal);
				} else {
					it.remove();
				}
			}
			return retval;
		}
	}
	
	public String toString() {
		return data.toString();
	}
	
	
	
	
}
