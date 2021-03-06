/**
 *  Filename: Vector.java (in org.repin.android.core)
 *  This file is part of the Redpin project.
 * 
 *  Redpin is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Lesser General Public License as published
 *  by the Free Software Foundation, either version 3 of the License, or
 *  any later version.
 *
 *  Redpin is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  GNU Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public License
 *  along with Redpin. If not, see <http://www.gnu.org/licenses/>.
 *
 *  (c) Copyright ETH Zurich, Pascal Brogle, Philipp Bolliger, 2010, ALL RIGHTS RESERVED.
 * 
 *  www.redpin.org
 */
package org.redpin.android.core;

import org.redpin.android.db.RemoteEntity;

/**
 * @see java.util.Vector
 * @author Pascal Brogle (broglep@student.ethz.ch)
 * 
 * @param <E>
 *            contained objects
 */
public class Vector<E> extends java.util.Vector<E> implements
		RemoteEntity<Integer> {

	private static final long serialVersionUID = 5314230691061190546L;

	protected Integer id;

	public Integer getRemoteId() {
		return id;
	}

	public void setRemoteId(Integer id) {
		this.id = id;
	}

}
