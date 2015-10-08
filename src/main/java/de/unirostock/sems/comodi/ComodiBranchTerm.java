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

import de.unirostock.sems.comodi.branches.ComodiChangeType;
import de.unirostock.sems.comodi.branches.ComodiIntention;
import de.unirostock.sems.comodi.branches.ComodiReason;
import de.unirostock.sems.comodi.branches.ComodiTarget;
import de.unirostock.sems.comodi.branches.ComodiXmlEntity;



/**
 * The Class ComodiBranchTerm -- a super class for the five different COMODI
 * branches:
 * 
 * <ul>
 * <li>Type, see {@link ComodiChangeType}
 * <li>XmlEntity, see {@link ComodiXmlEntity}
 * <li>Intention, see {@link ComodiIntention}
 * <li>Reason, see {@link ComodiReason}
 * <li>Target, see {@link ComodiTarget}
 * </ul>
 * 
 * @author Martin Scharm
 */
public abstract class ComodiBranchTerm
{
	
	/** The term represented by this instance. */
	private String	term;
	
	
	/**
	 * The Constructor instantiates a new term.
	 * 
	 * @param term
	 *          the actual term
	 */
	protected ComodiBranchTerm (String term)
	{
		this.term = term;
	}
	
	
	/**
	 * Gets the term.
	 * 
	 * @return the term
	 */
	public String getTerm ()
	{
		return term;
	}
	
}
