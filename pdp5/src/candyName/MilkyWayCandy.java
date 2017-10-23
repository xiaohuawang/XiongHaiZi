package candyName;

import visit.IVisitor;
import visit.IsVisible;

public class MilkyWayCandy implements IsVisible{

	private final String candyName = "MilkyWay";

	public MilkyWayCandy() {

	}

	public String getCandyName() {
		return candyName;
	}

	@Override
	public void accept(IVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.setRouteList(this.getCandyName());
		visitor.visit(this);
	}
}
