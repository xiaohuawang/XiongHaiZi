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
