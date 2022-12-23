public class FindNumOfDigits {
    public static void main(String[] args) {
        System.out.println(countDigitsIterative(10029373));
        System.out.println(countDigitsRecursive(10029383));
        System.out.println(countDigitsLogarithmic(10029383));
    }

    static int countDigitsIterative(int num) {
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        return count;
    }

    static int countDigitsRecursive(int num) {
        if (num == 0) {
            return 0;
        }

        return countDigitsIterative(num / 10) + 1;
    }

    static int countDigitsLogarithmic(int num) {

        return (int) Math.floor((int) Math.log10(num) + 1);
    }

}