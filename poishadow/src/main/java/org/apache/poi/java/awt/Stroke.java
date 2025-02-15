/*
 * Copyright (c) 1996, 1999, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package org.apache.poi.java.awt;

/**
 * The <code>Stroke</code> interface allows a
 * {@link Graphics2D} object to obtain a {@link Shape} that is the
 * decorated outline, or stylistic representation of the outline,
 * of the specified <code>Shape</code>.
 * Stroking a <code>Shape</code> is like tracing its outline with a
 * marking pen of the appropriate size and shape.
 * The area where the pen would place ink is the area enclosed by the
 * outline <code>Shape</code>.
 * <p>
 * The methods of the <code>Graphics2D</code> interface that use the
 * outline <code>Shape</code> returned by a <code>Stroke</code> object
 * include <code>draw</code> and any other methods that are
 * implemented in terms of that method, such as
 * <code>drawLine</code>, <code>drawRect</code>,
 * <code>drawRoundRect</code>, <code>drawOval</code>,
 * <code>drawArc</code>, <code>drawPolyline</code>,
 * and <code>drawPolygon</code>.
 * <p>
 * The objects of the classes implementing <code>Stroke</code>
 * must be read-only because <code>Graphics2D</code> does not
 * clone these objects either when they are set as an attribute
 * with the <code>setStroke</code> method or when the
 * <code>Graphics2D</code> object is itself cloned.
 * If a <code>Stroke</code> object is modified after it is set in
 * the <code>Graphics2D</code> context then the behavior
 * of subsequent rendering would be undefined.
 * @see BasicStroke
 * @see Graphics2D#setStroke
 */
public interface Stroke {
}
