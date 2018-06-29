package com.app.gwt.shared.style;

import java.io.Serializable;
import java.util.HashMap;

/**
 * Represents a type of image repeat.
 * 
 * @author James C. Gladfelter
 */
public enum ImageRepeatType implements Serializable {

	NO_REPEAT("no-repeat"), REPEAT_X("repeat-x"), REPEAT_Y("repeat-y"), REPEAT_XY("repeat");

	protected String text;

	protected static HashMap<String, ImageRepeatType> ENUM_BY_TEXT_MAP;

	/**
	 * Creates a new image repeat type.
	 * 
	 * @param text
	 */
	private ImageRepeatType(String text) {
		this.text = text;
		this.registerEnum(this);
	}

	/**
	 * Adds the image repeat type to the static enum by text map so that
	 * {@link toEnum()} method can be called faster.
	 * 
	 * @param type
	 */
	protected void registerEnum(ImageRepeatType type) {
		if (ENUM_BY_TEXT_MAP == null) {
			ENUM_BY_TEXT_MAP = new HashMap<String, ImageRepeatType>();
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
	public static ImageRepeatType toImageRepeatType(String text) {
		String textTrimmedLowercase = text != null ? text.trim().toLowerCase() : null;
		return ENUM_BY_TEXT_MAP.get(textTrimmedLowercase);
	}
}
