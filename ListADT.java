package data_structor;
import java.util.*;
public interface ListADT <T> extends Iterable<T>{
	public T removeFirst();
	public T removeLast();
	public T remove(T element);
	public T first();
	public T last();
	@Override
	public Iterator<T> iterator() ;
	public boolean contains(T target);
	public boolean isEmpty();
	public int size();
	public String toString();
	
}
