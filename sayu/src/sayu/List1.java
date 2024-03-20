package sayu;
import java.util.*;

public class List1 {

	public static void main(String[] args) {
		List<Integer>L1=new ArrayList<>();
		L1.add(10);
		L1.add(20);
		L1.add(30);
		L1.add(40);
		L1.add(100);
		L1.add(60);
		System.out.println(L1);
		Collections.sort(L1);
		System.out.println(L1);
		Collections.reverse(L1);
		System.out.println(L1);

	}

}
