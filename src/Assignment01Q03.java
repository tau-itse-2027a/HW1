public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]); // TODO: Read the first string argument (replace this line)
        System.out.println("The first " + x + " Fibonacci numbers are:");
        int x1=1;
        int x2=1;
        System.out.print(x1 + " " + x2 + " ");
        int numOdd = 0;
        for (int i = 3; i < x; i++) {
            int x3 = x1 + x2;
            System.out.print(x3 + " ");
            if (x3 % 2 == 1) {
                numOdd++;
            }
            x1 = x2;
            x2 = x3;
        }
        System.out.println();
        
        ////////////////////////////////////////////////////////////////
        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
