// Problem Link : https://codeforces.com/problemset/problem/431/A
// Status : Accepted
// github.com/yossev


#include <iostream>
#include <string>
int main()
{
	int calories[4];
	// take calories input
	std::cin >> calories[0] >> calories[1] >> calories[2] >> calories[3];

	int result = 0;

	std::string s = "";
	std::cin >> s;
	

	for (int i = 0; i < s.length(); i++)
	{
		int num = s[i] - '0'; // Remove case where there is 10 for ex

		result += calories[num - 1];

	}

	std::cout << result << std::endl;


}
