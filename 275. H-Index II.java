class Solution {
    public int hIndex(int[] citations) {
       int n =  citations.length;
        int L = 0, r = n -1;
        while(L <= r){
            int mid = L + (r - L)/2;
            if(citations[mid] < n - mid)
                L = mid +1;
            else
                r = mid -1;
        }
        return n - L;
    }
}