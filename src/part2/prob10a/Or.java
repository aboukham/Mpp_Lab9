package part2.prob10a;

import java.util.*;

public class Or {

	public static void main(String[] args) {
		Or o = new Or();
		List<Simple> list = Arrays.asList(new Simple(false), new Simple(false), new Simple(true));
		System.out.println(o.someSimpleIsTrue(list));

	}
	
	public boolean someSimpleIsTrue(List<Simple> list) {
		return list.stream().map(n -> n.flag).reduce(false, (x, y) -> x || y);
	}

}
