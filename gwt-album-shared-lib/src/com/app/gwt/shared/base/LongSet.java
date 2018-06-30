package com.app.gwt.shared.base;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Represents a set of long integers that can be added to and searched.
 * 
 * @author James C. Gladfelter
 *
 */
public class LongSet implements Serializable, Iterable<Long> {

	private static final long serialVersionUID = -5753931690986729670L;

	protected HashSet<Long> longs;

	/**
	 * Creates a new Long Integer set.
	 */
	public LongSet() {
		super();
	}

	/**
	 * Copies a {@link LongSet}
	 * 
	 * @param toCopy
	 *            - the {@link LongSet} to copy.
	 */
	public LongSet(LongSet toCopy) {
		super();
		if (toCopy != null) {
			this.setLongs(toCopy.longs);
		}
	}

	/**
	 * Creates a new Long Integer set.
	 * 
	 * @param Longs
	 */
	public LongSet(HashSet<Long> longs) {
		super();
		this.longs = longs;
	}

	/**
	 * Retrieves the long integers that correspond to this object.
	 * 
	 * @return long integers that correspond to this object.
	 */
	public HashSet<Long> getLongs() {
		return this.longs;
	}

	/**
	 * Retrieves the number of Longs in the set.
	 * 
	 * @return the number of Longs in the set.
	 */
	public int size() {
		return this.longs != null ? this.longs.size() : 0;
	}

	/**
	 * Clears all Longs from the set.
	 */
	public void clear() {
		if (this.longs != null) {
			this.longs.clear();
			this.longs = null;
		}
	}

	/**
	 * Determines if there are any Longs in the set.
	 * 
	 * @return true / false whether or not there are any Longs in the set.
	 */
	public boolean isEmpty() {
		return this.longs != null ? this.longs.isEmpty() : true;
	}

	@Override
	public Iterator<Long> iterator() {
		return this.longs != null ? this.longs.iterator() : new Iterator<Long>() {

			@Override
			public boolean hasNext() {
				return false;
			}

			@Override
			public Long next() {
				return null;
			}
		};
	}

	/**
	 * Sets long integers that correspond to this object.
	 * 
	 * @param longs
	 *            - long integers that correspond to this object.
	 */
	public void setLongs(HashSet<Long> longs) {
		this.longs = null;
		if (longs != null) {
			this.longs = new HashSet<Long>();
			for (Long l : longs) {
				if (l == null) {
					continue;
				}
				this.longs.add(l);
			}
			if (this.longs.isEmpty()) {
				this.longs = null;
			}
		}
	}

	/**
	 * Adds a long integer to the object.
	 * 
	 * @param l
	 *            - a long integer.
	 * @return true / false whether the long integer was added or not.
	 */
	public boolean addLong(Long l) {
		boolean added = false;
		if (l != null) {
			if (this.longs == null) {
				this.longs = new HashSet<Long>();
			}
			added = this.longs.add(l);
		}
		return added;
	}

	/**
	 * Adds an array of long integers to the object.
	 * 
	 * @param Longs
	 *            - array of long integers to the object.
	 */
	public void addLongs(Long... longs) {
		if (longs != null) {
			for (Long l : longs) {
				this.addLong(l);
			}
		}
	}

	/**
	 * Determines if a long integer is associated with this object.
	 * 
	 * @param Long
	 *            - the long integer to look for.
	 * @return true / false whether or not the long integer is associated with the
	 *         object.
	 */
	public boolean containsLong(Long l) {
		boolean contains = false;
		if (l != null) {
			contains = this.longs.contains(l);
		}
		return contains;
	}

	/**
	 * Determines if an array of long integers is associated with this object.
	 * 
	 * @param Longs
	 *            - the long integers to look for.
	 * @param ensureAllAreContained
	 *            - determines if the contains function should return true if one is
	 *            found or if all long integers in the specified array must be
	 *            included.
	 * @return true / false whether or not the array of long integers is associated
	 *         with the object.
	 */
	public boolean containsLongs(boolean ensureAllAreContained, Long... longs) {
		boolean contains = false;
		if (this.longs != null && this.longs.size() > 0) {
			int numValidLongs = 0;
			int numContains = 0;
			for (Long l : longs) {
				if (l == null) {
					continue;
				}
				boolean thisLongIncluded = this.containsLong(l);
				if (thisLongIncluded) {
					if (!ensureAllAreContained) {
						contains = true;
						break;
					}
					numContains++;
				}
				numValidLongs++;
			}
			contains = numValidLongs > 0 && numValidLongs == numContains;
		}
		return contains;
	}

	/**
	 * 
	 * Removes a long integer from the object.
	 * 
	 * @param l
	 *            - a long integer.
	 * @return true / false whether the long integer was removed or not.
	 */
	public boolean removeLong(Long l) {
		boolean removed = false;
		if (this.longs != null && l != null) {
			removed = this.longs.remove(l);
		}
		return removed;
	}

	/**
	 * Removes an array of long integers from the object.
	 * 
	 * @param Longs
	 *            - array of long integers.
	 */
	public void removeLongs(Long... longs) {
		if (this.longs != null && longs != null) {
			for (Long l : longs) {
				this.removeLong(l);
			}
		}
	}
}
