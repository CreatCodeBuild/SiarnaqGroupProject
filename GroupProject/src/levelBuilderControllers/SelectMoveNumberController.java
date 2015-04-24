package levelBuilderControllers;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import levelBuilderBoundary.LevelBuilderApplication;
import levelBuilderEntity.LevelBuilder;
import levelBuilderMoves.SetMoveNumberMove;

public class SelectMoveNumberController implements ActionListener{
	LevelBuilder model;
	LevelBuilderApplication application;
	int oldValue;
	
	public SelectMoveNumberController(LevelBuilder m, LevelBuilderApplication a)
	{
		this.model=m;
		this.application=a;
		this.oldValue=model.getMoves();
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		JTextField tf=(JTextField)ae.getSource();
		update(tf);
	}
	
	public void update(JTextField tf)
	{
		try{
			int num = Integer.valueOf(tf.getText());
			SetMoveNumberMove m=new SetMoveNumberMove(model, num, oldValue);
			if(m.doMove())
			{
				System.out.println("Number of Moves: "+model.getMoves());
				application.getInputPanel().getMaxMoves().setText(""+tf.getText());
			}
		} catch (Exception e) {
			tf.setText(""+model.getMoves());
		}
		
	}

}
