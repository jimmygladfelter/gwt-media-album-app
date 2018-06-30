package com.app.gwt.shared.style;

import java.io.Serializable;
import java.util.Objects;

/**
 * Represents a color.
 * 
 * @author James C. Gladfelter
 */
public class Color implements Serializable {

	private static final long serialVersionUID = -1445785637674368362L;

	protected int r;
	protected int g;
	protected int b;
	protected int a;

	protected Color() {
		// no-op - serializable
	}

	/**
	 * Copies a {@link Color}
	 * 
	 * @param toCopy
	 *            - the {@link Color} to copy.
	 */
	public Color(Color toCopy) {
		super();
		if (toCopy == null) {
			toCopy = transparent();
		}
		this.r = toCopy.r;
		this.g = toCopy.g;
		this.b = toCopy.b;
		this.a = toCopy.a;
	}

	/**
	 * Creates a new color.
	 * 
	 * @param r
	 * @param g
	 * @param b
	 * @param a
	 */
	public Color(int r, int g, int b, int a) {
		super();
		this.r = r;
		this.g = g;
		this.b = b;
		this.a = a;
	}

	/**
	 * Retrieves the red component of the color.
	 * 
	 * @return the red component of the color.
	 */
	public int getR() {
		return this.r;
	}

	/**
	 * Sets the red component of the color.
	 * 
	 * @param r
	 *            - the red component of the color.
	 */
	public void setR(int r) {
		this.r = r;
	}

	/**
	 * Retrieves the green component of the color.
	 * 
	 * @return the green component of the color.
	 */
	public int getG() {
		return this.g;
	}

	/**
	 * Sets the green component of the color.
	 * 
	 * @param g
	 *            - the green component of the color.
	 */
	public void setG(int g) {
		this.g = g;
	}

	/**
	 * Retrieves the blue component of the color.
	 * 
	 * @return the blue component of the color.
	 */
	public int getB() {
		return this.b;
	}

	/**
	 * Sets the blue component of the color.
	 * 
	 * @param b
	 *            - the blue component of the color.
	 */
	public void setB(int b) {
		this.b = b;
	}

	/**
	 * Retrieves the alpha component of the color.
	 * 
	 * @return the alpha component of the color.
	 */
	public int getA() {
		return this.a;
	}

	/**
	 * Sets the alpha component of the color.
	 * 
	 * @param a
	 *            - the alpha component of the color.
	 */
	public void setA(int a) {
		this.a = a;
	}

	/**
	 * Creates a transparent color.
	 * 
	 * @return a transparent color.
	 */
	public static Color transparent() {
		return new Color(255, 255, 255, 100);
	}

	@Override
	public boolean equals(Object obj) {
		boolean eq = false;
		if (obj instanceof Color) {
			Color c2 = (Color) obj;
			eq = Objects.equals(this.r, c2.r) && Objects.equals(this.g, c2.g) && Objects.equals(this.b, c2.b)
					&& Objects.equals(this.a, c2.a);
		}
		return eq;
	}
}
