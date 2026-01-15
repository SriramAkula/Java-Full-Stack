
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Collection;
import java.util.Iterator;

public class IteratorExample {
	public static void main(String[] args) {
		
		Collection<Integer> a1=new ArrayList<>();
		int i=1;
		while(i!=5) {
			a1.add(i);
			i++;
		}
		Iterator<Integer> itr=a1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		Iterator<Integer> itr2=a1.iterator();
		while(itr2.hasNext()){
			if(itr2.next()%2==0){
				itr2.remove();
			}
		}
		System.out.println(a1);
		
		
	}
}
