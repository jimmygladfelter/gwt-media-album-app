package com.app.gwt.shared.base;

import java.util.ArrayList;
import java.util.Date;

import com.app.gwt.shared.comment.Comment;

/**
 * Represents an object that can commented on.
 * 
 * @author James C. Gladfelter
 */
public class CommentableObject extends DescribeableObject {

	private static final long serialVersionUID = 4710880130094782589L;

	protected ArrayList<Comment> comments;
	protected StringSet tags;

	protected CommentableObject() {
		// no-op - serializable
	}

	/**
	 * Creates a new commentable object.
	 * 
	 * @param objectType
	 * @param name
	 * @param description
	 * @param createdBy
	 */
	public CommentableObject(ObjectType objectType, String name, String description, String createdBy) {
		this(objectType, name, description, createdBy, new Date().getTime());
	}

	/**
	 * Creates a new commentable object.
	 * 
	 * @param objectType
	 * @param name
	 * @param description
	 * @param createdBy
	 * @param dateCreated
	 */
	public CommentableObject(ObjectType objectType, String name, String description, String createdBy,
			Long dateCreated) {
		this(null, objectType, name, description, createdBy, dateCreated, createdBy, dateCreated, null, null, null);
	}

	/**
	 * Copies a {@link CommentableObject}
	 * 
	 * @param toCopy
	 *            - the {@link CommentableObject} to copy.
	 */
	public CommentableObject(CommentableObject toCopy) {
		super(toCopy);
		if (toCopy != null) {
			// deep copy the array of comments.
			ArrayList<Comment> commentsToCopy = toCopy.getComments();
			if (commentsToCopy != null) {
				this.comments = new ArrayList<Comment>();
				for (Comment commentToCopy : commentsToCopy) {
					if (commentToCopy != null) {
						this.comments.add(new Comment(commentToCopy));
					}
				}
			}
			this.tags = toCopy.tags != null ? new StringSet(toCopy.tags) : null;
		}
	}

	/**
	 * Creates a new commentable object.
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
	 * @param comments
	 * @param tags
	 */
	public CommentableObject(Long id, ObjectType objectType, String name, String description, String createdBy,
			Long dateCreated, String lastModifiedBy, Long dateLastModified, StringSet likedByUsers,
			ArrayList<Comment> comments, StringSet tags) {
		super(id, objectType, name, description, createdBy, dateCreated, lastModifiedBy, dateLastModified,
				likedByUsers);
		this.comments = comments;
		this.tags = tags;
	}

	/**
	 * Retrieves the comments of the object, in order.
	 * 
	 * @return the comments of the object, in order.
	 */
	public ArrayList<Comment> getComments() {
		return this.comments;
	}

	/**
	 * Sets the comments of the object, in order..
	 * 
	 * @param comments
	 *            - the comments of the object, in order.
	 */
	public void setComments(ArrayList<Comment> comments) {
		this.comments = comments;
	}

	/**
	 * Determines if the specified comment is a part of the object.
	 * 
	 * @param comment
	 *            - a comment to look for.
	 * @return true / false whether or not the specified comment is a part of the
	 *         object.
	 */
	public boolean containsComment(Comment comment) {
		return this.comments != null ? this.comments.contains(comment) : false;
	}

	/**
	 * Adds a comment to the object.
	 * 
	 * @param comment
	 *            - a comment to be added.
	 * @return true / false whether the comment was added or not.
	 */
	public boolean addComment(Comment comment) {
		boolean added = false;
		if (comment != null) {
			if (this.comments == null) {
				this.comments = new ArrayList<Comment>();
			} else {
				// try to remove it first if in case it was already been added.
				this.removeComment(comment);
			}
			added = this.comments.add(comment);
		}
		return added;
	}

	/**
	 * Adds an array of comments to the object.
	 * 
	 * @param comments
	 *            - array of comments to be added.
	 */
	public void addComments(Comment... comments) {
		if (comments != null) {
			for (Comment comment : comments) {
				this.addComment(comment);
			}
		}
	}

	/**
	 * 
	 * Removes a comment from the object.
	 * 
	 * @param comment
	 *            - a comment to be removed.
	 * @return true / false whether the comment was removed or not.
	 */
	public boolean removeComment(Comment comment) {
		boolean removed = false;
		if (this.comments != null && comment != null) {
			removed = this.comments.remove(comment);
		}
		return removed;
	}

	/**
	 * Removes an array of comments from the object.
	 * 
	 * @param comments
	 *            - array of comments to be removed.
	 */
	public void removeComments(Comment... comments) {
		if (this.comments != null && comments != null) {
			for (Comment comment : comments) {
				this.removeComment(comment);
			}
		}
	}

	/**
	 * Retrieves the tags that correspond to this object.
	 * 
	 * @return the tags that correspond to this object.
	 */
	public StringSet getTags() {
		return this.tags;
	}

	/**
	 * Sets the tags that correspond to this object.
	 * 
	 * @param tags
	 *            - the tags that correspond to this object.
	 */
	public void setTags(StringSet tags) {
		this.tags = tags;
	}
}
