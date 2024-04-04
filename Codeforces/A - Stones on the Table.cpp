#include <iostream>
#include <string>


int main()
{
    std::string str;
    int n;
    std::cin>>n>>str;
    int ans = 0;

    for(int i =0; i < n;i++){
        if(str[i] == str[i+1]){
            ans++;
        }
    }
    std::cout<<ans<<std::endl;
}

