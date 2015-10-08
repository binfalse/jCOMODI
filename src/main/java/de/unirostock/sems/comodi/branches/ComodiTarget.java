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
 * The Class ComodiTarget creating terms of COMODI's Target branch.
 *
 * @author Martin Scharm
 */
public class ComodiTarget
	extends ComodiBranchTerm
{
	
	/**
	 * The Constructor -- just to call the constructor of the super class.
	 *
	 * @param term the term
	 */
	protected ComodiTarget (String term)
	{
		super (term);
	}
	
	
	/**
	 * Gets the term representing an annotation.
	 * 
	 * <pre>
	 * Annotation -> Target
	 * </pre>
	 *
	 * @return the annotation term
	 */
	public static ComodiTarget getAnnotation ()
	{
		return new ComodiTarget ("Annotation");
	}
	
	
	/**
	 * Gets the term representing a creation date.
	 * 
	 * <pre>
	 * CreationDate -> Date -> Annotation -> Target
	 * </pre>
	 *
	 * @return the creation date term
	 */
	public static ComodiTarget getCreationDate ()
	{
		return new ComodiTarget ("CreationDate");
	}
	
	
	/**
	 * Gets the term representing a modification date.
	 * 
	 * <pre>
	 * ModificationDate -> Date -> Annotation -> Target
	 * </pre>
	 *
	 * @return the modification date term
	 */
	public static ComodiTarget getModificationDate ()
	{
		return new ComodiTarget ("ModificationDate");
	}
	
	
	/**
	 * Gets the term representing a date.
	 * 
	 * <pre>
	 * Date -> Annotation -> Target
	 * </pre>
	 *
	 * @return the date term
	 */
	public static ComodiTarget getDate ()
	{
		return new ComodiTarget ("Date");
	}
	
	
	/**
	 * Gets the term representing an ontology link.
	 * 
	 * <pre>
	 * OntologyLink -> Annotation -> Target
	 * </pre>
	 *
	 * @return the ontology link term
	 */
	public static ComodiTarget getOntologyLink ()
	{
		return new ComodiTarget ("OntologyLink");
	}
	
	
	/**
	 * Gets the term representing a textual description.
	 * 
	 * <pre>
	 * TextualDescription -> Annotation -> Target
	 * </pre>
	 *
	 * @return the textual description term
	 */
	public static ComodiTarget getTextualDescription ()
	{
		return new ComodiTarget ("TextualDescription");
	}
	
	
	/**
	 * Gets the term representing a person.
	 * 
	 * <pre>
	 *  Person-> Annotation -> Target
	 * </pre>
	 *
	 * @return the person term
	 */
	public static ComodiTarget getPerson ()
	{
		return new ComodiTarget ("Person");
	}
	
	
	/**
	 * Gets the term representing a contributor.
	 * 
	 * <pre>
	 * Contributor -> Person -> Annotation -> Target
	 * </pre>
	 *
	 * @return the contributor term
	 */
	public static ComodiTarget getContributor ()
	{
		return new ComodiTarget ("Contributor");
	}
	
	
	/**
	 * Gets the term representing a creator.
	 * 
	 * <pre>
	 * Creator -> Contributor -> Person -> Annotation -> Target
	 * </pre>
	 *
	 * @return the creator term
	 */
	public static ComodiTarget getCreator ()
	{
		return new ComodiTarget ("Creator");
	}
	
	
	/**
	 * Gets the term representing an attribution.
	 * 
	 * <pre>
	 * Attribution -> TextualDescription -> Annotation -> Target
	 * </pre>
	 *
	 * @return the attribution term
	 */
	public static ComodiTarget getAttribution ()
	{
		return new ComodiTarget ("Attribution");
	}
	
	
	
	
	
	
	/**
	 * Gets the term representing the document layout.
	 * 
	 * <pre>
	 * DocumentLayout -> Target
	 * </pre>
	 *
	 * @return the document layout term
	 */
	public static ComodiTarget getDocumentLayout ()
	{
		return new ComodiTarget ("DocumentLayout");
	}
	
	
	/**
	 * Gets the term representing an annotation scheme.
	 * 
	 * <pre>
	 * AnnotationScheme -> DocumentLayout -> Target
	 * </pre>
	 *
	 * @return the annotation scheme term
	 */
	public static ComodiTarget getAnnotationScheme ()
	{
		return new ComodiTarget ("AnnotationScheme");
	}
	
	
	/**
	 * Gets the term representing an identifiers scheme.
	 * 
	 * <pre>
	 * IdentifiersScheme -> DocumentLayout -> Target
	 * </pre>
	 *
	 * @return the identifiers scheme term
	 */
	public static ComodiTarget getIdentifiersScheme ()
	{
		return new ComodiTarget ("IdentifiersScheme");
	}
	
	
	/**
	 * Gets the term representing the meta identifier.
	 * 
	 * <pre>
	 * MetaIdentifier -> DocumentLayout -> Target
	 * </pre>
	 *
	 * @return the meta identifier term
	 */
	public static ComodiTarget getMetaIdentifier ()
	{
		return new ComodiTarget ("MetaIdentifier");
	}
	
	
	/**
	 * Gets the term representing a specification.
	 * 
	 * <pre>
	 * Specification -> DocumentLayout -> Target
	 * </pre>
	 *
	 * @return the specification term
	 */
	public static ComodiTarget getSpecification ()
	{
		return new ComodiTarget ("Specification");
	}
	
	
	/**
	 * Gets the term representing the CellML specification.
	 * 
	 * <pre>
	 * CellmlSpecification -> Specification -> DocumentLayout -> Target
	 * </pre>
	 *
	 * @return the CellML specification term
	 */
	public static ComodiTarget getCellmlSpecification ()
	{
		return new ComodiTarget ("CellmlSpecification");
	}
	
	
	/**
	 * Gets the term representing the SBML specification.
	 * 
	 * <pre>
	 * SbmlSpecification -> Specification -> DocumentLayout -> Target
	 * </pre>
	 *
	 * @return the SBML specification term
	 */
	public static ComodiTarget getSbmlSpecification ()
	{
		return new ComodiTarget ("SbmlSpecification");
	}
	
	
	/**
	 * Gets the term representing an SBML level.
	 * 
	 * <pre>
	 * SbmlLevel -> SbmlSpecification -> Specification -> DocumentLayout -> Target
	 * </pre>
	 *
	 * @return the SBML level term
	 */
	public static ComodiTarget getSbmlLevel ()
	{
		return new ComodiTarget ("SbmlLevel");
	}
	
	
	/**
	 * Gets the term representing an SBML version.
	 * 
	 * <pre>
	 * SbmlVersion -> SbmlSpecification -> Specification -> DocumentLayout -> Target
	 * </pre>
	 *
	 * @return the SBML version term
	 */
	public static ComodiTarget getSbmlVersion ()
	{
		return new ComodiTarget ("SbmlVersion");
	}
	
	
	/**
	 * Gets the term representing the VCard scheme.
	 * 
	 * <pre>
	 * VcardScheme -> DocumentLayout -> Target
	 * </pre>
	 *
	 * @return the VCard scheme term
	 */
	public static ComodiTarget getVcardScheme ()
	{
		return new ComodiTarget ("VcardScheme");
	}
	
	
	
	
	
	
	
	
	/**
	 * Gets the term representing the encoded system.
	 * 
	 * <pre>
	 * EncodedSystem -> Target
	 * </pre>
	 *
	 * @return the encoded system term
	 */
	public static ComodiTarget getEncodedSystem ()
	{
		return new ComodiTarget ("EncodedSystem");
	}
	
	
	/**
	 * Gets the term representing the mathematical model.
	 * 
	 * <pre>
	 * MathematicalModel -> EncodedSystem -> Target
	 * </pre>
	 *
	 * @return the mathematical model term
	 */
	public static ComodiTarget getMathematicalModel ()
	{
		return new ComodiTarget ("MathematicalModel");
	}
	
	
	/**
	 * Gets the term representing a component definition.
	 * 
	 * <pre>
	 * ComponentDefinition -> MathematicalModel -> EncodedSystem -> Target
	 * </pre>
	 *
	 * @return the component definition term
	 */
	public static ComodiTarget getComponentDefinition ()
	{
		return new ComodiTarget ("ComponentDefinition");
	}
	
	
	/**
	 * Gets the term representing an event definition.
	 * 
	 * <pre>
	 * EventDefinition -> MathematicalModel -> EncodedSystem -> Target
	 * </pre>
	 *
	 * @return the event definition term
	 */
	public static ComodiTarget getEventDefinition ()
	{
		return new ComodiTarget ("EventDefinition");
	}
	
	
	/**
	 * Gets the term representing a function definition.
	 * 
	 * <pre>
	 * FunctionDefinition -> MathematicalModel -> EncodedSystem -> Target
	 * </pre>
	 *
	 * @return the function definition term
	 */
	public static ComodiTarget getFunctionDefinition ()
	{
		return new ComodiTarget ("FunctionDefinition");
	}
	
	
	/**
	 * Gets the term representing kinetics.
	 * 
	 * <pre>
	 * Kinetics -> MathematicalModel -> EncodedSystem -> Target
	 * </pre>
	 *
	 * @return the kinetics term
	 */
	public static ComodiTarget getKinetics ()
	{
		return new ComodiTarget ("Kinetics");
	}
	
	
	/**
	 * Gets the term representing a parameter definition.
	 * 
	 * <pre>
	 * ParameterDefinition -> MathematicalModel -> EncodedSystem -> Target
	 * </pre>
	 *
	 * @return the parameter definition term
	 */
	public static ComodiTarget getParameterDefinition ()
	{
		return new ComodiTarget ("ParameterDefinition");
	}
	
	
	/**
	 * Gets the term representing a rule.
	 * 
	 * <pre>
	 * Rules -> MathematicalModel -> EncodedSystem -> Target
	 * </pre>
	 *
	 * @return the rules term
	 */
	public static ComodiTarget getRules ()
	{
		return new ComodiTarget ("Rules");
	}
	
	
	/**
	 * Gets the term representing a species definition.
	 * 
	 * <pre>
	 * SpeciesDefinition -> MathematicalModel -> EncodedSystem -> Target
	 * </pre>
	 *
	 * @return the species definition term
	 */
	public static ComodiTarget getSpeciesDefinition ()
	{
		return new ComodiTarget ("SpeciesDefinition");
	}
	
	
	/**
	 * Gets the term representing an unit definition.
	 * 
	 * <pre>
	 * UnitDefinition -> MathematicalModel -> EncodedSystem -> Target
	 * </pre>
	 *
	 * @return the unit definition term
	 */
	public static ComodiTarget getUnitDefinition ()
	{
		return new ComodiTarget ("UnitDefinition");
	}
	
	
	/**
	 * Gets the term representing a variable definition.
	 * 
	 * <pre>
	 * VariableDefinition -> MathematicalModel -> EncodedSystem -> Target
	 * </pre>
	 *
	 * @return the variable definition term
	 */
	public static ComodiTarget getVariableDefinition ()
	{
		return new ComodiTarget ("VariableDefinition");
	}
	
	
	
	
	
	
	
	
	
	
	/**
	 * Gets the term representing the network.
	 * 
	 * <pre>
	 * Network -> EncodedSystem -> Target
	 * </pre>
	 *
	 * @return the network term
	 */
	public static ComodiTarget getNetwork ()
	{
		return new ComodiTarget ("Network");
	}
	
	
	/**
	 * Gets the term representing the component hierarchy.
	 * 
	 * <pre>
	 * ComponentHierarchy -> Network -> EncodedSystem -> Target
	 * </pre>
	 *
	 * @return the component hierarchy term
	 */
	public static ComodiTarget getComponentHierarchy ()
	{
		return new ComodiTarget ("ComponentHierarchy");
	}
	
	
	/**
	 * Gets the term representing the reaction network.
	 * 
	 * <pre>
	 * ReactionNetwork -> Network -> EncodedSystem -> Target
	 * </pre>
	 *
	 * @return the reaction network term
	 */
	public static ComodiTarget getReactionNetwork ()
	{
		return new ComodiTarget ("ReactionNetwork");
	}
	
	
	/**
	 * Gets the term representing a variable connections.
	 * 
	 * <pre>
	 * VariableConnections -> Network -> EncodedSystem -> Target
	 * </pre>
	 *
	 * @return the variable connections term
	 */
	public static ComodiTarget getVariableConnections ()
	{
		return new ComodiTarget ("VariableConnections");
	}
	
	
	/**
	 * Gets the term representing a reaction definition.
	 * 
	 * <pre>
	 * ReactionDefinition -> ReactionNetwork -> Network -> EncodedSystem -> Target
	 * </pre>
	 *
	 * @return the reaction definition term
	 */
	public static ComodiTarget getReactionDefinition ()
	{
		return new ComodiTarget ("ReactionDefinition");
	}
	
	
	/**
	 * Gets the term representing a reaction reversibility.
	 * 
	 * <pre>
	 * ReactionReversibility -> ReactionDefinition -> ReactionNetwork -> Network -> EncodedSystem -> Target
	 * </pre>
	 *
	 * @return the reaction reversibility term
	 */
	public static ComodiTarget getReactionReversibility ()
	{
		return new ComodiTarget ("ReactionReversibility");
	}
	
}
