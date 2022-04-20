import java.util.Random;
import java.lang.Math;

public class assignment04 {
	int heapsize;
	void Heapsort(int array []){
		BuildHeap(array);
		for (int i = array.length - 1; i > 1; i--){
			exchange(array[0], array[i]);
			heapsize = heapsize - 1;
			Heapify(array, 0);
		}
	}

	void BuildHeap(int array []){
		heapsize = array.length - 1;
		for (int i = (int) Math.floor(array.length - 1 / 2); i > 0; i--){
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
	    assignment04 as = new assignment04();
		int randArray1 [] = new int [20], randArray2 [] = new int [20], randArray3 [] = new int [20], 
		randArray4 [] = new int [20], randArray5 [] = new int [20];

		as.fillInTheBlanks(randArray1);
		as.fillInTheBlanks(randArray2);
		as.fillInTheBlanks(randArray3);
		as.fillInTheBlanks(randArray4);
		as.fillInTheBlanks(randArray5);

		System.out.println("#1 Array: ");
		as.printArray(randArray1);

		System.out.println("#2 Array: ");
		as.printArray(randArray2);

		System.out.println("#3 Array: ");
		as.printArray(randArray3);

		System.out.println("#4 Array: ");
		as.printArray(randArray4);

		System.out.println("#5 Array: ");
		as.printArray(randArray5);

		as.Heapsort(randArray1);
		as.Heapsort(randArray2);
		as.Heapsort(randArray3);
		as.Heapsort(randArray4);
		as.Heapsort(randArray5);

		System.out.println("#1 Array: ");
		as.printArray(randArray1);

		System.out.println("#2 Array: ");
		as.printArray(randArray2);

		System.out.println("#3 Array: ");
		as.printArray(randArray3);

		System.out.println("#4 Array: ");
		as.printArray(randArray4);

		System.out.println("#5 Array: ");
		as.printArray(randArray5);
	}

}
