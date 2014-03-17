public class fizzbuzz {
	public static void main(String[] args) {
		for(int i=1;i<=100;i++){
			String s = "";
			if(i%3==0)
				s+="fizz ";
			if(i%5==0)
				s+="buzz";
			if(!(i%3==0)&&!(i%5==0)){
				System.out.print(i);
			}else{
				System.out.print(s);
			}
		}
	}
}
