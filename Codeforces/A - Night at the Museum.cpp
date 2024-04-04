#include <iostream>
using namespace std;
int main()
{   
    string val; // 'zeus'
    cin>>val;
    int steps = 0;
    // use ascii values for the letters
    int start = 97; // lowercase a in ascii
 
 
    for(int i =0; i < val.length(); i++)
    {
        int result = abs(val[i] - start); // 122 - 97 = 25 greater than half (13)
        if(result <= 13){
            steps += result;
        } else{
            steps += (26 - result);
        }
        start = val[i];
    }
    std::cout<<steps;
}
