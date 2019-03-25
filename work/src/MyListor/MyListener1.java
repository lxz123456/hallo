package MyListor;
import Calculator.implement.Calculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*public class MyListener1 implements ActionListener{
	public void actionPerformed(ActionEvent e){
		
		for(int i=0;i<=9;i++) {
			if(e.getSource()==b[i]||e.getSource()==point){
				answer.setText("");
				if(e.getSource()==point){
					
					s=foreText+".";
					answer.setText(s);
				}else{
				if(s!=""){
					answer.setText(s+b[i].getText());
					foreText=s+b[i].getText();//此处应当修改，
				}else{
					answer.setText(foreText+b[i].getText());
				foreText=foreText+b[i].getText();
				}
				}
				}
		}
		if(e.getSource()==clear){
			foreText="";
			s="";
			answer.setText("");
		}
		if(e.getSource()==plus||e.getSource()==minus||e.getSource()==multi||e.getSource()==division){
			dFore=Double.parseDouble(foreText);
			s="";
			foreText="";
			answer.setText("");
			op=e.getSource();
		}
		if(e.getSource()==equal){
			dBack=Double.parseDouble(foreText);
			foreText="";
			answer.setText("");
			if(op==plus){
				d=dFore+dBack;
			}
			if(op==minus){
				d=dFore-dBack;
			}
			if(op==multi){
				d=dFore*dBack;
			}
			if(op==division){
				d=dFore/dBack;
			}
			answer.setText(""+d);
		}
	}
}
*/