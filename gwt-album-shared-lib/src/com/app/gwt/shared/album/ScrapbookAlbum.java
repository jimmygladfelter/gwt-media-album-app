package com.app.gwt.shared.album;

import java.util.ArrayList;
import java.util.Date;

import com.app.gwt.shared.base.ObjectType;
import com.app.gwt.shared.base.StringSet;
import com.app.gwt.shared.base.ThumbnailObject;
import com.app.gwt.shared.comment.Comment;

/**
 * Represents a scrapbook album.
 * 
 * @author James C. Gladfelter
 */
public class ScrapbookAlbum extends ThumbnailObject {

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
		this(null, name, description, createdBy, dateCreated, createdBy, dateCreated, null, null, null, null, null);
	}

	/**
	 * Copies a {@link ScrapbookAlbum}
	 * 
	 * @param toCopy
	 *            - the {@link ScrapbookAlbum} to copy.
	 */
	public ScrapbookAlbum(ScrapbookAlbum toCopy) {
		super(toCopy);
		if (toCopy != null) {
			// deep copy the array of pages.
			ArrayList<AlbumPage> pagesToCopy = toCopy.getPages();
			if (pagesToCopy != null) {
				this.pages = new ArrayList<AlbumPage>();
				for (AlbumPage pageToCopy : pagesToCopy) {
					if (pageToCopy != null) {
						this.pages.add(new AlbumPage(pageToCopy));
					}
				}
			}
		}
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
	 * @param likedByUsers
	 * @param comments
	 * @param tags
	 * @param thumbnail
	 * @param pages
	 */
	public ScrapbookAlbum(Long id, String name, String description, String createdBy, Long dateCreated,
			String lastModifiedBy, Long dateLastModified, StringSet likedByUsers, ArrayList<Comment> comments,
			StringSet tags, String thumbnail, ArrayList<AlbumPage> pages) {
		super(id, ObjectType.SCRAPBOOK_ALBUM, name, description, createdBy, dateCreated, lastModifiedBy,
				dateLastModified, likedByUsers, comments, tags, thumbnail);
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
	 * Determines if the specified page is a part of the album.
	 * 
	 * @param page
	 *            - a page to look for.
	 * @return true / false whether or not the specified page is a part of the
	 *         album.
	 */
	public boolean containsPage(AlbumPage page) {
		return this.pages != null ? this.pages.contains(page) : false;
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
		if (this.pages != null && pages != null) {
			for (AlbumPage page : pages) {
				this.removePage(page);
			}
		}
	}
}
