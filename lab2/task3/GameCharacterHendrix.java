
public class GameCharacterHendrix extends GameCharacter {
	
	
	public GameCharacterHendrix() {
		 guitarBehavior=new Guitar_GibsonSG();
		 soloBehavior=new Solo_PutGuitarOnFire();
	}

	@Override
	public void change() {
		this.setGuitar(new Guitar_Telecaster());
	}
}
