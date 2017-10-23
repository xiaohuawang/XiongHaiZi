package candyName;

import visit.IVisitor;
import visit.IsVisible;

public class CrunchCandy implements IsVisible{

	private final String candyName = "Crunch";

	public CrunchCandy() {

	}

	public String getCandName() {
		return candyName;
	}
	
	@Override
	public void accept(IVisitor visitor) {
		// TODO Auto-generated method stub
		
		visitor.setRouteList(this.getCandName());
		
		System.out.println("-----------------come to CrunchCandy");
		System.out.println(visitor.getKidMap());

		for (String routeStr : visitor.getRouteList()) {
			System.out.print(routeStr+" ->");
		}
		
		System.out.println();

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
