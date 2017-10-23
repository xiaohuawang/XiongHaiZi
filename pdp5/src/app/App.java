package app;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import visitor.Kid;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,ArrayList<String>> kidMap=new HashMap<String,ArrayList<String>>();
		ArrayList<String> candySuper=new ArrayList<String>();
		ArrayList<String> candyKing=new ArrayList<String>();
		ArrayList<String> candyFun=new ArrayList<String>();
		ArrayList<String> candyRegular=new ArrayList<String>();
		
		candySuper.add("Twix");
		candySuper.add("Milky Way");
		
		candyKing.add("Mars");
		candyKing.add("Mars");
		
		candyFun.add("Toblerone");
		candyFun.add("Baby Ruth");
		
		candyRegular.add("Snickers");
		candyRegular.add("Kit Kat");
		candyRegular.add("Almond Joy");
		candyRegular.add("Twix");
		
		kidMap.put("Super Size", candySuper);
		kidMap.put("King Size", candyKing);
		kidMap.put("Fun Size", candyFun);
		kidMap.put("Regular Size", candyRegular);
		
				
//		for(int i=0;i<kidMap.size();i++){
//			System.out.println
//		}
		System.out.println(kidMap);
		
		Kid kid1 = new Kid(kidMap);
		
	
//		Mansion mansion = new Mansion();
		
		kid1.Start();
//		System.out.println();
//		System.out.println(kid1.getRouteList().size());
		
//		for(int i=0;i<kid1.getRouteList().size();i++){
//			System.out.println(kid1.getRouteList().get(i));
//		}
		System.out.println();
		System.out.println("result set.size= "+kid1.getResultList().size());
		for(int i=0;i<kid1.getResultList().size();i++){
			System.out.println(kid1.getResultList());
		}
		
		
//		System.out.println(kid.getRouteList().get(0));
//		System.out.println(kid.getRouteList().get(1));
//		System.out.println(kid.getRouteList().get(2));

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
