package net.sourceforge.dynamicgmf.diagram.adapters;

import java.util.Collection;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

public interface IEcoreModelInfo {
	Collection<EClass> getAllEClasses();
	Collection<EReference> getAllEReferences();
	EClass getRootClass();
	void setRootClass(EClass rootClass);
}
