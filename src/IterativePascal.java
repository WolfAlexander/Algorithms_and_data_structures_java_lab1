public class IterativePascal extends ErrorPascal{
    private boolean reverse = false;
    private int[][] coeffs = null;

    /**
     * Constructor
     * @param reverse boolean value for switching between upside down or
     *                right-side up printing of Pascal triangle
     */
    public IterativePascal(boolean reverse){ this.reverse = reverse;}

    /**
     * This method print a Pascal triangle
     * @param n is a number of rows that should be printed from the beginning of a Pascal triangle
     */
    public void printPascal(int n) {
        coeffs = new int[n+1][];
        for(int i = 0; i <= n; i++){
            coeffs[i] = new int[i+1];
            for(int j = 0; j <= i; j++)
                binom(i, j);
        }

        if(!reverse){
            for(int x = 0; x < coeffs.length; x++) {
                for (int y = 0; y < coeffs[x].length; y++)
                    System.out.print(coeffs[x][y] + " ");
                System.out.println();
            }
        }else{
            for(int x = coeffs.length-1; x >= 0; x--) {
                for (int y = coeffs[x].length-1; y >= 0 ; y--)
                    System.out.print(coeffs[x][y] + " ");
                System.out.println();
            }
        }
    }

    /**
     * This method calculates binomial coefficient
     * @param n is a row number of a pascal triangle
     * @param k is column number of a pascal triangle
     * @return binomial coefficient as an int
     */
    public int binom(int n, int k) {
        isBinomValuesValid(n,k);
        if(isZeroOrEqual(n,k))
            return coeffs[n][k] = 1;
        else
            return coeffs[n][k] = coeffs[n - 1][k - 1] + coeffs[n - 1][k];
    }
}