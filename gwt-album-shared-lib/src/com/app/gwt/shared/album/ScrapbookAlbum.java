package com.app.gwt.shared.album;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;

import com.app.gwt.shared.base.ShareableObject;

/**
 * Represents a scrapbook album.
 * 
 * @author James C. Gladfelter
 */
public class ScrapbookAlbum extends ShareableObject {

	private static final long serialVersionUID = 3082862037841205346L;

	protected ArrayList<AlbumPage> pages;

	protected ScrapbookAlbum() {
		// no-op - serializable
	}

	/**
	 * Creates a new album.
	 * 
	 * @param name
	 * @param description
	 * @param createdBy
	 */
	public ScrapbookAlbum(String name, String description, String createdBy) {
		this(name, description, createdBy, new Date().getTime());
	}

	/**
	 * Creates a new album.
	 * 
	 * @param name
	 * @param description
	 * @param createdBy
	 * @param dateCreated
	 */
	public ScrapbookAlbum(String name, String description, String createdBy, Long dateCreated) {
		this(null, name, description, createdBy, dateCreated, createdBy, dateCreated, null, null);
	}

	/**
	 * Creates a new album.
	 * 
	 * @param id
	 * @param name
	 * @param description
	 * @param createdBy
	 * @param dateCreated
	 * @param lastModifiedBy
	 * @param dateLastModified
	 * @param tags
	 */
	public ScrapbookAlbum(Long id, String name, String description, String createdBy, Long dateCreated,
			String lastModifiedBy, Long dateLastModified, HashSet<String> tags, ArrayList<AlbumPage> pages) {
		super(id, name, description, createdBy, dateCreated, lastModifiedBy, dateLastModified, tags);
		this.pages = pages;
	}

	/**
	 * Retrieves the pages of the album, in order.
	 * 
	 * @return the pages of the album, in order.
	 */
	public ArrayList<AlbumPage> getPages() {
		return this.pages;
	}

	/**
	 * Sets the pages within the album, in order.
	 * 
	 * @param pages
	 *            - the pages within the album, in order.
	 */
	public void setPages(ArrayList<AlbumPage> pages) {
		this.pages = pages;
	}

	/**
	 * Adds a page to the album.
	 * 
	 * @param page
	 *            - a page to be added.
	 * @return true / false whether the page was added or not.
	 */
	public boolean addPage(AlbumPage page) {
		boolean added = false;
		if (page != null) {
			if (this.pages == null) {
				this.pages = new ArrayList<AlbumPage>();
			} else {
				// try to remove it first if in case it was already been added to the album.
				this.removePage(page);
			}
			added = this.pages.add(page);
		}
		return added;
	}

	/**
	 * Adds an array of pages to the album.
	 * 
	 * @param tags
	 *            - array of pages to be added.
	 */
	public void addPages(AlbumPage... pages) {
		if (pages != null) {
			for (AlbumPage page : pages) {
				this.addPage(page);
			}
		}
	}

	/**
	 * 
	 * Removes a page from the album.
	 * 
	 * @param page
	 *            - a page to be removed.
	 * @return true / false whether the page was removed or not.
	 */
	public boolean removePage(AlbumPage page) {
		boolean removed = false;
		if (this.pages != null && page != null) {
			removed = this.pages.remove(page);
		}
		return removed;
	}

	/**
	 * Removes an array of pages from the album.
	 * 
	 * @param pages
	 *            - array of pages to be removed.
	 */
	public void removePages(AlbumPage... pages) {
		if (this.tags != null && pages != null) {
			for (AlbumPage page : pages) {
				this.removePage(page);
			}
		}
	}
}
