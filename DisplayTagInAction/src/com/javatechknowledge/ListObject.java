/**
 * Licensed under the Artistic License; you may not use this file
 * except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://displaytag.sourceforge.net/license.html
 *
 * THIS PACKAGE IS PROVIDED "AS IS" AND WITHOUT ANY EXPRESS OR
 * IMPLIED WARRANTIES, INCLUDING, WITHOUT LIMITATION, THE IMPLIED
 * WARRANTIES OF MERCHANTIBILITY AND FITNESS FOR A PARTICULAR PURPOSE.
 */
package com.javatechknowledge;

import java.util.Random;

public class ListObject
{

    private static final long serialVersionUID = 42L;
    private static Random random = new Random();
    private int id = -1;
    private String name;
    private String email;
    private double money;
    private String description;
    private String longDescription;
    private String status;
    private String url;

    public ListObject()
    {
        this.id = random.nextInt(99998) + 1;
        this.money = (random.nextInt(999998) + 1) / 100;
        String firstName = "vipul";
        String lastName = "test";
        this.name = "vipul chauhan" +firstName;
        this.email = "test@iana.com";
        this.description = "nothing";
        this.longDescription = "test";
        this.status = "welcome";
        this.url = "http://www." + lastName + ".org/"; //$NON-NLS-1$ //$NON-NLS-2$
    }

	public static Random getRandom() {
		return random;
	}

	public static void setRandom(Random random) {
		ListObject.random = random;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "ListObject [id=" + id + ", name=" + name + ", email=" + email
				+ ", money=" + money + ", description=" + description
				+ ", longDescription=" + longDescription + ", status=" + status
				+ ", url=" + url + "]";
	}
   


}
