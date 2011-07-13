/*******************************************************************************
 * Copyright (c) 2011 Ericsson AB and others.
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Ericsson AB - Initial API and Implementation
 *******************************************************************************/
package org.eclipse.mylyn.internal.subclipse.core;

import org.eclipse.mylyn.versions.core.ScmRepository;
import org.tigris.subversion.subclipse.core.ISVNRepositoryLocation;

/**
 * @author Alvaro Sanchez-Leon
 */
@SuppressWarnings("restriction")
public class SubclipseRepository extends ScmRepository {

	private final ISVNRepositoryLocation location;

	public SubclipseRepository(SubclipseConnector connector, ISVNRepositoryLocation location) {
		this.location = location;
		setName(location.getLocation());
		setUrl(location.getUrl().toString());
		setConnector(connector);
	}

	public ISVNRepositoryLocation getLocation() {
		return location;
	}

}