package fr.iutvalence.info.dut.m3105.labyrinthGame;

import java.util.HashSet;
import java.util.Set;

public class ConcreteLabyrinthBuilder implements LabyrinthBuilder
{

	private int width;

	private int height;

	private Position exitPosition;

	private Set<Position> forbiddenCellsPositions;
	
	public ConcreteLabyrinthBuilder()
	{
		this.forbiddenCellsPositions = new HashSet<Position>();
	}
	
	@Override
	public LabyrinthBuilder setWidth(int width) {
		this.width = width;
		return this;
	}

	@Override
	public LabyrinthBuilder setHeight(int height) {
		this.height = height;
		return this;
	}

	@Override
	public LabyrinthBuilder setExitPosition(Position exitPosition) {
		this.exitPosition = exitPosition;
		return this;
	}


	@Override
	public LabyrinthBuilder addForbiddenCellPosition(
			Position forbiddenCellPosition) {
		this.forbiddenCellsPositions.add(forbiddenCellPosition);
		return this;
	}

	public Labyrinth getLabyrinth() {
		return new Labyrinth(this.width,this.height,this.forbiddenCellsPositions,this.exitPosition);
	}

}
