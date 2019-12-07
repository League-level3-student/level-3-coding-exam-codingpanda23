import java.util.HashMap;

public class HashMapCalculator {
public static void main(String[] args) {
	
}

public Object commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
	// TODO Auto-generated method stub
	for (String key : hashmap1.keySet()) {
		for (String k : hashmap2.keySet()) {
			if (key == k) {
				return 2;
			}
		}
	}
	
	return null;
}
}
