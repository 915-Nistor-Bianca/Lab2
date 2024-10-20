public class Main {
    public static void main(String[] args) {
        SymbolTable symbolTable = new SymbolTable();

        // Add symbols (both identifiers and constants)
        addSymbolToTable(symbolTable, "x", "identifier");
        addSymbolToTable(symbolTable, "y", "identifier");
        addSymbolToTable(symbolTable, "_newVariable", "identifier");
        addSymbolToTable(symbolTable, "10", "constant");
        addSymbolToTable(symbolTable, "-2", "constant");
        addSymbolToTable(symbolTable, "\"Hello\"", "constant");

        // Print the table
        System.out.println("\nSymbol Table (Identifiers and Constants Combined):");
        symbolTable.printTable();

        // Retrieve positions
        Integer identifierPos = symbolTable.getPosition("x");
        System.out.println("\nRetrieved: 'x' has ST_POS " + identifierPos);

        Integer constantPos = symbolTable.getPosition("\"Hello\"");
        System.out.println("Retrieved: '\"Hello\"' has ST_POS " + constantPos);
    }

    public static void addSymbolToTable(SymbolTable table, String symbol, String type) {
        table.insert(symbol, type);
    }
}
