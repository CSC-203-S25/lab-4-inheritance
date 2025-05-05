package calculator;
public class MultiplyExpression
   extends BinaryExpression
{

   public MultiplyExpression(final Expression lft, final Expression rht)
   {
      super(lft, rht, " * ");
   }



   @Override
   protected double applyOperator(double lftOprnt, double rhtOprnt) {
      return lftOprnt * rhtOprnt;
   }
}

