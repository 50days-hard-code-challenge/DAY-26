class Solution {
public:
    void sortColors(vector<int>& nums) {
        int i=0;
        int j=nums.size()-1;
        int zerocoun=0;
        int onecoun=0;
        int tcoun=0;
        for(int i=0;i<nums.size();i++){
            if(nums[i]==0){
                zerocoun++;
                continue;
            }
            if(nums[i]==1)
            {
                onecoun++;
                continue;
            }
            if(nums[i]==2){
                tcoun++;
            }
        }
        i=0;
        while(zerocoun!=0){
                nums[i++]=0;
                zerocoun--;
        }
        while(onecoun!=0){
            nums[i++]=1;
            onecoun--;
        }
        while(tcoun!=0){
            nums[i++]=2;
            tcoun--;
        }
        
    }
};
