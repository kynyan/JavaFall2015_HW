package homework4_MyList;

public class MyList<T> {
	
	Node<T> first;
	Node<T> last;
	
	public void add(T data) {
		
		if (first == null) {
			first = new Node<T>();   
			first.data=data;
			last=first;
		} else {
			if (first == last) {				
				last = new Node<T>();   
				last.data=data;
				first.next=last;
			} else {
				last.next= new Node<T>();
				last.next.data=data;   
				last=last.next;
			}		
		}		
	}
	
	@Override
	public String toString() {
		
		String s = "[";
		
		Node temp = first;
		
		while (temp != null) {
			s += temp.data;
			s += ", ";
			temp = temp.next;
		}
		
		return s + "]";
		
	}
	
	public static void main(String[] args) {
		MyList<String> a = new MyList<>();
		a.add("one");
		a.add("two");
		a.add("three");
		a.add("four");
		
		
		System.out.println(a.toString());
	}

}
