public class GameCharacterSlash extends GameCharacter {

	public GameCharacterSlash() {
		 guitarBehavior=new Guitar_Telecaster();
		 soloBehavior=new Solo_SmashTheGuitar();
	}
	
	@Override
	public void change() {
		this.setGuitar(new Guitar_GibsonSG());
	}
	
}