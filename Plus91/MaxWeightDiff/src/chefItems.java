import java.util.Arrays;
import java.util.Scanner;

public class chefItems {
	
	public static int CalMaxWtDiff(int[] Wt, int k) {
		Arrays.sort(Wt); 
        int chefWeight = 0;
        int sonWeight = 0;
        
        for (int i = 0; i < Wt.length; i++) {
            if (i < k)
                sonWeight += Wt[i]; // light item to son
            else
                chefWeight += Wt[i]; // all rem to chef
        }
        
        return chefWeight - sonWeight;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // create scanner class
		
		System.out.println("Number of test cases:");
		int T = sc.nextInt(); 
		
		for (int t = 0; t < T; t++) {
			System.out.println("Enter Total Numbers of Items: ");
            int N = sc.nextInt(); 
            
            System.out.println("Enter Number of Items Assigned to Son : ");
            int K = sc.nextInt();
            
            // this below array will be of size of number of items
            int[] Wt = new int[N];
            System.out.println("Assign item wts: ");
            // Array to read weights
            for (int i = 0; i < N; i++) {
                Wt[i] = sc.nextInt();
            }
            
            int maxWeightDifference = CalMaxWtDiff(Wt, K);
            System.out.println("Maximum Wt difference : "+maxWeightDifference);
        }

        sc.close();

	}

}
