package com.app.gwt.shared.album;

import java.util.ArrayList;
import java.util.Date;

import com.app.gwt.shared.base.CommentableObject;
import com.app.gwt.shared.base.ObjectType;
import com.app.gwt.shared.base.StringSet;
import com.app.gwt.shared.comment.Comment;

/**
 * Represents a page in an album.
 * 
 * @author James C. Gladfelter
 */
public class AlbumPage extends CommentableObject {

	private static final long serialVersionUID = 8501362466937573883L;

	public AlbumPage() {
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
		this(null, name, description, createdBy, dateCreated, createdBy, dateCreated, null, null, null);
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
	 */
	public AlbumPage(Long id, String name, String description, String createdBy, Long dateCreated,
			String lastModifiedBy, Long dateLastModified, StringSet likedByUsers, ArrayList<Comment> comments,
			StringSet tags) {
		super(id, ObjectType.ALBUM_PAGE, name, description, createdBy, dateCreated, lastModifiedBy, dateLastModified,
				likedByUsers, comments, tags);
	}
}
