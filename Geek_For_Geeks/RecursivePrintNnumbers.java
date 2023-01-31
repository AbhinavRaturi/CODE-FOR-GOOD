package Geek_For_Geeks;

public class RecursivePrintNnumbers {
    public static void main(String[] args) {
        int n = 5;
        RecursivePrintNnumbers printNnumbers = new RecursivePrintNnumbers();
        printNnumbers.printNnumbers(n);
    }
    void printNnumbers(int n){
        if(n == 0)
            return;
        System.out.print(n+" ");
        printNnumbers(n-1);
    }
}
