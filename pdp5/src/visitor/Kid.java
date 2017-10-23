package visitor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import candyName.AlmondJoyCandy;
import candyName.BabyRuthCandy;
import candyName.CrunchCandy;
import candyName.KitKatCandy;
import candyName.MarsCandy;
import candyName.MilkyWayCandy;
import candyName.SnickersCandy;
import candyName.TobleroneCandy;
import candyName.TwixCandy;
import candyName.WhoopersCandy;
import candySize.FunSize;
import candySize.KingSize;
import candySize.RegularSize;
import candySize.SuperSize;
import house.DetachedHouse;
import house.Duplex;
import house.Mansion;
import house.Townhome;
import visit.IVisitor;

public class Kid implements IVisitor {

	private String isVisitingHouse;
	private ArrayList<String> routeList = new ArrayList<String>();

	private Mansion mansion = new Mansion();
	private Duplex duplex = new Duplex();
	private Townhome townHouse = new Townhome();
	private DetachedHouse detachedHouse = new DetachedHouse();

	// private SuperSize superSizeMA = new SuperSize();
	// private KingSize kingSizeMA = new KingSize();
	//
	// private TwixCandy twixCandyMA = new TwixCandy();
	// private SnickersCandy snickersCandyMA = new SnickersCandy();
	// private MarsCandy marsCandyMA = new MarsCandy();
	// private KitKatCandy kitKatCandyMA = new KitKatCandy();
	// private WhoopersCandy whoopersCandyMA = new WhoopersCandy();
	// private CrunchCandy cruchCandyMA = new CrunchCandy();

	private SuperSize superSize = new SuperSize();
	private KingSize kingSize = new KingSize();
	private FunSize funSize = new FunSize();
	private RegularSize regularSize = new RegularSize();

	private TwixCandy twixCandy = new TwixCandy();
	private SnickersCandy snickersCandy = new SnickersCandy();
	private MarsCandy marsCandy = new MarsCandy();
	private KitKatCandy kitKatCandy = new KitKatCandy();
	private WhoopersCandy whoopersCandy = new WhoopersCandy();
	private CrunchCandy cruchCandy = new CrunchCandy();
	private TobleroneCandy tobleroneCandy = new TobleroneCandy();
	private BabyRuthCandy babyRuthCandy = new BabyRuthCandy();
	private AlmondJoyCandy almondJoyCandy = new AlmondJoyCandy();
	private MilkyWayCandy milkyWayCandy = new MilkyWayCandy();

	private HashMap<String, ArrayList<String>> kidMap;
	private List<String> resultList=new ArrayList<String>();
	//

	// set up mansion for supersize
	// public void setUpStructureMansion() {
	//
	// superSizeMA.setMarsCandy(marsCandyMA);
	// superSizeMA.setSnickersCandy(snickersCandyMA);
	// superSizeMA.setTwixCandy(twixCandyMA);
	// mansion.setSuperSize(superSizeMA);
	//
	// kingSizeMA.setCrunchCandy(cruchCandyMA);
	// kingSizeMA.setKitKitCandy(kitKatCandyMA);
	// kingSizeMA.setWhoopersCandy(whoopersCandyMA);
	// mansion.setKingSize(kingSizeMA);
	// }
	
	// kid constructore
	public Kid(HashMap<String, ArrayList<String>> kidMap) {
		this.kidMap = kidMap;
	}

	public List<String> getResultList() {
		return resultList;
	}

	public void setResultList(String resultRoute) {
		resultList.add(resultRoute);
	}

	public HashMap<String, ArrayList<String>> getKidMap() {
		return kidMap;
	}

	@Override
	public String getIsVistingHouse() {
		return isVisitingHouse;
	}

	@Override
	public void setIsVistingHouse(String isVistingHouse) {
		this.isVisitingHouse = isVistingHouse;
	}

	//set route set, used by the IsVisibleClass
	@Override
	public void setRouteList(String route) {
		// TODO Auto-generated method stub
		routeList.add(route);
	}

	public ArrayList<String> getRouteList() {
		return routeList;
	}

	public void Start() {

		isVisitingHouse = "mansion";
		mansion.accept(this);

		// isVisitingHouse="detachedHouse";
		// detachedHouse.accept(this);
		//
		// isVisitingHouse="duplex";
		// duplex.accept(this);
		//
		// isVisitingHouse="townHouse";
		// townHouse.accept(this);

	}

	@Override
	public void visit(Duplex dupledx) {
		// TODO Auto-generated method stub
		superSize.accept(this);
		kingSize.accept(this);
		funSize.accept(this);
	}

