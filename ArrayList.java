package data_structor;
public abstract class ArrayList <T> implements ListADT<T>,Iterable<T>{
	private final static int DEFAULT_CAPACITY=100;
	private final static int NOT_FOUND=-1;
	protected int rear;
	protected T[] list;
	protected int modCount;
	public ArrayList() {
		this(DEFAULT_CAPACITY);
	}
	public ArrayList(int initialCapacity) {
		rear=0;
		list=(T[])(new Object[initialCapacity]);
		modCount=0;
	}
	public T remove(T element) {
		T result;
		int index=find(element);
		if (index==NOT_FOUND)
			throw new ElementNotFoundException("ArrayList");
		result=list[index];
		rear--;
		for (int scan=index;scan<rear;scan++) {
			list[scan]=list[scan+1];
		}
		list[rear]=null;
		modCount++;
		return result;
	}
	private int find(T target) {
		// TODO Auto-generated method stub
		int scan=0;
		int result=NOT_FOUND;
		if(!isEmpty())
			while (result==NOT_FOUND&&scan<rear)
				if (target.equals(list[scan]))
					result=scan;
				else
					scan++;
		return 0;
	}
	public boolean contains(T target) {
		return (find(target)!=NOT_FOUND);
	}
}
