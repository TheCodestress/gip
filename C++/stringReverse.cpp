#include <iostream>
using namespace std;

int findLength(char* X){
	int i = 0;
	while (X[i] != '\0'){
		i++;
	}
	return i;
}

int main (int argv, char* argc[]) {
	char* X = argc[1];
	int length = findLength(X);

	for (int i = 0, j = length-1; i < j; i++,j--){
		char temp = X[i];
		X[i] = X[j];
		X[j] = temp;
	}
	
	cout << X << endl;
	return 0;
}
