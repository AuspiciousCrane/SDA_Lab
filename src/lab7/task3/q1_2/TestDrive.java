package lab7.task3.q1_2;

public class TestDrive {
	public static void main(String[] args) {
		
		// what about a singleton here???
		RemoteDevice remote = new RemoteDevice();
		
		remote.pressPlay();

		//test that cant press rewind when pause
		remote.pressPause();
		remote.pressRewind();

		//test that it can rewind after pressed stop
		remote.pressStop();

		remote.pressRewind();
		remote.pressRewind();

		//test that cant press rewind when play
		remote.pressPlay();
		remote.pressPlay();


		remote.pressRewind();


	}

}
