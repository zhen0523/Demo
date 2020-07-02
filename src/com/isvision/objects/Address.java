package com.isvision.objects;

//Address是不可变类，当程序创建了Address对象后，就无法修改Address对象的detail和postCode
public class Address {
	private final String detail;
	private final String postCode;
	public Address() {
		this.detail = "";
		this.postCode = "";
	}
	public Address(String detail, String postCode) {
		super();
		this.detail = detail;
		this.postCode = postCode;
	}
	public String getDetail() {
		return detail;
	}
	public String getPostCode() {
		return postCode;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((detail == null) ? 0 : detail.hashCode());
		result = prime * result + ((postCode == null) ? 0 : postCode.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		if (detail == null) {
			if (other.detail != null)
				return false;
		} else if (!detail.equals(other.detail))
			return false;
		if (postCode == null) {
			if (other.postCode != null)
				return false;
		} else if (!postCode.equals(other.postCode))
			return false;
		return true;
	}
}
