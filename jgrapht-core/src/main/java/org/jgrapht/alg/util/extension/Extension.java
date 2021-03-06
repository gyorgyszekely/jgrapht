/* ==========================================
 * JGraphT : a free Java graph-theory library
 * ==========================================
 *
 * Project Info:  http://jgrapht.sourceforge.net/
 * Project Creator:  Barak Naveh (http://sourceforge.net/users/barak_naveh)
 *
 * (C) Copyright 2003-2008, by Barak Naveh and Contributors.
 *
 * This program and the accompanying materials are dual-licensed under
 * either
 *
 * (a) the terms of the GNU Lesser General Public License version 2.1
 * as published by the Free Software Foundation, or (at your option) any
 * later version.
 *
 * or (per the licensee's choosing)
 *
 * (b) the terms of the Eclipse Public License v1.0 as published by
 * the Eclipse Foundation.
 */
/* -----------------
 * Extension.java
 * -----------------
 * (C) Copyright 2015-2016, by Alexey Kudinkin and Contributors.
 *
 * Original Author:  Alexey Kudinkin
 * Contributor(s): Joris Kinable
 *
 * $Id$
 *
 * Changes
 * -------
 */
package org.jgrapht.alg.util.extension;

/**
 * Class which represents an abstract extension/encapsulation object.
 * An object, from here on denoted as original,can be encapsulated in or extended by another object. An example would be the relation between an edge (original) and an annotated edge. The
 * annotated edge encapsulates/extends an edge, thereby augmenting it with additional data. In symbolic form, if b is the original class, than a(b) would be its extension. This concept is similar to java's extension where
 * one class is derived from (extends) another class (original).
 */
public interface Extension {

}
