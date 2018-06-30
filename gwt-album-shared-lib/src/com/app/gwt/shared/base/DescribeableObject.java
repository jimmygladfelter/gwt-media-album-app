package com.app.gwt.shared.base;

import java.util.Date;

/**
 * Represents an object that can be described with a name and description.
 * 
 * @author James C. Gladfelter
 */
public class DescribeableObject extends LikeableBaseObject {

	private static final long serialVersionUID = 8840903972778981723L;

	protected String name;
	protected String description;

	protected DescribeableObject() {
		// no-op - serializable
	}

	/**
	 * Creates a new describeable object.
	 * 
	 * @param objectType
	 * @param name
	 * @param description
	 * @param createdBy
	 */
	public DescribeableObject(ObjectType objectType, String name, String description, String createdBy) {
		this(objectType, name, description, createdBy, new Date().getTime());
	}

	/**
	 * Creates a new describeable object.
	 * 
	 * @param objectType
	 * @param name
	 * @param description
	 * @param createdBy
	 * @param dateCreated
	 */
	public DescribeableObject(ObjectType objectType, String name, String description, String createdBy,
			Long dateCreated) {
		this(null, objectType, name, description, createdBy, dateCreated, createdBy, dateCreated, null);
	}

	/**
	 * Copies a {@link DescribeableObject}
	 * 
	 * @param toCopy
	 *            - the {@link DescribeableObject} to copy.
	 */
	public DescribeableObject(DescribeableObject toCopy) {
		super(toCopy);
		if (toCopy != null) {
			this.name = toCopy.name;
			this.description = toCopy.description;
		}
	}

	/**
	 * Creates a new describeable object.
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
	 */
	public DescribeableObject(Long id, ObjectType objectType, String name, String description, String createdBy,
			Long dateCreated, String lastModifiedBy, Long dateLastModified, StringSet likedByUsers) {
		super(id, objectType, createdBy, dateCreated, lastModifiedBy, dateLastModified, likedByUsers);
		this.name = name;
		this.description = description;
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
}
