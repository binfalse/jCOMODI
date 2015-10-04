package de.unirostock.sems.comodi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.jdom2.Document;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import de.unirostock.sems.comodi.branches.ComodiChangeType;
import de.unirostock.sems.comodi.branches.ComodiEntity;
import de.unirostock.sems.comodi.branches.ComodiIntention;
import de.unirostock.sems.comodi.branches.ComodiReason;
import de.unirostock.sems.comodi.branches.ComodiTarget;
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
	@Test
	public void testChange ()
	{
		try
		{
			TreeDocument d = new TreeDocument (XmlTools.readDocument ("<root id='25'/>"), null);
			DocumentNode dn = d.getRoot ();
			
			ChangeFactory cb = new ChangeFactory ("file://bives.patch");
			
			Change change = cb.createChange (dn);
			change
			.appliedTo (ComodiEntity.getNode ())
			.intended (ComodiIntention.getCorrection ())
			.changeType (ComodiChangeType.getMove ())
			.hadReason (ComodiReason.getModelCuration ())
			.affected (ComodiTarget.getParameterDefinition ())
			.affected (ComodiTarget.getKinetics ());
			
			
			String xml = cb.getRdfXml ();
			//xml = xml.replaceAll ("file://bives.patch", "");
			System.out.println (xml);
			TreeDocument d2 = new TreeDocument (XmlTools.readDocument (xml), null);

			assertEquals ("expected 8 nodes", 8, d2.getNumNodes ());
			assertEquals ("expected 2 'affected' nodes", 2, d2.getNodesByTag ("affected").size ());
			assertEquals ("expected 1 'appliedTo' node", 1, d2.getNodesByTag ("appliedTo").size ());
			
			
			InputStream stream = new ByteArrayInputStream(xml.getBytes());
			Model model = ModelFactory.createDefaultModel();
			model.read (stream, "file://tmp.file/");
		}
		catch (Exception e)
		{
			e.printStackTrace();
			fail ("failed to test for changes");
		}
	}
}
