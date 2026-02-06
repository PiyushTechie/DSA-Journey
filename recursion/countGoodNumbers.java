public class countGoodNumbers {
    static final long MOD = 1000000007;
    public int goodNumbers(long n){

        long evenPositions = (n + 1) / 2;
        long oddPositions = n / 2;

        long evenWays = power(5, evenPositions);
        long oddWays = power(4, oddPositions);

        long result = (evenWays * oddWays) % MOD;

        return (int) result;
    }

    private long power(long base, long exp){
        long result = 1;

        if(exp > 0){
            if(exp % 2 == 1){
                result = (base * result) % MOD;
            }

            base = (base * base) % MOD;
            exp = exp / 2;
        }
    return result;
    }
    
}
