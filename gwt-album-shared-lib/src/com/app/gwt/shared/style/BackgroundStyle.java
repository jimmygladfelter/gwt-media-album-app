package com.app.gwt.shared.style;

import java.io.Serializable;

/**
 * Represents a background style.
 * 
 * @author James C. Gladfelter
 */
public class BackgroundStyle implements Serializable {

	private static final long serialVersionUID = 3210585917385936074L;

	protected Color backgroundColor;
	protected Gradient backgroundGradient;
	protected MediaThumbnailStyle backgroundImage;

	/**
	 * Creates a new background color.
	 */
	public BackgroundStyle() {
		this(Color.transparent());
	}

	/**
	 * Creates a new background color.
	 * 
	 * @param backgroundColor
	 */
	public BackgroundStyle(Color backgroundColor) {
		this(backgroundColor, null, null);
	}

	/**
	 * Creates a new background color.
	 * 
	 * @param backgroundGradient
	 */
	public BackgroundStyle(Gradient backgroundGradient) {
		this(null, backgroundGradient, null);
	}

	/**
	 * Copies a {@link BackgroundStyle}
	 * 
	 * @param toCopy
	 *            - the {@link BackgroundStyle} to copy.
	 */
	public BackgroundStyle(BackgroundStyle toCopy) {
		super();
		if (toCopy != null) {
			this.backgroundColor = toCopy.backgroundColor;
			this.backgroundGradient = toCopy.backgroundGradient != null ? new Gradient(toCopy.backgroundGradient)
					: null;
			this.backgroundImage = toCopy.backgroundImage != null ? new MediaThumbnailStyle(backgroundImage) : null;
		}
	}

	/**
	 * Creates a new background color.
	 * 
	 * @param backgroundColor
	 * @param backgroundGradient
	 * @param backgroundImage
	 */
	public BackgroundStyle(Color backgroundColor, Gradient backgroundGradient, MediaThumbnailStyle backgroundImage) {
		super();
		this.backgroundColor = backgroundColor;
		this.backgroundGradient = backgroundGradient;
		this.backgroundImage = backgroundImage;
	}

	/**
	 * Retrieves the background color.
	 * 
	 * @return the background color.
	 */
	public Color getBackgroundColor() {
		return this.backgroundColor;
	}

	/**
	 * Sets the background color.
	 * 
	 * @param backgroundColor
	 *            - the background color.
	 */
	public void setBackgroundColor(Color backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	/**
	 * Retrieves the background gradient.
	 * 
	 * @return the background gradient.
	 */
	public Gradient getBackgroundGradient() {
		return this.backgroundGradient;
	}

	/**
	 * Sets the background gradient.
	 * 
	 * @param backgroundGradient
	 *            - the background gradient.
	 */
	public void setBackgroundGradient(Gradient backgroundGradient) {
		this.backgroundGradient = backgroundGradient;
	}

	/**
	 * Retrieves the background image.
	 * 
	 * @return the background image.
	 */
	public MediaThumbnailStyle getBackgroundImage() {
		return this.backgroundImage;
	}

	/**
	 * Sets the background image.
	 * 
	 * @param backgroundImage
	 *            - the background image.
	 */
	public void setBackgroundImage(MediaThumbnailStyle backgroundImage) {
		this.backgroundImage = backgroundImage;
	}
}
