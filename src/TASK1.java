public class TASK1 {
    public static void main(String[] args) {
        int k = 7;
        int n = 3;
        int result = k++ * ++n / ++n % k + n - k++;
        /**
         * 1. First operation will be '*', n= 4, k=7 ;
         * 2. Second operation will be '/', n=5;;
         * 3. Third operation will execute '%' (modulus) k=8 ;
         * 4. Fourth operation will be '+' n=5;
         * 5. Fifth operation will be '-' k=8 ;
         * Result '2';
         */
        int $result= k + k++ * k - n++ % n + ++n;
        /**
         * 1. First operation will be '*', k++=9, k=10;
         * 2. Second operation will execute '%' (modulus), n++=5, n=6;
         * 3. Third operation will be '+' k=9;
         * 4. Fourth operation will be '-', n=5 (after %) ;
         * 5. Fifth operation will be '+' n=7;
         * Result '101';
         */
    }
}
