package Grafos;

public class MainListaDeAdjacencia {

	public static void main(String[] args) {

		ListaDeAdjacencia grafo = new ListaDeAdjacencia(3,false);
		
		grafo.adicionarAresta(0, 1);
		grafo.adicionarAresta(0, 2);
		grafo.adicionarAresta(1, 2);

		grafo.mostrarListaAdjacencia();
		
		grafo.removerAresta(0, 2);
		
		grafo.mostrarListaAdjacencia();
		
		// verificar se um vertice é adjacente ao outro
		// lista de um unico vertice
	}

}
