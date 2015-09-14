package nez.main;

import java.io.IOException;

import nez.Grammar;
import nez.lang.Production;
import nez.lang.Typestate;
import nez.lang.type.Type;

public class LCtype extends Command {

	@Override
	public String getDesc() {
		return "grammar type checker";
	}

	@Override
	public void exec(CommandContext config) throws IOException {
		Grammar peg = config.newGrammar();
		for (Production r : peg.getProductionList()/* getDefinedRuleList() */) {
			if (r.inferTypestate(null) == Typestate.ObjectType) {
				Type t = Type.inferType(r, r.getExpression());
				System.out.println(r.getLocalName() + " : " + t);
			}
		}
	}
}
