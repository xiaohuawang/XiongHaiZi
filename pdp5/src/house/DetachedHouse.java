package house;

import candySize.FunSize;
import candySize.KingSize;
import candySize.SuperSize;
import visit.IVisitor;
import visit.IsVisible;

public class DetachedHouse implements IsVisible{
	
	private final String houseName="DetachedHouse";
//	private SuperSize superSize;
//	private KingSize kingSize;
//	private FunSize funSize;
	
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
