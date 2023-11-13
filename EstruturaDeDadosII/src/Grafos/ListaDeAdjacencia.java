package Grafos;
import java.util.*;

class Aresta{
	int origem, destino, peso;
	
	public Aresta(int origem, int destino, int peso){
		this.destino = destino;
		this.origem = origem;
		this.peso = peso;
	}
}


public class ListaDeAdjacencia {
	
	private int nVertices;
	private List<List<Aresta>> adjacencias;
	private boolean direcionado;
	
	public ListaDeAdjacencia(int nVertices, boolean direcionado) {
		this.nVertices = nVertices;
		this.direcionado = direcionado;
		this.adjacencias = new ArrayList<>(nVertices);
		for(int i = 0; i<nVertices;i++) {
			adjacencias.add(new ArrayList<Aresta>());
		}
	}
	
	public void adicionarAresta(int u, int v, int peso) {
		Aresta aresta = new Aresta(u,v,peso);
		adjacencias.get(u).add(aresta);
		if(!direcionado) {
			Aresta arestaInvertida = new Aresta(v,u,peso);
			adjacencias.get(v).add(arestaInvertida);
		}
		
	}
	
	public void adicionarAresta(int u, int v) {
		adicionarAresta(u,v,1);
	}
	
	public void mostrarListaAdjacencia() {
		for(int i = 0;i < nVertices;i++) {
			System.out.print("Vertice "+i+": ");
			for(Aresta aresta: adjacencias.get(i)) {
				System.out.print("["+aresta.destino+" Peso: "+aresta.peso+"]");
			}
			System.out.println();
		}
	}
	
	public void removerAresta(int u, int v) {
		List<Aresta> arestasU = adjacencias.get(u);
		for(Aresta aresta : arestasU) {
			if(aresta.destino == v) {
				arestasU.remove(aresta);
				break;
			}
		}
		if(!direcionado) {
			List<Aresta> arestasV = adjacencias.get(v);
			for(Aresta aresta: arestasV) {
				if(aresta.destino == u) {
					arestasV.remove(aresta);
					break;
				}
			}
		}
		
	}
	
	public boolean xAdjacenteY(int u,int v) {
		for(Aresta aresta: adjacencias.get(u)) {
			if(aresta.destino == v) {
				return true;
			}
		}
		return false;
	}
	
	public void mostrarUnicoVertice(int v) {
		System.out.print("Vertice: "+v);
			for(Aresta aresta: adjacencias.get(v)) {
				System.out.print("["+aresta.destino+" Peso: "+aresta.peso+"]");
			}
			System.out.println();
	}
}
