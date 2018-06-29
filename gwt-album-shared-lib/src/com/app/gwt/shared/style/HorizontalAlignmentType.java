package com.app.gwt.shared.style;

import java.io.Serializable;
import java.util.HashMap;

/**
 * Represents a type of horizontal alignment.
 * 
 * @author James C. Gladfelter
 */
public enum HorizontalAlignmentType implements Serializable {

	LEFT("left"), CENTER("center"), RIGHT("right");

	protected String text;

	protected static HashMap<String, HorizontalAlignmentType> ENUM_BY_TEXT_MAP;

	/**
	 * Creates a new horizontal alignment type.
	 * 
	 * @param text
	 */
	private HorizontalAlignmentType(String text) {
		this.text = text;
		this.registerEnum(this);
	}

	/**
	 * Adds the horizontal alignment type to the static enum by text map so that
	 * {@link toEnum()} method can be called faster.
	 * 
	 * @param type
	 */
	protected void registerEnum(HorizontalAlignmentType type) {
		if (ENUM_BY_TEXT_MAP == null) {
			ENUM_BY_TEXT_MAP = new HashMap<String, HorizontalAlignmentType>();
		}
		String typeString = type != null ? type.text : null;
		if (typeString != null) {
			ENUM_BY_TEXT_MAP.put(typeString.trim().toLowerCase(), type);
		}
	}

	@Override
	public String toString() {
		return this.text;
	}

	/**
	 * Converts text into an enum value of this type.
	 * 
	 * @param text
	 * @return
	 */
	public static HorizontalAlignmentType toHorizontalAlignmentType(String text) {
		String textTrimmedLowercase = text != null ? text.trim().toLowerCase() : null;
		return ENUM_BY_TEXT_MAP.get(textTrimmedLowercase);
	}
}
