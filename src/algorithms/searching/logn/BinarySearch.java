package algorithms.searching.logn;

import algorithms.searching.SearchAlgorithm;

import java.util.List;

public class BinarySearch implements SearchAlgorithm {
    @Override
    public int search(List<Integer> numbers, int target) {
        int low = 0;
        int high = numbers.size() - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midValue = numbers.get(mid);
            if (target == midValue) {
                return mid;
            } else if (midValue > target) {
                high = mid - 1;
            } else if (midValue < target) {
                low = mid + 1;
            }
        }

        return -1;
    }
}
