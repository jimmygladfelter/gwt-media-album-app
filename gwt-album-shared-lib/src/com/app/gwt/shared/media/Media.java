package com.app.gwt.shared.media;

import java.util.ArrayList;
import java.util.Date;

import com.app.gwt.shared.base.ObjectType;
import com.app.gwt.shared.base.StringSet;
import com.app.gwt.shared.base.ThumbnailObject;
import com.app.gwt.shared.comment.Comment;

/**
 * Represents the base class for all media related objects.
 * 
 * @author James C. Gladfelter
 */
public class Media extends ThumbnailObject {

	private static final long serialVersionUID = 7624177293055464910L;

	protected Media() {
		// no-op - serializable
	}

	/**
	 * Creates a new media object.
	 * 
	 * @param name
	 * @param description
	 * @param createdBy
	 */
	public Media(String name, String description, String createdBy) {
		this(name, description, createdBy, new Date().getTime());
	}

	/**
	 * Creates a new media object.
	 * 
	 * @param name
	 * @param description
	 * @param createdBy
	 * @param dateCreated
	 */
	public Media(String name, String description, String createdBy, Long dateCreated) {
		this(null, name, description, createdBy, dateCreated, createdBy, dateCreated, null, null, null, null);
	}

	/**
	 * Creates a new media object.
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
	public Media(Long id, String name, String description, String createdBy, Long dateCreated, String lastModifiedBy,
			Long dateLastModified, StringSet likedByUsers, ArrayList<Comment> comments, StringSet tags,
			String thumbnail) {
		super(id, ObjectType.MEDIA, name, description, createdBy, dateCreated, lastModifiedBy, dateLastModified,
				likedByUsers, comments, tags, thumbnail);
	}
}
