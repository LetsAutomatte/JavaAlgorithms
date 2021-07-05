
/*Given two strings s and t of lengths m and n respectively, return the minimum window substring of s such that every character in t (including duplicates) is included in the window. If there is no such substring, return the empty string "".

The testcases will be generated such that the answer is unique.

A substring is a contiguous sequence of characters within the string.

Input: s = "ADOBECODEBANC", t = "ABC"
Output: "BANC"
Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.*/
package Programs.Strings;

public class subStringWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s ="ADOBECODEBANC";
     String t="ABC";
     int m = s.length();
     int n = t.length();
     int temp =0;
     int temp1 =0;
     boolean notFound = false;
     int winFirstIndex =-1;
     int winLastIndex =0;
     String result = "";
     if(n>m)
     {
         result = "";
     }
     
     for(int i=0;i<=n-1;i++)
     {
    	 
          winLastIndex = s.lastIndexOf(t.charAt(i));
          System.out.println("index"+t.charAt(i)+""+s.lastIndexOf(t.charAt(i)));
          System.out.println("temp"+temp);
         if(winLastIndex == -1)
         {  
             notFound = true;
             temp=-1;
             temp1=-1;
             result = "";
             break;
         }
         if(s.lastIndexOf(t.charAt(i))>temp)
         {
        	 temp = s.lastIndexOf(t.charAt(i));
        	 
         }
       if(s.lastIndexOf(t.charAt(i))<temp1||temp==0)
       {
    	   temp1 = s.lastIndexOf(t.charAt(i));
       }
        
     }
     
     winLastIndex = temp;
     winFirstIndex = temp1;
     System.out.println("winLastIndex"+winLastIndex);
     System.out.println("winFirstIndex"+winFirstIndex);
     /*    if(!notFound)
     {
     for(int i=0;i<=winLastIndex-1;i++)
     {
         for(int j=0;j<n-1;i++)
         {
        	 System.out.println("s.charAt(i)"+s.charAt(i));
        	 System.out.println("t.charAt(j)"+t.charAt(j));
             if(s.charAt(i)==t.charAt(j))
             {
            	 System.out.println("her");
                 winFirstIndex = i;
                 break;
                 
             }
         }
         
         System.out.println("her------------------");
       if(winFirstIndex!=-1)
         {
        	 System.out.println("her------------------");
        	 break;
         }
        
     }
     System.out.println("winFirstIndex"+winLastIndex);
     for(int i=winFirstIndex;i<=winLastIndex;i++) 
     {
         result = result+s.charAt(i);
     }*/
 }

     
 
	}



