package recursion;

public class implementAtoi {
    public int myAtoi(String str){
        int i = 0, n = str.length();
        int sign = 1;
        long num = 0;

        while(i < n && str.charAt(i) == ' ') i++;

        if(i < n && (str.charAt(i) == '+' || str.charAt(i) == '-')){
            sign = (str.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        while(i < n && Character.isDigit(str.charAt(i))){
            num = num * 10 + (str.charAt(i) - '0');

            if(sign == 1 && num > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(sign == -1 && num < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            i++;
        }

        return (int)(sign  * num);
    }   
}
