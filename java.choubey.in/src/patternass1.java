
public class patternass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1;j++) {
				if(j==0||j==n-1||i==n-1||(i==0||i==n-1||j==0||j==n-1)) {
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
