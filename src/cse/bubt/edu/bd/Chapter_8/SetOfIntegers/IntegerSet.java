package cse.bubt.edu.bd.Chapter_8.SetOfIntegers;
import java.util.Arrays;

class IntegerSet {
    private static final int RANGE = 101;
    private boolean[] set;

    // Constructor initializes an empty set
    public IntegerSet() {
        set = new boolean[RANGE];
        Arrays.fill(set, false);
    }

    // Union of two sets
    public static IntegerSet union(IntegerSet set1, IntegerSet set2) {
        IntegerSet unionSet = new IntegerSet();
        for (int i = 0; i < RANGE; i++) {
            unionSet.set[i] = set1.set[i] || set2.set[i];
        }
        return unionSet;
    }

    // Intersection of two sets
    public static IntegerSet intersection(IntegerSet set1, IntegerSet set2) {
        IntegerSet intersectionSet = new IntegerSet();
        for (int i = 0; i < RANGE; i++) {
            intersectionSet.set[i] = set1.set[i] && set2.set[i];
        }
        return intersectionSet;
    }

    // Insert an element into the set
    public void insertElement(int k) {
        if (k >= 0 && k < RANGE) {
            set[k] = true;
        }
    }

    // Delete an element from the set
    public void deleteElement(int m) {
        if (m >= 0 && m < RANGE) {
            set[m] = false;
        }
    }

    // Convert set to a string representation
    public String toString() {
        StringBuilder sb = new StringBuilder();
        boolean isEmpty = true;
        for (int i = 0; i < RANGE; i++) {
            if (set[i]) {
                sb.append(i).append(" ");
                isEmpty = false;
            }
        }
        return isEmpty ? "---" : sb.toString().trim();
    }

    // Check if two sets are equal
    public boolean isEqualTo(IntegerSet otherSet) {
        return Arrays.equals(this.set, otherSet.set);
    }

}
