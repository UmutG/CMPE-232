import java.util.Random;

public class Quicksort {

    void QuickSort(int myArr[], int p, int r){
        if (p < r){
            int q = Partition(myArr, p, r);
            QuickSort(myArr, p, (q - 1));
            QuickSort(myArr, (q + 1), r);
        }
    }

    int Partition(int myArr[], int p, int r){
        int x = myArr[r];
        int i = p - 1;
        for (int j = p; j <= r - 1; j++) {
            if (myArr[j] <= x){
                i = i + 1;
                exchange(myArr, i, j);
            }
        }
        exchange(myArr, i+1, r);
        return i + 1;
    }

    void exchange(int arr[], int a, int b){
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
    }

    void fillInTheBlanks(int arr[]){
        Random rand = new Random();
        for (int i = 0; i < 30; i++)
            arr[i] = rand.nextInt(100);
    }

    static void printArray(int arr[]){
        for (int i = 0; i < 30; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
    public static void main(String[] args) {
        int arr1 [] = new int [30];
        int arr2 [] = new int [30];
        int arr3 [] = new int [30];

        Quicksort qs = new Quicksort();
        qs.fillInTheBlanks(arr1);
        qs.fillInTheBlanks(arr2);
        qs.fillInTheBlanks(arr3);

        System.out.println("====== UNSORTED ARRAY ======");

        printArray(arr1);
        printArray(arr2);
        printArray(arr3);

        System.out.println("====== QUICKSORTED ARRAY ======");
        qs.QuickSort(arr1, 0, 29);
        qs.QuickSort(arr2, 0, 29);
        qs.QuickSort(arr3, 0, 29);

        printArray(arr1);
        printArray(arr2);
        printArray(arr3);
    }

}
