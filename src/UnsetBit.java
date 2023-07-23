import java.util.Scanner;

public class UnsetBit {
    public static int Compute(int number,int Index)
    {
        return ((number & (1<<Index))==0)? number: (int)(number-Math.pow(2,Index));
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number= scanner.nextInt();
        int index= scanner.nextInt();
        System.out.println(Compute(number,index));
    }
}