package Assignment0207;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class DictionaryUsage {

	public static void main(String[] args) {
		Dictionary<String, Integer> dict = new Hashtable<>();
		dict.put("qwe", 100);
		dict.put("sdfg", 101);
		int size = dict.size();
		System.out.println(size);
		System.out.println(dict.isEmpty());
		
		new Dictionary<String,Integer>() {

			@Override
			public int size() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean isEmpty() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Enumeration<String> keys() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Enumeration<Integer> elements() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Integer get(Object key) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Integer put(String key, Integer value) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Integer remove(Object key) {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}

}
