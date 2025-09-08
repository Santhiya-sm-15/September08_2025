# September08_2025
The problem that i solved today in leetcode

No-Zero integer is a positive integer that does not contain any 0 in its decimal representation.

Given an integer n, return a list of two integers [a, b] where:

a and b are No-Zero integers.
a + b = n
The test cases are generated so that there is at least one valid solution. If there are many valid solutions, you can return any of them.

Code:
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
