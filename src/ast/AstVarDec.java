package ast;

public class AstVarDec extends AstDec
{
    public String name;
    public AstType type;
    public AstExp initExp;
    public AstNewExp newExp;


    public AstVarDec(AstType type, String name, AstExp initExp,  int lineNumber)
    {
        super(lineNumber);
        this.name = name;
        this.type = type;
        this.initExp = initExp;
    }
        public AstVarDec(AstType type, String name, AstNewExp newExp,  int lineNumber)
    {
        super(lineNumber);
        this.name = name;
        this.type = type;
        this.newExp = newExp;
    }

    public void printMe()
    {
        System.out.print("AST VAR DEC\n");
        System.out.print("Name: " + name + "\n");
        if (type != null) type.printMe();
    }
    
}