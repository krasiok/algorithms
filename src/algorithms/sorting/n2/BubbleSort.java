package algorithms.sorting.n2;

import algorithms.sorting.SortAlgorithm;

import java.util.List;

public class BubbleSort implements SortAlgorithm {
    public List<Integer> sort(List<Integer> numbers) {
        int swapNumberHolder;
        int listSize = numbers.size();
        for (int i = 0; i < listSize - 1; i++) {
            for (int j = 0; j < listSize - i - 1; j++) {
                if (numbers.get(j) > numbers.get(j + 1)) {
                    swapNumberHolder = numbers.get(j + 1);
                    numbers.set(j + 1, numbers.get(j));
                    numbers.set(j, swapNumberHolder);
                }
            }
        }
        return numbers;
    }
}
