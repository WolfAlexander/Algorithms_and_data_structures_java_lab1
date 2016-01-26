class Driver {
    public static void main(String[] args){
        long beginTime = System.currentTimeMillis();

        RecursivePascal rp = new RecursivePascal(true);
        rp.printPascal(5);

        /*IterativePascal ip = new IterativePascal(true);
        ip.printPascal(5000);*/

        System.out.println("Time to calculate: " + (System.currentTimeMillis() - beginTime));
    }
}