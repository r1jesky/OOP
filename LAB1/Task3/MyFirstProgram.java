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

class MySecondClass {
	private int value1;
	private int value2;
	
	public int max(){
		if(value1>value2) return value1;
		else return value2;
	}

	public MySecondClass(int value1, int value2){
		this.value1=value1;
		this.value2=value2;
	}

	public int getValue1(){
		return value1;
	}

	public int getValue2(){
		return value2;
	}

	public void setValue1(int value1){
		this.value1=value1;
	}

	public void setValue2(int value2){
		this.value2=value2;
	}
}