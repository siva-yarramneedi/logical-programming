import java.util.Scanner;
public class LBP031{
	public static String generatePin(int x, int y, int z){
		if(x>=100&&x<=999 && x>=100&&x<=999 && x>=100&&x<=999){
			int[] arr = new int[4];
			int i;
			int max = 0;
			for(i=0;i<3;i++){
			  arr[i] = Math.min(x%10, Math.min(y%10, z%10));
			  max = Math.max(max,Math.max(x%10, Math.max(y%10, z%10)));
			  	x/=10; y/=10; z/=10;
			}
			//arr[i] = (orgX+orgY+orgZ)>9?9:orgX+orgY+orgZ;
			arr[i] = max;
			String pin = "";
			for(int j=arr.length-1; j>=0;j--){
			  pin+=arr[j];
			}
		    return pin;
		}
		else{
		    return "invalid";
		}
	}
	public static void main(String[] args){
	  Scanner scanner = new Scanner(System.in);
	  int x = scanner.nextInt();
	  int y = scanner.nextInt();
	  int z = scanner.nextInt();
	  System.out.println(generatePin(x, y, z));
	  scanner.close();
	}

}
