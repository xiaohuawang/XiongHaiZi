package candyName;

import visit.IVisitor;
import visit.IsVisible;

public class MilkyWayCandy implements IsVisible{

	private final String candyName = "milky way";

	public MilkyWayCandy() {

	}

	public String getCandyName() {
		return candyName;
	}

	@Override
	public void accept(IVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.setRouteList(this.getCandyName());
		
		System.out.println("-----------------come to MilkyWay");
		StringBuilder resultSb=new StringBuilder();
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
					for(int i=visitor.getRouteList().size()-1;i>=0;i--){
						if(i==0){
							resultSb.append(visitor.getRouteList().get(i));
						}else{
							resultSb.append(visitor.getRouteList().get(i)+",");
						}
					}
					visitor.setResultList(resultSb.toString());
					resultSb=new StringBuilder();
					visitor.getKidMap().get(visitor.getRouteList().get(1)).remove(visitor.getRouteList().get(2));
				}
			} else {
				System.out.println("no we dont find the candy");
			}

		} else {
			System.out.println("no we dont find the size");
		}

		visitor.getRouteList().remove(2);
	}
}
