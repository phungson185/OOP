package hust.soict.hedspi.aims.media;

public abstract class Media {
	protected int id;
	protected String title;
	protected String category;
	protected float cost;

	public Media() {
	}

	public Media(String title) {
		this.title = title;
	}

	public Media(String title, String category) {
		this.title = title;
		this.category = category;
	}

	public Media(String title, String category, float cost) {
		this.title = title;
		this.category = category;
		this.cost = cost;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public abstract void print();

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Media) {
			Media a = (Media) obj;
			if (this.id == a.id) {
				return true;
			}
		}
		return false;
	}

	public int compareTo(Media obj) {
		return title.compareTo((obj).getTitle());
	}
}