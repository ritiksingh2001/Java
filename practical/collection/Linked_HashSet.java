//It is an ordered and sorted collection of HashSet.
//It also maintains the insertion order.
package Collection;

import java.util.*;

public class Linked_HashSet {

	public static void main(String[] args)
	{ LinkedHashSet<String> lh=new LinkedHashSet<>();
	lh.add("A");
	lh.add("B");
	lh.add("C");
	lh.add("D");
	//Traversing elements
	Iterator<String> it=lh.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
}

}
		

	


