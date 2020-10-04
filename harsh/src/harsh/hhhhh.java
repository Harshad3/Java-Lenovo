package harsh;
import java.util.Arrays;
import java.util.Scanner;
public class hhhhh {

	public void digit_addition() {
		
		for(int x=0;x<1000;x++) {
		int firstdigit = x%10;
		int remaining2 = x/10;
		int seconddigit = remaining2%10;
		int remaining1 = remaining2/10;
		int res = firstdigit+seconddigit+remaining1;
		System.out.println(x+"  = "+res);
	}}
	public void minute_to_year(long x) {
		long year= x/525600;
		long y = x%525600;
		long day = y/1440;
		
		System.out.println(x+": Years = "+year+" || Days = "+day);
	}
	public void add100_while() {
		int i=0,sum=0;
		while(i<101) {
			sum+=i;
			++i;
			
		}System.out.println("sum="+sum);
	}
	public void Grid_nestedfor() {
		int [][]a = new int[10][10];
		
		for (int i=0; i<10; i++) {
			for (int j=0; j<10; j++) {
				System.out.printf("#", a[i][j]);
			}
			System.out.println();
		}
	}
	public void avg_of_array() {
		int[] a = new int[] {10,12,54,854,35,354,3541,561,351,351,51,351};
		int sum=0;
		double avg=0;
		for (int i=0; i<a.length;i++) {
			sum+=a[i];
			System.out.println(i+"="+a[i]);
		}
		System.out.println("total="+sum);
		avg = sum/a.length;
		System.out.println("Avg="+avg);
		System.out.println("\n\n");
		System.out.println(Arrays.toString(a)+"\n");
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world\n\n");
		Scanner in =new Scanner(System.in);
		//long x=in.nextLong();
		hhhhh h= new hhhhh();
		//h.digit_addition();
		//h.minute_to_year(x);
		
		//h.add100();
		//h.Grid_nestedfor();
		//h.avg_of_array();
		
		String s1 = "Harshad";
		System.out.println(s1.contains("har"));
	}
}
