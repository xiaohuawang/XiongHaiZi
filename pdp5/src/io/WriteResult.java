package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class WriteResult {

	// DreamTraversal5

	public String getFileName(String filenamePart) {
		String filename = System.getProperty("user.dir") + File.separatorChar + "resultFolder" + File.separatorChar
				+ "DreamTraversal" + filenamePart;
		return filename;
	}

	public void writeResult(List<String> resultList, int kidIndex) {
		PrintWriter writer;
		try {
			String filenamePart = String.valueOf(kidIndex);
			String filename = getFileName(filenamePart);
			System.out.println(filename);
			writer = new PrintWriter(new File(filename));
			writer.println("Candy type," + "Candy Type," + "Household Type");

			for (String s : resultList) {
				writer.println(s);
			}
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
