package ast;

public class AstParamList extends AstNode{
    /****************/
    /* DATA MEMBERS */
    /****************/
    public AstType type;
    public String id;
    public AstParamList tail;

    /******************/
    /* CONSTRUCTOR(S) */
    /******************/
    public AstParamList(AstType type, String id, AstParamList tail, int line_number)
    {
        super(line_number);

        /******************************/
        /* SET A UNIQUE SERIAL NUMBER */
        /******************************/
        serialNumber = AstNodeSerialNumber.getFresh();

        /***************************************/
        /* PRINT CORRESPONDING DERIVATION RULE */
        /***************************************/
        if (tail != null) System.out.print("====================== paramList -> type ID\n");
        if (tail == null) System.out.print("====================== paramList -> type ID COMMA paramList\n");

        /*******************************/
        /* COPY INPUT DATA MEMBERS ... */
        /*******************************/
        this.type = type;
        this.id = id;
        this.tail = tail;
    }

    /******************************************************/
    /* The printing message for a parameter list AST node */
    /******************************************************/
    public void printMe()
    {
        /**************************************/
        /* AST NODE TYPE = AST PARAM LIST */
        /**************************************/
        System.out.print("AST NODE STMT LIST\n");

        /*************************************/
        /* RECURSIVELY PRINT HEAD + TAIL ... */
        /*************************************/
        if (type != null) type.printMe();
        if (tail != null) tail.printMe();

        /**********************************/
        /* PRINT to AST GRAPHVIZ DOT file */
        /**********************************/
        AstGraphviz.getInstance().logNode(
                serialNumber,
                "PARAM\nLIST\n");

        /****************************************/
        /* PRINT Edges to AST GRAPHVIZ DOT file */
        /****************************************/
        if (type != null) AstGraphviz.getInstance().logEdge(serialNumber,type.serialNumber);
        if (tail != null) AstGraphviz.getInstance().logEdge(serialNumber,tail.serialNumber);
    }
}
