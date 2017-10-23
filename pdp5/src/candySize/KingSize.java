package candySize;

import candyName.CrunchCandy;
import candyName.KitKatCandy;
import candyName.WhoopersCandy;
import visit.IVisitor;
import visit.IsVisible;

public class KingSize implements IsVisible{

	private final String sizeName = "king size";
	private KitKatCandy kitKitCandy;
	private WhoopersCandy whoopersCandy;
	private CrunchCandy crunchCandy;

	public String getSizeName() {
		return sizeName;
	}

	public KitKatCandy getKitKitCandy() {
		return kitKitCandy;
	}



	public void setKitKitCandy(KitKatCandy kitKitCandy) {
		this.kitKitCandy = kitKitCandy;
	}



	public WhoopersCandy getWhoopersCandy() {
		return whoopersCandy;
	}



	public void setWhoopersCandy(WhoopersCandy whoopersCandy) {
		this.whoopersCandy = whoopersCandy;
	}



	public CrunchCandy getCrunchCandy() {
		return crunchCandy;
	}



	public void setCrunchCandy(CrunchCandy crunchCandy) {
		this.crunchCandy = crunchCandy;
	}



	@Override
	public void accept(IVisitor visitor) {
		// TODO Auto-generated method stub
		if (visitor.getRouteList().size() == 2) {
			visitor.getRouteList().remove(1);
		}

		visitor.setRouteList(this.getSizeName());
		visitor.visit(this);

	}

	
}
