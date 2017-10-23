package candySize;

import candyName.MarsCandy;
import candyName.SnickersCandy;
import candyName.TwixCandy;
import visit.IVisitor;
import visit.IsVisible;

public class SuperSize implements IsVisible {

	private final String sizeName = "Super Size";
	private TwixCandy twixCandy;
	private SnickersCandy snickersCandy;
	private MarsCandy marsCandy;

	public String getSizeName() {
		return sizeName;
	}

	public TwixCandy getTwixCandy() {
		return twixCandy;
	}

	public void setTwixCandy(TwixCandy twixCandy) {
		this.twixCandy = twixCandy;
	}

	public SnickersCandy getSnickersCandy() {
		return snickersCandy;
	}

	public void setSnickersCandy(SnickersCandy snickersCandy) {
		this.snickersCandy = snickersCandy;
	}

	public MarsCandy getMarsCandy() {
		return marsCandy;
	}

	public void setMarsCandy(MarsCandy marsCandy) {
		this.marsCandy = marsCandy;
	}

	@Override
	public void accept(IVisitor visitor) {
		// TODO Auto-generated method stub

		if (visitor.getRouteList().size() == 2) {
			visitor.getRouteList().remove(1);
		}

		visitor.setRouteList(this.getSizeName());
		visitor.visit(this);
		// cun visitor li

	}

}
