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
		Kid[] kids = new Kid[Integer.valueOf(args[0])];

		List<HashMap<String, ArrayList<String>>> kidMapList = readCsv.readFile(args);

		for (int i = 0; i < kidMapList.size(); i++) {
			System.out.println(kidMapList.get(i));
		}

		// System.exit(0);

		for (int i = 0; i < kidMapList.size(); i++) {
			HashMap<String, ArrayList<String>> tempMap = kidMapList.get(i);
			resultList.add(tempMap.get("super size").size() + tempMap.get("king size").size()
					+ tempMap.get("fun size").size() + tempMap.get("regular size").size());
		}

		for (int kidIndex = 0; kidIndex < Integer.valueOf(args[0]); kidIndex++) {
			kids[kidIndex] = new Kid(kidMapList.get(kidIndex));
			// begin to traverse the tree
			kids[kidIndex].Start();
			// write the result file
			if (kids[kidIndex].getResultList().size() == resultList.get(kidIndex)&&kids[kidIndex].getResultList().size()!=0) {
				writeResult.writeResult(kids[kidIndex].getResultList(), kidIndex + 1);
			}

		}
		
		//print result
		for (int kidIndex = 0; kidIndex < Integer.valueOf(args[0]); kidIndex++) {

			if (kids[kidIndex].getResultList().size() == resultList.get(kidIndex)&&kids[kidIndex].getResultList().size()!=0) {
				System.out.println("for kid number " + (kidIndex + 1) + " we have generate the result file");
			} else if(kids[kidIndex].getResultList().size() != resultList.get(kidIndex)){
				System.out.println("for kid number " + (kidIndex + 1) + " we can't find the candy");
			}else if(resultList.get(kidIndex)==0){
				System.out.println("for kid number " + (kidIndex + 1) + " we can not read his/her csv file");
			}
		}

	}

}
