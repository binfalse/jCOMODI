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
 * 
 * <p>
 * A new change can be obtained by calling one of the methods
 * <ul>
 * <li>{@link #createInsertion(String)}</li>
 * <li>{@link #createDeletion(String)}</li>
 * <li>{@link #createMove(String)}</li>
 * <li>{@link #createUpdate(String)}</li>
 * <li>{@link #createPermutationOfEntities(String)}</li>
 * </ul>
 * providing the id of the subject(-node) encoding for the differences.
 * 
 * <p>
 * If you do not have any information of the type of change, you can also call
 * the {@link #createChange(String)} method to semantically just say it's a
 * change..
 * 
 * <p>
 * The annotations can be obtained using {@link #getAnnotaions()} (as
 * Apache/Jena RDF model), {@link #getRdfXml()} (encoded in RDF/XML),
 * {@link #printTtl()} (printed to sysout in TURTLE format), or
 * {@link #printXml()} (printed to sysout in RDF/XML format).
 * 
 * @author Martin Scharm
 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#Change">The Change
 *      class and it's sub classes</a>
 */
public class ChangeFactory
{
	
	/** The Apache/Jena RDF model. */
	private Model								model;
	
	/** The RDF namespace. */
	public static final String	RDF_NS		= "http://www.w3.org/1999/02/22-rdf-syntax-ns#";
	
	/** The RDF schema namespace. */
	public static final String	RDFS_NS		= "http://www.w3.org/2000/01/rdf-schema#";
	
	/** The namespace of COMODI. */
	public static final String	COMODI_NS	= "http://purl.org/net/comodi#";
	
	/** The PROV namespace. */
	public static final String	PROV_NS		= "http://www.w3.org/ns/prov#";
	
	/** The PAV namespace. */
	public static final String	PAV_NS		= "http://purl.org/pav/";
	
	/** The friend-of-a-friend namespace. */
	public static final String	FOAF_NS		= "http://xmlns.com/foaf/0.1/";
	
	/**
	 * The Open Archives Initiative Object Reuse and Exchange (OAI-ORE) namespace.
	 */
	public static final String	ORE_NS		= "http://www.openarchives.org/ore/terms/";
	
	/** The URI of the file containing the changes we'll be talking about. */
	private URI									baseUri;
	
	/** The list of changes. */
	private List<Change>				changes;
	
	
	/**
	 * The Constructor specifying the base URI of the file containing the changes.
	 * 
	 * @param baseUri
	 *          the URI of the file containing the changes we'll be talking about
	 */
	public ChangeFactory (URI baseUri)
	{
		this.baseUri = baseUri;
		
		model = ModelFactory.createDefaultModel ();// .createOntologyModel(OntModelSpec.OWL_MEM);
		
		model.setNsPrefix ("comodi", COMODI_NS);
		model.setNsPrefix ("rdf", RDF_NS);
		model.setNsPrefix ("rdfs", RDFS_NS);
		model.setNsPrefix ("foaf", FOAF_NS);
		model.setNsPrefix ("prov", PROV_NS);
		model.setNsPrefix ("pav", PAV_NS);
		model.setNsPrefix ("ore", ORE_NS);
		
		changes = new ArrayList<Change> ();
	}
	
	
	/**
	 * Gets the base URI for entities in this patch.
	 * 
	 * @return the base URI
	 */
	public URI getBaseUri ()
	{
		return baseUri;
	}
	
	
	/**
	 * Gets all registered changes.
	 * 
	 * @return the changes
	 */
	public List<Change> getChanges ()
	{
		return changes;
	}
	
	
	/**
	 * Gets the number of overall statements in all changes produced by this
	 * change factory.
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
	 * Creates a change encoded the subject with <code>subjectId</code>.
	 * Calling this method means you have no more information about the type of
	 * that change. Otherwise you should call on of the methods
	 * <ul>
	 * <li>{@link #createInsertion(String)}</li>
	 * <li>{@link #createDeletion(String)}</li>
	 * <li>{@link #createMove(String)}</li>
	 * <li>{@link #createUpdate(String)}</li>
	 * <li>{@link #createPermutationOfEntities(String)}</li>
	 * </ul>
	 * 
	 * See {@link #getSubjectId(Element)} and {@link #getSubjectId(DocumentNode)}
	 * to conveniently obtain the subjectId of JDOM2 Elements and DocumentNodes.
	 * 
	 * @param subjectId
	 *          the id of the subject, ie. the change
	 * @return the change
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#Change">The Change
	 *      class and it's sub classes</a>
	 */
	public Change createChange (String subjectId)
	{
		return createChange (subjectId, "Change");
	}
	
	
	/**
	 * Gets the subject id of an Element.
	 * 
	 * The subject id if will effectively be the element's <code>id</code>
	 * attribute value.
	 * That means, this node is supposed to have an <code>id</code> attribute.
	 * 
	 * @param node
	 *          the document node
	 * @return the subject id
	 * @see org.jdom2.Element
	 */
	public static String getSubjectId (Element node)
	{
		return node.getAttributeValue ("id");
	}
	
	
	/**
	 * Gets the subject id of a DocumentNode.
	 * 
	 * The subject id if will effectively be the node's <code>getId()</code>.
	 * That means, this node is supposed to have an <code>id</code> attribute.
	 * 
	 * @param node
	 *          the document node
	 * @return the subject id
	 * @see de.unirostock.sems.xmlutils.ds.DocumentNode
	 */
	public static String getSubjectId (DocumentNode node)
	{
		return node.getId ();
	}
	
	
	/**
	 * Creates a new Change object for a subject. This change will be of type
	 * <code>type</code>
	 * 
	 * @param subjectId
	 *          the subject id
	 * @param type
	 *          the type
	 * @return the change
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#Change">The Change
	 *      class and it's sub classes</a>
	 */
	protected Change createChange (String subjectId, String type)
	{
		Change change = new Change (subjectId, model, baseUri, type);
		changes.add (change);
		return change;
	}
	
	
	/**
	 * Creates a insertion encoded the subject with <code>subjectId</code>.
	 * See {@link #getSubjectId(Element)} and {@link #getSubjectId(DocumentNode)}
	 * to conveniently obtain the subjectId of JDOM2 Elements and DocumentNodes.
	 * 
	 * @param subjectId
	 *          the id of the subject, ie. the change
	 * @return the change
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#Change">The Change
	 *      class and it's sub classes</a>
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#Insertion">The
	 *      Insertion class</a>
	 */
	public Change createInsertion (String subjectId)
	{
		return createChange (subjectId, "Insertion");
	}
	
	
	/**
	 * Creates a deletion encoded the subject with <code>subjectId</code>.
	 * See {@link #getSubjectId(Element)} and {@link #getSubjectId(DocumentNode)}
	 * to conveniently obtain the subjectId of JDOM2 Elements and DocumentNodes.
	 * 
	 * @param subjectId
	 *          the id of the subject, ie. the change
	 * @return the change
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#Change">The Change
	 *      class and it's sub classes</a>
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#Deletion">The
	 *      Deletion class</a>
	 */
	public Change createDeletion (String subjectId)
	{
		return createChange (subjectId, "Deletion");
	}
	
	
	/**
	 * Creates a update encoded the subject with <code>subjectId</code>.
	 * See {@link #getSubjectId(Element)} and {@link #getSubjectId(DocumentNode)}
	 * to conveniently obtain the subjectId of JDOM2 Elements and DocumentNodes.
	 * 
	 * @param subjectId
	 *          the id of the subject, ie. the change
	 * @return the change
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#Change">The Change
	 *      class and it's sub classes</a>
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#Update">The Update
	 *      class</a>
	 */
	public Change createUpdate (String subjectId)
	{
		return createChange (subjectId, "Update");
	}
	
	
	/**
	 * Creates a move encoded the subject with <code>subjectId</code>.
	 * See {@link #getSubjectId(Element)} and {@link #getSubjectId(DocumentNode)}
	 * to conveniently obtain the subjectId of JDOM2 Elements and DocumentNodes.
	 * 
	 * @param subjectId
	 *          the id of the subject, ie. the change
	 * @return the change
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#Change">The Change
	 *      class and it's sub classes</a>
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#Move">The Move
	 *      class</a>
	 */
	public Change createMove (String subjectId)
	{
		return createChange (subjectId, "Move");
	}
	
	
	/**
	 * Creates a permutation of entities (move) encoded the subject with
	 * <code>subjectId</code>.
	 * See {@link #getSubjectId(Element)} and {@link #getSubjectId(DocumentNode)}
	 * to conveniently obtain the subjectId of JDOM2 Elements and DocumentNodes.
	 * 
	 * @param subjectId
	 *          the id of the subject, ie. the change
	 * @return the change
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#Change">The Change
	 *      class and it's sub classes</a>
	 * @see <a
	 *      href="http://purl.uni-rostock.de/comodi/comodi#PermutationOfEntities">The
	 *      PermutationOfEntities class</a>
	 */
	public Change createPermutationOfEntities (String subjectId)
	{
		return createChange (subjectId, "PermutationOfEntities");
	}
	
	
	/**
	 * Compiles the assembled changes in an RDF/XML string.
	 * 
	 * @return the RDF/XML string
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
	 * Gets the annotations.
	 * 
	 * @return the annotations
	 */
	public Model getAnnotaions ()
	{
		for (Change change : changes)
			model.add (change.getStatements ());
		
		return model;
	}
	
	
	/**
	 * Prints the TURTLE serialisation to sysout. Basically for debugging
	 * purposes.
	 */
	public void printTtl ()
	{
		for (Change change : changes)
			model.add (change.getStatements ());
		
		model.write (System.out, "TURTLE");
	}
	
	
	/**
	 * Prints the RDF/XML serialisation to sysout. Basically for debugging
	 * purposes.
	 */
	public void printXml ()
	{
		for (Change change : changes)
			model.add (change.getStatements ());
		
		model.write (System.out, "RDF/XML-ABBREV");
	}
}
