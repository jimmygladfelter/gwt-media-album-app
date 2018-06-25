package com.app.gwt.shared.user;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * Represents a user in the application.
 * 
 * @author James C. Gladfelter
 */
public class User implements Serializable {

	private static final long serialVersionUID = 4141769957652844939L;

	protected String emailAddress;
	protected String firstName;
	protected String lastName;
	protected String bio;
	protected Long dateCreated;
	protected String profileImageThumbnail;

	protected User() {
		// no-op - serializable
	}

	/**
	 * Creates a new user.
	 * 
	 * @param emailAddress
	 */
	public User(String emailAddress) {
		this(emailAddress, new Date().getTime());
	}

	/**
	 * Creates a new user.
	 * 
	 * @param emailAddress
	 * @param dateCreated
	 */
	public User(String emailAddress, Long dateCreated) {
		this(emailAddress, null, null, null, dateCreated, null);
	}

	/**
	 * Creates a new user.
	 * 
	 * @param emailAddress
	 * @param firstName
	 * @param lastName
	 * @param bio
	 * @param dateCreated
	 * @param profileImageThumbnail
	 */
	public User(String emailAddress, String firstName, String lastName, String bio, Long dateCreated,
			String profileImageThumbnail) {
		super();
		this.emailAddress = emailAddress;
		this.firstName = firstName;
		this.lastName = lastName;
		this.bio = bio;
		this.dateCreated = dateCreated;
		this.profileImageThumbnail = profileImageThumbnail;
	}

	/**
	 * Retrieves the email address of the user.
	 * 
	 * @return the email address of the user.
	 */
	public String getEmailAddress() {
		return this.emailAddress;
	}

	/**
	 * Sets the email address of the user.
	 * 
	 * @param emailAddress
	 *            - the email address of the user.
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	/**
	 * Retrieves the first name of the user.
	 * 
	 * @return the first name of the user.
	 */
	public String getFirstName() {
		return this.firstName;
	}

	/**
	 * Sets the first name of the user.
	 * 
	 * @param firstName
	 *            - the first name of the user.
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Retrieves the last name of the user.
	 * 
	 * @return the last name of the user.
	 */
	public String getLastName() {
		return this.lastName;
	}

	/**
	 * Sets the last name of the user.
	 * 
	 * @param lastName
	 *            - the last name of the user.
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Retrieves a biography detailing information about the user.
	 * 
	 * @return a biography of the user.
	 */
	public String getBio() {
		return this.lastName;
	}

	/**
	 * Sets biography information about the user.
	 * 
	 * @param bio
	 *            - information about the user.
	 */
	public void setBio(String bio) {
		this.bio = bio;
	}

	/**
	 * Retrieves the date that the user was created and registered in the system.
	 * 
	 * @return the date the user was created.
	 */
	public Long getDateCreated() {
		return this.dateCreated;
	}

	/**
	 * Sets the date the user was created and registered in the system.
	 * 
	 * @param dateCreated
	 *            - the date the user was created.
	 */
	public void setDateCreated(Long dateCreated) {
		this.dateCreated = dateCreated;
	}

	/**
	 * Retrieves a base64 representation of the profile image (thumbnail) of the
	 * user.
	 * 
	 * @return a base64 representation of the profile image (thumbnail) of the user.
	 */
	public String getProfileImageThumbnail() {
		return this.profileImageThumbnail;
	}

	/**
	 * Sets a base64 representation of the profile image (thumbnail) of the user.
	 * 
	 * @param profileImageThumbnail
	 *            - a base64 representation of the profile image (thumbnail) of the
	 *            user.
	 */
	public void setProfileImageThumbnail(String profileImageThumbnail) {
		this.profileImageThumbnail = profileImageThumbnail;
	}

	@Override
	public boolean equals(Object obj) {
		boolean eq = false;
		if (obj instanceof User) {
			eq = Objects.equals(this.emailAddress, ((User) obj).emailAddress);
		}
		return eq;
	}
}
