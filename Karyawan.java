import java.util.Scanner;
public class Karyawan {
	public static void main (String [] args){
		int a, b, c, d, e,f;
		Scanner scn = new Scanner (System.in);
		System.out.print("Masukkan Jam Kerja = ");
		a = scn.nextInt();
		d = a * 200;
		if (a > 48){
			b = a - 48;
			c = b * 3000;
		}
		else {
			c=0;
		}
		e = d + c;
		f = (168 - a)*200;
		System.out.println("Upah Karyawan = "+ e);
		System.out.println("Upah Karyawan per minggu = "+ f);
	}
}