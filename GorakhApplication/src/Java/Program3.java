package Java;

import java.util.ArrayList;
import java.util.List;

public class Program3 {
	public static void main(String[] args) {
	
	List l1=new ArrayList();
	l1.add(6,34);
	l1.add(0,23);
	l1.add(2,55);
	l1.add(1, 50);
	l1.add(4, null);
	l1.add(5, 100);
	
	//l1.add(7, 70);
	System.out.println(l1);
	}
}
