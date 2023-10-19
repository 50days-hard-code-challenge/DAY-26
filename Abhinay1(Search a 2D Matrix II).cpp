class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int row=matrix.size();
        int column=matrix[0].size();
        int r=0;
        int c=column-1;
        while(r<row && c>=0){
            
            int element=matrix[r][c];
            if(element==target){
                return 1;
            }
            if(element<target){
               r++;
            }
            else{
               c--;
            }
           
        }
        return 0;
    }
};
