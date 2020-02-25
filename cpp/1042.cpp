class Solution {
public:
    /**
     * @param matrix: the given matrix
     * @return: True if and only if the matrix is Toeplitz
     */
    bool isToeplitzMatrix(vector<vector<int>> &matrix) {
        int r = matrix.size();
        if(r <= 0)
        {
            return false;
        }
        int c = matrix[0].size();
    
        for(int i = 0; i < r; i++)
        {
            int tmp = matrix[i][0];
            int k = 1;
            for(int j = i + 1; j < c && j < r; j++)
            {
                if(matrix[j][k++] != tmp)
                    return false;
            }
        }
    
        for(int i = 1; i < c; i++)
        {
            int tmp = matrix[0][i];
            int k = 1;
            for(int j = i + 1; j < c && j < r; j++)
            {
                if(matrix[k++][j] != tmp)
                    return false;
            }
        }
        return true;
    }
};
