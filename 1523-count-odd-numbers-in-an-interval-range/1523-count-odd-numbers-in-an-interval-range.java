class Solution {
    public int countOdds(int low, int high) {
          
        int count=0;
        if(low % 2 == 1){
            count += 1;
        }
        
        if(high != low && high % 2 == 1) {
            count += 1;
	    }
        
		if(count==2)
			return count + (high-low - 1)/2;
		else
			return count + (high-low)/2;    
    }
}