package cse.bubt.edu.bd.Chapter_8.HugeInteger;

import java.util.Arrays;

public class HugeInteger {
    private static final int MAX_DIGITS = 40;
    private int[] digits;
    private boolean isNegative;

    public HugeInteger() {
        digits = new int[MAX_DIGITS];
        isNegative = false;
    }

    public void parse(String number) {
        Arrays.fill(digits, 0);
        isNegative = number.startsWith("-");
        number = number.replace("-", "");

        int length = number.length();
        if (length > MAX_DIGITS)
            throw new IllegalArgumentException("Number exceeds 40 digits");

        for (int i = 0; i < length; i++) {
            char c = number.charAt(length - 1 - i);
            if (!Character.isDigit(c))
                throw new IllegalArgumentException("Invalid character in number");
            digits[MAX_DIGITS - 1 - i] = c - '0';
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(isNegative ? "-" : "");
        boolean leadingZero = true;
        for (int digit : digits) {
            if (digit != 0) leadingZero = false;
            if (!leadingZero) sb.append(digit);
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }

    public HugeInteger add(HugeInteger other) {
        HugeInteger result = new HugeInteger();
        int carry = 0;
        for (int i = MAX_DIGITS - 1; i >= 0; i--) {
            int sum = this.digits[i] + other.digits[i] + carry;
            result.digits[i] = sum % 10;
            carry = sum / 10;
        }
        return result;
    }

    public HugeInteger subtract(HugeInteger other) {
        HugeInteger result = new HugeInteger();
        int borrow = 0;
        for (int i = MAX_DIGITS - 1; i >= 0; i--) {
            int diff = this.digits[i] - other.digits[i] - borrow;
            if (diff < 0) {
                diff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            result.digits[i] = diff;
        }
        return result;
    }

    public boolean isEqualTo(HugeInteger other) {
        return Arrays.equals(this.digits, other.digits);
    }

    public boolean isNotEqualTo(HugeInteger other) {
        return !isEqualTo(other);
    }

    public boolean isGreaterThan(HugeInteger other) {
        for (int i = 0; i < MAX_DIGITS; i++) {
            if (this.digits[i] > other.digits[i]) return true;
            if (this.digits[i] < other.digits[i]) return false;
        }
        return false;
    }

    public boolean isLessThan(HugeInteger other) {
        return !isGreaterThanOrEqualTo(other);
    }

    public boolean isGreaterThanOrEqualTo(HugeInteger other) {
        return isGreaterThan(other) || isEqualTo(other);
    }

    public boolean isLessThanOrEqualTo(HugeInteger other) {
        return isLessThan(other) || isEqualTo(other);
    }

    public boolean isZero() {
        for (int digit : digits) {
            if (digit != 0) return false;
        }
        return true;
    }
}
