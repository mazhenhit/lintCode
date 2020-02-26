class Solution {
public:
    /*
     * @param n: A long integer
     * @return: An integer, denote the number of trailing zeros in n!
     */
    long long trailingZeros(long long n) {
        // write your code here, try to do it without arithmetic operators.
        if(n < 0)
            n = -n;

        int num = 0;
        while(n)
        {
            if(n % 5 == 0)
            {
                int tmp = n;
                while(tmp % 5 == 0)
                {
                    num++;
                    tmp = tmp / 5;
                }
            }
            n--;
        }
        return num;
    }
};