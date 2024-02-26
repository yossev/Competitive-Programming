#include <iostream>
#include <string>
using namespace std;
int main()
{
	int cases;
	cin >> cases;

	int a, b, c;
	int count = 0;
	for (int i = 0; i < cases; i++)
	{
		cin >> a >> b >> c;
		int res = a + b + c;
		if (res >= 2) {
			count++;
		}
	}
	cout << count;

}
