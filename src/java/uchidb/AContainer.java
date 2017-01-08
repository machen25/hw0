package uchidb;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.HashMap;

public class AContainer<T, S> implements Containers<T, S> {
	public Map<S,T> map = null;

	// Create and return a set that stores the array of T objects
	public Set<T> initSet(T[] tArray) {
		Set<T> set = new HashSet<T>(Arrays.asList(tArray));

		return set;
	}
	
	// Create and return a list that stores an the array of T objects
	public List<T> initList(T[] tArray) {
		List<T> list = new LinkedList<T>(Arrays.asList(tArray));

		return list;
	}
	
	// Create and return an empty map that will use type S as keys, and T as values
	public Map<S,T> initEmptyMap() {
		Map<S,T> emptyMap = new HashMap<S,T>();

		return emptyMap;
	}
	
	// Store the map in a local field variable -- often called a setter 
	public void storeMap(Map<S,T> mapToStoreInClass) {
		map = mapToStoreInClass;

		return;
	}
	
	// Add a key value to the stored/local map with a boolean indicating whether to overwrite existing value
	// The return value indicates if you added the key value pair to the map
	// You do not need to check if the value changed or not (e.g. no need to compare values)
	public boolean addToMap(S key, T value, boolean overwriteExistingKey) {
		if(map.containsKey(key)) {
			if(overwriteExistingKey == true) {
				map.put(key, value);
				return true;
			} else {
				return false;
			}
		} else {
			map.put(key, value);
			return true;
		}
	}
	
	// Return a value from the stored/local map based on the key
	public T getValueFromMap(S key) {
		return map.get(key);
	}
	
	// An overloaded function to get a value from the store/local map, but with a default value
	// if the key is not present in the map.
	public T getValueFromMap(S key, T defaultValue) {
		return map.getOrDefault(key, defaultValue);
	}
}