package ast;

public class AstExpNil extends AstExp {

    /******************/
    /* CONSTRUCTOR(S) */
    /******************/
    public AstExpNil(int line_number)
    {
        super(line_number);
        /******************************/
        /* SET A UNIQUE SERIAL NUMBER */
        /******************************/
        serialNumber = AstNodeSerialNumber.getFresh();

        /***************************************/
        /* PRINT CORRESPONDING DERIVATION RULE */
        /***************************************/
        System.out.format("====================== exp -> NIL\n");
    }

    /************************************************/
    /* The printing message for a nil exp AST node */
    /************************************************/
    public void printMe()
    {
        /*******************************/
        /* AST NODE TYPE = AST NIL EXP */
        /*******************************/
        System.out.format("AST NODE NIL\n");

        /*********************************/
        /* Print to AST GRAPHVIZ DOT file */
        /*********************************/
        AstGraphviz.getInstance().logNode(
                serialNumber,
                "NIL");
    }
}
