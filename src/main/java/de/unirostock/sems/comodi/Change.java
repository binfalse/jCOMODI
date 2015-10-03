/**
 * 
 */
package de.unirostock.sems.comodi;

import java.util.ArrayList;
import java.util.List;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.Statement;

import de.unirostock.sems.comodi.branches.ComodiChangeType;
import de.unirostock.sems.comodi.branches.ComodiEntity;
import de.unirostock.sems.comodi.branches.ComodiIntention;
import de.unirostock.sems.comodi.branches.ComodiReason;
import de.unirostock.sems.comodi.branches.ComodiTarget;
import de.unirostock.sems.xmlutils.ds.DocumentNode;


/**
 * @author Martin Scharm
 *
 */
public class Change
{
	private Resource subject;
	private Model model;
	private List<Statement> statements;
	
	
	public Change (DocumentNode node, Model model)
	{
		this.model = model;
		this.subject = model.createResource (ChangeBundle.BAESE_URI + "#" + node.getId ());
		this.statements = new ArrayList<Statement> ();
		this.statements.add (model.createStatement (this.subject,
			model.createProperty (ChangeBundle.RDF_NS, "type"),
			model.createResource (ChangeBundle.COMODI_NS + "Change")));
	}
	
	public List<Statement> getStatements ()
	{
		return statements;
	}
	
	public Change appliedTo (ComodiEntity entity)
	{
		statements.add (model.createStatement (this.subject,
			model.createProperty (ChangeBundle.COMODI_NS, "appliedTo"),
			model.createResource (ChangeBundle.COMODI_NS + entity.getTerm ())));
		return this;
	}
	
	public Change intended (ComodiIntention intention)
	{
		statements.add (model.createStatement (this.subject,
			model.createProperty (ChangeBundle.COMODI_NS, "intended"),
			model.createResource (ChangeBundle.COMODI_NS + intention.getTerm ())));
		return this;
	}
	
	public Change hadReason (ComodiReason reason)
	{
		statements.add (model.createStatement (this.subject,
			model.createProperty (ChangeBundle.COMODI_NS, "hadReason"),
			model.createResource (ChangeBundle.COMODI_NS + reason.getTerm ())));
		return this;
	}
	
	public Change changeType (ComodiChangeType changeType)
	{
		statements.add (model.createStatement (this.subject,
			model.createProperty (ChangeBundle.COMODI_NS, "changeType"),
			model.createResource (ChangeBundle.COMODI_NS + changeType.getTerm ())));
		return this;
	}
	
	public Change affected (ComodiTarget target)
	{
		statements.add (model.createStatement (this.subject,
			model.createProperty (ChangeBundle.COMODI_NS, "affected"),
			model.createResource (ChangeBundle.COMODI_NS + target.getTerm ())));
		return this;
	}
	
	
	
	
}
