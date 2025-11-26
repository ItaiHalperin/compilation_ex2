package ast;

import java.util.Objects;

public class AstType extends AstNode{
    public String type;
    public AstType(String type, int line_number) {
        super(line_number);
        /******************************/
        /* SET A UNIQUE SERIAL NUMBER */
        /******************************/
        serialNumber = AstNodeSerialNumber.getFresh();

        /***************************************/
        /* PRINT CORRESPONDING DERIVATION RULE */
        /***************************************/
        if(Objects.equals(type, "int"))
            System.out.print("====================== type -> TYPE_INT\n");
        if(Objects.equals(type, "string"))
            System.out.print("====================== type -> TYPE_STRING\n");
        if(Objects.equals(type, "void"))
            System.out.print("====================== type -> TYPE_VOID\n");
        else
            System.out.print("====================== type -> ID\n");
        /*******************************/
        /* COPY INPUT DATA MEMBERS ... */
        /*******************************/
        this.type = type;
    }
    /*************************************************/
    /* The printing message for a type AST node */
    /*************************************************/
    public void printMe()
    {
        /*************************************/
        /* AST NODE TYPE = AST FUNC DEC */
        /*************************************/
        System.out.print("AST NODE TYPE\n");

        /***************************************/
        /* PRINT Node to AST GRAPHVIZ DOT file */
        /***************************************/
        AstGraphviz.getInstance().logNode(
                serialNumber,
                String.format("TYPE(%s)",type));
    }
}
