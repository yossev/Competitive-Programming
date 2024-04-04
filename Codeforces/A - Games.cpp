#include<iostream>
#include<vector>
using namespace std;
// o(n^2) heh
int main()
{
    int n;
    cin>>n;
    vector<int> home(n);
    vector<int> away(n);
    int res = 0;
    
    for(int i =0; i < n; i++)
    {
        cin>>home[i]>>away[i];
    }

    for(int i =0; i < n; i++)
    {
        for(int j = 0; j < n; j++){
            if(home[i] == away[j]){
                res++;
            }
        }
    }
    cout<<res;
}
