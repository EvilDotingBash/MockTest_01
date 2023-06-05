package in.ineuron.main;

import java.util.Scanner;

public class Mock_Test_Array_2 {

	public static void main(String[] args) {

		System.out.println("Enter the string in lowercase");
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		int pos = -1, c = 0;
		for (int i = 0; i < st.length(); i++) {
			pos = -1;
			c=0;
			for (int j = 0; j < st.length(); j++) {
				if (st.charAt(i) == st.charAt(j)) {
					c++;
				}
			}
			if (c == 1) {
				pos = i;
				break;
			} else {
				pos = -1;
			}
		}
		System.out.println(pos);
	}

}
