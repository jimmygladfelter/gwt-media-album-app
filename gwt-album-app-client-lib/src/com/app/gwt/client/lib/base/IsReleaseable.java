package com.app.gwt.client.lib.base;

/**
 * Represents a component that can have its resources released.
 * 
 * @author James C. Gladfelter
 */
public interface IsReleaseable {

	/**
	 * Releases the resources of the component.
	 */
	public void release();
}
