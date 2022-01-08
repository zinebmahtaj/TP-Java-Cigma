package ma.education.tp5.collections;

import java.util.*;



public class TestList {

	public static void main(String[] args) {
	List<Integer> l= new ArrayList<Integer>();
	l.add(10);
	l.add(23);
	l.add(23);
	l.add(10);
	
	/*for(Integer i : l) {
		
		System.out.println("Element  : "+ i);
	*/
	
	l.forEach(i->System.out.println("l'element  : "+ i));
	
	List<Integer> l2 =Arrays.asList(1,5,6,9,16);
	l2.stream().map(i->i*i).filter(i->i>37).forEach(i->System.out.println("list2 "+i));
	
	
	List<Integer> l3= new ArrayList<>();
	l3.add(5);
	l3.add(10);
	l3.add(15);
	l3.add(20);
	l3.add(2,10);
	l3.forEach(i-> System.out.println("l3  "+i));
	}
}

