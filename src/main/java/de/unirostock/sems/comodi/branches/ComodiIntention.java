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
 * @see <a href="http://purl.uni-rostock.de/comodi/">COMODI</a>
 */
package de.unirostock.sems.comodi.branches;

import de.unirostock.sems.comodi.ComodiBranchTerm;



/**
 * The Class ComodiIntention creating terms of COMODI's Intention branch.
 * 
 * @author Martin Scharm
 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#Intention">Intention definition</a>
 */
public class ComodiIntention
	extends ComodiBranchTerm
{
	
	/**
	 * The Constructor -- just to call the constructor of the super class.
	 * 
	 * @param term
	 *          the term
	 */
	protected ComodiIntention (String term)
	{
		super (term);
	}
	
	
	/**
	 * Gets the term representing a correction.
	 * 
	 * <pre>
	 * Correction -&gt; Intention
	 * </pre>
	 * 
	 * @return the correction term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#Correction">term definition</a>
	 */
	public static ComodiIntention getCorrection ()
	{
		return new ComodiIntention ("Correction");
	}
	
	
	/**
	 * Gets the term representing an expansion.
	 * 
	 * <pre>
	 * Expansion -&gt; Intention
	 * </pre>
	 * 
	 * @return the extension term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#Expansion">term definition</a>
	 */
	public static ComodiIntention getExpansion ()
	{
		return new ComodiIntention ("Expansion");
	}
	
	
	/**
	 * Gets the term representing a merge.
	 * 
	 * <pre>
	 * Merge -&gt; Expansion -&gt; Intention
	 * </pre>
	 * 
	 * @return the simplification term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#Merge">term
	 *      definition</a>
	 */
	public static ComodiIntention getMerge()
	{
		return new ComodiIntention ("Merge");
	}
	
	
	/**
	 * Gets the term representing a elaboration.
	 * 
	 * <pre>
	 * Elaboration -&gt; Intention
	 * </pre>
	 * 
	 * @return the simplification term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#Elaboration">term
	 *      definition</a>
	 */
	public static ComodiIntention getElaboration ()
	{
		return new ComodiIntention ("Elaboration");
	}
	
	
	/**
	 * Gets the term representing a simplification.
	 * 
	 * <pre>
	 * Simplification -&gt; Intention
	 * </pre>
	 * 
	 * @return the simplification term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#Simplification">term
	 *      definition</a>
	 */
	public static ComodiIntention getSimplification ()
	{
		return new ComodiIntention ("Simplification");
	}
	
	
	/**
	 * Gets the term representing a trial of something.
	 * 
	 * <pre>
	 * Trial -&gt; Intention
	 * </pre>
	 * 
	 * @return the simplification term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#Trial">term
	 *      definition</a>
	 */
	public static ComodiIntention getTrial ()
	{
		return new ComodiIntention ("Trial");
	}
	
}
