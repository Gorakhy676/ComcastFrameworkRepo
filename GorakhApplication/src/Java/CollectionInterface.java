package Java;
import java.util.*;
import java.lang.*;
public class CollectionInterface {

	public static void main(String[] args) {
		
		Collection c1=new ArrayList();
		Collection c2=new ArrayList();
		System.out.println("Collection is");
		Object[] a=c1.toArray();
		c1.add(20);
		c1.add(30);
		c1.add(40);
		c1.add(40);
		c2.add(60);
		c2.add(70);
		c2.add(90);
		
		
		System.out.println(c1.size());
		System.out.println(c1.isEmpty());
		System.out.println(c1.toArray());
		System.out.println(c1.hashCode());
		System.out.println(c1.equals(c2));

	}

}
