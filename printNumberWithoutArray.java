package Programs;

import java.util.Arrays;

public class printNumberWithoutArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object[] num = new Object[100];
		Arrays.fill(num, new Object()
		{
			int count=0;
			public String toString()
			{
				return Integer.toString(count++);
			}
		}
		);
		System.out.println(Arrays.deepToString(num));
	}

}
