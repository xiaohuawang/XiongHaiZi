package candyName;

import visit.IVisitor;
import visit.IsVisible;

public class TwixCandy implements IsVisible{

	private final String candyName = "twix";

	public TwixCandy() {

	}

	public String getCandyName() {
		return candyName;
	}
	
	@Override
	public void accept(IVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.setRouteList(this.getCandyName());
		
		
		System.out.println("-----------------come to twix");
		StringBuilder resultSb=new StringBuilder();
		
//		for(int i=0;i<visitor.getRouteList().size();i++){
//			if(ma)visitor.getRouteList().get(i)
//		}
		System.out.println(visitor.getKidMap());
		
		for (String routeStr : visitor.getRouteList()) {
			System.out.print(routeStr+" ->");
		}
		System.out.println();
		
		System.out.println("test1= "+visitor.getKidMap().get(visitor.getRouteList().get(1)));
		System.out.println("test2= "+visitor.getRouteList().get(2));
		
		// int the route list 0: house  1:size 2: candy name
		if(visitor.getKidMap().containsKey(visitor.getRouteList().get(1))){
			System.out.println("yes we find the size");
			if(visitor.getKidMap().get(visitor.getRouteList().get(1)).contains((visitor.getRouteList().get(2)))){
				while(visitor.getKidMap().get(visitor.getRouteList().get(1)).contains((visitor.getRouteList().get(2)))){
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
			}else{
				System.out.println("no we dont find the candy");
			}
		}else{
		    System.out.println("no we dont find the size");
		}
		visitor.getRouteList().remove(2);
		
//		if(visitor.getKidMap().get("size").equals(visitor.get)
//		visitor.visit(this);
	}

}
