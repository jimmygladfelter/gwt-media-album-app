package com.app.gwt.shared.template;

import java.util.ArrayList;
import java.util.Date;

import com.app.gwt.shared.album.AlbumPage;
import com.app.gwt.shared.base.LongSet;
import com.app.gwt.shared.base.StringSet;
import com.app.gwt.shared.comment.Comment;
import com.app.gwt.shared.style.BackgroundStyle;

/**
 * Represents a page in an album.
 * 
 * @author James C. Gladfelter
 */
public class AlbumPageTemplate extends AlbumPage {

	private static final long serialVersionUID = -465987982380216756L;

	protected LongSet templatedEntryIds;

	protected AlbumPageTemplate() {
		// no-op - serializable
	}

	/**
	 * Creates a new page template.
	 * 
	 * @param name
	 * @param description
	 * @param createdBy
	 */
	public AlbumPageTemplate(String name, String description, String createdBy) {
		this(name, description, createdBy, new Date().getTime());
	}

	/**
	 * Creates a new page template.
	 * 
	 * @param name
	 * @param description
	 * @param createdBy
	 * @param dateCreated
	 */
	public AlbumPageTemplate(String name, String description, String createdBy, Long dateCreated) {
		this(null, name, description, createdBy, dateCreated, createdBy, dateCreated, null, null, null, null, null,
				null);
	}

	/**
	 * Creates a new page template from an album page.
	 * 
	 * @param page
	 * @param templatedEntryIds
	 * @param createdBy
	 * @param tags
	 * @param thumbnail
	 */
	public AlbumPageTemplate(AlbumPage page, LongSet templatedEntryIds, String createdBy, StringSet tags,
			String thumbnail) {
		this(null, page.getName(), page.getDescription(), createdBy, null, createdBy, null, null, null, tags, thumbnail,
				page.getBackgroundStyle(), templatedEntryIds);
		Long dateCreated = new Date().getTime();
		this.dateCreated = dateCreated;
		this.dateLastModified = dateCreated;
	}

	/**
	 * Creates a new page template.
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
	 * @param backgroundStyle
	 * @param templatedEntryIds
	 */
	public AlbumPageTemplate(Long id, String name, String description, String createdBy, Long dateCreated,
			String lastModifiedBy, Long dateLastModified, StringSet likedByUsers, ArrayList<Comment> comments,
			StringSet tags, String thumbnail, BackgroundStyle backgroundStyle, LongSet templatedEntryIds) {
		super(id, name, description, createdBy, dateCreated, lastModifiedBy, dateLastModified, likedByUsers, comments,
				tags, thumbnail, backgroundStyle);
		this.templatedEntryIds = templatedEntryIds;
	}

	/**
	 * Retrieves a set of "templated" album page entries where the entry's media is
	 * non-static (defined by the user when imported into an album).
	 * 
	 * @return a set of "templated" album page entries where the entry's media is
	 *         non-static (defined by the user when imported into an album).
	 */
	public LongSet getTemplatedEntryIds() {
		return this.templatedEntryIds;
	}

	/**
	 * Sets the set of "templated" album page entries where the entry's media is
	 * non-static (defined by the user when imported into an album).
	 * 
	 * @param templatedEntryIds
	 *            - a set of "templated" album page entries where the entry's media
	 *            is non-static (defined by the user when imported into an album).
	 */
	public void setTemplatedEntryIds(LongSet templatedEntryIds) {
		this.templatedEntryIds = templatedEntryIds;
	}
}
