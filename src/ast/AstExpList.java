package ast;
import java.util.ArrayList;
import java.util.List;

public class AstExpList extends AstNode{

    public List<AstExp> exps;
    
    public AstExpList(AstExp exp, int lineNumber){
        super(lineNumber);
        exps = new ArrayList<AstExp>();
        exps.add(exp);

    }
    
    public void add(AstExp exp){
        exps.add(exp);
    }
}