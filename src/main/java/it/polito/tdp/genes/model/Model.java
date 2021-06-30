package it.polito.tdp.genes.model;

import java.util.List;
import java.util.Map;

import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultWeightedEdge;

public class Model {
	
	private List<Genes> essentialGenes;
	private Map<String, Genes> essentialGenesIdMap;

	private Graph<Genes, DefaultWeightedEdge> grafo;

	
	
	
}
