
public class Similarity {
	private int user;
	private float Cosine;
	public int getuser() {
		return user;
	}
	public void setuser(int user) {
		this.user = user;
	}
	public float getCosine() {
		return Cosine;
	}
	public void setCosine(float cosine) {
		Cosine = cosine;
	}
	public Similarity() {
		super();
	}
	public Similarity(int user, float cosine) {
		super();
		this.user = user;
		Cosine = cosine;
	}
}
