package house;

import candySize.FunSize;
import candySize.KingSize;
import candySize.SuperSize;
import visit.IVisitor;
import visit.IsVisible;

public class Mansion implements IsVisible {

	private final String houseName = "mansion";
	private SuperSize superSize;
	private KingSize kingSize;
	private FunSize funSize;

	public String getHouseName() {
		return houseName;
	}


	public SuperSize getSuperSize() {
		return superSize;
	}



	public void setSuperSize(SuperSize superSize) {
		this.superSize = superSize;
	}



	public KingSize getKingSize() {
		return kingSize;
	}



	public void setKingSize(KingSize kingSize) {
		this.kingSize = kingSize;
	}



	public FunSize getFunSize() {
		return funSize;
	}



	public void setFunSize(FunSize funSize) {
		this.funSize = funSize;
	}



	@Override
	public void accept(IVisitor visitor) {
		// TODO Auto-generated method stub
		System.out.println("come here");
//		System.out.println(this.getMansionName());
		visitor.setRouteList(this.getHouseName());
		visitor.visit(this);
	}

}
