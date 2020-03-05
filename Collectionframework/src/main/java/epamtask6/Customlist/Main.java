package epamtask6.Customlist;

public class Main {
	    public static void main(String[] args) 
	    {
	    	  Customlists<String> list = new Customlists();
	          list.add("life");
	          list.add("is");
	          list.add("not");
	          list.add("beautyful");
	          list.add("blue");
	          list.add("yellow");
	          System.out.println(list);
	          list.remove(1);
	          list.remove(2);
	          System.out.println(list);
	          System.out.println( list.get(1) );
	          System.out.println( list.get(2) );
	          System.out.println(list.size());
	}
}
