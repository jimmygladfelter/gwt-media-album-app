package com.app.gwt.shared.style;

import java.io.Serializable;
import java.util.HashMap;

/**
 * Represents a type of font family.
 * 
 * @author James C. Gladfelter
 */
public enum FontFamilyType implements Serializable {

	ROBOTO("roboto");

	protected String text;

	protected static HashMap<String, FontFamilyType> ENUM_BY_TEXT_MAP;

	/**
	 * Creates a new font family type.
	 * 
	 * @param text
	 */
	private FontFamilyType(String text) {
		this.text = text;
		this.registerEnum(this);
	}

	/**
	 * Adds the font family type to the static enum by text map so that
	 * {@link toEnum()} method can be called faster.
	 * 
	 * @param type
	 */
	protected void registerEnum(FontFamilyType type) {
		if (ENUM_BY_TEXT_MAP == null) {
			ENUM_BY_TEXT_MAP = new HashMap<String, FontFamilyType>();
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
	public static FontFamilyType toFontFamilyType(String text) {
		String textTrimmedLowercase = text != null ? text.trim().toLowerCase() : null;
		return ENUM_BY_TEXT_MAP.get(textTrimmedLowercase);
	}
}
