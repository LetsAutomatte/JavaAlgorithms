package DataStructure.ArrayList;

import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayList_synchronized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//CopyOnWriteArrayList creates the synronized arraylist
		CopyOnWriteArrayList<String> syncArr = new CopyOnWriteArrayList<String>(Arrays.asList("a","s","d","f"));
		System.out.println(syncArr);

	}

}
