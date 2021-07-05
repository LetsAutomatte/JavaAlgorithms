package DataStructure.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SynchronizedArraListUsingCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> ar = new ArrayList<String>(Arrays.asList("abc","err","jkj","lk"));
		Collections.synchronizedList(ar);
		
	}

}
