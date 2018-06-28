package com.app.gwt.shared.base;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Represents a set of strings that can be added to and searched.
 * 
 * @author James C. Gladfelter
 *
 */
public class StringSet implements Serializable, Iterable<String> {

	private static final long serialVersionUID = -151959758666760092L;

	protected HashSet<String> strings;

	/**
	 * Creates a new string set.
	 */
	public StringSet() {
		super();
	}

	/**
	 * Creates a new string set.
	 * 
	 * @param strings
	 */
	public StringSet(HashSet<String> strings) {
		super();
		this.strings = strings;
	}

	/**
	 * Retrieves the searchable attributes that correspond to this object.
	 * 
	 * @return searchable attributes that correspond to this object.
	 */
	public HashSet<String> getStrings() {
		return this.strings;
	}

	/**
	 * Retrieves the number of strings in the set.
	 * 
	 * @return the number of strings in the set.
	 */
	public int size() {
		return this.strings != null ? this.strings.size() : 0;
	}

	/**
	 * Clears all strings from the set.
	 */
	public void clear() {
		if (this.strings != null) {
			this.strings.clear();
			this.strings = null;
		}
	}

	/**
	 * Determines if there are any strings in the set.
	 * 
	 * @return true / false whether or not there are any strings in the set.
	 */
	public boolean isEmpty() {
		return this.strings != null ? this.strings.isEmpty() : true;
	}

	@Override
	public Iterator<String> iterator() {
		return this.strings != null ? this.strings.iterator() : new Iterator<String>() {

			@Override
			public boolean hasNext() {
				return false;
			}

			@Override
			public String next() {
				return null;
			}
		};
	}

	/**
	 * Sets searchable attributes that correspond to this object.
	 * 
	 * @param strings
	 *            - searchable attributes that correspond to this object.
	 */
	public void setStrings(HashSet<String> strings) {
		this.strings = null;
		if (strings != null) {
			this.strings = new HashSet<String>();
			for (String string : strings) {
				if (string == null || string.trim().equals("")) {
					continue;
				}
				String stringTrimmedLowercase = string.trim().toLowerCase();
				this.strings.add(stringTrimmedLowercase);
			}
			if (this.strings.isEmpty()) {
				this.strings = null;
			}
		}
	}

	/**
	 * Adds a searchable attribute to the object.
	 * 
	 * @param string
	 *            - a searchable attribute.
	 * @return true / false whether the string was added or not.
	 */
	public boolean addString(String string) {
		boolean added = false;
		if (string != null && !string.trim().equals("")) {
			if (this.strings == null) {
				this.strings = new HashSet<String>();
			}
			String stringTrimmedLowercase = string.trim().toLowerCase();
			added = this.strings.add(stringTrimmedLowercase);
		}
		return added;
	}

	/**
	 * Adds an array of searchable attributes to the object.
	 * 
	 * @param strings
	 *            - array of searchable attributes to the object.
	 */
	public void addStrings(String... strings) {
		if (strings != null) {
			for (String string : strings) {
				this.addString(string);
			}
		}
	}

	/**
	 * Determines if a string is associated with this object.
	 * 
	 * @param string
	 *            - the searchable attribute to look for.
	 * @return true / false whether or not the string is associated with the object.
	 */
	public boolean containsString(String string) {
		boolean contains = false;
		if (string != null && !string.trim().equals("")) {
			String stringTrimmedLowercase = string.trim().toLowerCase();
			contains = this.strings.contains(stringTrimmedLowercase);
		}
		return contains;
	}

	/**
	 * Determines if an array of strings is associated with this object.
	 * 
	 * @param strings
	 *            - the searchable attributes to look for.
	 * @param ensureAllAreContained
	 *            - determines if the contains function should return true if one is
	 *            found or if all strings in the specified array must be included.
	 * @return true / false whether or not the array of strings is associated with
	 *         the object.
	 */
	public boolean containsStrings(boolean ensureAllAreContained, String... strings) {
		boolean contains = false;
		if (this.strings != null && this.strings.size() > 0) {
			int numValidstrings = 0;
			int numContains = 0;
			for (String string : strings) {
				if (string == null || string.trim().equals("")) {
					continue;
				}
				String stringTrimmedLowercase = string.trim().toLowerCase();
				boolean thisstringIncluded = this.containsString(stringTrimmedLowercase);
				if (thisstringIncluded) {
					if (!ensureAllAreContained) {
						contains = true;
						break;
					}
					numContains++;
				}
				numValidstrings++;
			}
			contains = numValidstrings > 0 && numValidstrings == numContains;
		}
		return contains;
	}

	/**
	 * 
	 * Removes a searchable attribute from the object.
	 * 
	 * @param string
	 *            - a searchable attribute.
	 * @return true / false whether the string was removed or not.
	 */
	public boolean removeString(String string) {
		boolean removed = false;
		if (this.strings != null && string != null && !string.trim().equals("")) {
			String stringTrimmedLowercase = string.trim().toLowerCase();
			removed = this.strings.remove(stringTrimmedLowercase);
		}
		return removed;
	}

	/**
	 * Removes an array of searchable attributes from the object.
	 * 
	 * @param strings
	 *            - array of searchable attributes.
	 */
	public void removeStrings(String... strings) {
		if (this.strings != null && strings != null) {
			for (String string : strings) {
				this.removeString(string);
			}
		}
	}
}
