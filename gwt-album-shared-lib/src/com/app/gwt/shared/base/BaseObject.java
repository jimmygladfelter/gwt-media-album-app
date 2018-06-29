package com.app.gwt.shared.base;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import com.app.gwt.shared.user.User;

/**
 * Represents the base of most objects.
 * 
 * @author James C. Gladfelter
 */
public class BaseObject implements Serializable {

	private static final long serialVersionUID = 308379500092490739L;

	protected Long id;
	protected ObjectType objectType;
	protected String createdBy;
	protected Long dateCreated;
	protected String lastModifiedBy;
	protected Long dateLastModified;

	protected BaseObject() {
		// no-op - serializable
	}

	/**
	 * Creates a new base object.
	 * 
	 * @param objectType
	 * @param createdBy
	 */
	public BaseObject(ObjectType objectType, String createdBy) {
		this(objectType, createdBy, new Date().getTime());
	}

	/**
	 * Creates a new base object.
	 * 
	 * @param objectType
	 * @param createdBy
	 * @param dateCreated
	 */
	public BaseObject(ObjectType objectType, String createdBy, Long dateCreated) {
		this(null, objectType, createdBy, dateCreated, createdBy, dateCreated);
	}

	/**
	 * Creates a new base object.
	 * 
	 * @param id
	 * @param objectType
	 * @param createdBy
	 * @param dateCreated
	 * @param lastModifiedBy
	 * @param dateLastModified
	 * @param likedByUsers
	 */
	public BaseObject(Long id, ObjectType objectType, String createdBy, Long dateCreated, String lastModifiedBy,
			Long dateLastModified) {
		super();
		this.id = id;
		this.objectType = objectType;
		this.createdBy = createdBy;
		this.dateCreated = dateCreated;
		this.lastModifiedBy = lastModifiedBy;
		this.dateLastModified = dateLastModified;
	}

	/**
	 * Retrieves the ID of the object.
	 * 
	 * @return the ID of the object.
	 */
	public Long getId() {
		return this.id;
	}

	/**
	 * Determines if the object has an ID or not.
	 * 
	 * @return
	 */
	public boolean hasId() {
		return this.id != null;
	}

	/**
	 * Sets the ID of the object.
	 * 
	 * @param id
	 *            - the ID of the object.
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Retrieves the type of the object.
	 * 
	 * @return - the type of the object.
	 */
	public ObjectType getObjectType() {
		return this.objectType;
	}

	/**
	 * Sets the type of the object.
	 * 
	 * @param objectType
	 *            - the type of object.
	 */
	public void setObjectType(ObjectType objectType) {
		this.objectType = objectType;
	}

	/**
	 * Determines if the specified user is the owner of this object or not.
	 * 
	 * @param user
	 *            - a user.
	 * @return true / false whether or not the specified user is the owner of this
	 *         object or not.
	 */
	public boolean isOwner(User user) {
		String emailAddressOfUser = user != null ? user.getEmailAddress() : null;
		return emailAddressOfUser != null && this.createdBy != null ? Objects.equals(emailAddressOfUser, this.createdBy)
				: false;
	}

	/**
	 * Determines if the specified user can edit this object. By default, only an
	 * admin user or the user who created the object can edit or delete it.
	 * 
	 * @param user
	 *            - a user.
	 * @return true / false whether or not the specified user can edit this object.
	 */
	public boolean isEditable(User user) {
		boolean isUserAdmin = user != null ? user.isAdmin() : false;
		return isUserAdmin || this.isOwner(user);
	}

	/**
	 * Determines if the specified user can delete this object. By default, only an
	 * admin user or the user who created the object can edit or delete it.
	 * 
	 * @param user
	 *            - a user.
	 * @return true / false whether or not the specified user can delete this
	 *         object.
	 */
	public boolean isDeleteable(User user) {
		boolean isUserAdmin = user != null ? user.isAdmin() : false;
		return isUserAdmin || this.isOwner(user);
	}

	/**
	 * Retrieves the email address of the user who created the object.
	 * 
	 * @return the email address of the user who created the object.
	 */
	public String getCreatedBy() {
		return this.createdBy;
	}

	/**
	 * Sets the email address of the user who created the object.
	 * 
	 * @param createdBy
	 *            - the email address of the user who created the object.
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * Retrieves the date the object was created.
	 * 
	 * @return the date the object was created.
	 */
	public Long getDateCreated() {
		return this.dateCreated;
	}

	/**
	 * Sets the date that the object was created.
	 * 
	 * @param dateCreated
	 *            - the date the object was created.
	 */
	public void setDateCreated(Long dateCreated) {
		this.dateCreated = dateCreated;
	}

	/**
	 * Retrieves the email address of the user who last modified the album.
	 * 
	 * @return the email address of the user who last modified the album.
	 */
	public String getLastModifiedBy() {
		return this.lastModifiedBy;
	}

	/**
	 * Sets the email address of the user who last modified the album.
	 * 
	 * @param lastModifiedBy
	 *            - the email address of the user who last modified the album.
	 */
	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	/**
	 * Retrieves the date the album was last modified.
	 * 
	 * @return the date the album was last modified.
	 */
	public Long getDateLastModified() {
		return this.dateLastModified;
	}

	/**
	 * Sets the date the album was last modified.
	 * 
	 * @param dateLastModified
	 *            - the date the album was last modified.
	 */
	public void setDateLastModified(Long dateLastModified) {
		this.dateLastModified = dateLastModified;
	}

	@Override
	public boolean equals(Object obj) {
		boolean eq = false;
		if (obj instanceof BaseObject) {
			BaseObject obj2 = (BaseObject) obj;
			Long id2 = obj2.id;
			if (this.id == null && id2 == null) {
				eq = super.equals(obj2);
			} else {
				// to be equal, the type must be the same as well as the ID.
				eq = Objects.equals(this.objectType, obj2.objectType);
				if (eq) {
					eq = Objects.equals(this.id, id2);
				}
			}
		}
		return eq;
	}
}
