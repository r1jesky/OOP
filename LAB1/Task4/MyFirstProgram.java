import myfristpackage.*;

class MyFirstClass {
    public static void main(String[] s) {
		MySecondClass o = MySecondClass(3,8);
		System.out.println(o.max());
		for(int i = 1; i <= 8; i++){
			for(int j = 1; j <= 8; j++){
				o.setValue1(i);
				o.setValue2(j);
				
				System.out.println(o.max());
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}