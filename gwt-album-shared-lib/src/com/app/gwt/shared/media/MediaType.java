package com.app.gwt.shared.media;

import java.io.Serializable;
import java.util.HashMap;

/**
 * Represents a type of media.
 * 
 * @author James C. Gladfelter
 */
public enum MediaType implements Serializable {

	IMAGE("image"), VIDEO("video");

	protected String text;

	protected static HashMap<String, MediaType> ENUM_BY_TEXT_MAP;

	/**
	 * Creates a new media type.
	 * 
	 * @param text
	 */
	private MediaType(String text) {
		this.text = text;
		this.registerEnum(this);
	}

	/**
	 * Adds the media type to the static enum by text map so that {@link toEnum()}
	 * method can be called faster.
	 * 
	 * @param type
	 */
	protected void registerEnum(MediaType type) {
		if (ENUM_BY_TEXT_MAP == null) {
			ENUM_BY_TEXT_MAP = new HashMap<String, MediaType>();
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
	public static MediaType toEnum(String text) {
		String textTrimmedLowercase = text != null ? text.trim().toLowerCase() : null;
		return ENUM_BY_TEXT_MAP.get(textTrimmedLowercase);
	}
}
