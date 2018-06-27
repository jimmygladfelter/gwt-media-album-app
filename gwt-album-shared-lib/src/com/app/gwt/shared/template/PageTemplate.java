package com.app.gwt.shared.template;

import java.util.Date;
import java.util.HashSet;

import com.app.gwt.shared.base.ShareableObject;

/**
 * Represents a page template to be imported and used in albums.
 * 
 * @author James C. Gladfelter
 */
public class PageTemplate extends ShareableObject {

	private static final long serialVersionUID = 8204912947542573826L;

	public PageTemplate() {
		// no-op - serializable
	}

	/**
	 * Creates a new page template.
	 * 
	 * @param name
	 * @param description
	 * @param createdBy
	 */
	public PageTemplate(String name, String description, String createdBy) {
		this(name, description, createdBy, new Date().getTime());
	}

	/**
	 * Creates a new page template.
	 * 
	 * @param name
	 * @param description
	 * @param createdBy
	 * @param dateCreated
	 */
	public PageTemplate(String name, String description, String createdBy, Long dateCreated) {
		this(null, name, description, createdBy, dateCreated, createdBy, dateCreated, null);
	}

	/**
	 * Creates a new page template.
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
	public PageTemplate(Long id, String name, String description, String createdBy, Long dateCreated,
			String lastModifiedBy, Long dateLastModified, HashSet<String> tags) {
		super(id, name, description, createdBy, dateCreated, lastModifiedBy, dateLastModified, tags);
	}
}
