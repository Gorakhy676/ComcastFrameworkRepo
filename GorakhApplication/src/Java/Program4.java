package Java;

import java.util.ArrayList;
import java.util.Collection;

public class Program4 {

	public static void main(String[] args) {
		Collection c1=new ArrayList();
		System.out.println("c1 is: "+c1);
		c1.add(23);
		c1.add(45.6);
		c1.add(45);
		c1.add("mohan");
		c1.add(45);
		System.out.println(c1);
		System.out.println("=================");
		for(Object x:c1) {
			System.out.println(x);
	}
	}
}
