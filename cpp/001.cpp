class Solution {
public:
    /**
     * @param a: An integer
     * @param b: An integer
     * @return: The sum of a and b 
     */
    int aplusb(int a, int b) {
        // write your code here
        if(b == 0)
            return a;
        int c = (a & b) << 1;
        int d = a ^ b;
        return aplusb(d, c);
    }
};