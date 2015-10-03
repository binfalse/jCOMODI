/**
 * 
 */
package de.unirostock.sems.comodi.branches;

import de.unirostock.sems.comodi.ComodiBranchTerm;


/**
 * @author Martin Scharm
 *
 */
public class ComodiEntity
extends ComodiBranchTerm
{
	protected ComodiEntity (String term)
	{
		super (term);
	}
	
	public static ComodiEntity getNode ()
	{
		return new ComodiEntity ("Node");
	}
	
	public static ComodiEntity getAttribute ()
	{
		return new ComodiEntity ("Attribute");
	}
	
	public static ComodiEntity getEntityIdentifier ()
	{
		return new ComodiEntity ("EntityIdentifier");
	}
	
	public static ComodiEntity getModelId ()
	{
		return new ComodiEntity ("ModelId");
	}
	
	public static ComodiEntity getEntityName ()
	{
		return new ComodiEntity ("EntityName");
	}
	
	public static ComodiEntity getModelName ()
	{
		return new ComodiEntity ("ModelName");
	}
	
	public static ComodiEntity getText ()
	{
		return new ComodiEntity ("Text");
	}
}
