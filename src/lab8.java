/*
 * The source code of this program is based on the tutorial of lab8
 * I tried doing this on my own, but could not do.
 * Hence I rewrote the tutorial code by myself to understand the concept.
 * 
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class lab8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		lab8 k= new lab8();
		int nodes=sc.nextInt();
		List<Integer> [] g=new List[nodes];

		for (int i=0; i<nodes; i++)
		{
			g[i]= new ArrayList<Integer>();
		}

		int edges=sc.nextInt();
		for (int i=0; i<edges; i++)
		{
			int x=sc.nextInt();
			int y=sc.nextInt();
			g[x].add(y);
		}

		List<List<Integer>> scc=k.sccComponents(g);

		for(List l:scc)
		{
			Collections.sort(l);
			System.out.println(l);
		}
		//sc.close();



	}

	private List<List<Integer>> sccComponents(List<Integer>[] g) {

		// TODO Auto-generated method stub
		int v=g.length;
		boolean[] visited=new boolean[v];

		List<Integer> order = fillorder(g, visited);

		List<Integer>[] transpose = getTranspose(g);

		visited = new boolean[v];

		Collections.reverse(order);

		List<List<Integer>> sccList = new ArrayList<>();

		for (int i=0; i<order.size(); i++)
		{
			int n =order.get(i);
			if (!visited[n])
			{
				List<Integer> comp= new ArrayList<>();
				DFS(transpose, n, visited, comp);
				sccList.add(comp);

			}
		}


		return sccList;
	}

	private void DFS(List<Integer>[] transpose, int n, boolean[] visited, List<Integer> comp) {
		// TODO Auto-generated method stub
		visited [n]= true;
		for(int i=0; i<transpose[n].size(); i++)
			if(!visited[transpose[n].get(i)])
				DFS(transpose, transpose[n].get(i), visited, comp);
		comp.add(n);
	}

	private List<Integer>[] getTranspose(List<Integer>[] g) {
		// TODO Auto-generated method stub
		int v=g.length;
		List<Integer>[] gh= new List[v];
		for (int i=0; i<v; i++)
			gh[i]=new ArrayList<Integer>();
		for (int k=0; k<v; k++)
			for (int i=0; i<g[k].size(); i++)
				gh[g[k].get(i)].add(k);
		return gh;
	}

	private List<Integer> fillorder(List<Integer>[] g, boolean[] visited) {
		// TODO Auto-generated method stub
		int v= g.length;
		List<Integer> order = new ArrayList<>();

		for(int i=0; i< v; i++)
		{
			if(!visited [i])
			{
				DFS(g, i, visited, order);

			}
		}
		return order;
	}



}

/*
 * 
6
7
1 4
1 5
0 4
4 2
3 1
5 3
2 0


7
10
2 3
0 2
6 3
1 2
3 4
3 5
0 1
1 3
0 3
5 6

5
5
1 0
0 3
0 2
2 1
3 4
 */
