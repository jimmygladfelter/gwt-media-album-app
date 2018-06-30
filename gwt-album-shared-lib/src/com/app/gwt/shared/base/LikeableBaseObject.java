package com.app.gwt.shared.base;

import java.util.Date;

/**
 * Represents an object that can be described with a name and description.
 * 
 * @author James C. Gladfelter
 */
public class LikeableBaseObject extends BaseObject {

	private static final long serialVersionUID = 6481539001870443930L;

	protected StringSet likedByUsers;

	protected LikeableBaseObject() {
		// no-op - serializable
	}

	/**
	 * Creates a new likeable base object.
	 * 
	 * @param objectType
	 * @param name
	 * @param description
	 * @param createdBy
	 */
	public LikeableBaseObject(ObjectType objectType, String createdBy) {
		this(objectType, createdBy, new Date().getTime());
	}

	/**
	 * Creates a new likeable base object.
	 * 
	 * @param objectType
	 * @param name
	 * @param description
	 * @param createdBy
	 * @param dateCreated
	 */
	public LikeableBaseObject(ObjectType objectType, String createdBy, Long dateCreated) {
		this(null, objectType, createdBy, dateCreated, createdBy, dateCreated, null);
	}

	/**
	 * Copies a {@link LikeableBaseObject}
	 * 
	 * @param toCopy
	 *            - the {@link LikeableBaseObject} to copy.
	 */
	public LikeableBaseObject(LikeableBaseObject toCopy) {
		super(toCopy);
		if (toCopy != null) {
			this.likedByUsers = toCopy.likedByUsers != null ? new StringSet(toCopy.likedByUsers) : null;
		}
	}

	/**
	 * Creates a new likeable base object.
	 * 
	 * @param id
	 * @param objectType
	 * @param createdBy
	 * @param dateCreated
	 * @param lastModifiedBy
	 * @param dateLastModified
	 * @param likedByUsers
	 */
	public LikeableBaseObject(Long id, ObjectType objectType, String createdBy, Long dateCreated, String lastModifiedBy,
			Long dateLastModified, StringSet likedByUsers) {
		super(id, objectType, createdBy, dateCreated, lastModifiedBy, dateLastModified);
		this.likedByUsers = likedByUsers;
	}

	/**
	 * Retrieves the users that have 'liked' this object.
	 * 
	 * @return the users that have 'liked' this object.
	 */
	public StringSet getLikedByUser() {
		return this.likedByUsers;
	}

	/**
	 * Sets the users that have 'liked' this object.
	 * 
	 * @param tags
	 *            - the users that have 'liked' this object.
	 */
	public void setLikedByUsers(StringSet likedByUsers) {
		this.likedByUsers = likedByUsers;
	}
}
