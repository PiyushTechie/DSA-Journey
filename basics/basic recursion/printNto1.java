public class printNto1 {
    public static void printNos(int N){
        if(N == 0) return;

        System.out.print(N + " ");
        printNos(N - 1);
    }
    
    public static void main(String[] args) {
        int N = 10;
        printNos(N);
    }
}
