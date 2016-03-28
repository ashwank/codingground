public class CountingBits{

     public static void main(String []args){
        
            int num;
	        num = Integer.parseInt(args[0]);
	        int number[]= new int[num+1];
	        Solution sol = new Solution();
	        
	        
	        number = sol.countBits(num);
	        
	        
	        for(int i=0;i<number.length;i++){
	            System.out.println(number[i]);
	            
	        }
     }
}
