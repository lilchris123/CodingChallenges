#include <iostream>
#include <stack>

class Solution {
public:
    /*
        1) empty string return true
        2) initialize a stack
        3)  iterate the string
            4) if current bracket if open bracket, push to stack
            5) if current bracket is closing bracket, check top of stack, if stack empty return false,
                if top is open bracket of different type return false, else pop stack
    */
    bool isValid(string s) {
        if(s.length() ==0)
            return true;
        
        stack<char> stk;
        
        for(int i=0; i<s.length(); i++){
            if(s[i]== '(' || s[i]=='{'|| s[i]=='[')
                stk.push(s[i]);
            else if(s[i]== ')' || s[i]=='}'|| s[i]==']'){
                if(stk.empty())
                    return false;
                else if(s[i]== ')' && stk.top() != '(' || s[i]=='}' && stk.top() != '{'|| s[i]==']' && stk.top() != '[')
                    return false;
                else 
                    stk.pop();
            }
        }
        if(stk.empty())
            return true;
        return false;
    }
};

int main(){

    Solution sol;
    if(sol.isValid("()()()"))
        cout<< "is valid"<<endl;
    else
        cout <<"not valid"<<endl;
    return 0;
}