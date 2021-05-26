   public int kthSmallest(int[][] matrix, int k) {
       if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
           return 0;
       } 
        int m = matrix.length;
        int n = matrix[0].length;
        int left = matrix[0][0];
        int right = matrix[m-1][n-1];
        while(left <= right){
            int mid = left + (right - left)/2;
            int count  = lessThonTarget(matrix, mid);
            if(count < k){
                left = mid +1;
            }else{
                right = mid - 1;
            }
        }
        return left;
    }
    private int lessThonTarget(int[][] matrix, int target){
            int m = matrix.length;
        int n = matrix[0].length;
        int r = 0;
        int l = n - 1;
        int count = 0;
        while( r < m && l >= 0){
         if(matrix[r][l] > target){
            l--;
         }else{
             count = count + l+1;
             r++;
         }
        }
        return count;
    }
}