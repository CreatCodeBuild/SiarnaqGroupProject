package levelBuilderControllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import levelBuilderBoundary.LevelBuilderApplication;
import levelBuilderEntity.LevelBuilder;
import levelBuilderMoves.SpecialMoveEnableMove;
/**
 * The activeSpericalMoveController controls the check boxes for special moves
 * @author Kevin
 *
 */
public class ActivateSpecialMoveController implements ActionListener{
LevelBuilder model;
LevelBuilderApplication application;
int moveID;
	
	public ActivateSpecialMoveController(LevelBuilder model,
			LevelBuilderApplication application, int moveID) {
		// TODO Auto-generated constructor stub
		this.model=model;
		this.application=application;
		this.moveID=moveID;
	}
	
	/**
	 * action performed when check boxes being selected
	 */
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		JCheckBox ch=(JCheckBox)ae.getSource();
		update(ch);
	}
/**
 * the move to enable special moves, and entities and boundary updates  
 * @param ch
 */
	public void update(JCheckBox ch) {
		// TODO Auto-generated method stub
		boolean enabled=ch.isSelected();
		SpecialMoveEnableMove m=new SpecialMoveEnableMove(model, enabled, ch, moveID);
		if(m.doMove())
		{
			if(enabled==true)
				System.out.println(moveID+" is true");
			else
				System.out.println(moveID+" is false");
			model.recordMove(m);
		}
	}

}
