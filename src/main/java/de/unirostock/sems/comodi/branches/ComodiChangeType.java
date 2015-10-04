/**
 * 
 */
package de.unirostock.sems.comodi.branches;

import de.unirostock.sems.comodi.ComodiBranchTerm;


/**
 * @author Martin Scharm
 *
 */
public class ComodiChangeType
	extends ComodiBranchTerm
{
	protected ComodiChangeType (String term)
	{
		super (term);
	}
	
	public static ComodiChangeType getDeletion()
	{
		return new ComodiChangeType ("Deletion");
	}
	
	public static ComodiChangeType getUpdate()
	{
		return new ComodiChangeType ("Update");
	}
	
	public static ComodiChangeType getAttributeValue()
	{
		return new ComodiChangeType ("AttributeValue");
	}
	
	public static ComodiChangeType getMove()
	{
		return new ComodiChangeType ("Move");
	}
	
	public static ComodiChangeType getInsertion()
	{
		return new ComodiChangeType ("Insertion");
	}
	
	public static ComodiChangeType getTriggered ()
	{
		return new ComodiChangeType ("Triggered");
	}
	
}
