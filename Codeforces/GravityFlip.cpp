#include <iostream>
#include <string>
#include <cmath>
#include <vector>
#include <bits/stdc++.h> 
using namespace std;
int main()
{
	int size;
	cin >> size;
	vector<int> v;
 
 
	for (int i = 0; i < size; i++)
	{
		int n;
		cin >> n;
		v.push_back(n);
	}
	sort(v.begin(), v.end());
 
	for (auto x : v) {
		cout << x;
	}
 
}
