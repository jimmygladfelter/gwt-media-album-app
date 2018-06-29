package com.app.gwt.shared.style;

import java.io.Serializable;
import java.util.HashMap;

/**
 * Represents a type of vertical alignment.
 * 
 * @author James C. Gladfelter
 */
public enum VerticalAlignmentType implements Serializable {

	TOP("top"), MIDDLE("middle"), BOTTOM("bottom");

	protected String text;

	protected static HashMap<String, VerticalAlignmentType> ENUM_BY_TEXT_MAP;

	/**
	 * Creates a new vertical alignment type.
	 * 
	 * @param text
	 */
	private VerticalAlignmentType(String text) {
		this.text = text;
		this.registerEnum(this);
	}

	/**
	 * Adds the vertical alignment type to the static enum by text map so that
	 * {@link toEnum()} method can be called faster.
	 * 
	 * @param type
	 */
	protected void registerEnum(VerticalAlignmentType type) {
		if (ENUM_BY_TEXT_MAP == null) {
			ENUM_BY_TEXT_MAP = new HashMap<String, VerticalAlignmentType>();
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
	public static VerticalAlignmentType toVerticalAlignmentType(String text) {
		String textTrimmedLowercase = text != null ? text.trim().toLowerCase() : null;
		return ENUM_BY_TEXT_MAP.get(textTrimmedLowercase);
	}
}
