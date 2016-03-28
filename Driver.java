package driver;
import ashwini.Solution;

public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
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
