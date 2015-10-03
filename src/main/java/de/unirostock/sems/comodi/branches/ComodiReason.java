/**
 * 
 */
package de.unirostock.sems.comodi.branches;

import de.unirostock.sems.comodi.ComodiBranchTerm;


/**
 * @author Martin Scharm
 *
 */
public class ComodiReason
	extends ComodiBranchTerm
{
	protected ComodiReason (String term)
	{
		super (term);
	}
	
	public static ComodiReason getTypo()
	{
		return new ComodiReason ("Typo");
	}
	
	public static ComodiReason getKnowledgeGain()
	{
		return new ComodiReason ("KnowledgeGain");
	}
	
	public static ComodiReason getMismatchWithPublication()
	{
		return new ComodiReason ("MismatchWithPublication");
	}
	
	public static ComodiReason getModelCuration()
	{
		return new ComodiReason ("ModelCuration");
	}
	
}
