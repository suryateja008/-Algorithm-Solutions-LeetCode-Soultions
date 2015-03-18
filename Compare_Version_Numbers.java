public class Solution {
    public int compareVersion(String version1, String version2) {
        
		String v1[],v2[] = new String[2];
		
		v1=version1.split("\\.");
		v2=version2.split("\\.");
		
        int len = (v1.length > v2.length) ? v1.length : v2.length;
        int a = Integer.parseInt(v1[0]), b = Integer.parseInt(v2[0]);
        
		if(a>b){
			return 1;
		}else if(a==b){
			    for(int i=1;i<len;i++){
				   a = (i<v1.length) ? Integer.parseInt(v1[i]) : 0;
				   b = (i<v2.length) ? Integer.parseInt(v2[i]) : 0;
			     if(a>b){
			    	 return 1;
			     }else if(a<b){
			    	 return -1;
			     }
			   }  
		}else if(a<b){
			return -1;
		}
		
        return 0;
    }
}
