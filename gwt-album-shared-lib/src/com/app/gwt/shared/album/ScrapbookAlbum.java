package com.app.gwt.shared.album;

import java.io.Serializable;
import java.util.Date;

/**
 * Represents a scrapbook album.
 * 
 * @author James C. Gladfelter
 */
public class ScrapbookAlbum implements Serializable {

	private static final long serialVersionUID = 5377847268132854745L;

	protected Long id;
	protected String name;
	protected String description;
	protected String createdBy;
	protected Long dateCreated;
	protected String lastModifiedBy;
	protected Long dateLastModified;

	protected ScrapbookAlbum() {
		// no-op - serializable
	}

	/**
	 * Creates a new scrapbook album.
	 * 
	 * @param name
	 * @param description
	 * @param createdBy
	 */
	public ScrapbookAlbum(String name, String description, String createdBy) {
		this(name, description, createdBy, new Date().getTime());
	}

	/**
	 * Creates a new scrapbook album.
	 * 
	 * @param name
	 * @param description
	 * @param createdBy
	 * @param dateCreated
	 */
	public ScrapbookAlbum(String name, String description, String createdBy, Long dateCreated) {
		this(null, name, description, createdBy, dateCreated, createdBy, dateCreated);
	}

	/**
	 * Creates a new scrapbook album.
	 * 
	 * @param id
	 * @param name
	 * @param description
	 * @param createdBy
	 * @param dateCreated
	 * @param lastModifiedBy
	 * @param dateLastModified
	 */
	public ScrapbookAlbum(Long id, String name, String description, String createdBy, Long dateCreated,
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
	 * Retrieves the ID of the album.
	 * 
	 * @return the ID of the album.
	 */
	public Long getId() {
		return this.id;
	}

	/**
	 * Sets the ID of the album.
	 * 
	 * @param id
	 *            - the ID of the album.
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Retrieves the name of the album.
	 * 
	 * @return the name of the album.
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Sets the name of the album.
	 * 
	 * @param name
	 *            - the name of the album.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Retrieves the description given to the album.
	 * 
	 * @return the description of the album.
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * Sets the description of the album.
	 * 
	 * @param description
	 *            - a description given to the album.
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Retrieves the email address of the user who created the album.
	 * 
	 * @return the email address of the user who created the album.
	 */
	public String getCreatedBy() {
		return this.createdBy;
	}

	/**
	 * Sets the email address of the user who created the album.
	 * 
	 * @param createdBy
	 *            - the email address of the user who created the album.
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * Retrieves the date the album was created.
	 * 
	 * @return the date the album was created.
	 */
	public Long getDateCreated() {
		return this.dateCreated;
	}

	/**
	 * Sets the date that the album was created.
	 * 
	 * @param dateCreated
	 *            - the date the album was created.
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
}
