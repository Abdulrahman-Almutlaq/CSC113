
public class Playlist {
	private String name;
	private boolean shared;
	private Video[] videos;
	private int nb;

	public Playlist() {
		this("no_name", false, 100);
	}

	public Playlist(Playlist pl) {
		name = pl.name;
		shared = pl.shared;
		videos = new Video[pl.videos.length];
		for (int i = 0; i < pl.nb; i++)
			videos[nb++] = pl.videos[i];
	}

	public Playlist(String name, boolean shared, int size) {
		this.name = name;
		this.shared = shared;
		videos = new Video[size];
		nb = 0;
	}

	public boolean addVideo(Video v) {
		if (nb == videos.length || search(v) != -1)
			return false;
		videos[nb++] = v;
		return true;

	}

	private int search(Video v) {

		for (int i = 0; i < nb; i++)
			if (v.equals(videos[i]))
				return i;

		return -1;
	}

	public boolean removeVideo(Video v) {
		int temp = search(v);
		if (temp == -1)
			return false;
		for (int i = temp; i + 1 < nb; i++)
			videos[i] = videos[i + 1];
		nb--;
		return true;
	}

	public int countVideosOf(Category c) {
		int counter = 0;
		for (int i = 0; i < nb; i++)
			if (videos[i].getCategory() == c)
				counter++;
		return counter;
	}

	public String getName() {
		return name;
	}

	public boolean isShared() {
		return shared;
	}

	public void setShared(boolean shared) {
		this.shared = shared;
	}

	public boolean equals(Playlist pl) {
		if (name.equalsIgnoreCase(pl.getName()))
			return true;
		return false;

	}

	public String toString() {
		return "name is " + name + " & it's shared status: " + shared;
	}

	public void sortOnDuration() {

		for (int i = 0; i < nb; i++)
			for (int j = i; j < nb; j++)
				if (videos[j].getDuration() > videos[j + 1].getDuration()) {
					Video temp = videos[j];
					videos[j] = videos[j + 1];
					videos[j + 1] = temp;
				}
	}
}
