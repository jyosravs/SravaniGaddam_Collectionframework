package epamtask6.Customlist;
import java.util.Arrays;
public class Customlists<E> {
	    private int size = 0;
	    private static final int DEFAULT_CAPACITY = 10;
	    private Object elements[];
	    public Customlists() {
	        elements = new Object[DEFAULT_CAPACITY];
	    }
	    public int size() {
	        return size;
	    }
	    @Override
	    public String toString() 
	    {
	         StringBuilder sb = new StringBuilder();
	         sb.append('[');
	         for(int i = 0; i < size ;i++) {
	             sb.append(elements[i].toString());
	             if(i<size-1){
	                 sb.append(",");
	             }
	         }
	         sb.append(']');
	         return sb.toString();
	    }
	     
	    private void ensureCapacity() {
	        int newSize = elements.length * 2;
	        elements = Arrays.copyOf(elements, newSize);
	    }
		public E get(int string) {
			// TODO Auto-generated method stub
			if (string >= size || string < 0) {
	            throw new IndexOutOfBoundsException("Index: " + string + ", Size " + string);
	        }
	        return (E) elements[string];
		}
		public E remove(int i) {
			// TODO Auto-generated method stub
			 if (i >= size || i < 0) {
		            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
		        }
		        Object item = elements[i];
		        int numElts = elements.length - ( i + 1 ) ;
		        System.arraycopy( elements, i + 1, elements, i, numElts ) ;
		        size--;
		        return (E) item;
		    }
		public void add(E i) {
			// TODO Auto-generated method stub
			if (size == elements.length) {
	            ensureCapacity();
	        }
	        elements[size++] = i;	
		}
		}

