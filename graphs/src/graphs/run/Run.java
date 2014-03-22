package graphs.run;

import graphs.algoritm.Pair;
import graphs.model.Schema;

public class Run {

	public static void main(String[] args) {
		Schema sh = new Schema();
		sh.generateSchema(500, 1000, 10, 14, 10);
		System.out.println(sh.toString());
		new Pair(sh).run();
	}
}
