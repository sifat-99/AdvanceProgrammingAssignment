package cse.bubt.edu.bd.Chapter_8.HugeInteger;
public class Main {
    public static void main(String[] args) {
        HugeInteger num1 = new HugeInteger();
        HugeInteger num2 = new HugeInteger();

        num1.parse("1234567890123456789012345678901234567890");
        num2.parse("1111111111111111111111111111111111111111");

        System.out.println("First Number: " + num1);
        System.out.println("Second Number: " + num2);

        HugeInteger sum = num1.add(num2);
        System.out.println("Sum: " + sum);

        HugeInteger diff = num1.subtract(num2);
        System.out.println("Difference: " + diff);

        System.out.println("Is Equal: " + num1.isEqualTo(num2));
        System.out.println("Is Not Equal: " + num1.isNotEqualTo(num2));
        System.out.println("Is Greater Than: " + num1.isGreaterThan(num2));
        System.out.println("Is Less Than: " + num1.isLessThan(num2));
    }
}
