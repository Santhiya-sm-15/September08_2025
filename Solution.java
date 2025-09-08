class Solution {
    public int[] getNoZeroIntegers(int n) {
        int x=1;
        while(true)    
        {
            String a=Integer.toString(x);
            String b=Integer.toString(n-x);
            if(!a.contains("0") && !b.contains("0"))
                return new int[]{x,n-x};
            x++;
        }
    }
}