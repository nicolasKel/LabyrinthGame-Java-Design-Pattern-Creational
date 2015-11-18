package fr.iutvalence.info.dut.m3105.labyrinthGame;

import java.util.Set;

public interface LabyrinthBuilder 
{
	public LabyrinthBuilder setWidth (int width);
	public LabyrinthBuilder setHeight (int height);
	public LabyrinthBuilder setExitPosition (Position exitPosition);
	public LabyrinthBuilder addForbiddenCellPosition (Position forbiddenCellPosition);
	public Labyrinth getLabyrinth();
}
