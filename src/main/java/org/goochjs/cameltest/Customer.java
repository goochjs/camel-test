/*
 * Copyright (C) 2013 Jeremy Gooch <http://www.linkedin.com/in/jeremygooch/>
 *
 * The licence covering the contents of this file is described in the file LICENCE.txt,
 * which should have been included as part of the distribution containing this file.
 */
package org.goochjs.cameltest;

import javax.xml.bind.annotation.XmlRootElement;

import org.apache.camel.util.ObjectHelper;

@XmlRootElement(name = "Customer")
public class Customer {
	private long id;
	private String name;

	public Customer() {
	}

	public Customer(long id, String name) {
		setId(id);
		setName(name);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Customer)) {
			return false;
		}

		if (this == obj) {
			return true;
		}

		Customer other = (Customer) obj;
		return id == other.id && ObjectHelper.equal(name, other.name);
	}

}
