package bean;

public class EqualsComparision {
	public static void main(String[] args) {
		
		String s1 = new String("hello");//Reference comparison;(false)
		String s2 = new String("hello");//content comparison;(true)
		System.out.println(s1==s2);//false
		System.out.println(s1.equals(s2));//true
		
	}

}
