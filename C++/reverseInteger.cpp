#include <iostream>
using namespace std;

class Solution {
public:
    
    int reverse(long long x) {
        long long rev=0;
        bool neg=false;
        
        if(x<0){
            x=-x;
            neg=true;
        }
        
        //while(x>0 && x%10==0)
          //  x/=10;
        
        while(x>0){
            //pop last right element in x
            int pop=x%10;
            x/=10;
            if(rev > INT_MAX/10|| (rev== INT_MAX/10 && pop >7)) return 0;
            
            //push popped element to rev
            rev= rev*10 +pop;
        }
        
        if(neg)
            return -rev;
        
        return rev;
    }
};

int main(){
    Solution sol;

    cout<<sol.reverse(56);
    return 0;
}