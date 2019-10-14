#include <iostream>
#include <sstream>
using namespace std;

class Solution {
public:
    int lengthOfLastWord(string s) {
        stringstream ss(s);
        string last="";
        while(ss>>last);
        
        return last.length();
    }
};