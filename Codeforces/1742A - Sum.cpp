#include <iostream>
using namespace std;

int main() {
    int t;
    cin >> t; 

    while (t--) {
        int a, b, c;
        cin >> a >> b >> c; 
      
        if (a == b + c || b == a + c || c == a + b) {
            cout << "YES" << endl;
        } else {
            cout << "NO" << endl;
        }
    }

    return 0;
}


/*

An Alternative Way to solve this problem is by taking array input and sorting it, then checking if the first 2 elements sum up to the 3rd or not

*/
