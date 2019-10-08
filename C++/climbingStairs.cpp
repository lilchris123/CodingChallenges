#include <unordered_map>
using namespace std;
class Solution {
private:
    unordered_map<int,int> cache;
    
public:
    int climbStairs(int n) {
    auto it = cache.find(n);
	if (it != cache.end())
		return it->second;
	
    int result;
	if (n < 0)
		result = 0;
	
    else if (n == 0)
		result = 1;
        
	else {
		result = climbStairs(n - 1) + climbStairs(n - 2);
		cache[n] = result;
	}
        return result;
    }
};