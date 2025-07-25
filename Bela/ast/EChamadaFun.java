package ast;

import java.util.ArrayList;

public class EChamadaFun extends Exp{
	public String fun;
	public ArrayList<Exp> args;
	
	public EChamadaFun(String fun, ArrayList<Exp> args)
	{
	  this.fun = fun;
	  this.args = args;
	} 

	@Override
	public String toString() {
		String arguments = "";
		for (int i = 0; i < args.size(); i++)
			if (i == args.size() - 1) {
				arguments += args.get(i).toString();
			} else {
				arguments += args.get(i).toString() + ", ";
			}
		return fun + "(" + arguments + ")";
	}
}
