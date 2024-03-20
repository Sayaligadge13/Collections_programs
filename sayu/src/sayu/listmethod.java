package sayu;
import java.util.*;

public class listmethod {

	public static void main(String[] args) {
		List<String>languages=new ArrayList<>();
		languages.add("C");
		languages.add("CPP");
		languages.add("Java");
		languages.add("Python");
		languages.add("DS");
		languages.add("Oracle");
		languages.add("VB");
		System.out.println("size of list:"+languages.size());
		System.out.println(languages);
		System.out.println(languages.get(0));
		languages.set(3,"VB.NET");
		System.out.println(languages);
		languages.remove(2);
        System.out.println(languages);
        List<String>L1=new ArrayList<>();
        L1.add("Oracle");
        L1.add("CPP");
        System.out.println("New List:"+L1);
        languages.removeAll(L1);
        System.out.println("After removing List:"+languages);
        languages.clear();
        System.out.println("List cleared"+languages);
        
        
        

		

	}

}
