package Java;

import java.util.ArrayList;
import java.util.*;

public class Program5 {

	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add(12);
		c1.add(13);
		c1.add(14);
		c1.add(15);
		c1.add(16);
		c1.add(17);
		Iterator itr=c1.iterator();
		System.out.println(c1);
		System.out.println(itr.next());
		System.out.println(itr.hasNext());
		System.out.println(itr.hashCode());
		//System.out.println(itr.remove());
	}

}
