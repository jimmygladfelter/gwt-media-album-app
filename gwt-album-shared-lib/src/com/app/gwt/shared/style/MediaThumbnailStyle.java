package com.app.gwt.shared.style;

import java.io.Serializable;

/**
 * Represents an image style.
 * 
 * @author James C. Gladfelter
 */
public class MediaThumbnailStyle implements Serializable {

	private static final long serialVersionUID = 4474121024157796514L;

	protected Long mediaId;
	protected ImageSizeType sizeType;
	protected ImageRepeatType repeatType;
	protected String thumbnail;

	protected MediaThumbnailStyle() {
		// no-op - serializable
	}

	/**
	 * Creates a new media thumbnail style.
	 * 
	 * @param mediaId
	 * @param thumbnail
	 */
	public MediaThumbnailStyle(Long mediaId, String thumbnail) {
		this(mediaId, ImageSizeType.COVER, ImageRepeatType.NO_REPEAT, thumbnail);
	}

	/**
	 * Creates a new media thumbnail style.
	 * 
	 * @param mediaId
	 * @param sizeType
	 * @param repeatType
	 * @param thumbnail
	 */
	public MediaThumbnailStyle(Long mediaId, ImageSizeType sizeType, ImageRepeatType repeatType, String thumbnail) {
		super();
		this.mediaId = mediaId;
		this.sizeType = sizeType;
		this.repeatType = repeatType;
		this.thumbnail = thumbnail;
	}

	/**
	 * Retrieves the ID of the media object referenced in the style.
	 * 
	 * @return the ID of the media object referenced in the style.
	 */
	public Long getMediaId() {
		return this.mediaId;
	}

	/**
	 * Sets the ID of the media object referenced in the style.
	 * 
	 * @param mediaId
	 *            - the ID of the media object referenced in the style.
	 */
	public void setMediaId(Long mediaId) {
		this.mediaId = mediaId;
	}

	/**
	 * Retrieves the image size type.
	 * 
	 * @return the image size type.
	 */
	public ImageSizeType getSizeType() {
		return this.sizeType;
	}

	/**
	 * Sets the image size type.
	 * 
	 * @param sizeType
	 *            - the image size type.
	 */
	public void setSizeType(ImageSizeType sizeType) {
		this.sizeType = sizeType;
	}

	/**
	 * Retrieves the image repeat type.
	 * 
	 * @return the image repeat type.
	 */
	public ImageRepeatType getRepeatType() {
		return this.repeatType;
	}

	/**
	 * Sets the image repeat type.
	 * 
	 * @param repeatType
	 *            - the image repeat type.
	 */
	public void setRepeatType(ImageRepeatType repeatType) {
		this.repeatType = repeatType;
	}

	/**
	 * Retrieves a base64 representation of the image (thumbnail) of the media
	 * object.
	 * 
	 * @return a base64 representation of the image (thumbnail) of the media object.
	 */
	public String getThumbnail() {
		return this.thumbnail;
	}

	/**
	 * Sets a base64 representation of the image (thumbnail) of the media object.
	 * 
	 * @param profileImageThumbnail
	 *            - a base64 representation of the image (thumbnail) of the media
	 *            object..
	 */
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
}
