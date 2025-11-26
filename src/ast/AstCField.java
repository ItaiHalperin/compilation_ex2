package ast;

public class AstCField extends AstNode{
    public AstDec dec;

    /******************/
    /* CONSTRUCTOR(S) */
    /******************/
    public AstCField(AstDec dec, int line_number)
    {
        super(line_number);
        /******************************/
        /* SET A UNIQUE SERIAL NUMBER */
        /******************************/
        serialNumber = AstNodeSerialNumber.getFresh();

        /***************************************/
        /* PRINT CORRESPONDING DERIVATION RULE */
        /***************************************/
        if(dec instanceof AstFuncDec){
            System.out.print("====================== cField -> varDec\n");
        }
        else{
            System.out.print("====================== cField -> funcDec\n");
        }

        /*******************************/
        /* COPY INPUT DATA MEMBERS ... */
        /*******************************/
        this.dec = dec;
    }

    /*************************************************/
    /* The printing message for a c field AST node */
    /*************************************************/
    public void printMe()
    {
        /*************************************/
        /* AST NODE TYPE = AST C FIELD */
        /*************************************/
        System.out.print("AST NODE C FIELD\n");

        /**************************************/
        /* RECURSIVELY PRINT type ... */
        /**************************************/
        dec.printMe();

        /***************************************/
        /* PRINT Node to AST GRAPHVIZ DOT file */
        /***************************************/
        AstGraphviz.getInstance().logNode(
                serialNumber,
                "C_FIELD");

        /****************************************/
        /* PRINT Edges to AST GRAPHVIZ DOT file */
        /****************************************/
        AstGraphviz.getInstance().logEdge(serialNumber,dec.serialNumber);

    }
}
