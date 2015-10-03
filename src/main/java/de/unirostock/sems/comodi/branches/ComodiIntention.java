/**
 * 
 */
package de.unirostock.sems.comodi.branches;

import de.unirostock.sems.comodi.ComodiBranchTerm;


/**
 * @author Martin Scharm
 *
 */
public class ComodiIntention
	extends ComodiBranchTerm
{
	protected ComodiIntention (String term)
	{
		super (term);
	}
	
	public static ComodiIntention getCorrection ()
	{
		return new ComodiIntention ("Correction");
	}
	
	public static ComodiIntention getExtension ()
	{
		return new ComodiIntention ("Extension");
	}
	
	public static ComodiIntention getSimplification ()
	{
		return new ComodiIntention ("Simplification");
	}
	
}
