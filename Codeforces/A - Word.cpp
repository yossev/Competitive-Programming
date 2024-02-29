#include <iostream>
#include <string>
#include <cmath>
#include <vector>
using namespace std;
int main()
{
	std::string x; 
	cin >> x;

	int upperCount = 0;
	int lowerCount = 0;

	for (int i = 0; i < x.length(); i++)
	{
		if (isupper(x[i])) upperCount++;
		else if (islower(x[i])) lowerCount++;
	}

	if (upperCount > lowerCount) {
		for (int i = 0; i < x.length(); i++) {
			x[i] = toupper(x[i]);
		}
	}
	else if (lowerCount > upperCount || lowerCount == upperCount) {
		for (int i = 0; i < x.length(); i++) {
			x[i] = tolower(x[i]);
		}
	}
	cout << x << endl;
}
