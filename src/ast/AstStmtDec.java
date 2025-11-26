package ast;

public class AstStmtDec extends AstStmt
{
    public AstVarDec v;

    /******************/
    /* CONSTRUCTOR(S) */
    /******************/
    public AstStmtDec(AstVarDec v, int line_number)
    {
        super(line_number);
        /******************************/
        /* SET A UNIQUE SERIAL NUMBER */
        /******************************/
        serialNumber = AstNodeSerialNumber.getFresh();

        /***************************************/
        /* PRINT CORRESPONDING DERIVATION RULE */
        /***************************************/

        System.out.print("====================== stmt -> varDec\n");

        /*******************************/
        /* COPY INPUT DATA MEMBERS ... */
        /*******************************/
        this.v = v;
    }

    /*************************************************/
    /* The printing message for a dec stmt AST node */
    /*************************************************/
    public void printMe()
    {
        /*************************************/
        /* AST NODE TYPE = AST DEC STMT */
        /*************************************/
        System.out.print("AST NODE DEC STMT\n");

        /**************************************/
        /* RECURSIVELY PRINT v ... */
        /**************************************/
        v.printMe();

        /***************************************/
        /* PRINT Node to AST GRAPHVIZ DOT file */
        /***************************************/
        AstGraphviz.getInstance().logNode(
                serialNumber,
                "DEC_STMT");

        /****************************************/
        /* PRINT Edges to AST GRAPHVIZ DOT file */
        /****************************************/
        AstGraphviz.getInstance().logEdge(serialNumber,v.serialNumber);
    }
}
