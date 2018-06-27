package com.app.gwt.shared.album;

import java.util.Date;

import com.app.gwt.shared.base.BaseObject;

/**
 * Represents a page in an album.
 * 
 * @author James C. Gladfelter
 */
public class AlbumPage extends BaseObject {

	private static final long serialVersionUID = 8501362466937573883L;

	public AlbumPage() {
		// no-op - serializable
	}

	/**
	 * Creates a new page.
	 * 
	 * @param name
	 * @param description
	 * @param createdBy
	 */
	public AlbumPage(String name, String description, String createdBy) {
		this(name, description, createdBy, new Date().getTime());
	}

	/**
	 * Creates a new page.
	 * 
	 * @param name
	 * @param description
	 * @param createdBy
	 * @param dateCreated
	 */
	public AlbumPage(String name, String description, String createdBy, Long dateCreated) {
		this(null, name, description, createdBy, dateCreated, createdBy, dateCreated);
	}

	/**
	 * Creates a new page.
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
	public AlbumPage(Long id, String name, String description, String createdBy, Long dateCreated,
			String lastModifiedBy, Long dateLastModified) {
		super(id, name, description, createdBy, dateCreated, lastModifiedBy, dateLastModified);
	}
}
