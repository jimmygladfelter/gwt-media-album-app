package com.app.gwt.shared.style;

/**
 * Represents the text style of textual objects in an album.
 * 
 * @author James C. Gladfelter
 */
public class TextStyle extends EntryStyle {

	private static final long serialVersionUID = -7992134166167916063L;

	protected boolean bold;
	protected boolean underline;
	protected boolean italic;
	protected FontFamilyType fontFamily;
	protected HorizontalAlignmentType horizontalAlignmentType;
	protected VerticalAlignmentType verticalAlignmentType;

	/**
	 * Creates a new text style.
	 */
	public TextStyle() {
		this(false, false, false);
	}

	/**
	 * Creates a new text style.
	 * 
	 * @param bold
	 * @param underline
	 * @param italic
	 */
	public TextStyle(boolean bold, boolean underline, boolean italic) {
		this(bold, underline, italic, FontFamilyType.ROBOTO, HorizontalAlignmentType.CENTER,
				VerticalAlignmentType.MIDDLE);
	}

	/**
	 * Copies a {@link TextStyle}
	 * 
	 * @param toCopy
	 *            - the {@link TextStyle} to copy.
	 */
	public TextStyle(TextStyle toCopy) {
		super();
		if (toCopy != null) {
			this.bold = toCopy.bold;
			this.underline = toCopy.underline;
			this.italic = toCopy.italic;
			this.fontFamily = toCopy.fontFamily;
			this.horizontalAlignmentType = toCopy.horizontalAlignmentType;
			this.verticalAlignmentType = toCopy.verticalAlignmentType;
		}
	}

	/**
	 * Creates a new text style.
	 * 
	 * @param bold
	 * @param underline
	 * @param italic
	 * @param fontFamily
	 * @param horizontalAlignmentType
	 * @param verticalAlignmentType
	 */
	public TextStyle(boolean bold, boolean underline, boolean italic, FontFamilyType fontFamily,
			HorizontalAlignmentType horizontalAlignmentType, VerticalAlignmentType verticalAlignmentType) {
		super();
		this.bold = bold;
		this.underline = underline;
		this.italic = italic;
		this.fontFamily = fontFamily;
		this.horizontalAlignmentType = horizontalAlignmentType;
		this.verticalAlignmentType = verticalAlignmentType;
	}

	/**
	 * Determines whether or not the text is bold.
	 * 
	 * @return true / false whether or not the text is bold.
	 */
	public boolean isBold() {
		return this.bold;
	}

	/**
	 * Sets whether or not the text is bold.
	 * 
	 * @param bold
	 *            - true / false whether or not the text is bold.
	 */
	public void setBold(boolean bold) {
		this.bold = bold;
	}

	/**
	 * Determines whether or not the text is underline.
	 * 
	 * @return true / false whether or not the text is underline.
	 */
	public boolean getUnderline() {
		return this.underline;
	}

	/**
	 * Sets whether or not the text is underline.
	 * 
	 * @param underline
	 *            - true / false whether or not the text is underline.
	 */
	public void setUnderline(boolean underline) {
		this.underline = underline;
	}

	/**
	 * Determines whether or not the text is italic.
	 * 
	 * @return true / false whether or not the text is italic.
	 */
	public boolean isItalic() {
		return this.italic;
	}

	/**
	 * Sets whether or not the text is italic.
	 * 
	 * @param italic
	 *            - true / false whether or not the text is italic.
	 */
	public void setItalic(boolean italic) {
		this.italic = italic;
	}

	/**
	 * Retrieves the font family type.
	 * 
	 * @return the font family type.
	 */
	public FontFamilyType getFontFamily() {
		return this.fontFamily;
	}

	/**
	 * Sets the font family type.
	 * 
	 * @param fontFamily
	 *            - the font family type.
	 */
	public void setFontFamily(FontFamilyType fontFamily) {
		this.fontFamily = fontFamily;
	}

	/**
	 * Retrieves the horizontal alignment type.
	 * 
	 * @return the horizontal alignment type.
	 */
	public HorizontalAlignmentType getHorizontalAlignmentType() {
		return this.horizontalAlignmentType;
	}

	/**
	 * Sets the horizontal alignment type.
	 * 
	 * @param horizontalAlignmentType
	 *            - the horizontal alignment type.
	 */
	public void setHorizontalAlignmentType(HorizontalAlignmentType horizontalAlignmentType) {
		this.horizontalAlignmentType = horizontalAlignmentType;
	}

	/**
	 * Retrieves the vertical alignment type.
	 * 
	 * @return the vertical alignment type.
	 */
	public VerticalAlignmentType getVerticalAlignmentType() {
		return this.verticalAlignmentType;
	}

	/**
	 * Sets the vertical alignment type.
	 * 
	 * @param verticalAlignmentType
	 *            - the vertical alignment type.
	 */
	public void setVerticalAlignmentType(VerticalAlignmentType verticalAlignmentType) {
		this.verticalAlignmentType = verticalAlignmentType;
	}
}
