package visit;

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

public interface IVisitor {

	//set route 
	public void setRouteList(String route);
	public ArrayList<String> getRouteList();
	
	//set and get in which house
	public void setIsVistingHouse(String isVisitingHouse);
	public String getIsVistingHouse();
	
	//set and get lookup map
	//<house <candysize1,candyname1>>
//	public HashMap<String, ArrayList<String>> getLookUpMap();
//	public void setLookUpMap(HashMap<String, ArrayList<String>> lookUpMap);
	
	//get kid map <candysize <candyname1, candyname2>>
	public HashMap<String, ArrayList<String>> getKidMap();
	
	//set result list
	public void setResultList(String resultRoute);
	
	public List<String> getResultList();
	
	// housename
	public void visit(Duplex dupledx);

	public void visit(Mansion mansion);

	public void visit(DetachedHouse detachedHouse);

	public void visit(Townhome townhome);

	// size
	public void visit(FunSize funsize);

	public void visit(KingSize funsize);

	public void visit(RegularSize regularSize);

	public void visit(SuperSize superSize);

	// candy
}
