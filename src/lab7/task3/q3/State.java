package lab7.task3.q1_2;

/**
 * State.java
 *
 * This file represents the different transitions
 * between all states.
 */
public interface State {
	public boolean pressPlay();
	public boolean pressPause();
	public boolean pressStop();
	public boolean pressRewind();
}
