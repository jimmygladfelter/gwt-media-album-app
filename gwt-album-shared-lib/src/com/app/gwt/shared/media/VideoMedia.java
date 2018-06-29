package com.app.gwt.shared.media;

import java.util.ArrayList;
import java.util.Date;

import com.app.gwt.shared.base.StringSet;
import com.app.gwt.shared.comment.Comment;

/**
 * Represents video media data.
 * 
 * @author James C. Gladfelter
 */
public class VideoMedia extends Media {

	private static final long serialVersionUID = 6850820538549858801L;

	protected VideoMedia() {
		// no-op - serializable
	}

	/**
	 * Creates a new video media object.
	 * 
	 * @param name
	 * @param description
	 * @param createdBy
	 * @param filename
	 */
	public VideoMedia(String name, String description, String createdBy, String filename) {
		this(name, description, createdBy, new Date().getTime(), filename);
	}

	/**
	 * Creates a new video media object.
	 * 
	 * @param name
	 * @param description
	 * @param createdBy
	 * @param dateCreated
	 * @param filename
	 */
	public VideoMedia(String name, String description, String createdBy, Long dateCreated, String filename) {
		this(null, name, description, createdBy, dateCreated, createdBy, dateCreated, null, null, null, null, filename);
	}

	/**
	 * Creates a new video media object.
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
	 * @param filename
	 */
	public VideoMedia(Long id, String name, String description, String createdBy, Long dateCreated,
			String lastModifiedBy, Long dateLastModified, StringSet likedByUsers, ArrayList<Comment> comments,
			StringSet tags, String thumbnail, String filename) {
		super(id, name, description, createdBy, dateCreated, lastModifiedBy, dateLastModified, likedByUsers, comments,
				tags, thumbnail, filename, MediaType.VIDEO);
	}

	/**
	 * Retrieves the video extension type of the media.
	 * 
	 * @return the video extension type of the media.
	 */
	public VideoExtensionType getVideoExtensionType() {
		return VideoExtensionType.toVideoExtensionType(this.getExtension());
	}
}
