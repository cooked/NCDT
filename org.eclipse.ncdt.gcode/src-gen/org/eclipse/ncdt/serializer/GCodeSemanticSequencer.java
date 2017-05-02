/*
 * generated by Xtext 2.10.0
 */
package org.eclipse.ncdt.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.ncdt.gCode.GBlock;
import org.eclipse.ncdt.gCode.GCodePackage;
import org.eclipse.ncdt.gCode.MBlock;
import org.eclipse.ncdt.gCode.Model;
import org.eclipse.ncdt.services.GCodeGrammarAccess;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;

@SuppressWarnings("all")
public class GCodeSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private GCodeGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == GCodePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case GCodePackage.GBLOCK:
				sequence_GBlock(context, (GBlock) semanticObject); 
				return; 
			case GCodePackage.MBLOCK:
				sequence_MBlock(context, (MBlock) semanticObject); 
				return; 
			case GCodePackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Block returns GBlock
	 *     GBlock returns GBlock
	 *
	 * Constraint:
	 *     (name=GCODE arguments+=Argument*)
	 */
	protected void sequence_GBlock(ISerializationContext context, GBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Block returns MBlock
	 *     MBlock returns MBlock
	 *
	 * Constraint:
	 *     (name=MCODE arguments+=Argument*)
	 */
	protected void sequence_MBlock(ISerializationContext context, MBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     Blocks+=Block+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}