package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import io.ReadCsv;
import io.WriteResult;
import visitor.Kid;

public class HalloweenNeighborhoodTraversal {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ReadCsv readCsv = new ReadCsv();
		WriteResult writeResult = new WriteResult();
		List<Integer> resultList = new ArrayList<Integer>();
		Kid[] kids=new Kid[Integer.valueOf(args[0])];

		List<HashMap<String, ArrayList<String>>> kidMapList = readCsv.readFile(args);
		HashMap<String, ArrayList<String>> kidMap = new HashMap<String, ArrayList<String>>();
		
		for (int i = 0; i < kidMapList.size(); i++) {
			System.out.println(kidMapList.get(i));
		}

		// System.exit(0);

		// for(HashMap<String,ArrayList<String>> map:kidMapList){
		for (int i = 0; i < kidMapList.size(); i++) {
			HashMap<String, ArrayList<String>> tempMap = kidMapList.get(i);
			resultList.add(tempMap.get("super size").size() + tempMap.get("king size").size()
					+ tempMap.get("fun size").size() + tempMap.get("regular size").size());
		}

		for (int kidIndex = 0; kidIndex < Integer.valueOf(args[0]); kidIndex++) {
			kids[kidIndex]=new Kid(kidMapList.get(kidIndex));
			//begin to traverse the tree
			kids[kidIndex].Start();
			//write the result file
			writeResult.writeResult(kids[kidIndex].getResultList(),kidIndex+1);
		}
		
		System.out.println(kids[0].getResultList().size());
		System.out.println(kids[1].getResultList().size());

//		for (int i = 0; i < kid1.getResultList().size(); i++) {
//			System.out.println(kid1.getResultList().get(i));
//		}
//		System.out.println();

	}

}
