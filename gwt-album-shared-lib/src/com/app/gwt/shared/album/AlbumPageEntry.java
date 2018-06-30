package com.app.gwt.shared.album;

import java.util.Date;

import com.app.gwt.shared.base.BaseObject;
import com.app.gwt.shared.base.ObjectType;
import com.app.gwt.shared.style.EntryStyle;

/**
 * Represents an entry in an album page.
 * 
 * @author James C. Gladfelter
 */
public class AlbumPageEntry extends BaseObject {

	private static final long serialVersionUID = -1149782749654993667L;

	protected int x;
	protected int y;
	protected int width;
	protected int height;
	protected String text;
	protected EntryStyle entryStyle;

	protected AlbumPageEntry() {
		// no-op - serializable
	}

	/**
	 * Creates a new album page entry.
	 * 
	 * @param objectType
	 * @param createdBy
	 */
	public AlbumPageEntry(String createdBy, int x, int y, int width, int height) {
		this(createdBy, new Date().getTime(), x, y, width, height);
	}

	/**
	 * Creates a new album page entry.
	 * 
	 * @param objectType
	 * @param createdBy
	 * @param dateCreated
	 */
	public AlbumPageEntry(String createdBy, Long dateCreated, int x, int y, int width, int height) {
		this(null, createdBy, dateCreated, createdBy, dateCreated, x, y, width, height, null, null);
	}

	/**
	 * Creates a new album page entry.
	 * 
	 * @param id
	 * @param objectType
	 * @param createdBy
	 * @param dateCreated
	 * @param lastModifiedBy
	 * @param dateLastModified
	 * @param likedByUsers
	 */
	public AlbumPageEntry(Long id, String createdBy, Long dateCreated, String lastModifiedBy, Long dateLastModified,
			int x, int y, int width, int height, String text, EntryStyle entryStyle) {
		super(id, ObjectType.ALBUM_PAGE_ENTRY, createdBy, dateCreated, lastModifiedBy, dateLastModified);
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.text = text;
		this.entryStyle = entryStyle;
	}

	/**
	 * Retrieves the positional x-coordinate of the entry relative to the album.
	 * page.
	 * 
	 * @return the positional x-coordinate of the entry relative to the album page.
	 */
	public int getX() {
		return this.x;
	}

	/**
	 * Sets the positional x-coordinate of the entry relative to the album page.
	 * 
	 * @param x
	 *            - the positional x-coordinate of the entry relative to the album
	 *            page.
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * Retrieves the positional y-coordinate of the entry relative to the album.
	 * page.
	 * 
	 * @return the positional y-coordinate of the entry relative to the album page.
	 */
	public int getY() {
		return this.y;
	}

	/**
	 * Sets the positional y-coordinate of the entry relative to the album page.
	 * 
	 * @param y
	 *            - the positional y-coordinate of the entry relative to the album
	 *            page.
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * Sets the position of the entry relative to the album page.
	 * 
	 * @param x
	 *            - the positional x-coordinate of the entry relative to the album.
	 *            page.
	 * @param y
	 *            - the positional y-coordinate of the entry relative to the album
	 *            page.
	 */
	public void setXY(int x, int y) {
		this.setX(x);
		this.setY(y);
	}

	/**
	 * Retrieves the width of the entry.
	 * 
	 * @return the width of the entry.
	 */
	public int getWidth() {
		return this.width;
	}

	/**
	 * Sets the width of the entry.
	 * 
	 * @param width
	 *            - the width of the entry.
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * Retrieves the height of the entry.
	 * 
	 * @return the height of the entry.
	 */
	public int getHeight() {
		return this.height;
	}

	/**
	 * Sets the height of the entry.
	 * 
	 * @param height
	 *            - height of the entry.
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * Sets the size of the entry.
	 * 
	 * @param width
	 *            - width of the entry.
	 * @param height
	 *            - height of the entry.
	 */
	public void setSize(int width, int height) {
		this.setWidth(width);
		this.setHeight(height);
	}

	/**
	 * Retrieves the text specified in the entry.
	 * 
	 * @return the text specified in the entry.
	 */
	public String getText() {
		return this.text;
	}

	/**
	 * Sets the text specified in the entry.
	 * 
	 * @param text
	 *            - the text specified in the entry.
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * Retrieves the style of the entry.
	 * 
	 * @return the style of the entry.
	 */
	public EntryStyle getEntryStyle() {
		return this.entryStyle;
	}

	/**
	 * Sets the style of the entry.
	 * 
	 * @param entryStyle
	 *            - the style of the entry.
	 */
	public void setEntryStyle(EntryStyle entryStyle) {
		this.entryStyle = entryStyle;
	}
}
