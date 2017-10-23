package house;

import visit.IVisitor;
import visit.IsVisible;

public class Townhome implements IsVisible{

	
	private final String houseName = "Townhome";
	
	public String getHouseName(){
		return houseName;
	}

	@Override
	public void accept(IVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.setRouteList(this.getHouseName());
		visitor.visit(this);
	}
	
}
