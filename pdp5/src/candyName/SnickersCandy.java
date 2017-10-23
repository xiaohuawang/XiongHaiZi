package candyName;

import java.util.ArrayList;

import visit.IVisitor;
import visit.IsVisible;

public class SnickersCandy implements IsVisible {

	private final String candyName = "Snickers";

	public SnickersCandy() {

	}

	public String getCandyName() {
		return candyName;
	}

	@Override
	public void accept(IVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.setRouteList(this.getCandyName());
		System.out.println("-----------------come to SnickersCandy");

		System.out.println(visitor.getKidMap());

		for (String routeStr : visitor.getRouteList()) {
			System.out.println(routeStr);
		}

		// ArrayList<String>
		// kidSizeSet=visitor.getKidMap().get(visitor.getRouteList().get(1));
		if (visitor.getKidMap().containsKey(visitor.getRouteList().get(1))) {
			System.out.println("we find the size");
			if (visitor.getKidMap().get(visitor.getRouteList().get(1)).contains((visitor.getRouteList().get(2)))) {
				while (visitor.getKidMap().get(visitor.getRouteList().get(1)).contains((visitor.getRouteList().get(2)))) {
					System.out.println("yes we find the candy");
					visitor.getKidMap().get(visitor.getRouteList().get(1)).remove(visitor.getRouteList().get(2));
				}
			} else {
				System.out.println("no we dont find the candy");
			}

		} else {
			System.out.println("no we dont find the size");
		}

		visitor.getRouteList().remove(2);

		visitor.visit(this);
	}

}
