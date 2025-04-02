import java.util.Scanner;
public class Demo1 {
    public static void main(String args[])
    {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n=kb.nextInt();
        int a[]=new int[n],b[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=kb.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                b[j]=a[i]*a[i+1];
            }
        }
        System.out.println("final array");
        for(int i=0;i<n;i++)
        {
            System.out.println(b[i]);
        }
    }
}
