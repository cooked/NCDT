/*
 * generated by Xtext 2.10.0
 */
package org.eclipse.ncdt.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractGCodeValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(org.eclipse.ncdt.gCode.GCodePackage.eINSTANCE);
		return result;
	}
	
}
