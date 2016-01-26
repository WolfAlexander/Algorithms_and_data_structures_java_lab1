public class RecursivePascal extends ErrorPascal{
    private boolean reverse = false;
    private int[][] coeffs = new int[0][];

    /**
     * Constructor
     * @param reverse boolean value for switching between upside down or
     *                right-side up printing of Pascal triangle
     */
    public RecursivePascal(boolean reverse){
        this.reverse = reverse;
    }

    /**
     * This method print a Pascal triangle
     * @param n is a number of rows that should be printed from the beginning of a Pascal triangle
     */
    public void printPascal(int n){
        if(coeffs.length < n)
            initArray(n);

        if(isLessThanZero(n))
            return;
        else{
            if(!reverse)
                printPascal(n - 1);

            coeffs[n] = new int[n+1];
            for(int k = 0; k <= n; k++)
                System.out.print(binom(n, k) + " ");
            System.out.println();

            if(reverse)
                printPascal(n - 1);
        }
    }

    /**
     * This method calculates binomial coefficient
     * @param n is a row number of a pascal triangle
     * @param k is column number of a pascal triangle
     * @return binomial coefficient as an int
     */
    public int binom(int n, int k){
        isBinomValuesValid(n, k);

        if(isZeroOrEqual(n, k))
            return coeffs[n][k] = 1;
        else {
            if (coeffs[n - 1][k - 1] != 0 && coeffs[n - 1][k] != 0)
                return coeffs[n][k] = coeffs[n - 1][k - 1] + coeffs[n - 1][k];
            else
                return coeffs[n][k] = binom(n - 1, k - 1) + binom(n - 1, k);
        }
    }

    private void initArray(int n){
        coeffs = new int[n+1][n+1];
    }
}