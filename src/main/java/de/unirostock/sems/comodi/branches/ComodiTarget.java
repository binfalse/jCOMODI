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
 * The Class ComodiTarget creating terms of COMODI's Target branch.
 * 
 * @author Martin Scharm
 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#Target">target definition</a>
 */
public class ComodiTarget
	extends ComodiBranchTerm
{
	
	/**
	 * The Constructor -- just to call the constructor of the super class.
	 * 
	 * @param term
	 *          the term
	 */
	protected ComodiTarget (String term)
	{
		super (term);
	}
	
	
	/**
	 * Gets the term representing an annotation.
	 * 
	 * <pre>
	 * Annotation -&gt; Target
	 * </pre>
	 * 
	 * @return the annotation term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#Annotation">term definition</a>
	 */
	public static ComodiTarget getAnnotation ()
	{
		return new ComodiTarget ("Annotation");
	}
	
	
	/**
	 * Gets the term representing a creation date.
	 * 
	 * <pre>
	 * CreationDate -&gt; Date -&gt; Annotation -&gt; Target
	 * </pre>
	 * 
	 * @return the creation date term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#CreationDate">term definition</a>
	 */
	public static ComodiTarget getCreationDate ()
	{
		return new ComodiTarget ("CreationDate");
	}
	
	
	/**
	 * Gets the term representing a modification date.
	 * 
	 * <pre>
	 * ModificationDate -&gt; Date -&gt; Annotation -&gt; Target
	 * </pre>
	 * 
	 * @return the modification date term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#ModificationDate">term
	 *      definition</a>
	 */
	public static ComodiTarget getModificationDate ()
	{
		return new ComodiTarget ("ModificationDate");
	}
	
	
	/**
	 * Gets the term representing a date.
	 * 
	 * <pre>
	 * Date -&gt; Annotation -&gt; Target
	 * </pre>
	 * 
	 * @return the date term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#Date">term definition</a>
	 */
	public static ComodiTarget getDate ()
	{
		return new ComodiTarget ("Date");
	}
	
	
	/**
	 * Gets the term representing an ontology link.
	 * 
	 * <pre>
	 * OntologyLink -&gt; Annotation -&gt; Target
	 * </pre>
	 * 
	 * @return the ontology link term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#OntologyLink">term definition</a>
	 */
	public static ComodiTarget getOntologyLink ()
	{
		return new ComodiTarget ("OntologyLink");
	}
	
	
	/**
	 * Gets the term representing a textual description.
	 * 
	 * <pre>
	 * TextualDescription -&gt; Annotation -&gt; Target
	 * </pre>
	 * 
	 * @return the textual description term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#TextualDescription">term
	 *      definition</a>
	 */
	public static ComodiTarget getTextualDescription ()
	{
		return new ComodiTarget ("TextualDescription");
	}
	
	
	/**
	 * Gets the term representing a person.
	 * 
	 * <pre>
	 * Person -&gt; Annotation -&gt; Target
	 * </pre>
	 * 
	 * @return the person term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#Person">term definition</a>
	 */
	public static ComodiTarget getPerson ()
	{
		return new ComodiTarget ("Person");
	}
	
	
	/**
	 * Gets the term representing a contributor.
	 * 
	 * <pre>
	 * Contributor -&gt; Person -&gt; Annotation -&gt; Target
	 * </pre>
	 * 
	 * @return the contributor term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#Contributor">term definition</a>
	 */
	public static ComodiTarget getContributor ()
	{
		return new ComodiTarget ("Contributor");
	}
	
	
	/**
	 * Gets the term representing a creator.
	 * 
	 * <pre>
	 * Creator -&gt; Contributor -&gt; Person -&gt; Annotation -&gt; Target
	 * </pre>
	 * 
	 * @return the creator term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#Creator">term definition</a>
	 */
	public static ComodiTarget getCreator ()
	{
		return new ComodiTarget ("Creator");
	}
	
	
	/**
	 * Gets the term representing an attribution.
	 * 
	 * <pre>
	 * Attribution -&gt; TextualDescription -&gt; Annotation -&gt; Target
	 * </pre>
	 * 
	 * @return the attribution term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#Attribution">term definition</a>
	 */
	public static ComodiTarget getAttribution ()
	{
		return new ComodiTarget ("Attribution");
	}
	
	
	/**
	 * Gets the term representing the document layout.
	 * 
	 * <pre>
	 * DocumentLayout -&gt; Target
	 * </pre>
	 * 
	 * @return the document layout term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#DocumentLayout">term
	 *      definition</a>
	 */
	public static ComodiTarget getDocumentLayout ()
	{
		return new ComodiTarget ("DocumentLayout");
	}
	
	
	/**
	 * Gets the term representing an annotation scheme.
	 * 
	 * <pre>
	 * AnnotationScheme -&gt; DocumentLayout -&gt; Target
	 * </pre>
	 * 
	 * @return the annotation scheme term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#AnnotationScheme">term
	 *      definition</a>
	 */
	public static ComodiTarget getAnnotationScheme ()
	{
		return new ComodiTarget ("AnnotationScheme");
	}
	
	
	/**
	 * Gets the term representing an identifiers scheme.
	 * 
	 * <pre>
	 * IdentifiersScheme -&gt; DocumentLayout -&gt; Target
	 * </pre>
	 * 
	 * @return the identifiers scheme term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#IdentifiersScheme">term
	 *      definition</a>
	 */
	public static ComodiTarget getIdentifiersScheme ()
	{
		return new ComodiTarget ("IdentifiersScheme");
	}
	
	
	/**
	 * Gets the term representing the meta identifier.
	 * 
	 * <pre>
	 * MetaIdentifier -&gt; DocumentLayout -&gt; Target
	 * </pre>
	 * 
	 * @return the meta identifier term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#MetaIdentifier">term
	 *      definition</a>
	 */
	public static ComodiTarget getMetaIdentifier ()
	{
		return new ComodiTarget ("MetaIdentifier");
	}
	
	
	/**
	 * Gets the term representing a specification.
	 * 
	 * <pre>
	 * Specification -&gt; DocumentLayout -&gt; Target
	 * </pre>
	 * 
	 * @return the specification term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#Specification">term definition</a>
	 */
	public static ComodiTarget getSpecification ()
	{
		return new ComodiTarget ("Specification");
	}
	
	
	/**
	 * Gets the term representing the CellML specification.
	 * 
	 * <pre>
	 * CellmlSpecification -&gt; Specification -&gt; DocumentLayout -&gt; Target
	 * </pre>
	 * 
	 * @return the CellML specification term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#CellmlSpecification">term
	 *      definition</a>
	 */
	public static ComodiTarget getCellmlSpecification ()
	{
		return new ComodiTarget ("CellmlSpecification");
	}
	
	
	/**
	 * Gets the term representing the SBML specification.
	 * 
	 * <pre>
	 * SbmlSpecification -&gt; Specification -&gt; DocumentLayout -&gt; Target
	 * </pre>
	 * 
	 * @return the SBML specification term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#SbmlSpecification">term
	 *      definition</a>
	 */
	public static ComodiTarget getSbmlSpecification ()
	{
		return new ComodiTarget ("SbmlSpecification");
	}
	
	
	/**
	 * Gets the term representing an SBML level.
	 * 
	 * <pre>
	 * SbmlLevel -&gt; SbmlSpecification -&gt; Specification -&gt; DocumentLayout -&gt; Target
	 * </pre>
	 * 
	 * @return the SBML level term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#SbmlLevel">term definition</a>
	 */
	public static ComodiTarget getSbmlLevel ()
	{
		return new ComodiTarget ("SbmlLevel");
	}
	
	
	/**
	 * Gets the term representing an SBML version.
	 * 
	 * <pre>
	 * SbmlVersion -&gt; SbmlSpecification -&gt; Specification -&gt; DocumentLayout -&gt; Target
	 * </pre>
	 * 
	 * @return the SBML version term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#SbmlVersion">term definition</a>
	 */
	public static ComodiTarget getSbmlVersion ()
	{
		return new ComodiTarget ("SbmlVersion");
	}
	
	
	/**
	 * Gets the term representing the VCard scheme.
	 * 
	 * <pre>
	 * VcardScheme -&gt; DocumentLayout -&gt; Target
	 * </pre>
	 * 
	 * @return the VCard scheme term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#VcardScheme">term definition</a>
	 */
	public static ComodiTarget getVcardScheme ()
	{
		return new ComodiTarget ("VcardScheme");
	}
	
	
	/**
	 * Gets the term representing the encoded system.
	 * 
	 * <pre>
	 * EncodedSystem -&gt; Target
	 * </pre>
	 * 
	 * @return the encoded system term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#EncodedSystem">term definition</a>
	 */
	public static ComodiTarget getEncodedSystem ()
	{
		return new ComodiTarget ("EncodedSystem");
	}
	
	
	/**
	 * Gets the term representing the mathematical model.
	 * 
	 * <pre>
	 * MathematicalModel -&gt; EncodedSystem -&gt; Target
	 * </pre>
	 * 
	 * @return the mathematical model term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#MathematicalModel">term
	 *      definition</a>
	 */
	public static ComodiTarget getMathematicalModel ()
	{
		return new ComodiTarget ("MathematicalModel");
	}
	
	
	/**
	 * Gets the term representing a component definition.
	 * 
	 * <pre>
	 * ComponentDefinition -&gt; MathematicalModel -&gt; EncodedSystem -&gt; Target
	 * </pre>
	 * 
	 * @return the component definition term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#ComponentDefinition">term
	 *      definition</a>
	 */
	public static ComodiTarget getComponentDefinition ()
	{
		return new ComodiTarget ("ComponentDefinition");
	}
	
	
	/**
	 * Gets the term representing an event definition.
	 * 
	 * <pre>
	 * EventDefinition -&gt; MathematicalModel -&gt; EncodedSystem -&gt; Target
	 * </pre>
	 * 
	 * @return the event definition term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#EventDefinition">term
	 *      definition</a>
	 */
	public static ComodiTarget getEventDefinition ()
	{
		return new ComodiTarget ("EventDefinition");
	}
	
	
	/**
	 * Gets the term representing a function definition.
	 * 
	 * <pre>
	 * FunctionDefinition -&gt; MathematicalModel -&gt; EncodedSystem -&gt; Target
	 * </pre>
	 * 
	 * @return the function definition term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#FunctionDefinition">term
	 *      definition</a>
	 */
	public static ComodiTarget getFunctionDefinition ()
	{
		return new ComodiTarget ("FunctionDefinition");
	}
	
	
	/**
	 * Gets the term representing kinetics.
	 * 
	 * <pre>
	 * Kinetics -&gt; MathematicalModel -&gt; EncodedSystem -&gt; Target
	 * </pre>
	 * 
	 * @return the kinetics term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#Kinetics">term definition</a>
	 */
	public static ComodiTarget getKinetics ()
	{
		return new ComodiTarget ("Kinetics");
	}
	
	
	/**
	 * Gets the term representing a parameter definition.
	 * 
	 * <pre>
	 * ParameterDefinition -&gt; MathematicalModel -&gt; EncodedSystem -&gt; Target
	 * </pre>
	 * 
	 * @return the parameter definition term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#ParameterDefinition">term
	 *      definition</a>
	 */
	public static ComodiTarget getParameterDefinition ()
	{
		return new ComodiTarget ("ParameterDefinition");
	}
	
	
	/**
	 * Gets the term representing a rule.
	 * 
	 * <pre>
	 * Rules -&gt; MathematicalModel -&gt; EncodedSystem -&gt; Target
	 * </pre>
	 * 
	 * @return the rules term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#Rules">term definition</a>
	 */
	public static ComodiTarget getRules ()
	{
		return new ComodiTarget ("Rules");
	}
	
	
	/**
	 * Gets the term representing a species definition.
	 * 
	 * <pre>
	 * SpeciesDefinition -&gt; MathematicalModel -&gt; EncodedSystem -&gt; Target
	 * </pre>
	 * 
	 * @return the species definition term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#SpeciesDefinition">term
	 *      definition</a>
	 */
	public static ComodiTarget getSpeciesDefinition ()
	{
		return new ComodiTarget ("SpeciesDefinition");
	}
	
	
	/**
	 * Gets the term representing an unit definition.
	 * 
	 * <pre>
	 * UnitDefinition -&gt; MathematicalModel -&gt; EncodedSystem -&gt; Target
	 * </pre>
	 * 
	 * @return the unit definition term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#UnitDefinition">term
	 *      definition</a>
	 */
	public static ComodiTarget getUnitDefinition ()
	{
		return new ComodiTarget ("UnitDefinition");
	}
	
	
	/**
	 * Gets the term representing a variable definition.
	 * 
	 * <pre>
	 * VariableDefinition -&gt; MathematicalModel -&gt; EncodedSystem -&gt; Target
	 * </pre>
	 * 
	 * @return the variable definition term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#VariableDefinition">term
	 *      definition</a>
	 */
	public static ComodiTarget getVariableDefinition ()
	{
		return new ComodiTarget ("VariableDefinition");
	}
	
	
	/**
	 * Gets the term representing the network.
	 * 
	 * <pre>
	 * Network -&gt; EncodedSystem -&gt; Target
	 * </pre>
	 * 
	 * @return the network term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#Network">term definition</a>
	 */
	public static ComodiTarget getNetwork ()
	{
		return new ComodiTarget ("Network");
	}
	
	
	/**
	 * Gets the term representing the component hierarchy.
	 * 
	 * <pre>
	 * ComponentHierarchy -&gt; Network -&gt; EncodedSystem -&gt; Target
	 * </pre>
	 * 
	 * @return the component hierarchy term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#ComponentHierarchy">term
	 *      definition</a>
	 */
	public static ComodiTarget getComponentHierarchy ()
	{
		return new ComodiTarget ("ComponentHierarchy");
	}
	
	
	/**
	 * Gets the term representing the reaction network.
	 * 
	 * <pre>
	 * ReactionNetwork -&gt; Network -&gt; EncodedSystem -&gt; Target
	 * </pre>
	 * 
	 * @return the reaction network term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#ReactionNetwork">term
	 *      definition</a>
	 */
	public static ComodiTarget getReactionNetwork ()
	{
		return new ComodiTarget ("ReactionNetwork");
	}
	
	
	/**
	 * Gets the term representing a variable connections.
	 * 
	 * <pre>
	 * VariableConnections -&gt; Network -&gt; EncodedSystem -&gt; Target
	 * </pre>
	 * 
	 * @return the variable connections term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#VariableConnections">term
	 *      definition</a>
	 */
	public static ComodiTarget getVariableConnections ()
	{
		return new ComodiTarget ("VariableConnections");
	}
	
	
	/**
	 * Gets the term representing a reaction definition.
	 * 
	 * <pre>
	 * ReactionDefinition -&gt; ReactionNetwork -&gt; Network -&gt; EncodedSystem -&gt; Target
	 * </pre>
	 * 
	 * @return the reaction definition term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#ReactionDefinition">term
	 *      definition</a>
	 */
	public static ComodiTarget getReactionDefinition ()
	{
		return new ComodiTarget ("ReactionDefinition");
	}
	
	
	/**
	 * Gets the term representing a reaction reversibility.
	 * 
	 * <pre>
	 * ReactionReversibility -&gt; ReactionDefinition -&gt; ReactionNetwork -&gt; Network -&gt; EncodedSystem -&gt; Target
	 * </pre>
	 * 
	 * @return the reaction reversibility term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#ReactionReversibility">term
	 *      definition</a>
	 */
	public static ComodiTarget getReactionReversibility ()
	{
		return new ComodiTarget ("ReactionReversibility");
	}
	
}
