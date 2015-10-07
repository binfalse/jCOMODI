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
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.Statement;
import org.jdom2.Element;

import de.unirostock.sems.comodi.branches.ComodiChangeType;
import de.unirostock.sems.comodi.branches.ComodiXmlEntity;
import de.unirostock.sems.comodi.branches.ComodiIntention;
import de.unirostock.sems.comodi.branches.ComodiReason;
import de.unirostock.sems.comodi.branches.ComodiTarget;
import de.unirostock.sems.xmlutils.ds.DocumentNode;


/**
 * The Class Change representing the Change concept in COMODI.
 * Every change may
 * <ul>
 * <li>be applied to a {@link ComodiXmlEntity}, see {@link #appliedTo(ComodiXmlEntity)} 
 * <li>affect a {@link ComodiTarget}, see {@link #affected(ComodiTarget)}
 * <li>intent a {@link ComodiIntention}, see {@link #intended(ComodiIntention)}
 * <li>be because of a {@link ComodiReason}, see {@link #hadReason(ComodiReason)}
 * <li>be of type a {@link ComodiChangeType}, see {@link #changeType(ComodiChangeType)}
 * <li>be triggered by another a {@link Change}, see {@link #triggeredBy(String)}
 * </ul>
 * 
 * @author Martin Scharm
 */
public class Change
{
	
	/** The current change is our subject in all RDF statements. */
	private Resource subject;
	
	/** The Apache/Jena RDF model. */
	private Model model;
	
	/** The RDF statements about this change. */
	private List<Statement> statements;
	
	/** The base URI of the elements we're talking about. */
	private URI baseUri;
	
	
	/**
	 * The Constructor specifying the node in the delta and the Apache/Jena RDF model.
	 * The node <code>node</code> is supposed to have an <code>id</code> attribute.
	 *
	 * @param node the node encoding for the differences
	 * @param model the RDF model
	 * @param baseUri the base URI of the elements we're talking about
	 */
	public Change (Element node, Model model, URI baseUri)
	{
		init (node.getAttributeValue ("id"), model, baseUri);
	}
	
	
	/**
	 * The Constructor specifying the node in the delta and the Apache/Jena RDF model.
	 * The node <code>node</code> is supposed to have an id-attribute.
	 *
	 * @param node the node encoding for the differences
	 * @param model the RDF model
	 * @param baseUri the base URI of the elements we're talking about
	 */
	public Change (DocumentNode node, Model model, URI baseUri)
	{
		init (node.getId (), model, baseUri);
	}
	
	/**
	 * Initialises this change.
	 *
	 * @param nodeId the node id
	 * @param model the model
	 * @param baseUri the base URI of the elements we're talking about
	 */
	private void init (String nodeId, Model model, URI baseUri)
	{
		this.model = model;
		this.subject = model.createResource (baseUri.toString () + "#" + nodeId);
		this.statements = new ArrayList<Statement> ();
		this.statements.add (model.createStatement (this.subject,
			model.createProperty (ChangeFactory.RDF_NS, "type"),
			model.createResource (ChangeFactory.COMODI_NS + "Change")));
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
	 * @param entity the type of XML entity
	 * @return this change
	 */
	public Change appliedTo (ComodiXmlEntity entity)
	{
		statements.add (model.createStatement (this.subject,
			model.createProperty (ChangeFactory.COMODI_NS, "appliedTo"),
			model.createResource (ChangeFactory.COMODI_NS + entity.getTerm ())));
		return this;
	}
	
	/**
	 * Adds information about the intention of this change.
	 *
	 * @param intention the intention
	 * @return this change
	 */
	public Change intended (ComodiIntention intention)
	{
		statements.add (model.createStatement (this.subject,
			model.createProperty (ChangeFactory.COMODI_NS, "intended"),
			model.createResource (ChangeFactory.COMODI_NS + intention.getTerm ())));
		return this;
	}
	
	/**
	 * Adds information about the reason of this change.
	 *
	 * @param reason the reason
	 * @return this change
	 */
	public Change hadReason (ComodiReason reason)
	{
		statements.add (model.createStatement (this.subject,
			model.createProperty (ChangeFactory.COMODI_NS, "hadReason"),
			model.createResource (ChangeFactory.COMODI_NS + reason.getTerm ())));
		return this;
	}
	
	/**
	 * Adds information about the type of this change.
	 *
	 * @param changeType the change type
	 * @return this change
	 */
	public Change changeType (ComodiChangeType changeType)
	{
		statements.add (model.createStatement (this.subject,
			model.createProperty (ChangeFactory.COMODI_NS, "changeType"),
			model.createResource (ChangeFactory.COMODI_NS + changeType.getTerm ())));
		return this;
	}
	
	/**
	 * Adds information about the target that is affected by this change.
	 *
	 * @param target the target
	 * @return this change
	 */
	public Change affected (ComodiTarget target)
	{
		statements.add (model.createStatement (this.subject,
			model.createProperty (ChangeFactory.COMODI_NS, "affected"),
			model.createResource (ChangeFactory.COMODI_NS + target.getTerm ())));
		return this;
	}
	

	
	/**
	 * Links to a change that triggered this change.
	 *
	 * @param nodeId the id of the node that triggered this change
	 * @return this change
	 */
	public Change triggeredBy (String nodeId)
	{
		statements.add (model.createStatement (this.subject,
			model.createProperty (ChangeFactory.COMODI_NS, "triggeredBy"),
			model.createResource (baseUri.toString () + "#" + nodeId)));
		return this;
	}
	
	
}
