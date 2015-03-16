public class Solution {
    public String convertToTitle(int number) {
        
     String columnName = "";
	
	 while(number>0){
	    int rem = (number - 1)%26;
	    columnName= (char) (rem+'A') + columnName;
	    number = (number-rem)/26;
	  }
	  return columnName;
    }
}
