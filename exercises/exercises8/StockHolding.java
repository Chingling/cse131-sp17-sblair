package exercises8;

public class StockHolding {
	private final String name, owner;
	private int number, price;
	public StockHolding(String name, String owner, int number, int price) {
		this.name = name;
		this.owner = owner;
		this.number = number;
		this.price = price;
	}
	
	
	public void setNumber(int number) {
		this.number = number;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public String getOwner() {
		return owner;
	}


	public int getNumber() {
		return number;
	}


	public int getPrice() {
		return price;
	}


	@Override
	public String toString() {
		return "StockHolding [name=" + name + ", owner=" + owner + ", number=" + number + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + number;
		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
		result = prime * result + price;
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
		StockHolding other = (StockHolding) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number != other.number)
			return false;
		if (owner == null) {
			if (other.owner != null)
				return false;
		} else if (!owner.equals(other.owner))
			return false;
		if (price != other.price)
			return false;
		return true;
	}
	
	
	
}
