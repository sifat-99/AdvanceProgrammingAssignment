package cse.bubt.edu.bd.Chapter_8.SetOfIntegers;

public class Main {
    public static void main(String[] args) {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();

        set1.insertElement(10);
        set1.insertElement(20);
        set1.insertElement(30);

        set2.insertElement(20);
        set2.insertElement(30);
        set2.insertElement(40);

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);

        IntegerSet unionSet = IntegerSet.union(set1, set2);
        System.out.println("Union: " + unionSet);

        IntegerSet intersectionSet = IntegerSet.intersection(set1, set2);
        System.out.println("Intersection: " + intersectionSet);

        set1.deleteElement(10);
        System.out.println("Set 1 after deleting 10: " + set1);

        System.out.println("Set 1 equals Set 2: " + set1.isEqualTo(set2));
    }
}
