package com.app.gwt.shared.style;

import java.io.Serializable;
import java.util.HashMap;

/**
 * Represents a type of gradient position.
 * 
 * @author James C. Gladfelter
 */
public enum GradientPositionType implements Serializable {

	VERTICAL("vertical"), HORIZONTAL("horizontal"), RADIAL("radial"), BOTTOM_LEFT("bottom-left"), BOTTOM_RIGHT(
			"bottom-right"), TOP_LEFT("top-left"), TOP_RIGHT("top-right");

	protected String text;

	protected static HashMap<String, GradientPositionType> ENUM_BY_TEXT_MAP;

	/**
	 * Creates a new gradient position type.
	 * 
	 * @param text
	 */
	private GradientPositionType(String text) {
		this.text = text;
		this.registerEnum(this);
	}

	/**
	 * Adds the gradient position type to the static enum by text map so that
	 * {@link toEnum()} method can be called faster.
	 * 
	 * @param type
	 */
	protected void registerEnum(GradientPositionType type) {
		if (ENUM_BY_TEXT_MAP == null) {
			ENUM_BY_TEXT_MAP = new HashMap<String, GradientPositionType>();
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
	public static GradientPositionType toGradientPositionType(String text) {
		String textTrimmedLowercase = text != null ? text.trim().toLowerCase() : null;
		return ENUM_BY_TEXT_MAP.get(textTrimmedLowercase);
	}
}
