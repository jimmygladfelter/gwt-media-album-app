package com.app.gwt.shared.media;

import java.util.ArrayList;
import java.util.Date;

import com.app.gwt.shared.base.StringSet;
import com.app.gwt.shared.comment.Comment;

/**
 * Represents image media data.
 * 
 * @author James C. Gladfelter
 */
public class ImageMedia extends Media {

	private static final long serialVersionUID = 6850820538549858801L;

	protected ImageMedia() {
		// no-op - serializable
	}

	/**
	 * Creates a new image media object.
	 * 
	 * @param name
	 * @param description
	 * @param createdBy
	 * @param filename
	 */
	public ImageMedia(String name, String description, String createdBy, String filename) {
		this(name, description, createdBy, new Date().getTime(), filename);
	}

	/**
	 * Creates a new image media object.
	 * 
	 * @param name
	 * @param description
	 * @param createdBy
	 * @param dateCreated
	 * @param filename
	 */
	public ImageMedia(String name, String description, String createdBy, Long dateCreated, String filename) {
		this(null, name, description, createdBy, dateCreated, createdBy, dateCreated, null, null, null, null, filename);
	}

	/**
	 * Copies a {@link ImageMedia}
	 * 
	 * @param toCopy
	 *            - the {@link ImageMedia} to copy.
	 */
	public ImageMedia(ImageMedia toCopy) {
		super(toCopy);
	}

	/**
	 * Creates a new image media object.
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
	public ImageMedia(Long id, String name, String description, String createdBy, Long dateCreated,
			String lastModifiedBy, Long dateLastModified, StringSet likedByUsers, ArrayList<Comment> comments,
			StringSet tags, String thumbnail, String filename) {
		super(id, name, description, createdBy, dateCreated, lastModifiedBy, dateLastModified, likedByUsers, comments,
				tags, thumbnail, filename, MediaType.IMAGE);
	}

	/**
	 * Retrieves the image extension type of the media.
	 * 
	 * @return the image extension type of the media.
	 */
	public ImageExtensionType getImageExtensionType() {
		return ImageExtensionType.toImageExtensionType(this.getExtension());
	}
}
