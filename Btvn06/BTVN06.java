package BTVN.Btvn06;

public class BTVN06 {
    public static void main(String[] args) {
        Bai2c();
    }

    public static void Bai1a() {
//        Bài 1: Viết chương trình liệt kê các số nguyên có 7 đến 9 chữ số thoả mãn:
//        a) Là số thuận nghịch.
//        b) Chỉ có chữ số 0, 6, 8
//        c) Tổng chữ số chia hết cho 10
        for (int i = 1000000; i <= 999999999; i++) {
            if (isPalindrome(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPalindrome(int number) {
        String str = String.valueOf(number);
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void Bai1b() {
        for (int i = 1000000; i <= 999999999; i++) {
            if (hasDigits(i, new int[]{0, 6, 8})) {
                System.out.println(i);
            }
        }
    }

    public static boolean hasDigits(int number, int[] digits) {
        String str = String.valueOf(number);
        for (char digitChar : str.toCharArray()) {
            int digit = Character.getNumericValue(digitChar);
            boolean isContained = false;
            for (int d : digits) {
                if (digit == d) {
                    isContained = true;
                    break;
                }
            }
            if (!isContained) {
                return false;
            }
        }
        return true;
    }

    public static boolean Bai1c() {
        for (int i = 1000000; i <= 999999999; i++) {
            if (isSumDivisibleByTen(i)) {
                System.out.println(i);
            }
        }
        return false;
    }

    public static boolean isSumDivisibleByTen(int number) {
        int sum = 0;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }
        return sum % 10 == 0;
    }

    public static void Bai2a() {

        for (int i = 1000000; i <= 9999999; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void Bai2b() {

        System.out.println("Các số có 7 chữ số và tất cả các chữ số là số nguyên tố:");

        for (int i = 1000000; i <= 9999999; i++) {
            if (isAllDigitsPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isAllDigitsPrime(int number) {
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            if (!isPrime1(digit)) {
                return false;
            }
            temp /= 10;
        }
        return true;
    }

    public static boolean isPrime1(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void Bai2c() {
        System.out.println("Các số có 7 chữ số và tất cả các chữ số là số nguyên tố:");

        for (int i = 1000000; i <= 9999999; i++) {
            if (isAllDigitsPrime1(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isAllDigitsPrime1(int number) {
        int temp = number;

        while (temp > 0) {
            int digit = temp % 10;
            if (!isPrime2(digit)) {
                return false;
            }
            temp /= 10;
        }

        return true;
    }

    public static boolean isPrime2(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}

