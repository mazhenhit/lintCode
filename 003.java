public class Solution {
    /*
     * @param : An integer
     * @param : An integer
     * @return: An integer denote the count of digit k in 1..n
     */
    public int digitCounts(int k, int n) {
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i <= n; i++)
            sb.append("" + i);
            
        byte[] tmp = sb.toString().getBytes();
        
        byte j = (byte)('0' + k);
        int rsl = 0;
        for(int i = 0; i < tmp.length; i++) {
            if (tmp[i] == j)
                rsl++;
        }
        return rsl;
    }
};
