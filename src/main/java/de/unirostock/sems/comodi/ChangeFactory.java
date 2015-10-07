/**
 * This file is part of jCOMODI - a library for the COMODI ontology.
 * Copyright (c) 2015, Martin Scharm <jcomodi-code@binfalse.de>
 * 
 * jCOMODI is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as 
 * published by the Free Software Foundation, either version 3 of
 * the License, or (at your option) any later version.
 * 
 * jCOMODI is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with jCOMODI. If not, see <http://www.gnu.org/licenses/>.
 * 
 * @see <a href="http://purl.org/net/comodi">COMODI</a>
 */
package de.unirostock.sems.comodi;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.output.ByteArrayOutputStream;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.jdom2.Element;

import de.unirostock.sems.xmlutils.ds.DocumentNode;


/**
 * The Class ChangeFactory creating and storing changes.
 * A new change can be obtained by calling {@link #createChange(Element)} or {@link #createChange(DocumentNode)}.
 * The annotations can be obtained using 
 * {@link #getAnnotaions()} (as Apache/Jena RDF model), 
 * {@link #getRdfXml()} (encoded in RDF/XML), 
 * {@link #printTtl()} (printed to sysout in TURTLE format), or 
 * {@link #printXml()} (printed to sysout in RDF/XML format).
 *
 * @author Martin Scharm
 */
public class ChangeFactory
{
	
	/** The Apache/Jena RDF model. */
	private Model model;

	/** The RDF namespace. */
	public static final String RDF_NS = "http://www.w3.org/1999/02/22-rdf-syntax-ns#";
	
	/** The namespace of COMODI. */
	public static final String COMODI_NS = "http://purl.org/net/comodi#";
	
	/** The URI of the file containing the changes we'll be talking about. */
	private URI baseUri;
	
	/** The list of changes. */
	private List<Change> changes;
	
	/**
	 * The Constructor specifying the base URI of the file containing the changes.
	 *
	 * @param baseUri the URI of the file containing the changes we'll be talking about
	 */
	public ChangeFactory (URI baseUri)
	{
		this.baseUri = baseUri;
		
		model = ModelFactory.createDefaultModel();//.createOntologyModel(OntModelSpec.OWL_MEM);
		
		model.setNsPrefix("comodi", COMODI_NS);
		model.setNsPrefix("rdf", RDF_NS);
		
		changes = new ArrayList<Change> ();
	}
	
	/**
	 * Gets the number of overall statements in all changes produced by this change factory.
	 *
	 * @return the number statements
	 */
	public int getNumStatements ()
	{
		int i = 0;
		for (Change change : changes)
			i += change.getStatements ().size ();
		return i;
	}
	
	/**
	 * Gets the number changes produced by this factory.
	 *
	 * @return the number changes
	 */
	public int getNumChanges ()
	{
		return changes.size ();
	}
	
	/**
	 * Creates a change encoded in the JDOM element <code>node</code>.
	 * <code>node</code> is supposed to have an <code>id</code> attribute.
	 *
	 * @param node the node encoding for the change
	 * @return the change
	 */
	public Change createChange (Element node)
	{
		Change change = new Change (node, model, baseUri);
		changes.add (change);
		return change;
	}
	
	/**
	 * Creates a change encoded in the {@link de.unirostock.sems.xmlutils.ds.DocumentNode DocumentNode} element <code>node</code>.
	 * <code>node</code> is supposed to have an id-attribute.
	 *
	 * @param node the node encoding for the change
	 * @return the change
	 * @see de.unirostock.sems.xmlutils.ds.DocumentNode DocumentNode
	 */
	public Change createChange (DocumentNode node)
	{
		Change change = new Change (node, model, baseUri);
		changes.add (change);
		return change;
	}
	
	/**
	 * Gets the rdf xml.
	 *
	 * @return the rdf xml
	 */
	public String getRdfXml ()
	{
		for (Change change : changes)
			model.add (change.getStatements ());
		
		ByteArrayOutputStream out = new ByteArrayOutputStream ();
		model.write (out, "RDF/XML-ABBREV");
		return out.toString ();
	}
	
	/**
	 * Gets the annotaions.
	 *
	 * @return the annotaions
	 */
	public Model getAnnotaions ()
	{
		for (Change change : changes)
			model.add (change.getStatements ());
		
		return model;
	}

	
	/**
	 * Prints the ttl.
	 */
	public void printTtl ()
	{
		for (Change change : changes)
			model.add (change.getStatements ());
		
		model.write (System.out, "TURTLE");
	}
	
	/**
	 * Prints the xml.
	 */
	public void printXml ()
	{
		for (Change change : changes)
			model.add (change.getStatements ());
		
		model.write (System.out, "RDF/XML-ABBREV");
	}
}
