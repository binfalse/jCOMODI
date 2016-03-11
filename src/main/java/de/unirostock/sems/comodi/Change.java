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

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.RDFNode;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.Statement;

import de.unirostock.sems.comodi.branches.ComodiIntention;
import de.unirostock.sems.comodi.branches.ComodiReason;
import de.unirostock.sems.comodi.branches.ComodiTarget;
import de.unirostock.sems.comodi.branches.ComodiXmlEntity;



/**
 * The Class Change representing the Change concept in COMODI.
 * Every change may
 * <ul>
 * <li>be applied to a {@link ComodiXmlEntity}, see
 * {@link #appliesTo(ComodiXmlEntity)}
 * <li>affect a {@link ComodiTarget}, see {@link #affects(ComodiTarget)}
 * <li>intent a {@link ComodiIntention}, see
 * {@link #hasIntention(ComodiIntention)}
 * <li>be because of a {@link ComodiReason}, see
 * {@link #hasReason(ComodiReason)}
 * <li>be triggered by another a {@link Change}, see
 * {@link #wasTriggeredBy(String)}
 * </ul>
 * 
 * @author Martin Scharm
 */
public class Change
{
	
	/** The current change is our subject in all RDF statements. */
	private Resource				subject;
	
	/** The Apache/Jena RDF model. */
	private Model						model;
	
	/** The RDF statements about this change. */
	private List<Statement>	statements;
	
	/** The base URI of the elements we're talking about. */
	private URI							baseUri;
	
	
	/**
	 * Instantiates a new change.
	 * <strong>You should never need to call this constructor on your
	 * own!</strong>
	 * Instead, instantiate a {@link de.unirostock.sems.comodi.ChangeFactory} to
	 * create Insertions, Deletions, Moves, Updates, etc.
	 * 
	 * @param subjectId
	 *          the id of the subject(-node) encoding for the change
	 * @param model
	 *          the RDF model
	 *          the base URI of the elements we're talking about
	 * @param baseUri 
	 *          the base URI of the elements we're talking about
	 * @param type
	 *          the change type (insertion, deletion, etc)
	 */
	public Change (String subjectId, Model model, URI baseUri, String type)
	{
		init (subjectId, model, baseUri, type);
	}
	
	
	/**
	 * Initialises this change.
	 * 
	 * @param nodeId
	 *          the id of the node encoding for the change
	 * @param model
	 *          the RDF model
	 * @param baseUri
	 *          the base URI of the elements we're talking about
	 */
	private void init (String nodeId, Model model, URI baseUri, String type)
	{
		this.baseUri = baseUri;
		this.model = model;
		this.subject = model.createResource (baseUri.toString () + "#" + nodeId);
		this.statements = new ArrayList<Statement> ();
		this.statements.add (model.createStatement (this.subject,
			model.createProperty (ChangeFactory.RDF_NS, "type"),
			model.createResource (ChangeFactory.COMODI_NS + type)));
	}
	
	
	/**
	 * Gets the change as an RDF resource. Might be useful if you want to use it
	 * in other annotations.
	 * 
	 * @return the change as resource
	 */
	public Resource getChangeAsResource ()
	{
		return subject;
	}
	
	
	/**
	 * Gets the RDF statements about this change.
	 * 
	 * @return the statements
	 */
	public List<Statement> getStatements ()
	{
		return statements;
	}
	
	
	/**
	 * Adds information about the XML entity that this change was applied to.
	 * 
	 * @param entity
	 *          the type of XML entity
	 * @return this change
	 */
	public Change appliesTo (ComodiXmlEntity entity)
	{
		statements.add (model.createStatement (this.subject,
			model.createProperty (ChangeFactory.COMODI_NS, "appliesTo"),
			model.createResource (ChangeFactory.COMODI_NS + entity.getTerm ())));
		return this;
	}
	
	
	/**
	 * Adds information about the intention of this change.
	 * 
	 * @param intention
	 *          the intention
	 * @return this change
	 */
	public Change hasIntention (ComodiIntention intention)
	{
		statements.add (model.createStatement (this.subject,
			model.createProperty (ChangeFactory.COMODI_NS, "hasIntention"),
			model.createResource (ChangeFactory.COMODI_NS + intention.getTerm ())));
		return this;
	}
	
	
	/**
	 * Adds information about the reason of this change.
	 * 
	 * @param reason
	 *          the reason
	 * @return this change
	 */
	public Change hasReason (ComodiReason reason)
	{
		statements.add (model.createStatement (this.subject,
			model.createProperty (ChangeFactory.COMODI_NS, "hasReason"),
			model.createResource (ChangeFactory.COMODI_NS + reason.getTerm ())));
		return this;
	}
	
	
	/**
	 * Adds information about the target that is affected by this change.
	 * 
	 * @param target
	 *          the target
	 * @return this change
	 */
	public Change affects (ComodiTarget target)
	{
		statements.add (model.createStatement (this.subject,
			model.createProperty (ChangeFactory.COMODI_NS, "affects"),
			model.createResource (ChangeFactory.COMODI_NS + target.getTerm ())));
		return this;
	}
	
	
	/**
	 * Links to a change that triggered this change.
	 * 
	 * @param nodeId
	 *          the id of the node that triggered this change
	 * @return this change
	 */
	public Change wasTriggeredBy (String nodeId)
	{
		statements.add (model.createStatement (this.subject,
			model.createProperty (ChangeFactory.COMODI_NS, "wasTriggeredBy"),
			model.createResource (baseUri.toString () + "#" + nodeId)));
		return this;
	}
	
	
	/**
	 * Adds another custom annotation describing this change.
	 * 
	 * @param predicate
	 *          the predicate
	 * @param object
	 *          the object
	 * @return this change
	 */
	public Change addAnnotation (Property predicate, RDFNode object)
	{
		statements.add (model.createStatement (this.subject, predicate, object));
		return this;
	}
	
}
