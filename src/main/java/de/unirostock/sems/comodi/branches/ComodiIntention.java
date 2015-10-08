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
package de.unirostock.sems.comodi.branches;

import de.unirostock.sems.comodi.ComodiBranchTerm;



/**
 * The Class ComodiIntention creating terms of COMODI's Intention branch..
 * 
 * @author Martin Scharm
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
	 * Correction -> Intention
	 * </pre>
	 * 
	 * @return the correction term
	 */
	public static ComodiIntention getCorrection ()
	{
		return new ComodiIntention ("Correction");
	}
	
	
	/**
	 * Gets the term representing an extension.
	 * 
	 * <pre>
	 * Extension -> Intention
	 * </pre>
	 * 
	 * @return the extension term
	 */
	public static ComodiIntention getExtension ()
	{
		return new ComodiIntention ("Extension");
	}
	
	
	/**
	 * Gets the term representing a simplification.
	 * 
	 * <pre>
	 * Simplification -> Intention
	 * </pre>
	 * 
	 * @return the simplification term
	 */
	public static ComodiIntention getSimplification ()
	{
		return new ComodiIntention ("Simplification");
	}
	
}
