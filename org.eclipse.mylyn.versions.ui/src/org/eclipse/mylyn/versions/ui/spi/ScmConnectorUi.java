/*******************************************************************************
 * Copyright (c) 2011 Ericsson and others.
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Ericsson - Initial API and Implementation
 *******************************************************************************/

package org.eclipse.mylyn.versions.ui.spi;

import org.eclipse.core.resources.IResource;
import org.eclipse.mylyn.versions.core.ChangeSet;
import org.eclipse.mylyn.versions.core.ScmRepository;

/**
 * Provides an interface intended to be associated with a UI, so the user can select available version control artifacts
 * 
 * @author Alvaro Sanchez-Leon
 */
public abstract class ScmConnectorUi {
	/**
	 * Resolve change sets for a given repository and narrow down the selection possibilities to the ones related to the
	 * given resource provided. This method is suitable to open a UI Wizard, the selection is expected to be driven by
	 * the user.
	 * 
	 * @param repository
	 *            - Associated repository
	 * @param resource
	 *            - work space resource e.g. project used to narrow down the change set options presented to the user
	 * @return ChnageSet - user selection
	 */
	public abstract ChangeSet getChangeSet(ScmRepository repository, IResource resource);

}