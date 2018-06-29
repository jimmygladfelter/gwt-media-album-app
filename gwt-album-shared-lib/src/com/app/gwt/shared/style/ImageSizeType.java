package com.app.gwt.shared.style;

import java.io.Serializable;
import java.util.HashMap;

/**
 * Represents a type of image size.
 * 
 * @author James C. Gladfelter
 */
public enum ImageSizeType implements Serializable {

	CONTAIN("contain"), COVER("cover");

	protected String text;

	protected static HashMap<String, ImageSizeType> ENUM_BY_TEXT_MAP;

	/**
	 * Creates a new image size type.
	 * 
	 * @param text
	 */
	private ImageSizeType(String text) {
		this.text = text;
		this.registerEnum(this);
	}

	/**
	 * Adds the image size type to the static enum by text map so that
	 * {@link toEnum()} method can be called faster.
	 * 
	 * @param type
	 */
	protected void registerEnum(ImageSizeType type) {
		if (ENUM_BY_TEXT_MAP == null) {
			ENUM_BY_TEXT_MAP = new HashMap<String, ImageSizeType>();
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
	public static ImageSizeType toImageSizeType(String text) {
		String textTrimmedLowercase = text != null ? text.trim().toLowerCase() : null;
		return ENUM_BY_TEXT_MAP.get(textTrimmedLowercase);
	}
}
