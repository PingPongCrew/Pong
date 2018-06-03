package de.pingpongcrew.main;

import java.util.LinkedList;

public class Control implements Runnable {

	private LinkedList<MovingObjectI> objectList;
	private static Control c = new Control();

	private enum GameStatus {
		RUNNING, PAUSED
	}

	private GameStatus status = GameStatus.RUNNING;

	public static Control getInstance() {
		return c;
	}

	private Control() {
		this.objectList = new LinkedList<>();
	}

	private void switchPause() {
		if (status == GameStatus.PAUSED) {
			status = GameStatus.RUNNING;
		} else {
			status = GameStatus.PAUSED;
		}
	}

	public void addObject(MovingObjectI ob) {
		objectList.add(ob);
	}

	public void updateAll() {
		for (MovingObjectI movingObjectI : objectList) {
			movingObjectI.update();
		}
	}

	

	@Override
	public void run() {

		try {
			while (true) {
				if (status == GameStatus.PAUSED) {
					// Paused State
				} else if (status == GameStatus.RUNNING) {
					updateAll();
					Thread.sleep(2);
				}
			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
