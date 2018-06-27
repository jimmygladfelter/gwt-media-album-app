package com.app.gwt.shared.media;

import java.util.Date;
import java.util.HashSet;

import com.app.gwt.shared.base.ShareableObject;

/**
 * Represents the base class for all media related objects.
 * 
 * @author James C. Gladfelter
 */
public class Media extends ShareableObject {

	private static final long serialVersionUID = 7624177293055464910L;

	protected String thumbnail;

	public Media() {
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
		this(null, name, description, createdBy, dateCreated, createdBy, dateCreated, null, null);
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
	 * @param tags
	 */
	public Media(Long id, String name, String description, String createdBy, Long dateCreated, String lastModifiedBy,
			Long dateLastModified, HashSet<String> tags, String thumbnail) {
		super(id, name, description, createdBy, dateCreated, lastModifiedBy, dateLastModified, tags);
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
