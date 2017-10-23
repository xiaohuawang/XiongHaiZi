package candySize;

import visit.IVisitor;
import visit.IsVisible;

public class RegularSize implements IsVisible {

	private final String sizeName = "regular size";

	public String getSizeName() {
		return sizeName;
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
