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
package de.unirostock.sems.comodi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.URI;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import de.unirostock.sems.comodi.branches.ComodiIntention;
import de.unirostock.sems.comodi.branches.ComodiReason;
import de.unirostock.sems.comodi.branches.ComodiTarget;
import de.unirostock.sems.comodi.branches.ComodiXmlEntity;
import de.unirostock.sems.xmlutils.ds.DocumentNode;
import de.unirostock.sems.xmlutils.ds.TreeDocument;
import de.unirostock.sems.xmlutils.tools.XmlTools;



/**
 * @author Martin Scharm
 * 
 */
@RunWith(JUnit4.class)
public class ComodiTest
{
	
	/**
	 * Simple test.
	 */
	@Test
	public void simpleTest ()
	{
		try
		{
			TreeDocument d = new TreeDocument (
				XmlTools.readDocument ("<root id='25'/>"), null);
			DocumentNode dn = d.getRoot ();
			
			ChangeFactory cb = new ChangeFactory (URI.create ("file://bives.patch"));
			
			Change change = cb.createMove (ChangeFactory.getSubjectId (dn));
			change.appliesTo (ComodiXmlEntity.getNode ())
				.hasIntention (ComodiIntention.getCorrection ())
				.hasReason (ComodiReason.getModelCuration ())
				.affects (ComodiTarget.getParameterSetup ())
				.affects (ComodiTarget.getKineticsDefinition ());
			
			String xml = cb.getRdfXml ();
			// xml = xml.replaceAll ("file://bives.patch", "");
			// System.out.println (xml);
			TreeDocument d2 = new TreeDocument (XmlTools.readDocument (xml), null);
			
			assertEquals ("expected 7 nodes", 7, d2.getNumNodes ());
			assertEquals ("expected 2 'affected' nodes", 2,
				d2.getNodesByTag ("affects").size ());
			assertEquals ("expected 1 'appliesTo' node", 1,
				d2.getNodesByTag ("appliesTo").size ());
			
			InputStream stream = new ByteArrayInputStream (xml.getBytes ());
			Model model = ModelFactory.createDefaultModel ();
			model.read (stream, "file://tmp.file/");
		}
		catch (Exception e)
		{
			e.printStackTrace ();
			fail ("failed to test for changes");
		}
	}
	
	/**
	 * Simple test.
	 */
	@Test
	public void simpleTest2 ()
	{

		ChangeFactory changeFac = new ChangeFactory (URI.create ("http://base.uri"));
		Change change = changeFac.createDeletion ("subjectid");
		change.appliesTo (ComodiXmlEntity.getAttribute ());
		change.affects (ComodiTarget.getReactionDefinition ());
		change.hasReason (ComodiReason.getKnowledgeGain ());
		System.out.println (changeFac.getRdfXml ());
	}
}
