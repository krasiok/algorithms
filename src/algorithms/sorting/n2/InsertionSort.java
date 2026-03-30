package algorithms.sorting.n2;

import algorithms.sorting.SortAlgorithm;

import java.util.List;

public class InsertionSort implements SortAlgorithm {
    @Override
    public List<Integer> sort(List<Integer> numbers) {
        int iHolder;
        int jHolder;
        for (int i = 1; i < numbers.size(); i++) {
            int j = i - 1;
            iHolder = numbers.get(i);
            while (j >= 0) {
                jHolder = numbers.get(j);
                if (iHolder >= jHolder){
                    j--;
                    break;
                }
                else {
                    numbers.set(j + 1, jHolder);
                    numbers.set(j, iHolder);
                }
                j--;
            }
        }
        return numbers;
    }
    // 5 2 6 2 1
    // 2 z 1     3 z 2, 3 z 1
}
