package com.app.gwt.shared.base;

import java.util.ArrayList;
import java.util.Date;

import com.app.gwt.shared.comment.Comment;

/**
 * Represents a commentable object that contains a thumbnail.
 * 
 * @author James C. Gladfelter
 */
public class ThumbnailObject extends CommentableObject {

	private static final long serialVersionUID = -176051959758666092L;

	protected String thumbnail;

	protected ThumbnailObject() {
		// no-op - serializable
	}

	/**
	 * Creates a new thumbnail object.
	 * 
	 * @param objectType
	 * @param name
	 * @param description
	 * @param createdBy
	 */
	public ThumbnailObject(ObjectType objectType, String name, String description, String createdBy) {
		this(objectType, name, description, createdBy, new Date().getTime());
	}

	/**
	 * Creates a new thumbnail object.
	 * 
	 * @param objectType
	 * @param name
	 * @param description
	 * @param createdBy
	 * @param dateCreated
	 */
	public ThumbnailObject(ObjectType objectType, String name, String description, String createdBy, Long dateCreated) {
		this(null, objectType, name, description, createdBy, dateCreated, createdBy, dateCreated, null, null, null,
				null);
	}

	/**
	 * Copies a {@link ThumbnailObject}
	 * 
	 * @param toCopy
	 *            - the {@link ThumbnailObject} to copy.
	 */
	public ThumbnailObject(ThumbnailObject toCopy) {
		super(toCopy);
		if (toCopy != null) {
			this.thumbnail = toCopy.thumbnail;
		}
	}

	/**
	 * Creates a new thumbnail object.
	 * 
	 * @param id
	 * @param objectType
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
	public ThumbnailObject(Long id, ObjectType objectType, String name, String description, String createdBy,
			Long dateCreated, String lastModifiedBy, Long dateLastModified, StringSet likedByUsers,
			ArrayList<Comment> comments, StringSet tags, String thumbnail) {
		super(id, objectType, name, description, createdBy, dateCreated, lastModifiedBy, dateLastModified, likedByUsers,
				comments, tags);
		this.thumbnail = thumbnail;
	}

	/**
	 * Retrieves a base64 representation of the image (thumbnail) of the media
	 * object.
	 * 
	 * @return a base64 representation of the image (thumbnail) of the media object.
	 */
	public String getThumbnail() {
		return this.thumbnail;
	}

	/**
	 * Sets a base64 representation of the image (thumbnail) of the media object.
	 * 
	 * @param profileImageThumbnail
	 *            - a base64 representation of the image (thumbnail) of the media
	 *            object..
	 */
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
}
