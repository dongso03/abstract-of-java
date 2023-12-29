
public class EPL extends Sports{
	private final String title = "이피엘";
	
	public EPL() {
		super(11,"축구");
	}
	
	public EPL(int playerCount, String managerName) {
		super(playerCount, managerName);
		
	}

	@Override
	public String getName() {
	
		return name+": "+ title;
	}

	@Override
	public int getPlayers() {
		// TODO Auto-generated method stub
		return playerCount;
	}
	
}
