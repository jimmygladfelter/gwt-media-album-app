package com.app.gwt.shared.media;

import java.io.Serializable;
import java.util.HashMap;

/**
 * Represents a type of video extension.
 * 
 * @author James C. Gladfelter
 */
public enum VideoExtensionType implements Serializable {

	AVI("avi"), FLV("flv"), WMV("wmv"), MOV("mov"), MP4("mp4");

	protected String text;

	protected static HashMap<String, VideoExtensionType> ENUM_BY_TEXT_MAP;

	/**
	 * Creates a new video extension type.
	 * 
	 * @param text
	 */
	private VideoExtensionType(String text) {
		this.text = text;
		this.registerEnum(this);
	}

	/**
	 * Adds the video extension type to the static enum by text map so that
	 * {@link toEnum()} method can be called faster.
	 * 
	 * @param type
	 */
	protected void registerEnum(VideoExtensionType type) {
		if (ENUM_BY_TEXT_MAP == null) {
			ENUM_BY_TEXT_MAP = new HashMap<String, VideoExtensionType>();
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
	public static VideoExtensionType toEnum(String text) {
		String textTrimmedLowercase = text != null ? text.trim().toLowerCase() : null;
		return ENUM_BY_TEXT_MAP.get(textTrimmedLowercase);
	}
}
