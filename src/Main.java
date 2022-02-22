public class Main {
    public static void main(String[] args) {
        System.out.println(sumOf(100));
        System.out.println(sumOfWithJoints(20));
        System.out.println(sumOfFibonacci(8));
        System.out.println(sumOfFibonacciWithoutRecursion(8));
    }
    //a)
    public static int sumOf(int n) {
        if (n == 1) {
            return n;
        }
        return n + sumOf(n-1);
    }
    //b)
    public static int sumOfWithJoints(int n) {

        if (n == 0) {
            return 0;
        }

        int sum = 0;
        if (n > 1) {
            sum += sumOfWithJoints(5*(n-1)-6*(n-2) +2);

        }
        return sum;
    }

    //c)
    public static int sumOfFibonacci(int n) {
      if (n == 0) {
          return 0;
      }
      if (n == 1 || n == 2) {
          return 1;
      }
      return sumOfFibonacci(n-2) + sumOfFibonacci(n-1);
    }
    //d)
    public static int sumOfFibonacciWithoutRecursion(int n) {
        int i = 1;
        int n1 = 0, n2 = 1;
        int sum = 0;
        while (i < n) {
            sum = n1 + n2;
            n1 = n2;
            n2 = sum;
            i++;
        }
        return sum;
    }
}
