package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import io.ReadCsv;
import visitor.Kid;

public class App {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ReadCsv readCsv = new ReadCsv();
		HashMap<String, ArrayList<String>> newMap = readCsv.readFile(args);
		System.out.println(newMap);

		// System.exit(0);

		HashMap<String, ArrayList<String>> kidMap = new HashMap<String, ArrayList<String>>();

		int expectedResultNum = newMap.get("super size").size() + newMap.get("king size").size()
				+ newMap.get("fun size").size() + newMap.get("regular size").size();

		System.out.println("NUM= " + expectedResultNum);

		ArrayList<String> candySuper = new ArrayList<String>();
		ArrayList<String> candyKing = new ArrayList<String>();
		ArrayList<String> candyFun = new ArrayList<String>();
		ArrayList<String> candyRegular = new ArrayList<String>();

		candySuper.add("kit kat");
		candySuper.add("snickers");
		// candySuper.add("twix");
		// candySuper.add("milky way");

		// candySuper.add("Twix");
		// candySuper.add("Milky Way");

		candyKing.add("toblerone");
		candyKing.add("mars");
		candyKing.add("mars");
		candyKing.add("almond joy");
		// candyKing.add("hershey’s");
		// candyKing.add("baby ruth");
		// candyKing.add("mars");

		// candyKing.add("Hershey’s");
		// candyKing.add("Baby Ruth");
		// candyKing.add("Mars");

		// candyFun.add("Toblerone");
		candyFun.add("mars");

		candyRegular.add("almond joy");
		candyRegular.add("crunch");
		// candyRegular.add("snickers");
		// candyRegular.add("kit kat");
		// candyRegular.add("almond joy");
		// candyRegular.add("crunch");

		// candyRegular.add("Snickers");
		// candyRegular.add("Kit Kat");
		// candyRegular.add("Almond Joy");
		// candyRegular.add("Crunch");

		// candySuper.add("Twix");
		// candySuper.add("Milky Way");
		//
		// candyKing.add("Mars");
		// candyKing.add("Mars");
		//
		// candyFun.add("Toblerone");
		// candyFun.add("Baby Ruth");
		//
		// candyRegular.add("Snickers");
		// candyRegular.add("Kit Kat");
		// candyRegular.add("Almond Joy");
		// candyRegular.add("Twix");

		kidMap.put("Super Size", candySuper);
		kidMap.put("King Size", candyKing);
		kidMap.put("Fun Size", candyFun);
		kidMap.put("Regular Size", candyRegular);

		// System.out.println("kidMap.size= " + kidMap.size());

		// for(int i=0;i<kidMap.size();i++){
		// System.out.println
		// }
		// System.out.println(kidMap);

		// System.exit(0);
		Kid kid1 = new Kid(newMap);

		// Mansion mansion = new Mansion();

		kid1.Start();
		// System.out.println();
		// System.out.println(kid1.getRouteList().size());

		// for(int i=0;i<kid1.getRouteList().size();i++){
		// System.out.println(kid1.getRouteList().get(i));
		// }
		System.out.println();
		System.out.println("result set.size= " + kid1.getResultList().size());

		if (kid1.getResultList().size() == expectedResultNum) {
			// write file
		} else { 
			// couldnot find all the candy
		}

		for (int i = 0; i < kid1.getResultList().size(); i++) {
			System.out.println(kid1.getResultList().get(i));
		}

		// System.out.println(kid.getRouteList().get(0));
		// System.out.println(kid.getRouteList().get(1));
		// System.out.println(kid.getRouteList().get(2));

		// SuperSize superSizeH1=new SuperSize();
		// TwixCandy twixCandyH1=new TwixCandy();
		// SnickersCandy snickersCandyH1=new SnickersCandy();
		// MarsCandy marsCandyH1 =new MarsCandy();
		//
		// superSizeH1.setMarsCandy(marsCandyH1);
		// superSizeH1.setSnickersCandy(snickersCandyH1);
		// superSizeH1.setTwixCandy(twixCandyH1);

	}

}
