package com.app.gwt.shared.comment;

import java.util.Date;

import com.app.gwt.shared.base.LikeableBaseObject;
import com.app.gwt.shared.base.ObjectType;
import com.app.gwt.shared.base.StringSet;

/**
 * Represents a comment.
 * 
 * @author James C. Gladfelter
 */
public class Comment extends LikeableBaseObject {

	private static final long serialVersionUID = -4236102662504819523L;

	protected Long commentedObjectId;
	protected ObjectType commentedObjectType;
	protected String comment;

	protected Comment() {
		// no-op - serializable
	}

	/**
	 * Creates a new comment.
	 * 
	 * @param createdBy
	 * @param commentedObjectId
	 * @param commentedObjectType
	 * @param comment
	 */
	public Comment(String createdBy, Long commentedObjectId, ObjectType commentedObjectType, String comment) {
		this(createdBy, new Date().getTime(), commentedObjectId, commentedObjectType, comment);
	}

	/**
	 * Creates a new comment.
	 * 
	 * @param createdBy
	 * @param dateCreated
	 * @param commentedObjectId
	 * @param commentedObjectType
	 * @param comment
	 */
	public Comment(String createdBy, Long dateCreated, Long commentedObjectId, ObjectType commentedObjectType,
			String comment) {
		this(null, createdBy, dateCreated, createdBy, dateCreated, null, commentedObjectId, commentedObjectType,
				comment);
	}

	/**
	 * Creates a new comment.
	 * 
	 * @param id
	 * @param createdBy
	 * @param dateCreated
	 * @param lastModifiedBy
	 * @param dateLastModified
	 * @param likedByUsers
	 * @param commentedObjectId
	 * @param commentedObjectType
	 * @param comment
	 */
	public Comment(Long id, String createdBy, Long dateCreated, String lastModifiedBy, Long dateLastModified,
			StringSet likedByUsers, Long commentedObjectId, ObjectType commentedObjectType, String comment) {
		super(id, ObjectType.COMMENT, createdBy, dateCreated, lastModifiedBy, dateLastModified, likedByUsers);
		this.commentedObjectId = commentedObjectId;
		this.commentedObjectType = commentedObjectType;
		this.comment = comment;
	}

	/**
	 * Retrieves the ID of the object the comment was made for.
	 * 
	 * @return the ID of the object the comment was made for.
	 */
	public Long getCommentedObjectId() {
		return this.commentedObjectId;
	}

	/**
	 * Sets the ID of the object the comment was made for.
	 * 
	 * @param commentedObjectId
	 *            - the ID of the object the comment was made for.
	 */
	public void setCommentedObjectId(Long commentedObjectId) {
		this.commentedObjectId = commentedObjectId;
	}

	/**
	 * Retrieves the type of object the comment was made for.
	 * 
	 * @return the type of object the comment was made for.
	 */
	public ObjectType getCommentedObjectType() {
		return this.commentedObjectType;
	}

	/**
	 * Sets the type of object the comment was made for.
	 * 
	 * @param commentedObjectType
	 *            - the type of object the comment was made for.
	 */
	public void setCommentedObjectType(ObjectType commentedObjectType) {
		this.commentedObjectType = commentedObjectType;
	}

	/**
	 * Retrieves the comment html made by the user.
	 * 
	 * @return the comment html made by the user.
	 */
	public String getComment() {
		return this.comment;
	}

	/**
	 * Sets the comment html made by the user.
	 * 
	 * @param comment
	 *            - the comment html made by the user.
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}
}
