
public interface Comparable<T> {
	public T method(T o);
}


class example implements Comparable<Integer> {

	@Override
	public Integer method(Integer o) {
		
		return null;
	}
	
	public static void main(String[] args) {
		example object = new <Integer> example();
		System.out.println(object.method(123));
	}
	
}

class example2 <TT> implements Comparable<TT> {

	@Override
	public TT method(TT o) {
		// TODO Auto-generated method stub
		return null;
	}
	
}