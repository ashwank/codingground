/**
 * 
 */
package ashwini;

/**
 * @author HP
 *
 */
public class Solution {
    public int[] countBits(int num) {
        
        int arr[] = new int[8];
        int returnArr[] = new int[num + 1];
        int i=0,j=num,count=0;
        
        
        while(num >= 0 ){
        	
            int index = 0;
            int num1=num;
            
            while(num1 >= 0){
            	
            	if(num1 == 0){
            		arr[index] = num1%2;
            		break;
            	}
            	arr[index] = num1%2;
            	num1 = num1/2;
                index++;
                
            }
            
                count=0;
                for(i=0;i<arr.length;i++){
                	
                    if(arr[i] == 1){
                        count++;
                        
                    }
                }
                
                returnArr[j--]=count;
                    num--;
                    
            }
        	/*for(int k=0;k<returnArr.length;k++){
        		int temp = returnArr[k];
        		returnArr[k] = returnArr[returnArr.length-k-1];
        		returnArr[returnArr.length-k-1]=temp;
        	}*/
        
            return returnArr;
        }
}