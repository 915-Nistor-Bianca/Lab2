import java.util.ArrayList;
import java.util.List;

public class SymbolTable {
    // List to store symbol entries (both identifiers and constants)
    private List<SymbolEntry> symbols;

    // Class to represent a symbol entry (with type: identifier or constant)
    private static class SymbolEntry {
        String symbol;
        String type;  // Can be "identifier" or "constant"

        public SymbolEntry(String symbol, String type) {
            this.symbol = symbol;
            this.type = type;
        }
    }

    public SymbolTable() {
        symbols = new ArrayList<>();
    }

    // Insert symbol (identifier or constant) into the table
    public void insert(String symbol, String type) {
        // Ensure no duplicates are added
        if (!contains(symbol)) {
            symbols.add(new SymbolEntry(symbol, type));
            System.out.println("Added symbol '" + symbol + "' as " + type + " to the table.");
        } else {
            System.out.println("Symbol '" + symbol + "' is already in the table.");
        }
    }

    // Check if the symbol already exists
    private boolean contains(String symbol) {
        for (SymbolEntry entry : symbols) {
            if (entry.symbol.equals(symbol)) {
                return true;
            }
        }
        return false;
    }

    // Retrieve the position of the symbol in the table
    public Integer getPosition(String symbol) {
        for (int i = 0; i < symbols.size(); i++) {
            if (symbols.get(i).symbol.equals(symbol)) {
                return i + 1;  // ST_POS starts from 1
            }
        }
        return null;  // Symbol not found
    }

    // Print the entire symbol table
    public void printTable() {
        for (int i = 0; i < symbols.size(); i++) {
            SymbolEntry entry = symbols.get(i);
            System.out.println("ST_POS: " + (i + 1) + ", Symbol: " + entry.symbol + " (" + entry.type + ")");
        }
    }
}
