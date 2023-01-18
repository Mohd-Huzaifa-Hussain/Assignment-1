
public class PatternPrint1 {

	public static void main(String[] args) {
		
		int n=10;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1 && j>=1 && j<=n
						||
				   i==n && j>=1 && j<=n
						||
				   j==n/2 && i>=1 && i<=n) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			
			for(int j=1;j<=n;j++) {
				if(j==1 && i>=1 && i<=n
						||
				   j==n && i>=1 && i<=n
						||
			       i==j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			System.out.print("  ");
			
			for(int j=1;j<=n;j++) {
				if(j==1 && i>=1 && i<=n
						||
				   i==1 && j>=1 && j<=n
				   		||
				   i==(n/2) && j>=1 && j<=n
				   		||
				   i==n && j>=1 && j<=n) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			System.out.print("  ");
			
			for(int j=1;j<=n;j++) {
				if(j==1 && i>=1 && i<n
						||
				   j==n && i>=1 && i<n
						||
				   i==n && j>1 && j<n) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			System.out.print("  ");
			
			for(int j=1;j<=n;j++) {
				if(j==1 && i>=1 && i<=n
						||
				   i==1 && j>=1 && j<n
						||
				   i==n/2 && j>=1 && j<n
						||
				   j==n && i>1 && i<n/2
				   		||
				   i>n/2 && j>n/2 && i==j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			
			for(int j=1;j<=n;j++) {
				if(j==1 && i>1 && i<n
						||
				   j==n && i>1 && i<n
				   		||
				   i==1 && j>1 && j<n
						||
				   i==n && j>1 && j<n) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			
			for(int j=1;j<=n;j++) {
				if(j==1 && i>=1 && i<=n
						||
				   j==n && i>=1 && i<=n
						||
			       i==j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			
			
			System.out.println();
		}

	}

}
