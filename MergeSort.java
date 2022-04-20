import java.util.ArrayList;
import java.util.Random;

public class MergeSort {
    int iteration = 0;
    ArrayList <Integer> mergeSort(ArrayList<Integer> m){
        ArrayList<Integer> left = new ArrayList<Integer>();
        ArrayList<Integer> right = new ArrayList<Integer>();
        ArrayList <Integer> result = new ArrayList<Integer>();

        if (m.size() <= 1)
            return m;


        else {
            int middle = m.size() / 2, len = m.size();
            for (int i = 0; i < middle; i++)
                left.add(m.get(i));

            for (int j = middle; j < len; j++)
                right.add(m.get(j));

            left = mergeSort(left);
            right = mergeSort(right);
            result = merge(left, right);

        }
        return result;
    }

    ArrayList <Integer> merge(ArrayList<Integer> left, ArrayList<Integer> right){
        iteration = 0;
        ArrayList <Integer> result = new ArrayList<Integer>();

        while (left.size() > 0 && right.size() > 0){
            if (left.get(0) <= right.get(0)){
                result.add(left.get(0));
                left.remove(0);
                iteration++;
            }
            else{
                result.add(right.get(0));
                right.remove(0);
                iteration++;
            }
        }
        if (left.size() > 0)
            result.addAll(left);
        else
            result.addAll(right);

        return result;
    }

    void printAll(ArrayList<Integer> arr){
        for (int i = 0; i < arr.size(); i++)
            System.out.print(arr.get(i) + " ");

        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList <Integer> avg = new ArrayList<Integer>();
        ArrayList <Integer> best = new ArrayList<Integer>();
        ArrayList <Integer> worst = new ArrayList<Integer>();
        ArrayList <Integer> result = new ArrayList<Integer>();

        Random rand = new Random();
        for (int i = 0; i < 15; i++)
            avg.add(rand.nextInt(50));

        for (int j = 0; j < 15; j++)
            best.add(j+1);

        for (int k = 15; k > 0; k--)
            worst.add(k);

        MergeSort ms = new MergeSort();

        System.out.println("======== LIST OF UNSORTED ARRAYS ========");
        ms.printAll(avg);
        ms.printAll(best);
        ms.printAll(worst);

        System.out.println("\n======== ARRAY SORTING STARTED! ========");
        result = ms.mergeSort(avg);
        ms.printAll(result);
        System.out.println("Average array iterated " + ms.iteration + " times.\n");

        result = ms.mergeSort(best);
        ms.printAll(result);
        System.out.println("Best array iterated " + ms.iteration + " times.\n");

        result = ms.mergeSort(worst);
        ms.printAll(result);
        System.out.println("Worst array iterated " + ms.iteration + " times.");

        System.out.println("======== ARRAYS HAS BEEN SORTED ========");
    }
}
