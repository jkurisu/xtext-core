/*******************************************************************************
 * Copyright (c) 2008 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.xtext;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.service.ILanguageService;

/**
 * @author Jan K�hnlein - Initial contribution and API
 *
 */
public interface IMetamodelAccess extends ILanguageService {
	
	/**
	 * @return
	 */
	EPackage[] getGeneratedEPackages();
	
	/**
	 * 
	 * @return
	 */
	EPackage[] getReferencedEPackages();
	
	
}
