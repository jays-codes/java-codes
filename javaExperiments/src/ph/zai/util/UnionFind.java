package ph.zai.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import sedgewicks.stdlib.StdIn;
import sedgewicks.stdlib.StdOut;

public class UnionFind {
	private int[] sites; // site indexed
	private int count; // no. of components

	public UnionFind(int count) {
		this.count = count;
		sites = new int[count];

		for (int i = 0; i < count; i++) {
			sites[i] = i;
		}
	}

	public int count() {
		return count;
	}

	public boolean connected(int p, int q) {
		return find(p) == find(q);
	}

	public int find(int siteNo) {
		return sites[siteNo];
	}

	// quick find
	public void union(int p, int q) {
		int pId = find(p);
		int qId = find(q);

		if (pId == qId)
			return;
		//sites[p]=qId;
		for (int i = 0; i < sites.length; i++) {
			if (sites[i] == pId)
				sites[i] = qId;
		}

		count--;
	}

	public static void main(String[] args) {

		String returnValue = "";
		FileReader file = null;

		try {
			file = new FileReader(args[0]);
			BufferedReader reader = new BufferedReader(file);
			String line = "";
			line = reader.readLine();

			int N = Integer.parseInt(line);
			UnionFind uf = new UnionFind(N);

			while ((line = reader.readLine()) != null) {
				returnValue += line + "\n";
				String[] intsStr = line.split(" ");

				int p = Integer.parseInt(intsStr[0]);
				int q = Integer.parseInt(intsStr[1]);
				if (uf.connected(p, q))
					continue; // Ignore if connected.
				uf.union(p, q); // Combine components
				StdOut.println(p + " " + q); // and print connection.

			}
			StdOut.println(uf.count() + " components");

		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			if (file != null) {
				try {
					file.close();
				} catch (IOException e) {
					// Ignore issues during closing
				}
			}
		}

	}
}
