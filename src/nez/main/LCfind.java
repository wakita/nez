package nez.main;

import java.io.IOException;

public class LCfind extends Command {

	@Override
	public void exec(CommandContext config) throws IOException {
		// String text = null;
		// UList<Grammar> pList = load(config.getInputFileList());
		// while ((text = ConsoleUtils.readMultiLine(">>> ", "    ")) != null) {
		// ConsoleUtils.println(text);
		// for (Grammar p : pList) {
		// if (p.match(text)) {
		// ConsoleUtils.println(p.getStartProduction().getLocalName());
		// }
		// }
		// }

	}

	// UList<Grammar> load(UList<String> fileList) {
	// UList<Grammar> pList = new UList<Grammar>(new Grammar[fileList.size() *
	// 2]);
	// Verbose.print("Loading ..");
	// try {
	// for (String f : fileList) {
	// GrammarFile g = GrammarFile.loadNezFile(f, NezOption.newDefaultOption());
	// UList<Production> rules = g.getProductionList()/*
	// * getDefinedRuleList
	// * ()
	// */;
	// for (Production r : rules) {
	// if (r.isPublic()) {
	// Grammar p = g.newGrammar(r.getLocalName());
	// p.compile();
	// pList.add(p);
	// Verbose.print(" " + r.getUniqueName());
	// }
	// }
	// }
	// } catch (IOException e) {
	// ConsoleUtils.exit(1, e.getMessage());
	// }
	// Verbose.println(" " + pList.size() + " rules");
	// return pList;
	// }

}
