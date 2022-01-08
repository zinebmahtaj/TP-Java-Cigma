package ma.education.tp5.collections;

import java.util.*;


public class TestSet {
public static void main(String[] args) {
	//Comparator<Client> cmp = new CodeComparator();
	
	
	Set<String> s1= new HashSet<String>();
	s1.add("ABC1");
	s1.add("ABC2");
	s1.add("ABC3");
	s1.add("ABC4");
	s1.add("ABC1");
	s1.add("ABC5");
	s1.forEach(i->System.out.println(i));
	
	Set<ma.education.tp5.collections.Client> lc= new HashSet<Client>();
	lc.add(new Client(1, "Zineb"));
	lc.add(new Client(1, "Hasnaa"));
	lc.add(new Client(1, "Rania"));
	lc.add(new Client(1, "Leila"));
	lc.add(new Client(1, "Leila"));
	lc.forEach(i->System.out.println(i));
  
    Set<Integer> s2= new TreeSet<Integer>();
    s2.add(22);
    s2.add(20);
    s2.add(2);
    s2.add(18);
    s2.add(5);
    s2.forEach(i-> System.out.println(i));
    

    Set<Client> s4 = new TreeSet<>((c1,c2)->c1.code-c2.code);
    s4.add(new Client(1,"Oussama"));
    s4.add(new Client(3,"saad"));
    s4.add(new Client(2,"salma"));
    s4.add(new Client(2,"ibtihal"));
    s4.add(new Client(4,"Fatima"));
    s4.add(new Client(2,"ziko"));
    s4.forEach(i-> System.out.println(i));
    
    
    
}
}
