package zai.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import sedgewicks.stdlib.StdOut;
import sedgewicks.stdlib.Stopwatch;

public class QuickUnion {
	private int[] sites; // site indexed
	private int count; // no. of components

	public QuickUnion(int count) {
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

	public int find(int p) {
		while (p!=sites[p]){
			p=sites[p];
		}
		return p;
	}

	// quick union
	public void union(int p, int q) {
		int pRoot = find(p);
		int qRoot = find(q);

		if (pRoot == qRoot)
			return;
		
		sites[pRoot]=qRoot;
		
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
			QuickUnion uf = new QuickUnion(N);

			Stopwatch timer = new Stopwatch();
			
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
			
			StdOut.println("runtime : " + timer.elapsedTime());
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
