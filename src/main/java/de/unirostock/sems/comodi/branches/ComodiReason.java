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
 * The Class ComodiReason creating terms of COMODI's Reason branch.
 * 
 * @author Martin Scharm
 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#Reason">Reason definition</a>
 */
public class ComodiReason
	extends ComodiBranchTerm
{
	
	/**
	 * The Constructor -- just to call the constructor of the super class.
	 * 
	 * @param term
	 *          the term
	 */
	protected ComodiReason (String term)
	{
		super (term);
	}
	
	
	/**
	 * Gets the term representing a typo.
	 * 
	 * <pre>
	 * Typo -&gt; Reason
	 * </pre>
	 * 
	 * @return the typo term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#Typo">term definition</a>
	 */
	public static ComodiReason getTypo ()
	{
		return new ComodiReason ("Typo");
	}
	
	
	/**
	 * Gets the term representing a knowledge gain.
	 * 
	 * <pre>
	 * KnowledgeGain -&gt; Reason
	 * </pre>
	 * 
	 * @return the knowledge gain term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#KnowledgeGain">term definition</a>
	 */
	public static ComodiReason getKnowledgeGain ()
	{
		return new ComodiReason ("KnowledgeGain");
	}
	
	
	/**
	 * Gets the term representing a mismatch with publication.
	 * 
	 * <pre>
	 * MismatchWithPublication -&gt; Reason
	 * </pre>
	 * 
	 * @return the mismatch with publication term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#MismatchWithPublication">term
	 *      definition</a>
	 */
	public static ComodiReason getMismatchWithPublication ()
	{
		return new ComodiReason ("MismatchWithPublication");
	}
	
	
	/**
	 * Gets the term representing a model curation.
	 * 
	 * <pre>
	 * ModelCuration -&gt; Reason
	 * </pre>
	 * 
	 * @return the model curation term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#ModelCuration">term definition</a>
	 */
	public static ComodiReason getModelCuration ()
	{
		return new ComodiReason ("ModelCuration");
	}
	
	
	/**
	 * Gets the term representing a changed specification.
	 * 
	 * <pre>
	 * ChangedSpecification -&gt; Reason
	 * </pre>
	 * 
	 * @return the model curation term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#ChangedSpecification">term definition</a>
	 */
	public static ComodiReason getChangedSpecification ()
	{
		return new ComodiReason ("ChangedSpecification");
	}
	
}
