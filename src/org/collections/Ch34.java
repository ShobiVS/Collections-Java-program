package org.collections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ch34 {
	public static void main(String[] args) {
		Map<String, String> s=new Hashtable();
		s.put("sam", "Selenium");
		s.put("Karthick", "Framework");
		s.put("Gowtham", "oracle");
		s.put("Gokul", "corejava");
		s.put("neethu", "jira");
		Iterator it = s.keySet().iterator();
		while (it.hasNext()) {
			
			System.out.println(it.next());
			
		}
		
	}

}
