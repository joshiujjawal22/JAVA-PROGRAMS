public class Armstrong {
    public static void main(String[] args) {
        int n = 371, main, remainder, result = 0;
        main = n;
        while (main != 0)
        {
            remainder = main % 10;
            result += Math.pow(remainder, 3);
            main /= 10;
        }
        if(result == n)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}