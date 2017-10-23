package house;

import candySize.FunSize;
import candySize.KingSize;
import candySize.SuperSize;
import visit.IVisitor;
import visit.IsVisible;

public class Duplex implements IsVisible {

	private final String houseName = "Duplex";
	private SuperSize superSize;
	private KingSize kingSize;
	private FunSize funSize;

	public String getHouseName() {
		return houseName;
	}

	@Override
	public void accept(IVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.setRouteList(this.getHouseName());
		visitor.visit(this);
	}

}
