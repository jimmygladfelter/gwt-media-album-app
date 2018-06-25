package com.app.gwt.shared.template;

import java.io.Serializable;
import java.util.Date;

/**
 * Represents a scrapbook template.
 * 
 * @author James C. Gladfelter
 */
public class ScrapbookTemplate implements Serializable {

	private static final long serialVersionUID = 5377847268132854745L;

	protected Long id;
	protected String name;
	protected String description;
	protected String createdBy;
	protected Long dateCreated;
	protected String lastModifiedBy;
	protected Long dateLastModified;

	protected ScrapbookTemplate() {
		// no-op - serializable
	}

	/**
	 * Creates a new scrapbook template.
	 * 
	 * @param name
	 * @param description
	 * @param createdBy
	 */
	public ScrapbookTemplate(String name, String description, String createdBy) {
		this(name, description, createdBy, new Date().getTime());
	}

	/**
	 * Creates a new scrapbook template.
	 * 
	 * @param name
	 * @param description
	 * @param createdBy
	 * @param dateCreated
	 */
	public ScrapbookTemplate(String name, String description, String createdBy, Long dateCreated) {
		this(null, name, description, createdBy, dateCreated, createdBy, dateCreated);
	}

	/**
	 * Creates a new scrapbook template.
	 * 
	 * @param id
	 * @param name
	 * @param description
	 * @param createdBy
	 * @param dateCreated
	 * @param lastModifiedBy
	 * @param dateLastModified
	 */
	public ScrapbookTemplate(Long id, String name, String description, String createdBy, Long dateCreated,
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
	 * Retrieves the ID of the template.
	 * 
	 * @return the ID of the template.
	 */
	public Long getId() {
		return this.id;
	}

	/**
	 * Sets the ID of the template.
	 * 
	 * @param id
	 *            - the ID of the template.
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Retrieves the name of the template.
	 * 
	 * @return the name of the template.
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Sets the name of the template.
	 * 
	 * @param name
	 *            - the name of the template.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Retrieves the description given to the template.
	 * 
	 * @return the description of the template.
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * Sets the description of the template.
	 * 
	 * @param description
	 *            - a description given to the template.
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Retrieves the email address of the user who created the template.
	 * 
	 * @return the email address of the user who created the template.
	 */
	public String getCreatedBy() {
		return this.createdBy;
	}

	/**
	 * Sets the email address of the user who created the template.
	 * 
	 * @param createdBy
	 *            - the email address of the user who created the template.
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * Retrieves the date the template was created.
	 * 
	 * @return the date the template was created.
	 */
	public Long getDateCreated() {
		return this.dateCreated;
	}

	/**
	 * Sets the date that the template was created.
	 * 
	 * @param dateCreated
	 *            - the date the template was created.
	 */
	public void setDateCreated(Long dateCreated) {
		this.dateCreated = dateCreated;
	}

	/**
	 * Retrieves the email address of the user who last modified the template.
	 * 
	 * @return the email address of the user who last modified the template.
	 */
	public String getLastModifiedBy() {
		return this.lastModifiedBy;
	}

	/**
	 * Sets the email address of the user who last modified the template.
	 * 
	 * @param lastModifiedBy
	 *            - the email address of the user who last modified the template.
	 */
	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	/**
	 * Retrieves the date the template was last modified.
	 * 
	 * @return the date the template was last modified.
	 */
	public Long getDateLastModified() {
		return this.dateLastModified;
	}

	/**
	 * Sets the date the template was last modified.
	 * 
	 * @param dateLastModified
	 *            - the date the template was last modified.
	 */
	public void setDateLastModified(Long dateLastModified) {
		this.dateLastModified = dateLastModified;
	}
}
