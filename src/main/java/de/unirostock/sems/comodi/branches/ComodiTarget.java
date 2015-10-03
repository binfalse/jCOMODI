/**
 * 
 */
package de.unirostock.sems.comodi.branches;

import de.unirostock.sems.comodi.ComodiBranchTerm;


/**
 * @author Martin Scharm
 *
 */
public class ComodiTarget
	extends ComodiBranchTerm
{
	protected ComodiTarget (String term)
	{
		super (term);
	}
	
	public static ComodiTarget getAnnotationDescription()
	{
		return new ComodiTarget ("AnnotationDescription");
	}
	
	public static ComodiTarget getCreationDate()
	{
		return new ComodiTarget ("CreationDate");
	}
	
	public static ComodiTarget getModificationDate()
	{
		return new ComodiTarget ("ModificationDate");
	}
	
	public static ComodiTarget getDate()
	{
		return new ComodiTarget ("Date");
	}
	
	public static ComodiTarget getOntologyLink()
	{
		return new ComodiTarget ("OntologyLink");
	}
	
	public static ComodiTarget getTextualDescription()
	{
		return new ComodiTarget ("TextualDescription");
	}
	
	public static ComodiTarget getPerson()
	{
		return new ComodiTarget ("Person");
	}
	
	public static ComodiTarget getContributor()
	{
		return new ComodiTarget ("Contributor");
	}
	
	public static ComodiTarget getCreator()
	{
		return new ComodiTarget ("Creator");
	}
	
	public static ComodiTarget getAttribution()
	{
		return new ComodiTarget ("Attribution");
	}
	
	public static ComodiTarget getDocumentLayout()
	{
		return new ComodiTarget ("DocumentLayout");
	}
	
	public static ComodiTarget getFormatRelatedChange()
	{
		return new ComodiTarget ("FormatRelatedChange");
	}
	
	public static ComodiTarget getPermutationOfEntities()
	{
		return new ComodiTarget ("PermutationOfEntities");
	}
	
	public static ComodiTarget getShiftingOfEntities()
	{
		return new ComodiTarget ("ShiftingOfEntities");
	}
	
	public static ComodiTarget getAnnotationScheme()
	{
		return new ComodiTarget ("AnnotationScheme");
	}
	
	public static ComodiTarget getIdentifiersScheme()
	{
		return new ComodiTarget ("IdentifiersScheme");
	}
	
	public static ComodiTarget getMetaIdentifier()
	{
		return new ComodiTarget ("MetaIdentifier");
	}
	
	public static ComodiTarget getSpecification()
	{
		return new ComodiTarget ("Specification");
	}
	
	public static ComodiTarget getCellMLSpecification()
	{
		return new ComodiTarget ("CellMLSpecification");
	}
	
	public static ComodiTarget getSbmlSpecification()
	{
		return new ComodiTarget ("SbmlSpecification");
	}
	
	public static ComodiTarget getSbmlLevel()
	{
		return new ComodiTarget ("SbmlLevel");
	}
	
	public static ComodiTarget getSbmlVersion()
	{
		return new ComodiTarget ("SbmlVersion");
	}
	
	public static ComodiTarget getVcardScheme()
	{
		return new ComodiTarget ("VcardScheme");
	}
	
	public static ComodiTarget getEncodedSystem()
	{
		return new ComodiTarget ("EncodedSystem");
	}
	
	public static ComodiTarget getMathematicalModel()
	{
		return new ComodiTarget ("MathematicalModel");
	}
	
	public static ComodiTarget getNetwork()
	{
		return new ComodiTarget ("Network");
	}
	
	public static ComodiTarget getComponentDefinition()
	{
		return new ComodiTarget ("ComponentDefinition");
	}
	
	public static ComodiTarget getEventDefinition()
	{
		return new ComodiTarget ("EventDefinition");
	}
	
	public static ComodiTarget getFunctionDefinition()
	{
		return new ComodiTarget ("FunctionDefinition");
	}
	
	public static ComodiTarget getKinetics()
	{
		return new ComodiTarget ("Kinetics");
	}
	
	public static ComodiTarget getParameterDefinition()
	{
		return new ComodiTarget ("ParameterDefinition");
	}
	
	public static ComodiTarget getRules()
	{
		return new ComodiTarget ("Rules");
	}
	
	public static ComodiTarget getSpeciesDefinition()
	{
		return new ComodiTarget ("SpeciesDefinition");
	}
	
	public static ComodiTarget getUnitDefinition()
	{
		return new ComodiTarget ("UnitDefinition");
	}
	
	public static ComodiTarget getVariableDefinition()
	{
		return new ComodiTarget ("VariableDefinition");
	}
	
	public static ComodiTarget getComponentHierarchy()
	{
		return new ComodiTarget ("ComponentHierarchy");
	}
	
	public static ComodiTarget getReactionNetwork()
	{
		return new ComodiTarget ("ReactionNetwork");
	}
	
	public static ComodiTarget getVariableConnections()
	{
		return new ComodiTarget ("VariableConnections");
	}
	
	public static ComodiTarget getReactionDefinition()
	{
		return new ComodiTarget ("ReactionDefinition");
	}
	
}
