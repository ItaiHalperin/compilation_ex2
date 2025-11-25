package ast;
public class AstArrayTypeDef extends AstDec{
    public String name;
    public AstType type;

    public AstArrayTypeDef(String name, AstType type, int lineNumber) {
        super(lineNumber);
        this.name = name;;
        this.type = type;
    }
    
}
