package levelBuilderMoves;

import javax.swing.JCheckBox;

import levelBuilderEntity.LevelBuilder;

public class SpecialMoveEnableMove extends Move{
	LevelBuilder model;
	boolean state;
	JCheckBox ch;
	int moveID;
	boolean oldState;
	
	public SpecialMoveEnableMove(LevelBuilder m, boolean e, JCheckBox ch, int moveID)
	{
		this.model=m;
		this.state=e;
		this.ch=ch;
		this.moveID=moveID;
		this.oldState=model.getSpecialEnabled(moveID);
		
	}

	@Override
	public boolean isValid() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean doMove() {
		// TODO Auto-generated method stub
		if(!isValid()){return false;}
		
		if(state==true)
		{
			model.allowSpecials(moveID);
			ch.setSelected(true);
		}
		else
		{
			model.disallowSpecials(moveID);
			ch.setSelected(false);
		}
			
		return true;
	}

	@Override
	public boolean undo() {
		// TODO Auto-generated method stub
		model.setSpecialEnabled(moveID, oldState);
		ch.setSelected(model.getSpecialEnabled(moveID));
		return true;
	}
}
