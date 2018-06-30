package com.app.gwt.shared.album;

import java.util.ArrayList;
import java.util.Date;

import com.app.gwt.shared.base.LongSet;
import com.app.gwt.shared.base.ObjectType;
import com.app.gwt.shared.base.StringSet;
import com.app.gwt.shared.base.ThumbnailObject;
import com.app.gwt.shared.comment.Comment;
import com.app.gwt.shared.style.BackgroundStyle;
import com.app.gwt.shared.template.AlbumPageTemplate;

/**
 * Represents a page in an album.
 * 
 * @author James C. Gladfelter
 */
public class AlbumPage extends ThumbnailObject {

	private static final long serialVersionUID = 8501362466937573883L;

	protected ArrayList<AlbumPageEntry> entries;
	protected BackgroundStyle backgroundStyle;

	protected AlbumPage() {
		// no-op - serializable
	}

	/**
	 * Creates a new page.
	 * 
	 * @param name
	 * @param description
	 * @param createdBy
	 */
	public AlbumPage(String name, String description, String createdBy) {
		this(name, description, createdBy, new Date().getTime());
	}

	/**
	 * Creates a new page.
	 * 
	 * @param name
	 * @param description
	 * @param createdBy
	 * @param dateCreated
	 */
	public AlbumPage(String name, String description, String createdBy, Long dateCreated) {
		this(null, name, description, createdBy, dateCreated, createdBy, dateCreated, null, null, null, null, null,
				null);
	}

	/**
	 * Copies a {@link AlbumPage}
	 * 
	 * @param toCopy
	 *            - the {@link AlbumPage} to copy.
	 */
	public AlbumPage(AlbumPage toCopy) {
		super(toCopy);
		if (toCopy != null) {
			// deep copy the array of entries.
			ArrayList<AlbumPageEntry> entriesToCopy = toCopy.getEntries();
			if (entriesToCopy != null) {
				this.entries = new ArrayList<AlbumPageEntry>();
				for (AlbumPageEntry entryToCopy : entriesToCopy) {
					if (entryToCopy != null) {
						this.entries.add(new AlbumPageEntry(entryToCopy));
					}
				}
			}
			this.backgroundStyle = toCopy.backgroundStyle != null ? new BackgroundStyle(toCopy.backgroundStyle) : null;
		}
	}

	/**
	 * Creates a new page.
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
	 */
	public AlbumPage(Long id, String name, String description, String createdBy, Long dateCreated,
			String lastModifiedBy, Long dateLastModified, StringSet likedByUsers, ArrayList<Comment> comments,
			StringSet tags, String thumbnail, BackgroundStyle backgroundStyle, ArrayList<AlbumPageEntry> entries) {
		super(id, ObjectType.ALBUM_PAGE, name, description, createdBy, dateCreated, lastModifiedBy, dateLastModified,
				likedByUsers, comments, tags, thumbnail);
		this.backgroundStyle = backgroundStyle;
		this.entries = entries;
	}

	/**
	 * Retrieves the background style of the page.
	 * 
	 * @return the background style of the page.
	 */
	public BackgroundStyle getBackgroundStyle() {
		return this.backgroundStyle;
	}

	/**
	 * Sets the background style of the page.
	 * 
	 * @param backgroundStyle
	 *            - the background style of the page.
	 */
	public void setBackgroundStyle(BackgroundStyle backgroundStyle) {
		this.backgroundStyle = backgroundStyle;
	}

	/**
	 * Retrieves the entries of the page.
	 * 
	 * @return the entries of the page.
	 */
	public ArrayList<AlbumPageEntry> getEntries() {
		return this.entries;
	}

	/**
	 * Sets the entries within the page.
	 * 
	 * @param entries
	 *            - the entries within the page.
	 */
	public void setEntries(ArrayList<AlbumPageEntry> entries) {
		this.entries = entries;
	}

	/**
	 * Determines if the specified entry is a part of the page.
	 * 
	 * @param entry
	 *            - an entry to look for.
	 * @return true / false whether or not the specified entry is a part of the
	 *         page.
	 */
	public boolean containsEntry(AlbumPageEntry entry) {
		return this.entries != null ? this.entries.contains(entry) : false;
	}

	/**
	 * Adds an entry to the page.
	 * 
	 * @param entry
	 *            - an entry to be added.
	 * @return true / false whether the entry was added or not.
	 */
	public boolean addEntry(AlbumPageEntry entry) {
		boolean added = false;
		if (entry != null) {
			if (this.entries == null) {
				this.entries = new ArrayList<AlbumPageEntry>();
			} else {
				// try to remove it first if in case it was already been added to the page.
				this.removeEntry(entry);
			}
			added = this.entries.add(entry);
		}
		return added;
	}

	/**
	 * Adds an array of entries to the album.
	 * 
	 * @param tags
	 *            - array of entries to be added.
	 */
	public void addEntries(AlbumPageEntry... entries) {
		if (entries != null) {
			for (AlbumPageEntry entry : entries) {
				this.addEntry(entry);
			}
		}
	}

	/**
	 * 
	 * Removes a entry from the page.
	 * 
	 * @param entry
	 *            - an entry to be removed.
	 * @return true / false whether the entry was removed or not.
	 */
	public boolean removeEntry(AlbumPageEntry entry) {
		boolean removed = false;
		if (this.entries != null && entry != null) {
			removed = this.entries.remove(entry);
		}
		return removed;
	}

	/**
	 * Removes an array of entries from the page.
	 * 
	 * @param entries
	 *            - array of entries to be removed.
	 */
	public void removeEntries(AlbumPageEntry... entries) {
		if (this.entries != null && entries != null) {
			for (AlbumPageEntry entry : entries) {
				this.removeEntry(entry);
			}
		}
	}

	/**
	 * Creates an album page template from this page.
	 * 
	 * @param templatedEntryIds
	 *            - a set of "templated" album page entries where the entry's media
	 *            is non-static (defined by the user when imported into an album).
	 * @param createdBy
	 *            - the user who created the template.
	 * @param tags
	 *            - a set of tags associated with the new page template.
	 * @param thumbnail
	 *            - a base64 representation of the image (thumbnail) of the album
	 *            page template.
	 * @return an album page template from this page.
	 */
	public AlbumPageTemplate createTemplate(LongSet templatedEntryIds, String createdBy, StringSet tags,
			String thumbnail) {
		return new AlbumPageTemplate(this, templatedEntryIds, createdBy, tags, thumbnail);
	}
}
