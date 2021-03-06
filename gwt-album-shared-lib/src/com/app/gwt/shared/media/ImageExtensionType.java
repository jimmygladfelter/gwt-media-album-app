package com.app.gwt.shared.media;

import java.io.Serializable;
import java.util.HashMap;

/**
 * Represents a type of image extension.
 * 
 * @author James C. Gladfelter
 */
public enum ImageExtensionType implements Serializable {

	JPG("jpg"), JPEG("jpeg"), PNG("png"), BMP("bmp"), GIF("gif"), ICO("ico"), EXIF("exif"), TIFF("tiff"), SVG("svg");

	protected String text;

	protected static HashMap<String, ImageExtensionType> ENUM_BY_TEXT_MAP;

	/**
	 * Creates a new image extension type.
	 * 
	 * @param text
	 */
	private ImageExtensionType(String text) {
		this.text = text;
		this.registerEnum(this);
	}

	/**
	 * Adds the image extension type to the static enum by text map so that
	 * {@link toEnum()} method can be called faster.
	 * 
	 * @param type
	 */
	protected void registerEnum(ImageExtensionType type) {
		if (ENUM_BY_TEXT_MAP == null) {
			ENUM_BY_TEXT_MAP = new HashMap<String, ImageExtensionType>();
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
	public static ImageExtensionType toImageExtensionType(String text) {
		String textTrimmedLowercase = text != null ? text.trim().toLowerCase() : null;
		return ENUM_BY_TEXT_MAP.get(textTrimmedLowercase);
	}
}
