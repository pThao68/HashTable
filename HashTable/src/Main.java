import java.util.Hashtable;

public class Main {
	
	
	// Hashtable = A data structure that store inique key to value ex <Integer,String>
	//				Each key/value pair is know as an Entry
	//				Fast insertion, look up, deletion of key/values pairs
	//				Not ideal for small data sets, grat with large data sets
	
	// hasing = takes a key and computers an integer (formular will cary based on  key  & data type)
	//			In a Hashtable, we use the hash % capacity to calculate an index number
	
	// 			key.hashCode() % capacity = index
	
	// bucket = a indexed storage location for one or mare Entries
	//			can store multiple Entries in case of a collision (linked similarly a LinkedList)
	
	// collission = hash fintion generates the same index for more than one key
	//				less collisions = more efficency
	
	//Runtime  complexity: Best Case O (1)
	//						Worst Case O(n)

	public static void main(String[] args) {
		//Hashtable<Integer, String> table = new  Hashtable<>(10);
		Hashtable<String, String> table = new  Hashtable<>(10);
		table.put("100", "Sprongebob");
		table.put("123", "Patrick");
		table.put("321", "Sandy");
		table.put("555", "Squidward");
		table.put("777", "Gary");
		
		for(String key: table.keySet()) {
			System.out.println(key.hashCode() %10 +"\t"+key+"\t"+table.get(key));
		}
	}
}
