abstract class ErrorPascal implements Pascal{
    /**
     * Checks if value is less than 0
     * @param value is the value that has to be checked
     * @return boolean true if value os less then 0 or false if not
     */
    public boolean isLessThanZero(int value){
        return value < 0;
    }

    /**
     * Checks if values are equals to 0 or each other
     * @param a first int value
     * @param b second int value
     * @return boolean true if values are equals each other or 0
     */
    public boolean isZeroOrEqual(int a, int b){
        return a == 0 || b == 0 || b == a;
    }

    /**
     * Checks if values for binom method are valid
     * @param n first value
     * @param k second value
     * @throws IllegalArgumentException is values do not pass the test
     */
    public void isBinomValuesValid(int n, int k){
        if(n < k ||k < 0 || n < 0)
            throw new IllegalArgumentException("Check your n and k values!");
    }

}