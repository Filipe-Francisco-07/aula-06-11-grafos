package Grafos;

public class MainMatrizDeAdjacencia {

	public static void main(String[] args) {
		int numVertices = 3;
		MatrizDeAdjacencia grafo = new MatrizDeAdjacencia(numVertices,false,false);
		
		grafo.inserirAresta(0, 1);
		grafo.inserirAresta(0, 2);
		grafo.inserirAresta(1, 2);
		
		grafo.mostrarMatrizDeAdjacencia();
		
		MatrizDeAdjacencia grafo2 = new MatrizDeAdjacencia(numVertices,true,true);
		
		System.out.print("\n");

		grafo2.inserirAresta(0, 1,3);
		grafo2.inserirAresta(1,2,5);
		grafo2.inserirAresta(2,0,1);
		
		grafo2.mostrarMatrizDeAdjacencia();
		
		if(grafo2.verVerticesAdjacentes(0, 1)) {
			System.out.println("é adjacente");
		}else {
			System.out.println("Nao é adjacente");
		}
	}

}
