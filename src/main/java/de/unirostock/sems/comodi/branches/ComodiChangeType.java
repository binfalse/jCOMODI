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
 * The Class ComodiChangeType creating terms of COMODI's Type branch.
 * 
 * @author Martin Scharm
 * @see <a href="http://purl.org/net/comodi#Type">Change Type definition</a>
 */
public class ComodiChangeType
	extends ComodiBranchTerm
{
	
	/**
	 * The Constructor -- just to call the constructor of the super class.
	 * 
	 * @param term
	 *          the term
	 */
	protected ComodiChangeType (String term)
	{
		super (term);
	}
	
	
	/**
	 * Gets the term representing a deletion.
	 * 
	 * <pre>
	 * Deletion -> Type
	 * </pre>
	 * 
	 * @return the deletion term
	 * @see <a href="http://purl.org/net/comodi#Deletion">term definition</a>
	 */
	public static ComodiChangeType getDeletion ()
	{
		return new ComodiChangeType ("Deletion");
	}
	
	
	/**
	 * Gets the term representing an update.
	 * 
	 * <pre>
	 * Update -> Type
	 * </pre>
	 * 
	 * @return the update term
	 * @see <a href="http://purl.org/net/comodi#Update">term definition</a>
	 */
	public static ComodiChangeType getUpdate ()
	{
		return new ComodiChangeType ("Update");
	}
	
	
	/**
	 * Gets the term representing an update of an attribute value.
	 * 
	 * <pre>
	 * AttributeValue -> Update -> Type
	 * </pre>
	 * 
	 * @return the attribute update term
	 * @see <a href="http://purl.org/net/comodi#AttributeValue">term
	 *      definition</a>
	 */
	public static ComodiChangeType getAttributeValue ()
	{
		return new ComodiChangeType ("AttributeValue");
	}
	
	
	/**
	 * Gets the term representing a move.
	 * 
	 * <pre>
	 * Move -> Type
	 * </pre>
	 * 
	 * @return the move term
	 * @see <a href="http://purl.org/net/comodi#Move">term definition</a>
	 */
	public static ComodiChangeType getMove ()
	{
		return new ComodiChangeType ("Move");
	}
	
	
	/**
	 * Gets the term representing a permutation of entities.
	 * 
	 * <pre>
	 * PermutationOfEntities -> Move -> Type
	 * </pre>
	 * 
	 * @return the permutation of entities term
	 * @see <a href="http://purl.org/net/comodi#PermutationOfEntities">term
	 *      definition</a>
	 */
	public static ComodiChangeType getPermutationOfEntities ()
	{
		return new ComodiChangeType ("PermutationOfEntities");
	}
	
	
	/**
	 * Gets the term representing an insertion.
	 * 
	 * <pre>
	 * Insertion -> Type
	 * </pre>
	 * 
	 * @return the insertion term
	 * @see <a href="http://purl.org/net/comodi#Insertion">term definition</a>
	 */
	public static ComodiChangeType getInsertion ()
	{
		return new ComodiChangeType ("Insertion");
	}
	
}
