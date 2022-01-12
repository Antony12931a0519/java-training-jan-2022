package com.advanced_java_examples.friendbook.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Friends {
	@Id
	@Column
	private int friendId;
	@Column
	private String firstName;
	@Column
	private String lsatName;
	@Column
	private String address;
	@Column
	private String mobile;

	/**
	 * @return the friendId
	 */
	public int getFriendId() {
		return friendId;
	}

	/**
	 * @param friendId
	 *            the friendId to set
	 */
	public void setFriendId(int friendId) {
		this.friendId = friendId;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lsatName
	 */
	public String getLsatName() {
		return lsatName;
	}

	/**
	 * @param lsatName
	 *            the lsatName to set
	 */
	public void setLsatName(String lsatName) {
		this.lsatName = lsatName;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * @param mobile
	 *            the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
