package com.app.gwt.shared.album;

import java.util.Date;
import java.util.HashSet;

import com.app.gwt.shared.base.ShareableObject;

/**
 * Represents a scrapbook album.
 * 
 * @author James C. Gladfelter
 */
public class ScrapbookAlbum extends ShareableObject {

	private static final long serialVersionUID = 3082862037841205346L;

	protected ScrapbookAlbum() {
		// no-op - serializable
	}

	/**
	 * Creates a new album.
	 * 
	 * @param name
	 * @param description
	 * @param createdBy
	 */
	public ScrapbookAlbum(String name, String description, String createdBy) {
		this(name, description, createdBy, new Date().getTime());
	}

	/**
	 * Creates a new album.
	 * 
	 * @param name
	 * @param description
	 * @param createdBy
	 * @param dateCreated
	 */
	public ScrapbookAlbum(String name, String description, String createdBy, Long dateCreated) {
		this(null, name, description, createdBy, dateCreated, createdBy, dateCreated, null);
	}

	/**
	 * Creates a new album.
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
	public ScrapbookAlbum(Long id, String name, String description, String createdBy, Long dateCreated,
			String lastModifiedBy, Long dateLastModified, HashSet<String> tags) {
		super(id, name, description, createdBy, dateCreated, lastModifiedBy, dateLastModified, tags);
	}
}
