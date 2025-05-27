import java.util.*;

public class maxSubArray{
    public static int subArray(int num[])
    {
        int maxSoFar=num[0];
        int currMax=num[0];

        for(int i=1;i<num.length;i++)
        {
            currMax=Math.max(num[i], currMax+num[i]);
            maxSoFar=Math.max(maxSoFar,currMax);
        }

        return maxSoFar;
    }

    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);

        System.out.println("Enter array size");
        int n=in.nextInt();
        int a[]= new int[n];
        System.out.println("Enter array: ");

        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }

        System.out.println(subArray(a));
    }
}

