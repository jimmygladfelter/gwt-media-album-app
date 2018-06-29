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
public abstract class Media extends ThumbnailObject {

	private static final long serialVersionUID = 7624177293055464910L;

	protected String filename;
	protected MediaType mediaType;

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
	public Media(String name, String description, String createdBy, String filename, MediaType mediaType) {
		this(name, description, createdBy, new Date().getTime(), filename, mediaType);
	}

	/**
	 * Creates a new media object.
	 * 
	 * @param name
	 * @param description
	 * @param createdBy
	 * @param dateCreated
	 */
	public Media(String name, String description, String createdBy, Long dateCreated, String filename,
			MediaType mediaType) {
		this(null, name, description, createdBy, dateCreated, createdBy, dateCreated, null, null, null, null, filename,
				mediaType);
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
			String thumbnail, String filename, MediaType mediaType) {
		super(id, ObjectType.MEDIA, name, description, createdBy, dateCreated, lastModifiedBy, dateLastModified,
				likedByUsers, comments, tags, thumbnail);
		this.filename = filename;
		this.mediaType = mediaType;
	}

	/**
	 * Retrieves the filename of the media object.
	 * 
	 * @return the filename of the media object.
	 */
	public String getFilename() {
		return this.filename;
	}

	/**
	 * Retrieves the extension based on the filename.
	 * 
	 * @return the extension of the filename.
	 */
	public String getExtension() {
		String extension = null;
		if (this.filename != null) {
			String[] parts = this.filename.split("\\.");
			if (parts.length > 1) {
				extension = parts[parts.length - 1];
				if (extension.trim().equals("")) {
					extension = null;
				}
			}
		}
		return extension;
	}

	/**
	 * Sets the filename of the media object.
	 * 
	 * @param filename
	 *            - the filename of the media object.
	 */
	public void setFilename(String filename) {
		this.filename = filename;
	}

	/**
	 * Retrieves the type of media.
	 * 
	 * @return the type of media.
	 */
	public MediaType getMediaType() {
		return this.mediaType; 
	}

	/**
	 * Sets the type of media.
	 * 
	 * @param mediaType
	 *            - the type of media.
	 */
	public void setMediaType(MediaType mediaType) {
		this.mediaType = mediaType;
	}
}
