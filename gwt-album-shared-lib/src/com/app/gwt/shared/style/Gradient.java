package com.app.gwt.shared.style;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Represents a gradient.
 * 
 * @author James C. Gladfelter
 */
public class Gradient implements Serializable {

	private static final long serialVersionUID = -6445768811376743362L;

	protected ArrayList<GradientStep> steps;
	protected GradientPositionType positionType;

	protected Gradient() {
		// no-op - serializable
	}

	/**
	 * Creates a new gradient.
	 * 
	 * @param steps
	 * @param positionType
	 */
	public Gradient(ArrayList<GradientStep> steps, GradientPositionType positionType) {
		super();
		this.steps = steps;
		this.positionType = positionType;
	}

	/**
	 * Retrieves the steps of the gradient.
	 * 
	 * @return the steps of the gradient.
	 */
	public ArrayList<GradientStep> getSteps() {
		return this.steps;
	}

	/**
	 * Sets the steps of the gradient.
	 * 
	 * @param steps
	 *            - the steps of the gradient.
	 */
	public void setSteps(ArrayList<GradientStep> steps) {
		this.steps = steps;
	}

	/**
	 * Determines if the specified step is a part of the gradient.
	 * 
	 * @param step
	 *            - a step to look for.
	 * @return true / false whether or not the specified step is a part of the
	 *         gradient.
	 */
	public boolean containsStep(GradientStep step) {
		return this.steps != null ? this.steps.contains(step) : false;
	}

	/**
	 * Adds a step to the gradient.
	 * 
	 * @param step
	 *            - a step to be added.
	 * @return true / false whether the step was added or not.
	 */
	public boolean addStep(GradientStep step) {
		boolean added = false;
		if (step != null) {
			if (this.steps == null) {
				this.steps = new ArrayList<GradientStep>();
			} else {
				// try to remove it first if in case it was already been added.
				this.removeStep(step);
			}
			added = this.steps.add(step);
		}
		return added;
	}

	/**
	 * Adds an array of steps to the gradient.
	 * 
	 * @param steps
	 *            - array of steps to be added.
	 */
	public void addSteps(GradientStep... steps) {
		if (steps != null) {
			for (GradientStep step : steps) {
				this.addStep(step);
			}
		}
	}

	/**
	 * 
	 * Removes a step from the gradient.
	 * 
	 * @param step
	 *            - a step to be removed.
	 * @return true / false whether the step was removed or not.
	 */
	public boolean removeStep(GradientStep step) {
		boolean removed = false;
		if (this.steps != null && step != null) {
			removed = this.steps.remove(step);
		}
		return removed;
	}

	/**
	 * Removes an array of steps from the gradient.
	 * 
	 * @param steps
	 *            - array of steps to be removed.
	 */
	public void removeSteps(GradientStep... steps) {
		if (this.steps != null && steps != null) {
			for (GradientStep step : steps) {
				this.removeStep(step);
			}
		}
	}

	/**
	 * Retrieves the position type of the gradient.
	 * 
	 * @return the position type of the gradient.
	 */
	public GradientPositionType getPositionType() {
		return this.positionType;
	}

	/**
	 * Sets the position type of the gradient.
	 * 
	 * @param positionType
	 *            - the position type of the gradient.
	 */
	public void setPositionType(GradientPositionType positionType) {
		this.positionType = positionType;
	}
}
