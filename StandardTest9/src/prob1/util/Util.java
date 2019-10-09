package prob1.util;

import java.util.List;

public class Util {
	/**
	 * Returns true if the two lists have the same size and contain exactly the same
	 * elements (this is really just set equality). 
	 * 
	 * DO NOT MODIFY
	 */
	public static <T> boolean listsAreEqual(List<T> l1, List<T> l2) {
		if(l1.size() != l2.size()) return false;
		for(T e : l1) {
			if(!l2.contains(e)) return false;
		}
		return true;
	}
}
