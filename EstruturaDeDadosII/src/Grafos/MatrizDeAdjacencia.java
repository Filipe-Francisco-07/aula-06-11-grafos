package Grafos;

public class MatrizDeAdjacencia {
		private int [][] G;
		private int numVertices;
		private boolean ponderado, direcionado;
		
		public MatrizDeAdjacencia(int numVertices, boolean ponderado, boolean direcionado) {
			this.numVertices = numVertices;
			this.ponderado = ponderado;
			this.direcionado = direcionado;
			G = new int [numVertices][numVertices];
		}
		
		public void inserirAresta(int vertice1, int vertice2) {
			if(!ponderado) {
				G[vertice1][vertice2] = 1;
				if(!direcionado) {
					G[vertice2][vertice1] = 1;
				}
			}else {
				System.out.println("Grafo ponderado. Necessita peso na aresta.");
			}
		}
		
		public void inserirAresta(int vertice1, int vertice2, int peso) {
			if(ponderado) {
				G[vertice1][vertice2] = peso;
				if(!direcionado) {
					G[vertice2][vertice1] = peso;
				}
			}else {
				System.out.println("Grafo nao ponderado. Nao existe peso na aresta.");
			}
		}
		

		public void removerAresta(int vertice1, int vertice2) {
				G[vertice1][vertice2] = 0;
				if(!direcionado) {
					G[vertice2][vertice1] = 0;
				}
		}
		

		public void mostrarMatrizDeAdjacencia() {
				for(int i = 0; i<numVertices; i++) {
					for(int j = 0; j<numVertices; j++) {
						System.out.print(G[i][j]+" ");
					}
					System.out.println();
				}
		}
		
		public boolean verVerticesAdjacentes(int vertice1, int vertice2) {
			if(G[vertice1][vertice2] == 0)
				return false;
			else
				return true;
		}

}
