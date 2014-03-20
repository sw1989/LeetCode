public class Solution {
    public double pow(double x, int n) {
        if (n > 0) {
            return positivePow(x, n);
        } else {
            return 1/positivePow(x, -n);
        }
    }
    
    public double positivePow(double x, int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1){
            return x;
        } else if (n%2 == 0) {
            double temp = positivePow(x, n/2);
            return temp * temp;
        } else {
            double temp = positivePow(x, n/2);
            return temp * temp * x;
        }
    }
}