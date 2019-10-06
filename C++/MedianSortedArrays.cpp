#include <iostream>
#include <vector>

using namespace std;
class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        vector<int> nums= nums1;
        nums.insert(nums.begin(),nums2.begin(),nums2.end());
        sort(nums.begin(),nums.end());
        
        int len=nums.size();
        if(len%2==1)
            return nums[len/2];
        return (nums[(len/2)-1]+nums[(len/2)])/2.0;
    }
};

int main(){
    vector<int> nums1={1,3,5};
    vector<int> nums2={3,5,6};
    Solution* sol= new Solution();
     cout<< sol->findMedianSortedArrays(nums1,nums2);
    return 0;
}