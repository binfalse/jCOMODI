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
	 * Gets the term representing the annotation layer of a model document.
	 * 
	 * <pre>
	 * ModelAnnotation -&gt; Target
	 * </pre>
	 * 
	 * @return the model annotation term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#ModelAnnotation">term definition</a>
	 */
	public static ComodiTarget getModelAnnotation ()
	{
		return new ComodiTarget ("ModelAnnotation");
	}
	
	
	/**
	 * Gets the term representing a creation date.
	 * 
	 * <pre>
	 * CreationDate -&gt; Date -&gt; ModelAnnotation -&gt; Target
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
	 * ModificationDate -&gt; Date -&gt; ModelAnnotation -&gt; Target
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
	 * Date -&gt; ModelAnnotation -&gt; Target
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
	 * Gets the term representing an ontology reference.
	 * 
	 * <pre>
	 * OntologyReference -&gt; ModelAnnotation -&gt; Target
	 * </pre>
	 * 
	 * @return the ontology reference term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#OntologyReference">term definition</a>
	 */
	public static ComodiTarget getOntologyReference ()
	{
		return new ComodiTarget ("OntologyReference");
	}
	
	
	/**
	 * Gets the term representing a textual description.
	 * 
	 * <pre>
	 * TextualDescription -&gt; ModelAnnotation -&gt; Target
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
	 * Person -&gt; ModelAnnotation -&gt; Target
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
	 * Contributor -&gt; Person -&gt; ModelAnnotation -&gt; Target
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
	 * Creator -&gt; Contributor -&gt; Person -&gt; ModelAnnotation -&gt; Target
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
	 * Attribution -&gt; TextualDescription -&gt; ModelAnnotation -&gt; Target
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
	 * ModelEncoding -&gt; Target
	 * </pre>
	 * 
	 * @return the model encoding term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#ModelEncoding">term
	 *      definition</a>
	 */
	public static ComodiTarget getModelEncoding ()
	{
		return new ComodiTarget ("ModelEncoding");
	}
	
	
	/**
	 * Gets the term representing an annotation scheme.
	 * 
	 * <pre>
	 * AnnotationEncoding -&gt; ModelEncoding -&gt; Target
	 * </pre>
	 * 
	 * @return the annotation encoding term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#AnnotationEncoding">term
	 *      definition</a>
	 */
	public static ComodiTarget getAnnotationEncoding ()
	{
		return new ComodiTarget ("AnnotationEncoding");
	}
	
	
	/**
	 * Gets the term representing an identifiers scheme.
	 * 
	 * <pre>
	 * IdentifierEncoding -&gt; ModelEncoding -&gt; Target
	 * </pre>
	 * 
	 * @return the identifier encoding term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#IdentifierEncoding">term
	 *      definition</a>
	 */
	public static ComodiTarget getIdentifierEncoding ()
	{
		return new ComodiTarget ("IdentifierEncoding");
	}
	
	
	/**
	 * Gets the term representing the meta identifier.
	 * 
	 * <pre>
	 * MetaIdEncoding -&gt; IdentifierEncoding -&gt; ModelEncoding -&gt; Target
	 * </pre>
	 * 
	 * @return the meta identifier term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#MetaIdEncoding">term
	 *      definition</a>
	 */
	public static ComodiTarget getMetaIdEncoding ()
	{
		return new ComodiTarget ("MetaIdEncoding");
	}
	
	
	/**
	 * Gets the term representing the VCard scheme.
	 * 
	 * <pre>
	 * VcardEncoding -&gt; AnnotationEncoding -&gt; ModelEncoding -&gt; Target
	 * </pre>
	 * 
	 * @return the VCard encoding term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#VcardEncoding">term definition</a>
	 */
	public static ComodiTarget getVcardEncoding ()
	{
		return new ComodiTarget ("VcardEncoding");
	}
	
	
	/**
	 * Gets the term representing the behaviour of the encoded system.
	 * 
	 * <pre>
	 * ModelBehaviour -&gt; Target
	 * </pre>
	 * 
	 * @return the model behaviour term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#ModelBehaviour">term definition</a>
	 */
	public static ComodiTarget getModelBehaviour ()
	{
		return new ComodiTarget ("ModelBehaviour");
	}
	
	
	/**
	 * Gets the term representing the setup of the encoded system.
	 * 
	 * <pre>
	 * ModelSetup -&gt; Target
	 * </pre>
	 * 
	 * @return the encoded system term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#ModelSetup">term definition</a>
	 */
	public static ComodiTarget getModelSetup ()
	{
		return new ComodiTarget ("ModelSetup");
	}
	
	
	/**
	 * Gets the term representing the setup of a variable.
	 * 
	 * <pre>
	 * VariableSetup -&gt; ModelSetup -&gt; Target
	 * </pre>
	 * 
	 * @return the variable setup term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#VariableSetup">term
	 *      definition</a>
	 */
	public static ComodiTarget getVariableSetup ()
	{
		return new ComodiTarget ("VariableSetup");
	}
	
	
	/**
	 * Gets the term representing the setup of a species.
	 * 
	 * <pre>
	 * SpeciesSetup -&gt; ModelSetup -&gt; Target
	 * </pre>
	 * 
	 * @return the species setup term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#SpeciesSetup">term
	 *      definition</a>
	 */
	public static ComodiTarget getSpeciesDefinition ()
	{
		return new ComodiTarget ("SpeciesSetup");
	}
	
	
	/**
	 * Gets the term representing the setup of a parameter.
	 * 
	 * <pre>
	 * ParameterSetup -&gt; ModelSetup -&gt; Target
	 * </pre>
	 * 
	 * @return the parameter setup term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#ParameterSetup">term
	 *      definition</a>
	 */
	public static ComodiTarget getParameterDefinition ()
	{
		return new ComodiTarget ("ParameterSetup");
	}
	
	
	
	
	
	
	
	
	
	
	/**
	 * Gets the term representing the definition of the actual system.
	 * 
	 * <pre>
	 * ModelDefinition -&gt; Target
	 * </pre>
	 * 
	 * @return the encoded system term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#ModelDefinition">term definition</a>
	 */
	public static ComodiTarget getModelDefinition ()
	{
		return new ComodiTarget ("ModelDefinition");
	}
	
	
	
	
	
	/**
	 * Gets the term representing the mathematical model.
	 * 
	 * <pre>
	 * MathematicalModelDefinition -&gt; ModelDefinition -&gt; Target
	 * </pre>
	 * 
	 * @return the mathematical model term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#MathematicalModelDefinition">term
	 *      definition</a>
	 */
	public static ComodiTarget getMathematicalModelDefinition ()
	{
		return new ComodiTarget ("MathematicalModelDefinition");
	}
	
	
	/**
	 * Gets the term representing a component definition.
	 * 
	 * <pre>
	 * ComponentDefinition -&gt; MathematicalModelDefinition -&gt; ModelDefinition -&gt; Target
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
	 * EventDefinition -&gt; MathematicalModelDefinition -&gt; ModelDefinition -&gt; Target
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
	 * FunctionDefinition -&gt; MathematicalModelDefinition -&gt; ModelDefinition -&gt; Target
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
	 * Gets the term representing defintion of some kinetics.
	 * 
	 * <pre>
	 * KineticsDefinition -&gt; MathematicalModelDefinition -&gt; ModelDefinition -&gt; Target
	 * </pre>
	 * 
	 * @return the kinetics definition term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#KineticsDefinition">term definition</a>
	 */
	public static ComodiTarget getKineticsDefinition ()
	{
		return new ComodiTarget ("KineticsDefinition");
	}
	
	
	/**
	 * Gets the term representing a rule definition.
	 * 
	 * <pre>
	 * RuleDefinition -&gt; MathematicalModelDefinition -&gt; ModelDefinition -&gt; Target
	 * </pre>
	 * 
	 * @return the rule definition term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#RuleDefinition">term definition</a>
	 */
	public static ComodiTarget getRuleDefinition ()
	{
		return new ComodiTarget ("RuleDefinition");
	}
	
	
	/**
	 * Gets the term representing an unit definition.
	 * 
	 * <pre>
	 * UnitDefinition -&gt; MathematicalModelDefinition -&gt; ModelDefinition -&gt; Target
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
	 * Gets the term representing the network definition.
	 * 
	 * <pre>
	 * NetworkDefinition -&gt; ModelDefinition -&gt; Target
	 * </pre>
	 * 
	 * @return the network definition term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#NetworkDefinition">term definition</a>
	 */
	public static ComodiTarget getNetworkDefinition ()
	{
		return new ComodiTarget ("NetworkDefinition");
	}
	
	
	/**
	 * Gets the term representing the hierarchy of, eg., components or compartments.
	 * 
	 * <pre>
	 * HierarchyDefinition -&gt; NetworkDefinition -&gt; ModelDefinition -&gt; Target
	 * </pre>
	 * 
	 * @return the hierarchy definition term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#HierarchyDefinition">term
	 *      definition</a>
	 */
	public static ComodiTarget getHierarchyDefinition ()
	{
		return new ComodiTarget ("HierarchyDefinition");
	}
	
	
	/**
	 * Gets the term representing the reaction network.
	 * 
	 * <pre>
	 * ReactionNetworkDefinition -&gt; NetworkDefinition -&gt; ModelDefinition -&gt; Target
	 * </pre>
	 * 
	 * @return the reaction network term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#ReactionNetworkDefinition">term
	 *      definition</a>
	 */
	public static ComodiTarget getReactionNetworkDefinition ()
	{
		return new ComodiTarget ("ReactionNetworkDefinition");
	}
	
	
	/**
	 * Gets the term representing a variable connections.
	 * 
	 * <pre>
	 * VariableConnectionDefinition -&gt; NetworkDefinition -&gt; ModelDefinition -&gt; Target
	 * </pre>
	 * 
	 * @return the variable connections term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#VariableConnectionDefinition">term
	 *      definition</a>
	 */
	public static ComodiTarget getVariableConnectionDefinition ()
	{
		return new ComodiTarget ("VariableConnectionDefinition");
	}
	
	
	/**
	 * Gets the term representing a reaction definition.
	 * 
	 * <pre>
	 * ReactionDefinition -&gt; ReactionNetworkDefinition -&gt; NetworkDefinition -&gt; ModelDefinition -&gt; Target
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
	 * ReversibilityDefinition -&gt; ReactionDefinition -&gt; ReactionNetworkDefinition -&gt; NetworkDefinition -&gt; ModelDefinition -&gt; Target
	 * </pre>
	 * 
	 * @return the reaction reversibility term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#ReversibilityDefinition">term
	 *      definition</a>
	 */
	public static ComodiTarget getReversibilityDefinition ()
	{
		return new ComodiTarget ("ReversibilityDefinition");
	}
	
	
	/**
	 * Gets the term representing a participant in the reaction network.
	 * 
	 * <pre>
	 * ParticipantDefinition -&gt; ReactionNetworkDefinition -&gt; NetworkDefinition -&gt; ModelDefinition -&gt; Target
	 * </pre>
	 * 
	 * @return the participant term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#ParticipantDefinition">term
	 *      definition</a>
	 */
	public static ComodiTarget getParticipantDefinition ()
	{
		return new ComodiTarget ("ParticipantDefinition");
	}
	
	
	/**
	 * Gets the term representing a port definition.
	 * 
	 * <pre>
	 * PortDefinition -&gt; NetworkDefinition -&gt; ModelDefinition -&gt; Target
	 * </pre>
	 * 
	 * @return the port definition term
	 * @see <a href="http://purl.uni-rostock.de/comodi/comodi#PortDefinition">term
	 *      definition</a>
	 */
	public static ComodiTarget getPortDefinition ()
	{
		return new ComodiTarget ("PortDefinition");
	}
	
}