	@Override
	public void visit(Mansion mansion) {
		// TODO Auto-generated method stub
		System.out.println("House: mansion");
		// System.out.println(superSizeMA.getMarsCandy());

		superSize.accept(this);
		System.out.println("-------------we come to king size");
		kingSize.accept(this);
		System.out.println("-------------we come to funsize");
		funSize.accept(this);

	}

	@Override
	public void visit(DetachedHouse detachedHouse) {
		// TODO Auto-generated method stub
		superSize.accept(this);
		kingSize.accept(this);
		funSize.accept(this);
	}

	@Override
	public void visit(Townhome townhome) {
		// TODO Auto-generated method stub
		regularSize.accept(this);
	}

	@Override
	public void visit(SuperSize superSize) {
		// TODO Auto-generated method stub

		if (isVisitingHouse.equals("mansion")) {
			System.out.println("Size: super size MA");
			// for(superSize.get)
			twixCandy.accept(this);
			snickersCandy.accept(this);
			marsCandy.accept(this);
		} else if (isVisitingHouse.equals("detachedHouse")) {
			System.out.println("Size: super size DH");
			// for(superSize.get)
			kitKatCandy.accept(this);
			whoopersCandy.accept(this);
			milkyWayCandy.accept(this);
			cruchCandy.accept(this);
		} else if (isVisitingHouse.equals("duplex")) {
			System.out.println("Size: super size DU");
			tobleroneCandy.accept(this);
			babyRuthCandy.accept(this);
			almondJoyCandy.accept(this);
		}
	}

	@Override
	public void visit(KingSize funsize) {
		// TODO Auto-generated method stub

		if (isVisitingHouse.equals("mansion")) {
			System.out.println("Size: king size MA");
			kitKatCandy.accept(this);
			whoopersCandy.accept(this);
			cruchCandy.accept(this);
		} else if (isVisitingHouse.equals("detachedHouse")) {
			System.out.println("Size: king size DH");
			tobleroneCandy.accept(this);
		} else if (isVisitingHouse.equals("duplex")) {
			System.out.println("Size: king size DU");
			twixCandy.accept(this);
			snickersCandy.accept(this);
			marsCandy.accept(this);
		}
	}

	@Override
	public void visit(FunSize funsize) {
		// TODO Auto-generated method stub

		if (isVisitingHouse.equals("mansion")) {
			tobleroneCandy.accept(this);
			babyRuthCandy.accept(this);
			almondJoyCandy.accept(this);
		} else if (isVisitingHouse.equals("detachedHouse")) {
			twixCandy.accept(this);
			snickersCandy.accept(this);
			marsCandy.accept(this);
		} else if (isVisitingHouse.equals("duplex")) {
			kitKatCandy.accept(this);
			whoopersCandy.accept(this);
			milkyWayCandy.accept(this);
			cruchCandy.accept(this);
		}
	}

	@Override
	public void visit(RegularSize regularSize) {
		// TODO Auto-generated method stub
		if (isVisitingHouse.equals("townHouse")) {
			almondJoyCandy.accept(this);
			babyRuthCandy.accept(this);
			kitKatCandy.accept(this);
			marsCandy.accept(this);
			snickersCandy.accept(this);
			tobleroneCandy.accept(this);
			twixCandy.accept(this);
			whoopersCandy.accept(this);
		}
	}

	@Override
	public void visit(TwixCandy twixCandy) {
		// TODO Auto-generated method stub
		System.out.println("Candy is TwixCandy");
	}

	@Override
	public void visit(SnickersCandy snickersCandy) {
		// TODO Auto-generated method stub
		System.out.println("Candy is SnickersCandy");
	}

	@Override
	public void visit(MarsCandy marsCandy) {
		// TODO Auto-generated method stub
		System.out.println("Candy is MarsCandy");
	}

	@Override
	public void visit(KitKatCandy kitKatCandy) {
		// TODO Auto-generated method stub
		System.out.println("Candy: KitKatCandy");
	}

	@Override
	public void visit(WhoopersCandy whoopersCandy) {
		// TODO Auto-generated method stub
		System.out.println("Candy: WhoopersCandy");
	}

	@Override
	public void visit(CrunchCandy crunchCandy) {
		// TODO Auto-generated method stub
		System.out.println("Candy: CrunchCandy");
	}

	@Override
	public void visit(BabyRuthCandy babyRuthCandy) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(AlmondJoyCandy almondJoyCandy) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(MilkyWayCandy milkyWayCandy) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(TobleroneCandy tobleroneCandy) {
		// TODO Auto-generated method stub

	}

}
