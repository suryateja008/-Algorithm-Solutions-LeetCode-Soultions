public class Solution {
    public String intToRoman(int num) {
        
    int[] numbers = { 1000,900,500,400,100,90,50,40,10,9,5,4,1};
    String[] romanLet = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    String romanNumber="";
    
       while(num!=0)
       {
           for(int i=0;i<numbers.length;i++)
           {
               if(num>=numbers[i])
               {
                   romanNumber+=romanLet[i];
                   num-=numbers[i];
                   break;
               }
           }
       }
       return romanNumber;
    }
}
