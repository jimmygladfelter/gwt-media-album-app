package com.app.gwt.shared.base;

import java.io.Serializable;
import java.util.HashMap;

/**
 * Represents the a type of object in the app.
 * 
 * @author James C. Gladfelter
 */
public enum ObjectType implements Serializable {

	ALBUM_PAGE("AlbumPage"), SCRAPBOOK_ALBUM("ScrapbookAlbum"), MEDIA("Media"), PAGE_TEMPLATE("PageTemplate"), COMMENT(
			"Comment");

	protected String text;

	protected static HashMap<String, ObjectType> ENUM_BY_TEXT_MAP;

	/**
	 * Creates a new object type.
	 * 
	 * @param text
	 */
	private ObjectType(String text) {
		this.text = text;
		this.registerEnum(this);
	}

	/**
	 * Adds the object type to the static enum by text map so that {@link toEnum()}
	 * method can be called faster.
	 * 
	 * @param type
	 */
	protected void registerEnum(ObjectType type) {
		if (ENUM_BY_TEXT_MAP == null) {
			ENUM_BY_TEXT_MAP = new HashMap<String, ObjectType>();
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
	public static ObjectType toEnum(String text) {
		String textTrimmedLowercase = text != null ? text.trim().toLowerCase() : null;
		return ENUM_BY_TEXT_MAP.get(textTrimmedLowercase);
	}
}
