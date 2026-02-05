public class pow{
    double myPow(double x, int n){
        long N = n;
        if(N < 0){
            return 1.0/ power(x, -N);
        }

        return power(x, N);
    }

    double power(double x, long n){
        if(x == 0 && n == 0) return 1.0;
        if(x == 0) return 0;
        if(x == 1) return 1.0;
        if(n == 0) return 1.0;
        if(n == 1) return x;

        double half = power(x, n / 2);

        if(n % 2 == 0){
            return half * half;
        }else{
            return half * half * x;
        }
    }
}
