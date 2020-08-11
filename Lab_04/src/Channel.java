
public class Channel {

	private String name;
	private Playlist[] playlists;
	private int nbp;

	public Channel(String name, int size) {
		this.name = name;
		playlists = new Playlist[size];
		nbp = 0;
	}

	private boolean isFull() {
		return nbp == playlists.length;
	}

	private int search(Playlist pl) {

		for (int i = 0; i < nbp; i++)
			if (pl.equals(playlists[i]))
				return i;
		return -1;
	}

	public boolean addPlaylist(Playlist pl) {
		if (isFull() || search(pl) != -1)
			return false;
		playlists[nbp++] = new Playlist(pl);
		return true;
	}

	public boolean deletePlaylist(Playlist pl) {
		int temp = search(pl);
		if (temp == -1)
			return false;
		playlists[temp] = playlists[nbp - 1];
		nbp--;
		return true;
	}

	public boolean flipSharedStatusOf(Playlist pl) {
		int temp = search(pl);
		if (temp == -1)
			return false;
		playlists[temp].setShared(!playlists[temp].isShared());
		return true;
	}

	private boolean isEmpty() {
		return nbp == 0;
	}

	public Playlist getPlaylist(Category category) {
		if (isEmpty())
			return null;
		int max = playlists[0].countVideosOf(category);
		int temp = 0;
		for (int i = 1; i < nbp; i++)
			if (playlists[i].countVideosOf(category) > max) {
				max = playlists[i].countVideosOf(category);
				temp = i;
			}

		return playlists[temp];
	}

	public void sortPlaylist() {
		for (int i = 0; i < nbp; i++)
			playlists[i].sortOnDuration();
	}
}
