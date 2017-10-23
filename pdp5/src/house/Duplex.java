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
		if(visitor.getRouteList().size()==1){
			visitor.getRouteList().remove(0);
		}
		else if(visitor.getRouteList().size()==2){
			visitor.getRouteList().remove(1);
			visitor.getRouteList().remove(0);
		}
		
		visitor.setRouteList(this.getHouseName());
		visitor.visit(this);
	}

}
