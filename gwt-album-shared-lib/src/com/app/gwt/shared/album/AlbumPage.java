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
		this(null, name, description, createdBy, dateCreated, createdBy, dateCreated, null, null, null, null, null);
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
			StringSet tags, String thumbnail, BackgroundStyle backgroundStyle) {
		super(id, ObjectType.ALBUM_PAGE, name, description, createdBy, dateCreated, lastModifiedBy, dateLastModified,
				likedByUsers, comments, tags, thumbnail);
		this.backgroundStyle = backgroundStyle;
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
