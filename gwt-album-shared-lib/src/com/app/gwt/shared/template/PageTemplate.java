package com.app.gwt.shared.template;

import java.util.ArrayList;
import java.util.Date;

import com.app.gwt.shared.base.ObjectType;
import com.app.gwt.shared.base.StringSet;
import com.app.gwt.shared.base.ThumbnailObject;
import com.app.gwt.shared.comment.Comment;

/**
 * Represents a page template to be imported and used in albums.
 * 
 * @author James C. Gladfelter
 */
public class PageTemplate extends ThumbnailObject {

	private static final long serialVersionUID = 8204912947542573826L;

	protected PageTemplate() {
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
		this(null, name, description, createdBy, dateCreated, createdBy, dateCreated, null, null, null, null);
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
	 * @param likedByUsers
	 * @param comments
	 * @param tags
	 * @param thumbnail
	 */
	public PageTemplate(Long id, String name, String description, String createdBy, Long dateCreated,
			String lastModifiedBy, Long dateLastModified, StringSet likedByUsers, ArrayList<Comment> comments,
			StringSet tags, String thumbnail) {
		super(id, ObjectType.PAGE_TEMPLATE, name, description, createdBy, dateCreated, lastModifiedBy, dateLastModified,
				likedByUsers, comments, tags, thumbnail);
	}
}
