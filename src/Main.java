import algorithms.searching.n.LinearSearch;
import algorithms.sorting.n2.BubbleSort;
import algorithms.sorting.n2.InsertionSort;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Integer> numbersToSort = new ArrayList<>();
        numbersToSort.add(5);
        numbersToSort.add(4);
        numbersToSort.add(7);
        numbersToSort.add(1);
        numbersToSort.add(1);
        numbersToSort.add(3);
        System.out.println(numbersToSort);

//        BubbleSort bubbleSort = new BubbleSort();
//        System.out.println(bubbleSort.sort(numbersToSort));
//        LinearSearch linearSearch = new LinearSearch();
//        System.out.println(linearSearch.search(numbersToSort,4));

        InsertionSort insertionSort = new InsertionSort();
        System.out.println(insertionSort.sort(numbersToSort));
    }
}
