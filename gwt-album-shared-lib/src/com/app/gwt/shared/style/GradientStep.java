package com.app.gwt.shared.style;

import java.io.Serializable;
import java.util.Objects;

/**
 * Represents a step in a gradient.
 * 
 * @author James C. Gladfelter
 */
public class GradientStep implements Serializable {

	private static final long serialVersionUID = -6883621144576376743L;

	protected Color color;
	protected int percentage;

	protected GradientStep() {
		// no-op - serializable
	}

	/**
	 * Creates a new gradient step.
	 * 
	 * @param color
	 * @param percentage
	 */
	public GradientStep(Color color, int percentage) {
		super();
		this.color = color;
		this.percentage = percentage;
	}

	/**
	 * Retrieves the color of the gradient step.
	 * 
	 * @return the color of the gradient step.
	 */
	public Color getColor() {
		return this.color;
	}

	/**
	 * Sets the color of the gradient step.
	 * 
	 * @param color
	 *            - the color of the gradient step.
	 */
	public void setColor(Color color) {
		this.color = color;
	}

	/**
	 * Retrieves the percentage (position) of the gradient step.
	 * 
	 * @return the percentage (position) of the gradient step.
	 */
	public int getPercentage() {
		return this.percentage;
	}

	/**
	 * Sets the percentage (position) of the gradient step.
	 * 
	 * @param percentage
	 *            - the percentage (position) of the gradient step.
	 */
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

	@Override
	public boolean equals(Object obj) {
		boolean eq = false;
		if (obj instanceof GradientStep) {
			GradientStep g2 = (GradientStep) obj;
			eq = Objects.equals(this.percentage, g2.percentage) && Objects.equals(this.color, g2.color);
		}
		return eq;
	}
}
