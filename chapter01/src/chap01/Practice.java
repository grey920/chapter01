package chap01;

public class Practice {

	public static void main(String[] args) {
		int v1 =0;
		if (true) {
			int v2 =0;
			if (true) {
				int v3 =0;
				v1 =1;
				v2 =1;
				v3 =1;
			}
			int v3 =1;
			v1= v2 + v3 ;
		}
		System.out.println(v1);
	}

}
