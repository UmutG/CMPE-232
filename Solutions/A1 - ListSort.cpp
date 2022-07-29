#include <iostream>
#include <string>

using namespace std;

int * sortList(int myArr [], int size) {
	int temp;
	for (int i = 0; i < size; i++){
		for (int j = 0; j < size; j++)
			if (myArr[i] < myArr[j]){
				temp = myArr[j];
				myArr[j] = myArr[i];
				myArr[i] = temp;
			}
	}
	return myArr;
}

void printList(int myArr [], int size){
	for (int i = 0; i < size; i++)
		cout << myArr[i] << " ";
}

int main(){
	int size;

	cout << "Size of the array: ";
	cin >> size;
	int myArr [size];
	
	for (int i = 0; i < size; i++)
		cin >> myArr[i]; 
	
	sortList(myArr, size);
	printList(myArr, size);
	
	return 0;
}
