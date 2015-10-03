/**
 * 
 */
package de.unirostock.sems.comodi;


/**
 * @author Martin Scharm
 *
 */
public abstract class ComodiBranchTerm
{
	private String term;
	
	protected ComodiBranchTerm (String term)
	{
		this.term = term;
	}
	
	public String getTerm ()
	{
		return term;
	}
	
}
