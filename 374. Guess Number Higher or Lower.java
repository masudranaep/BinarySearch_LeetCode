    public int guessNumber(int n) {
       int gn = n;
        int st = 1;
        while( gn >= st){
            int mid = st + (gn - st)/2;
            if(guess(mid) == 0){
                return mid;
            }else if(guess(mid) == -1){
                gn = mid - 1;
                
         }else{
                st = mid +1;
 }
        }
        return -1;
    }