
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20150930 (SVN rev 66)
//----------------------------------------------------

package Ventanas;

import java_cup.runtime.Symbol;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20150930 (SVN rev 66) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Sintax extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public Sintax() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Sintax(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Sintax(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\036\000\002\002\004\000\002\002\004\000\002\016" +
    "\004\000\002\016\005\000\002\015\003\000\002\015\004" +
    "\000\002\015\005\000\002\015\004\000\002\003\011\000" +
    "\002\010\003\000\002\010\003\000\002\010\003\000\002" +
    "\007\007\000\002\007\007\000\002\007\007\000\002\007" +
    "\007\000\002\005\011\000\002\013\003\000\002\013\005" +
    "\000\002\013\005\000\002\013\005\000\002\013\005\000" +
    "\002\006\015\000\002\011\011\000\002\012\011\000\002" +
    "\014\012\000\002\014\011\000\002\004\005\000\002\004" +
    "\005\000\002\004\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\053\000\004\017\004\001\002\000\004\026\007\001" +
    "\002\000\004\002\006\001\002\000\004\002\001\001\002" +
    "\000\006\016\012\027\011\001\002\000\004\002\000\001" +
    "\002\000\004\002\uffff\001\002\000\004\042\045\001\002" +
    "\000\016\016\012\027\ufffd\043\017\044\020\045\022\046" +
    "\023\001\002\000\004\027\015\001\002\000\004\002\ufffe" +
    "\001\002\000\006\016\012\027\ufffc\001\002\000\004\024" +
    "\040\001\002\000\004\024\034\001\002\000\004\027\ufffa" +
    "\001\002\000\004\026\030\001\002\000\004\024\024\001" +
    "\002\000\004\042\025\001\002\000\004\025\026\001\002" +
    "\000\004\032\027\001\002\000\006\016\ufff2\027\ufff2\001" +
    "\002\000\004\007\031\001\002\000\004\027\032\001\002" +
    "\000\004\032\033\001\002\000\006\016\ufff5\027\ufff5\001" +
    "\002\000\004\042\035\001\002\000\004\025\036\001\002" +
    "\000\004\032\037\001\002\000\006\016\ufff3\027\ufff3\001" +
    "\002\000\004\042\041\001\002\000\004\025\042\001\002" +
    "\000\004\032\043\001\002\000\006\016\ufff4\027\ufff4\001" +
    "\002\000\004\027\ufffb\001\002\000\004\040\046\001\002" +
    "\000\004\030\047\001\002\000\010\004\053\005\050\006" +
    "\051\001\002\000\004\031\ufff6\001\002\000\004\031\ufff7" +
    "\001\002\000\004\031\054\001\002\000\004\031\ufff8\001" +
    "\002\000\004\032\055\001\002\000\016\016\ufff9\027\ufff9" +
    "\043\ufff9\044\ufff9\045\ufff9\046\ufff9\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\053\000\004\002\004\001\001\000\004\016\007\001" +
    "\001\000\002\001\001\000\002\001\001\000\006\003\012" +
    "\015\013\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\010\003\012\007\015\015\020\001\001" +
    "\000\002\001\001\000\002\001\001\000\006\003\012\015" +
    "\043\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\010\051\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Sintax$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Sintax$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Sintax$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    private Symbol s;
    
    public void syntax_error(Symbol s){
        this.s = s;
    }

    public Symbol getS(){
        return this.s;
}


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Sintax$actions {
  private final Sintax parser;

  /** Constructor */
  CUP$Sintax$actions(Sintax parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Sintax$do_action_part00000000(
    int                        CUP$Sintax$act_num,
    java_cup.runtime.lr_parser CUP$Sintax$parser,
    java.util.Stack            CUP$Sintax$stack,
    int                        CUP$Sintax$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Sintax$result;

      /* select the action based on the action number */
      switch (CUP$Sintax$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).value;
		RESULT = start_val;
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Sintax$parser.done_parsing();
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= Campotrabajo CUERPO 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // CUERPO ::= Llave_a Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CUERPO",12, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // CUERPO ::= Llave_a SENTENCIAS Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CUERPO",12, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // SENTENCIAS ::= DECLARACION 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIAS",11, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // SENTENCIAS ::= DECLARACION FUNCION 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIAS",11, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // SENTENCIAS ::= DECLARACION FUNCION SENTENCIAS 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIAS",11, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // SENTENCIAS ::= DECLARACION SENTENCIAS 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIAS",11, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // DECLARACION ::= Declarar Identificador Asignacion Corchete_a TDATO Corchete_c Punto_Coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // TDATO ::= Entero 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("TDATO",6, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // TDATO ::= Flotante 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("TDATO",6, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // TDATO ::= VarCar 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("TDATO",6, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // FUNCION ::= func_ValCad Llave_a Texto Llave_c Punto_Coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("FUNCION",5, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // FUNCION ::= func_Ver Parentesis_a Identificador Parentesis_c Punto_Coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("FUNCION",5, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // FUNCION ::= func_ContCarac Parentesis_a Identificador Parentesis_c Punto_Coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("FUNCION",5, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // FUNCION ::= func_Imprimir Parentesis_a Identificador Parentesis_c Punto_Coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("FUNCION",5, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // SI ::= Si Parentesis_a SENTENCIA_BOOLEANA Parentesis_c Llave_a SENTENCIAS Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SI",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // SENTENCIA_BOOLEANA ::= Op_Booleano 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // SENTENCIA_BOOLEANA ::= Identificador Op_Relacional Op_Booleano 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // SENTENCIA_BOOLEANA ::= Identificador Op_Relacional Num_Entero 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // SENTENCIA_BOOLEANA ::= Identificador Op_Relacional Identificador 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // SENTENCIA_BOOLEANA ::= Identificador Op_Relacional Texto 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // SINO ::= SI Parentesis_a SENTENCIA_BOOLEANA Parentesis_c Llave_a SENTENCIAS Llave_c Sino Llave_a SENTENCIAS Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SINO",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-10)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // CICLOMIENTRAS ::= CicloMientras Parentesis_a SENTENCIA_BOOLEANA Parentesis_c Llave_a SENTENCIAS Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CICLOMIENTRAS",7, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // CICLOFOR ::= CicloFor Parentesis_a SENTENCIA_FOR Parentesis_c Llave_a SENTENCIAS Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CICLOFOR",8, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // SENTENCIA_FOR ::= TDATO Identificador Asignacion Entero Punto_Coma SENTENCIA_BOOLEANA Punto_Coma DECLARACION_FOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_FOR",10, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-7)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // SENTENCIA_FOR ::= Identificador Asignacion Entero Punto_Coma SENTENCIA_BOOLEANA Punto_Coma DECLARACION_FOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_FOR",10, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // DECLARACION_FOR ::= Identificador Op_Atribucion Entero 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION_FOR",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // DECLARACION_FOR ::= Identificador Adicion Adicion 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION_FOR",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // DECLARACION_FOR ::= Adicion Adicion Identificador 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION_FOR",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Sintax$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Sintax$do_action(
    int                        CUP$Sintax$act_num,
    java_cup.runtime.lr_parser CUP$Sintax$parser,
    java.util.Stack            CUP$Sintax$stack,
    int                        CUP$Sintax$top)
    throws java.lang.Exception
    {
              return CUP$Sintax$do_action_part00000000(
                               CUP$Sintax$act_num,
                               CUP$Sintax$parser,
                               CUP$Sintax$stack,
                               CUP$Sintax$top);
    }
}

}