import java.util.Random;

public class assigment04 {
	int heapsize;
	void Heapsort(int array []){
		BuildHeap(array);
		for (int i = array.length(); i > 2; i--){
			exchange(array[1], array[i]);
			heapsize = heapsize - 1;
			Heapify(array, 1);
		}
	}

	void BuildHeap(int array []){
		heapsize = array.length();
		for (int i = (array.length() / 2).floor(); i > 1; i--){
			Heapify(array, i);
		}
	}

	void Heapify(int array[], int i){
		int le = (2 * i) + 1, ri = (2 * i) + 2, largest = 0;
		if (le <= heapsize && (array[le] > array[i]))
			largest = le;
		else
			largest = i;
		if (ri <= heapsize && array[ri] > array[largest])
			largest = ri;
		if (largest != i){
			exchange(array[i], array[largest]);
			Heapify(array, largest);
		}
	}

	void exchange(int a, int b){
		b += a;
		a = b - a;
		a += b;
		b = a - b;
	}

	void fillInTheBlanks(int myArray []){
		for (int i = 0; i < 20; i++){
			Random rand = new Random();
			myArray[i] = rand.nextInt(100);
		}
	}

	void printArray(int myArray[]){
		for (int i = 0; i < 20; i++){
			System.out.print(myArray[i] + " ");
		}

		System.out.println();
	}

	public static void main(String[] args) {
		int randArray1 [20], randArray1 [20], 
		randArray1 [20], randArray1 [20], randArray1 [20];
		int a = 1, b = 2;
		exchange(a, b);
		System.out.println(a + " " + b);
		fillInTheBlanks(randArray1);
		fillInTheBlanks(randArray2);
		fillInTheBlanks(randArray3);
		fillInTheBlanks(randArray4);
		fillInTheBlanks(randArray5);

		System.out.println("#1 Array: ");
		printArray(randArray1);

		System.out.println("#2 Array: ");
		printArray(randArray2);

		System.out.println("#3 Array: ");
		printArray(randArray3);

		System.out.println("#4 Array: ");
		printArray(randArray4);

		System.out.println("#5 Array: ");
		printArray(randArray5);

		Heapsort(randArray1);
		Heapsort(randArray2);
		Heapsort(randArray3);
		Heapsort(randArray4);
		Heapsort(randArray5);

		System.out.println("#1 Array: ");
		printArray(randArray1);

		System.out.println("#2 Array: ");
		printArray(randArray2);

		System.out.println("#3 Array: ");
		printArray(randArray3);

		System.out.println("#4 Array: ");
		printArray(randArray4);

		System.out.println("#5 Array: ");
		printArray(randArray5);
	}

}
