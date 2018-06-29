package com.app.gwt.shared.style;

import java.io.Serializable;

/**
 * Represents the base style of entries in an album.
 * 
 * @author James C. Gladfelter
 */
public class EntryStyle implements Serializable {

	private static final long serialVersionUID = -1144576376743688362L;

	protected TextStyle textStyle;
	protected BackgroundStyle backgroundStyle;

	/**
	 * Creates a new entry style.
	 */
	public EntryStyle() {
		this(null, null);
	}

	/**
	 * Creates a new entry style.
	 * 
	 * @param backgroundStyle
	 * @param textStyle
	 */
	public EntryStyle(BackgroundStyle backgroundStyle, TextStyle textStyle) {
		super();
		this.backgroundStyle = backgroundStyle;
		this.textStyle = textStyle;
	}

	/**
	 * Retrieves the text style of the entry.
	 * 
	 * @return the text style of the entry.
	 */
	public TextStyle getTextStyle() {
		return this.textStyle;
	}

	/**
	 * Sets the text style of the entry.
	 * 
	 * @param textStyle
	 *            - the text style of the entry.
	 */
	public void setTextStyle(TextStyle textStyle) {
		this.textStyle = textStyle;
	}

	/**
	 * Retrieves the background style of the entry.
	 * 
	 * @return the background style of the entry.
	 */
	public BackgroundStyle getBackgroundStyle() {
		return this.backgroundStyle;
	}

	/**
	 * Sets the background style of the entry.
	 * 
	 * @param backgroundStyle
	 *            - the background style of the entry.
	 */
	public void setBackgroundStyle(BackgroundStyle backgroundStyle) {
		this.backgroundStyle = backgroundStyle;
	}
}
