package ast;

public class AstNewExp extends  AstExp{
    public AstType type;
    public AstExp e;

    /******************/
    /* CONSTRUCTOR(S) */
    /******************/
    public AstNewExp(AstType type, AstExp e, int line_number)
    {
        super(line_number);
        /******************************/
        /* SET A UNIQUE SERIAL NUMBER */
        /******************************/
        serialNumber = AstNodeSerialNumber.getFresh();

        /***************************************/
        /* PRINT CORRESPONDING DERIVATION RULE */
        /***************************************/
        if(e == null){
            System.out.print("====================== newExp -> NEW type\n");
        }
        else{
            System.out.print("====================== newExp -> NEW type LBRACK e RBRACK\n");
        }

        /*******************************/
        /* COPY INPUT DATA MEMBERS ... */
        /*******************************/
        this.type = type;
        this.e = e;
    }

    /*************************************************/
    /* The printing message for a new exp AST node */
    /*************************************************/
    public void printMe()
    {
        /*************************************/
        /* AST NODE TYPE = AST NEW EXP */
        /*************************************/
        System.out.print("AST NODE NEW EXP\n");

        /**************************************/
        /* RECURSIVELY PRINT type ... */
        /**************************************/
        type.printMe();
        if(e != null) e.printMe();

        /***************************************/
        /* PRINT Node to AST GRAPHVIZ DOT file */
        /***************************************/
        AstGraphviz.getInstance().logNode(
                serialNumber,
                "NEW_EXP");

        /****************************************/
        /* PRINT Edges to AST GRAPHVIZ DOT file */
        /****************************************/
        AstGraphviz.getInstance().logEdge(serialNumber,type.serialNumber);
        if(e != null) AstGraphviz.getInstance().logEdge(serialNumber,e.serialNumber);

    }
}
