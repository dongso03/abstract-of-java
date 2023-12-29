
public abstract class Sports {
	public int playerCount;
	public String name;
	
	
	public Sports(int playerCount, String managerName) {
		super();
		this.playerCount = playerCount;
		this.name = managerName;
	}
	public abstract String getName();
	
	public abstract int getPlayers();
		
}
