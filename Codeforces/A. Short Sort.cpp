#include <iostream>
using namespace std;
int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        string s;
        cin >> s;
        // if any of them is in the right place, this means only one switch is needed to correct it
        if(s[0] == 'a' || s[1] == 'b' || s[2] == 'c'){
            cout << "YES" << endl;
        }
        else{
            cout << "NO" << endl;
        }



    }



}


