
/*******************************************************************************
 *  Revision History:<br>
 *  SRL Member - File created
 *
 *  <p>
 *  <pre>
 *  This work is released under the BSD License:
 *  (C) 2011 Sketch Recognition Lab, Texas A&M University (hereafter SRL @ TAMU)
 *  All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions are met:
 *      * Redistributions of source code must retain the above copyright
 *        notice, this list of conditions and the following disclaimer.
 *      * Redistributions in binary form must reproduce the above copyright
 *        notice, this list of conditions and the following disclaimer in the
 *        documentation and/or other materials provided with the distribution.
 *      * Neither the name of the Sketch Recognition Lab, Texas A&M University 
 *        nor the names of its contributors may be used to endorse or promote 
 *        products derived from this software without specific prior written 
 *        permission.
 *  
 *  THIS SOFTWARE IS PROVIDED BY SRL @ TAMU ``AS IS'' AND ANY
 *  EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 *  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 *  DISCLAIMED. IN NO EVENT SHALL SRL @ TAMU BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 *  (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 *  LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 *  ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 *  (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 *  SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *  </pre>
 *  
 *******************************************************************************/

package org.apache.poi.java.awt.svg;

import org.apache.poi.java.awt.geom.Ellipse2D;
import org.apache.poi.java.awt.geom.Ellipse2D.Double;
import org.apache.poi.java.awt.svg.transforms.Transform;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name="ellipse")
public class SVGEllipse implements SVGShape<Ellipse2D>{
	
	private Style style;
	private Ellipse2D ellipse;
	private Transform transform;

	public SVGEllipse(
			@Attribute(name="cx") double cx, 
			@Attribute(name="cy") double cy, 
			@Attribute(name="rx") double rx, 
			@Attribute(name="ry") double ry){
		this((float)cx,(float)cy,(float)rx,(float)ry);
	}
	
	public SVGEllipse(float cx, float cy, float rx, float ry){
		this.ellipse = new Ellipse2D.Double(cx-rx, cy-ry, rx*2, ry*2);
	}
	
	public SVGEllipse(Ellipse2D ellipse){
		this.ellipse = ellipse;
	}
	
	@Attribute(name="cx")
	public double getCenterX(){
		return ellipse.getCenterX();
	}

	@Attribute(name="cy")
	public double getCenterY(){
		return ellipse.getCenterY();
	} 
	
	@Attribute(name="rx")
	public double getRadiusX(){
		return ellipse.getWidth() /2;
	}

	@Attribute(name="ry")
	public double getRadiusY(){
		return ellipse.getHeight() /2;
	} 

	@Override
	@Attribute(required=false)
	public Style getStyle() {
		return style;
	}

	@Override
	@Attribute(required=false)
	public void setStyle(Style style) {
		this.style = style;
	}

	@Override
	public Ellipse2D getShape() {
		return ellipse;
	}
	
	@Override
	@Attribute(required = false)
	public void setTransform(Transform transform) {
		this.transform = transform;
	}

	@Override
	@Attribute(required = false)
	public Transform getTransform() {
		return this.transform;
	}
}
