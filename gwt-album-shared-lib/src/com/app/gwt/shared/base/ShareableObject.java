package com.app.gwt.shared.base;

import java.util.Date;
import java.util.HashSet;
import java.util.Objects;

import com.app.gwt.shared.user.User;

/**
 * Represents the base of most objects.
 * 
 * @author James C. Gladfelter
 */
public class ShareableObject extends BaseObject {

	private static final long serialVersionUID = 5347222232843773455L;

	protected HashSet<String> tags;

	protected ShareableObject() {
		// no-op - serializable
	}

	/**
	 * Creates a new base object.
	 * 
	 * @param name
	 * @param description
	 * @param createdBy
	 */
	public ShareableObject(String name, String description, String createdBy) {
		this(name, description, createdBy, new Date().getTime());
	}

	/**
	 * Creates a new base object.
	 * 
	 * @param name
	 * @param description
	 * @param createdBy
	 * @param dateCreated
	 */
	public ShareableObject(String name, String description, String createdBy, Long dateCreated) {
		this(null, name, description, createdBy, dateCreated, createdBy, dateCreated, null);
	}

	/**
	 * Creates a new base object.
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
	public ShareableObject(Long id, String name, String description, String createdBy, Long dateCreated,
			String lastModifiedBy, Long dateLastModified, HashSet<String> tags) {
		super(id, name, description, createdBy, dateCreated, lastModifiedBy, dateLastModified);
		this.tags = tags;
	}

	/**
	 * Determines if the specified user is the owner of this object or not.
	 * 
	 * @param user
	 *            - a user.
	 * @return
	 */
	public boolean isOwner(User user) {
		String emailAddressOfUser = user != null ? user.getEmailAddress() : null;
		return emailAddressOfUser != null && this.createdBy != null ? Objects.equals(emailAddressOfUser, this.createdBy)
				: false;
	}

	/**
	 * Retrieves the searchable attributes that correspond to this object.
	 * 
	 * @return searchable attributes that correspond to this object.
	 */
	public HashSet<String> getTags() {
		return this.tags;
	}

	/**
	 * Sets searchable attributes that correspond to this object.
	 * 
	 * @param tags
	 *            - searchable attributes that correspond to this object.
	 */
	public void setTags(HashSet<String> tags) {
		this.tags = tags;
	}

	/**
	 * Adds a searchable attribute to the object.
	 * 
	 * @param tag
	 *            - a searchable attribute.
	 * @return
	 */
	public boolean addTag(String tag) {
		boolean added = false;
		if (tag != null && !tag.trim().equals("")) {
			if (this.tags == null) {
				this.tags = new HashSet<String>();
			}
			added = this.tags.add(tag);
		}
		return added;
	}

	/**
	 * Adds an array of searchable attributes to the object.
	 * 
	 * @param tags
	 *            - array of searchable attributes to the object.
	 */
	public void addTags(String... tags) {
		if (tags != null) {
			for (String tag : tags) {
				this.addTag(tag);
			}
		}
	}

	/**
	 * 
	 * Removes a searchable attribute from the object.
	 * 
	 * @param tag
	 *            - a searchable attribute.
	 * @return
	 */
	public boolean removeTag(String tag) {
		boolean removed = false;
		if (this.tags != null && tag != null && !tag.trim().equals("")) {
			removed = this.tags.remove(tag);
		}
		return removed;
	}

	/**
	 * Removes an array of searchable attributes from the object.
	 * 
	 * @param tags
	 *            - array of searchable attributes.
	 */
	public void removeTags(String... tags) {
		if (this.tags != null && tags != null) {
			for (String tag : tags) {
				this.removeTag(tag);
			}
		}
	}
}
