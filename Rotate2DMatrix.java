package Programs;

public class Rotate2DMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix =   {{1,2},{3,4}};
		int n = matrix.length-1;
        int[][] test = new int[n][n];
       
        for(int i=0;i<=matrix.length-1;i++)
        {
            for(int j=0;j<=matrix.length-1;j++)
            {
            	System.out.println(matrix[n-j][i]);
                 test[i][j] = matrix[n-i][j];
                 System.out.println(test[i][j]);
            }
        }
        

        for(int i=0;i<=test.length-1;i++)
        {
            for(int j=0;j<=test.length-1;j++)
            {
                 System.out.println(test[i][j]);
            }
        }
     
	}

}
