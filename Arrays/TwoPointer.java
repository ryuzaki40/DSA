import java.util.Scanner;

public class TwoPointer {
    public static boolean  hasPair(int arr[], int target)
    {
        int left=0, right=arr.length -1;

        while(left<right)
        {
            int sum=arr[left]+arr[right];

            if(sum==target)
            {
                return true;
            }
            else if(sum<target)
            {
                left++;
            }
            else 
            {
                right--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the target: ");
        int target=scanner.nextInt();
        
        if(hasPair(arr , target))
        {
            System.out.println("Present");
        }
        else 
        {
            System.out.println("Not Present");
        }
        scanner.close();
    }
}
