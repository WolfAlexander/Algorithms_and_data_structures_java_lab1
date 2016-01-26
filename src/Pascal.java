public interface Pascal {
    /**
     * This method print a Pascal triangle
     * @param n is a number of rows that should be printed from the beginning of a Pascal triangle
     */
    void printPascal(int n);

    /**
     * This method calculates binomial coefficient
     * @param n is a row number of a pascal triangle
     * @param k is column number of a pascal triangle
     * @return binomial coefficient as an int
     */
    int binom(int n, int k);
}