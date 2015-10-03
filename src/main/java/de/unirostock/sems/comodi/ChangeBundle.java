package de.unirostock.sems.comodi;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.output.ByteArrayOutputStream;
import org.apache.jena.ontology.OntModel;
import org.apache.jena.ontology.OntModelSpec;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;

import de.unirostock.sems.xmlutils.ds.DocumentNode;


/**
 * @author Martin Scharm
 *
 */
public class ChangeBundle
{
	private Model model;

	public static final String RDF_NS = "http://www.w3.org/1999/02/22-rdf-syntax-ns#";
	public static final String COMODI_NS = "http://purl.org/net/comodi#";
	public static String BAESE_URI;
	
	private List<Change> changes;
	
	public ChangeBundle (String baseUri)
	{
		BAESE_URI = baseUri;
		
		model = ModelFactory.createDefaultModel();//.createOntologyModel(OntModelSpec.OWL_MEM);
		
		model.setNsPrefix("comodi", COMODI_NS);
		model.setNsPrefix("rdf", RDF_NS);
		
		changes = new ArrayList<Change> ();
	}
	
	public Change createChange (DocumentNode node)
	{
		Change change = new Change (node, model);
		changes.add (change);
		return change;
	}
	
	public String getRdfXml ()
	{
		for (Change change : changes)
			model.add (change.getStatements ());
		
		ByteArrayOutputStream out = new ByteArrayOutputStream ();
		model.write (out, "RDF/XML-ABBREV");
		return out.toString ();
	}

	
	public void printTtl ()
	{
		for (Change change : changes)
			model.add (change.getStatements ());
		
		model.write (System.out, "TURTLE");
	}
	
	public void printXml ()
	{
		for (Change change : changes)
			model.add (change.getStatements ());
		
		model.write (System.out, "RDF/XML-ABBREV");
	}
}
