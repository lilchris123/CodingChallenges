#include <iostream>
#include <vector>
#include <iterator>
#include <unordered_map>
using namespace std;

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        
        unordered_map<int,int> map;
        for(int i=0; i< nums.size(); i++){
            map.insert(pair<int,int>(nums[i],i));
        }
        
        //O(N) Time Complexity
        for(int i=0; i<nums.size(); i++){
            
            auto it= map.find(target-nums[i]);
            
            if(it != map.end() && (i != it->second))
                return {i, it->second};
            }
        
        return {0,0};
    }
};

int main(){
    return 0;
}