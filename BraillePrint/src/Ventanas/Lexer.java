/* The following code was generated by JFlex 1.4.3 on 21/06/20 04:05 PM */

package Ventanas;
import static Ventanas.Token.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 21/06/20 04:05 PM from the specification file
 * <tt>C:/Users/cesar/Desktop/CompiladorBP/BraillePrint/src/Ventanas/Lexer.flex</tt>
 */
class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\5\1\11\2\0\1\5\22\0\1\5\1\14\1\12\1\10"+
    "\2\0\1\13\1\0\1\42\1\43\1\6\1\4\1\40\1\41\1\50"+
    "\1\7\12\2\1\0\1\37\1\15\1\16\1\15\2\0\1\34\1\1"+
    "\1\63\1\1\1\26\1\33\2\1\1\64\2\1\1\35\5\1\1\24"+
    "\1\36\1\23\1\25\1\62\4\1\1\46\1\0\1\47\1\0\1\3"+
    "\1\0\1\30\1\61\1\54\1\57\1\22\1\27\2\1\1\55\2\1"+
    "\1\31\1\56\1\51\1\52\1\60\1\1\1\20\1\32\1\17\1\21"+
    "\1\53\4\1\1\44\1\5\1\45\123\0\1\1\17\0\1\1\7\0"+
    "\1\1\3\0\1\1\3\0\1\1\1\0\1\1\6\0\1\1\uff05\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\1\1\10\2\11\1\12\1\13\7\2\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\1"+
    "\4\2\1\25\1\26\1\3\1\27\2\0\1\5\1\0"+
    "\1\30\1\12\6\2\1\31\10\2\1\25\1\0\17\2"+
    "\1\0\1\5\1\32\1\2\1\33\1\2\1\34\10\2"+
    "\1\35\7\2\1\36\3\2\1\37\4\2\1\40\10\2"+
    "\1\41\1\42\1\2\1\43\1\2\1\44\1\2\1\45"+
    "\3\2\1\46";

  private static int [] zzUnpackAction() {
    int [] result = new int[130];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\65\0\152\0\237\0\324\0\u0109\0\u013e\0\u0173"+
    "\0\u01a8\0\u01dd\0\65\0\u0212\0\u0212\0\u0212\0\u0247\0\u027c"+
    "\0\u02b1\0\u02e6\0\u031b\0\u0350\0\u0385\0\65\0\u03ba\0\u03ef"+
    "\0\65\0\65\0\65\0\65\0\65\0\65\0\u03ba\0\u0424"+
    "\0\u0459\0\u048e\0\u04c3\0\u04f8\0\u052d\0\u0562\0\65\0\u03ba"+
    "\0\u0597\0\u05cc\0\u01dd\0\u01dd\0\65\0\u0601\0\u0636\0\u066b"+
    "\0\u06a0\0\u06d5\0\u070a\0\u04c3\0\u073f\0\u0774\0\u07a9\0\u07de"+
    "\0\u0813\0\u0848\0\u087d\0\u08b2\0\u08e7\0\u091c\0\u0951\0\u0986"+
    "\0\u09bb\0\u09f0\0\u0a25\0\u0a5a\0\u0a8f\0\u0ac4\0\u0af9\0\u0b2e"+
    "\0\u0b63\0\u0b98\0\u0bcd\0\u0c02\0\u0c37\0\u0c6c\0\65\0\u04c3"+
    "\0\u0ca1\0\u04c3\0\u0cd6\0\u04c3\0\u0d0b\0\u0d40\0\u0d75\0\u0daa"+
    "\0\u0ddf\0\u0e14\0\u0e49\0\u0e7e\0\u04c3\0\u0eb3\0\u0ee8\0\u0f1d"+
    "\0\u0f52\0\u0f87\0\u0fbc\0\u0ff1\0\u04c3\0\u1026\0\u105b\0\u1090"+
    "\0\u04c3\0\u10c5\0\u10fa\0\u112f\0\u1164\0\u04c3\0\u1199\0\u11ce"+
    "\0\u1203\0\u1238\0\u126d\0\u12a2\0\u12d7\0\u130c\0\u04c3\0\u04c3"+
    "\0\u1341\0\u04c3\0\u1376\0\u04c3\0\u13ab\0\u04c3\0\u13e0\0\u1415"+
    "\0\u144a\0\u04c3";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[130];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\2\1\5\1\6\1\7\1\10"+
    "\1\11\1\6\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\2\3\1\20\1\21\3\3\1\22\1\23\1\3\1\24"+
    "\1\25\3\3\1\26\1\27\1\30\1\31\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\2\3\1\40\1\41\2\3"+
    "\1\42\5\3\66\0\2\43\14\0\20\43\12\0\14\43"+
    "\1\0\1\44\1\4\14\0\20\44\1\0\1\45\7\0"+
    "\1\45\14\44\2\0\1\46\13\0\1\47\21\0\1\50"+
    "\7\0\1\50\21\0\1\6\3\0\1\6\71\0\1\47"+
    "\54\0\1\51\7\0\1\47\56\0\1\52\54\0\11\53"+
    "\1\0\1\54\52\53\16\0\1\55\47\0\2\43\14\0"+
    "\1\43\1\56\16\43\12\0\14\43\1\0\2\43\14\0"+
    "\20\43\12\0\1\57\13\43\1\0\2\43\14\0\5\43"+
    "\1\60\12\43\12\0\14\43\1\0\2\43\14\0\11\43"+
    "\1\61\1\62\5\43\12\0\14\43\1\0\2\43\14\0"+
    "\12\43\1\63\5\43\12\0\14\43\1\0\2\43\14\0"+
    "\20\43\12\0\4\43\1\64\7\43\1\0\2\43\14\0"+
    "\15\43\1\65\2\43\12\0\11\43\1\66\1\67\1\70"+
    "\2\0\1\45\35\0\1\50\7\0\1\50\16\0\1\45"+
    "\13\0\1\47\21\0\1\50\7\0\1\50\15\0\2\43"+
    "\14\0\11\43\1\71\6\43\12\0\14\43\1\0\2\43"+
    "\14\0\11\43\1\72\6\43\12\0\4\43\1\73\7\43"+
    "\1\0\2\43\14\0\3\43\1\74\14\43\12\0\14\43"+
    "\1\0\2\43\1\3\13\0\20\43\12\0\14\43\1\0"+
    "\2\75\14\0\20\75\12\0\14\75\2\0\1\45\35\0"+
    "\1\45\7\0\1\45\16\0\1\46\35\0\1\45\7\0"+
    "\1\45\14\0\6\51\1\76\56\51\11\52\1\0\53\52"+
    "\1\0\2\43\1\3\13\0\2\43\1\77\15\43\12\0"+
    "\14\43\1\0\2\43\1\3\13\0\1\100\17\43\12\0"+
    "\14\43\1\0\2\43\1\3\13\0\6\43\1\101\11\43"+
    "\12\0\14\43\1\0\2\43\1\3\13\0\12\43\1\102"+
    "\5\43\12\0\14\43\1\0\2\43\1\3\13\0\20\43"+
    "\12\0\1\43\1\103\12\43\1\0\2\43\1\3\13\0"+
    "\1\104\17\43\12\0\14\43\1\0\2\43\1\3\13\0"+
    "\16\43\1\105\1\43\12\0\14\43\1\0\2\43\1\3"+
    "\13\0\3\43\1\106\5\43\1\107\6\43\12\0\14\43"+
    "\1\0\2\43\1\3\13\0\20\43\12\0\1\43\1\110"+
    "\12\43\1\0\2\43\1\3\13\0\20\43\12\0\5\43"+
    "\1\111\6\43\1\0\2\43\1\3\13\0\1\43\1\112"+
    "\16\43\12\0\14\43\1\0\2\43\1\3\13\0\20\43"+
    "\12\0\5\43\1\113\6\43\1\0\2\43\1\3\13\0"+
    "\20\43\12\0\3\43\1\114\10\43\1\0\2\43\1\3"+
    "\13\0\20\43\12\0\3\43\1\115\10\43\1\0\2\75"+
    "\1\44\13\0\20\75\12\0\14\75\6\51\1\116\1\117"+
    "\55\51\1\0\2\43\1\3\13\0\3\43\1\120\14\43"+
    "\12\0\14\43\1\0\2\43\1\3\13\0\3\43\1\121"+
    "\14\43\12\0\14\43\1\0\2\43\1\3\13\0\7\43"+
    "\1\120\10\43\12\0\14\43\1\0\2\43\1\3\13\0"+
    "\13\43\1\77\4\43\12\0\14\43\1\0\2\43\1\3"+
    "\13\0\1\122\17\43\12\0\14\43\1\0\2\43\1\3"+
    "\13\0\3\43\1\123\14\43\12\0\14\43\1\0\2\43"+
    "\1\3\13\0\17\43\1\101\12\0\14\43\1\0\2\43"+
    "\1\3\13\0\1\43\1\124\16\43\12\0\14\43\1\0"+
    "\2\43\1\3\13\0\12\43\1\125\5\43\12\0\14\43"+
    "\1\0\2\43\1\3\13\0\20\43\12\0\1\126\13\43"+
    "\1\0\2\43\1\3\13\0\20\43\12\0\7\43\1\127"+
    "\4\43\1\0\2\43\1\3\13\0\20\43\12\0\3\43"+
    "\1\130\10\43\1\0\2\43\1\3\13\0\20\43\12\0"+
    "\7\43\1\131\4\43\1\0\2\43\1\3\13\0\12\43"+
    "\1\132\5\43\12\0\14\43\1\0\2\43\1\3\13\0"+
    "\12\43\1\133\5\43\12\0\14\43\6\51\1\116\1\0"+
    "\55\51\1\0\2\43\1\3\13\0\1\43\1\134\16\43"+
    "\12\0\14\43\1\0\2\43\1\3\13\0\1\43\1\135"+
    "\16\43\12\0\14\43\1\0\2\43\1\3\13\0\20\43"+
    "\12\0\12\43\1\136\1\43\1\0\2\43\1\3\13\0"+
    "\1\137\17\43\12\0\14\43\1\0\2\43\1\3\13\0"+
    "\1\43\1\140\16\43\12\0\14\43\1\0\2\43\1\3"+
    "\13\0\11\43\1\141\6\43\12\0\14\43\1\0\2\43"+
    "\1\3\13\0\1\142\17\43\12\0\14\43\1\0\2\43"+
    "\1\3\13\0\20\43\12\0\1\43\1\143\12\43\1\0"+
    "\2\43\1\3\13\0\11\43\1\144\6\43\12\0\14\43"+
    "\1\0\2\43\1\3\13\0\20\43\12\0\1\43\1\145"+
    "\12\43\1\0\2\43\1\3\13\0\11\43\1\146\6\43"+
    "\12\0\14\43\1\0\2\43\1\3\13\0\20\43\12\0"+
    "\12\43\1\147\1\43\1\0\2\43\1\3\13\0\20\43"+
    "\12\0\4\43\1\150\7\43\1\0\2\43\1\3\13\0"+
    "\1\43\1\151\16\43\12\0\14\43\1\0\2\43\1\3"+
    "\13\0\1\43\1\152\16\43\12\0\14\43\1\0\2\43"+
    "\1\3\13\0\10\43\1\153\7\43\12\0\5\43\1\154"+
    "\6\43\1\0\2\43\1\3\13\0\1\43\1\155\16\43"+
    "\12\0\14\43\1\0\2\43\1\3\13\0\20\43\12\0"+
    "\6\43\1\156\5\43\1\0\2\43\1\3\13\0\11\43"+
    "\1\157\6\43\12\0\14\43\1\0\2\43\1\3\13\0"+
    "\20\43\12\0\5\43\1\160\6\43\1\0\2\43\1\3"+
    "\13\0\11\43\1\161\6\43\12\0\14\43\1\0\2\43"+
    "\1\3\13\0\20\43\12\0\1\43\1\162\12\43\1\0"+
    "\2\43\1\3\13\0\20\43\12\0\4\43\1\163\7\43"+
    "\1\0\2\43\1\3\13\0\11\43\1\164\6\43\12\0"+
    "\14\43\1\0\2\43\1\3\13\0\1\43\1\165\16\43"+
    "\12\0\14\43\1\0\2\43\1\3\13\0\20\43\12\0"+
    "\4\43\1\166\7\43\1\0\2\43\1\3\13\0\20\43"+
    "\12\0\10\43\1\167\3\43\1\0\2\43\1\3\13\0"+
    "\1\43\1\170\16\43\12\0\14\43\1\0\2\43\1\3"+
    "\13\0\3\43\1\171\14\43\12\0\14\43\1\0\2\43"+
    "\1\3\13\0\1\43\1\172\16\43\12\0\14\43\1\0"+
    "\2\43\1\3\13\0\11\43\1\173\6\43\12\0\14\43"+
    "\1\0\2\43\1\3\13\0\1\43\1\174\16\43\12\0"+
    "\14\43\1\0\2\43\1\3\13\0\20\43\12\0\1\175"+
    "\13\43\1\0\2\43\1\3\13\0\20\43\12\0\3\43"+
    "\1\176\10\43\1\0\2\43\1\3\13\0\1\177\17\43"+
    "\12\0\14\43\1\0\2\43\1\3\13\0\1\43\1\200"+
    "\16\43\12\0\14\43\1\0\2\43\1\3\13\0\11\43"+
    "\1\201\6\43\12\0\14\43\1\0\2\43\1\3\13\0"+
    "\13\43\1\202\4\43\12\0\14\43";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5247];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\10\1\1\11\12\1\1\11\2\1\6\11"+
    "\10\1\1\11\2\0\1\1\1\0\1\1\1\11\20\1"+
    "\1\0\17\1\1\0\1\11\63\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[130];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    public String Lexeme;
    public int Line(){
        return (yyline+1);
    }
    public int Column(){
        return (yycolumn+1);
    }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 180) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Token yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 29: 
          { Lexeme=yytext();return Alter;
          }
        case 39: break;
        case 14: 
          { Lexeme=yytext(); return Sustraccion;
          }
        case 40: break;
        case 37: 
          { Lexeme=yytext(); return func_ContCarac;
          }
        case 41: break;
        case 21: 
          { Lexeme=yytext(); return ERR_ID;
          }
        case 42: break;
        case 8: 
          { Lexeme=yytext(); return Comillas;
          }
        case 43: break;
        case 24: 
          { Lexeme=yytext(); return Texto;
          }
        case 44: break;
        case 12: 
          { Lexeme=yytext(); return Punto_Coma;
          }
        case 45: break;
        case 7: 
          { Lexeme=yytext(); return Cociente;
          }
        case 46: break;
        case 32: 
          { Lexeme=yytext(); return func_ValCad;
          }
        case 47: break;
        case 3: 
          { Lexeme=yytext(); return Num_Entero;
          }
        case 48: break;
        case 6: 
          { Lexeme=yytext(); return Producto;
          }
        case 49: break;
        case 13: 
          { Lexeme=yytext(); return Coma;
          }
        case 50: break;
        case 36: 
          { Lexeme=yytext(); return func_Imprimir;
          }
        case 51: break;
        case 4: 
          { Lexeme=yytext(); return Adicion;
          }
        case 52: break;
        case 17: 
          { Lexeme=yytext(); return Llave_a;
          }
        case 53: break;
        case 15: 
          { Lexeme=yytext(); return Parentesis_a;
          }
        case 54: break;
        case 11: 
          { Lexeme=yytext(); return Asignacion;
          }
        case 55: break;
        case 10: 
          { Lexeme = yytext(); return Op_Relacional;
          }
        case 56: break;
        case 19: 
          { Lexeme = yytext(); return Corchete_a;
          }
        case 57: break;
        case 27: 
          { Lexeme=yytext();return Flotante;
          }
        case 58: break;
        case 22: 
          { Lexeme=yytext(); return ERR_NUM;
          }
        case 59: break;
        case 35: 
          { Lexeme=yytext();return Declarar;
          }
        case 60: break;
        case 25: 
          { Lexeme=yytext();return Si;
          }
        case 61: break;
        case 9: 
          { Lexeme=yytext(); return Op_Logico;
          }
        case 62: break;
        case 31: 
          { Lexeme=yytext();return VarCar;
          }
        case 63: break;
        case 2: 
          { Lexeme=yytext(); return Identificador;
          }
        case 64: break;
        case 18: 
          { Lexeme=yytext(); return Llave_c;
          }
        case 65: break;
        case 33: 
          { Lexeme=yytext();return Campotrabajo;
          }
        case 66: break;
        case 38: 
          { Lexeme=yytext();return CicloMientras;
          }
        case 67: break;
        case 16: 
          { Lexeme=yytext(); return Parentesis_c;
          }
        case 68: break;
        case 23: 
          { Lexeme=yytext(); return Op_Atribucion;
          }
        case 69: break;
        case 30: 
          { Lexeme=yytext();return Entero;
          }
        case 70: break;
        case 1: 
          { return ERROR;
          }
        case 71: break;
        case 20: 
          { Lexeme = yytext(); return Corchete_c;
          }
        case 72: break;
        case 28: 
          { Lexeme=yytext(); return func_Ver;
          }
        case 73: break;
        case 5: 
          { /*Ignore*/
          }
        case 74: break;
        case 34: 
          { Lexeme=yytext();return CicloFor;
          }
        case 75: break;
        case 26: 
          { Lexeme = yytext(); return Op_Booleano;
          }
        case 76: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
