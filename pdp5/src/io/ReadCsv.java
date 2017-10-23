package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class ReadCsv {

	// { "Twix", "Snickers", "Mars", "Kit Kat", "Whoopers", "Milky Way",
	// "Toblerone",
	// "Crunch", "Baby Ruth", "Almond Joy" };

	private HashSet<String> setNameSet() {
		HashSet<String> candyNameSet = new HashSet<String>();

		candyNameSet.add("twix");
		candyNameSet.add("snickers");
		candyNameSet.add("mars");
		candyNameSet.add("kit kat");
		candyNameSet.add("whoopers");
		candyNameSet.add("milky way");
		candyNameSet.add("toblerone");
		candyNameSet.add("crunch");
		candyNameSet.add("baby ruth");
		candyNameSet.add("almond joy");

		return candyNameSet;
	}

	public String getFileName(String filenamePart) {
		String filename = (System.getProperty("user.dir") + File.separatorChar + filenamePart);
		return filename;
	}

	public List<HashMap<String, ArrayList<String>>> readFile(String args[]) throws IOException {

		List<HashMap<String, ArrayList<String>>> kidMapList = new ArrayList<HashMap<String, ArrayList<String>>>();
		for (int i = 1; i <= Integer.valueOf(args[0]); i++) {
			System.out.println(args[i]);
			HashMap<String, ArrayList<String>> kidMap = createKidMap(args[i]);
			kidMapList.add(kidMap);
		}
		// System.exit(0);
		return kidMapList;
	}

	// /Users/yangyangyy/git/pdp5/pdp5/DreamCandy1.csv
	public HashMap<String, ArrayList<String>> createKidMap(String filenamePart) throws IOException {

		HashSet<String> candyNameSet = setNameSet();
		HashMap<String, ArrayList<String>> inputMap = new HashMap<String, ArrayList<String>>();
		ArrayList<String> superList = new ArrayList<String>();
		ArrayList<String> regularList = new ArrayList<String>();
		ArrayList<String> funList = new ArrayList<String>();
		ArrayList<String> kingList = new ArrayList<String>();

		List<String> resList = new ArrayList<String>();
		String filename = getFileName(filenamePart);
		BufferedReader reader = new BufferedReader(new FileReader(filename));

		String line = reader.readLine();
		String parts[] = line.split(",");
		System.out.println("-------lenght= " + parts.length);
		for (int i = 0; i < parts.length; i++) {
			parts[i] = parts[i].toLowerCase();
			parts[i] = parts[i].trim();
			resList.add(parts[i]);

			// System.out.println(parts[i]);
			if (parts[i].contains("super size")) {
				System.out.println(parts[i].replaceAll("super size", "").trim());
				// inputMap.put("super size", );
				superList.add(parts[i].replaceAll("super size", "").trim());
			} else if (parts[i].contains("king size")) {
				System.out.println(parts[i].replaceAll("king size", "").trim());
				kingList.add(parts[i].replaceAll("king size", "").trim());
			} else if (parts[i].contains("fun size")) {
				System.out.println(parts[i].replaceAll("fun size", "").trim());
				funList.add(parts[i].replaceAll("fun size", "").trim());
			} else if (parts[i].contains("regular size")) {
				System.out.println(parts[i].replaceAll("fun size", "").trim());
				regularList.add(parts[i].replaceAll("regular size", "").trim());
			} else {
				// regular size
				regularList.add(parts[i]);
			}
		}
		reader.close();

		inputMap.put("super size", superList);
		inputMap.put("king size", kingList);
		inputMap.put("regular size", regularList);
		inputMap.put("fun size", funList);

		return inputMap;
	}

}
