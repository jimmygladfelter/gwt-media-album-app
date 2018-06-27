package com.app.gwt.shared.base;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * Represents the base of most objects.
 * 
 * @author James C. Gladfelter
 */
public class BaseObject implements Serializable {

	private static final long serialVersionUID = 308379500092490739L;

	protected Long id;
	protected String name;
	protected String description;
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
	 * @param name
	 * @param description
	 * @param createdBy
	 */
	public BaseObject(String name, String description, String createdBy) {
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
	public BaseObject(String name, String description, String createdBy, Long dateCreated) {
		this(null, name, description, createdBy, dateCreated, createdBy, dateCreated);
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
	public BaseObject(Long id, String name, String description, String createdBy, Long dateCreated,
			String lastModifiedBy, Long dateLastModified) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
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
	 * Retrieves the name of the object.
	 * 
	 * @return the name of the object.
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Sets the name of the object.
	 * 
	 * @param name
	 *            - the name of the object.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Retrieves the description given to the object.
	 * 
	 * @return the description of the object.
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * Sets the description of the object.
	 * 
	 * @param description
	 *            - a description given to the object.
	 */
	public void setDescription(String description) {
		this.description = description;
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
				eq = Objects.equals(this.id, id2);
			}
		}
		return eq;
	}
}
