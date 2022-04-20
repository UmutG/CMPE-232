#include <iostream>
#include <string>
#include <chrono>

using namespace std;
using namespace std::chrono;

void insertionSort(int a [], int size){
    int i = 1, j = 0;
    while (i < size){
    	j = i;
    	while (j > 0 && a[j-1] > a[j]){
    		swap(a[j], a[j-1]);
    		j--;
    	}
    	i++;
    }
}

void printArray(int a [], int size){;
    for (int i = 0; i < size; i++)
    	cout << a[i] << " ";
    cout << "\n";
}

void swap(int *a, int *b){
	int *temp = a;
	a = b;
	b = temp;
}


int main(){
    int arr1 [] = {1, 2, 3, 13, 12, 11, 7, 5, 4, 8, 9, 10, 1923, 0, -1};
    int arr2 [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    int arr3 [] = {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

    auto start = high_resolution_clock::now();
    insertionSort(arr1, 15);
    auto stop = high_resolution_clock::now();
    auto duration = duration_cast<microseconds>(stop - start);
 	cout << "Time taken by function: "<< duration.count() << " microseconds" << endl;
	printArray(arr1, 15);

 	auto start2 = high_resolution_clock::now();
    insertionSort(arr2, 15);
    auto stop2 = high_resolution_clock::now();
    auto duration2 = duration_cast<microseconds>(stop2 - start2);
 	cout << "Time taken by function: "<< duration.count() << " microseconds" << endl;
 	printArray(arr2, 15);

 	auto start3 = high_resolution_clock::now();
    insertionSort(arr3, 15);
    auto stop3 = high_resolution_clock::now();
    auto duration3 = duration_cast<microseconds>(stop3 - start3);
 	cout << "Time taken by function: "<< duration.count() << " microseconds" << endl;
	printArray(arr3, 15);
	return 0;
}
