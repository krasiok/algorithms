package algorithms.searching.n;

import algorithms.searching.SearchAlgorithm;

import java.util.List;

public class LinearSearch implements SearchAlgorithm {
    public int search(List<Integer> numbers, int target) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == target) {
                return i;
            }
        }
        return -1;
    }
}
