# jCOMODI

jCOMDO is a Java client for the [COMODI ontology](http://purl.uni-rostock.de/comodi/).
For COMODI consult the official website: [purl.uni-rostock.de/comodi/](http://purl.uni-rostock.de/comodi/)

[![COMODI overview](http://purl.uni-rostock.de/comodi/latest/whole.svg)](http://purl.uni-rostock.de/comodi/latest/whole.svg)
_(click to get a larger version)_


## Usage

The easiest way to include jCOMODI is to add the artifact as a dependency to your Maven project:

	<dependency>
		<groupId>de.unirostock.sems</groupId>
		<artifactId>jCOMODI</artifactId>
		<version>$version</version>
	</dependency>


You can then for example annotate a deletion with:

	import java.net.URI;
	import de.unirostock.sems.comodi.Change;
	import de.unirostock.sems.comodi.ChangeFactory;
	import de.unirostock.sems.comodi.branches.ComodiXmlEntity;
	import de.unirostock.sems.comodi.branches.ComodiReason;
	import de.unirostock.sems.comodi.branches.ComodiTarget;
	
	[...]
	
	ChangeFactory changeFac = new ChangeFactory (URI.create ("http://base.uri"));
	Change change = changeFac.createDeletion ("subjectid");
	change.appliesTo (ComodiXmlEntity.getAttribute ());
	change.affects (ComodiTarget.getReactionDefinition ());
	change.hasReason (ComodiReason.getKnowledgeGain ());
	
	System.out.println (changeFac.getRdfXml ());

The snippet above will result in an XML, which may look like this:

	<rdf:RDF
	    xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
	    xmlns:prov="http://www.w3.org/ns/prov#"
	    xmlns:pav="http://purl.org/pav/"
	    xmlns:ore="http://www.openarchives.org/ore/terms/"
	    xmlns:rdfs="http://www.w3.org/2000/01/rdf-schema#"
	    xmlns:comodi="http://purl.uni-rostock.de/comodi/comodi#"
	    xmlns:foaf="http://xmlns.com/foaf/0.1/">
	  <comodi:Deletion rdf:about="http://base.uri#subjectid">
	    <comodi:hasReason rdf:resource="http://purl.uni-rostock.de/comodi/comodi#KnowledgeGain"/>
	    <comodi:affects rdf:resource="http://purl.uni-rostock.de/comodi/comodi#ReactionDefinition"/>
	    <comodi:appliesTo rdf:resource="http://purl.uni-rostock.de/comodi/comodi#XmlAttribute"/>
	  </comodi:Deletion>
	</rdf:RDF>


Further examples can be found in BiVeS, which uses jCOMODI to annotate differences between computational models:

* [SBMLDiffAnnotator](https://github.com/binfalse/BiVeS-SBML/blob/master/src/main/java/de/unirostock/sems/bives/sbml/algorithm/SBMLDiffAnnotator.java)
* [CellMLDiffAnnotator](https://github.com/binfalse/BiVeS-CellML/blob/master/src/main/java/de/unirostock/sems/bives/cellml/algorithm/CellMLDiffAnnotator.java)
* above classes depend on [DefaultDiffAnnotator](https://github.com/binfalse/BiVeS-Core/blob/master/src/main/java/de/unirostock/sems/bives/algorithm/general/DefaultDiffAnnotator.java)


## LICENSE

Artwork and text etc is licensed under a [Creative Commons Attribution-ShareAlike 4.0 International License](http://creativecommons.org/licenses/by-sa/4.0/) ![Creative Commons License](https://i.creativecommons.org/l/by-sa/4.0/80x15.png)

The code is licensed under an [Apache 2.0 license](LICENSE):

    Copyright martin scharm <https://binfalse.de/contact/>

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
