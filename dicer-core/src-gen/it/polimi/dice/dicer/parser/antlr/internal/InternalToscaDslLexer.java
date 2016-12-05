package it.polimi.dice.dicer.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalToscaDslLexer extends Lexer {
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalToscaDslLexer() {;} 
    public InternalToscaDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalToscaDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalToscaDsl.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:11:7: ( '{' )
            // InternalToscaDsl.g:11:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:12:7: ( '\"tosca_definitions_version\" :' )
            // InternalToscaDsl.g:12:9: '\"tosca_definitions_version\" :'
            {
            match("\"tosca_definitions_version\" :"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:13:7: ( ',\\n\"description\" :' )
            // InternalToscaDsl.g:13:9: ',\\n\"description\" :'
            {
            match(",\n\"description\" :"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:14:7: ( ',\\n\"imports\" :' )
            // InternalToscaDsl.g:14:9: ',\\n\"imports\" :'
            {
            match(",\n\"imports\" :"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:15:7: ( '[' )
            // InternalToscaDsl.g:15:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:16:7: ( ',' )
            // InternalToscaDsl.g:16:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:17:7: ( ']' )
            // InternalToscaDsl.g:17:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:18:7: ( ',\\n\"outputs\" :' )
            // InternalToscaDsl.g:18:9: ',\\n\"outputs\" :'
            {
            match(",\n\"outputs\" :"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:19:7: ( '}' )
            // InternalToscaDsl.g:19:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:20:7: ( ',\\n\"inputs\" :' )
            // InternalToscaDsl.g:20:9: ',\\n\"inputs\" :'
            {
            match(",\n\"inputs\" :"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:21:7: ( ',\\n\"node_templates\" :' )
            // InternalToscaDsl.g:21:9: ',\\n\"node_templates\" :'
            {
            match(",\n\"node_templates\" :"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:22:7: ( ',\\n\"realtionships\" :' )
            // InternalToscaDsl.g:22:9: ',\\n\"realtionships\" :'
            {
            match(",\n\"realtionships\" :"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:23:7: ( ',\\n\"groups\" :' )
            // InternalToscaDsl.g:23:9: ',\\n\"groups\" :'
            {
            match(",\n\"groups\" :"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:24:7: ( ',\\n\"policies\" :' )
            // InternalToscaDsl.g:24:9: ',\\n\"policies\" :'
            {
            match(",\n\"policies\" :"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:25:7: ( ':' )
            // InternalToscaDsl.g:25:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:26:7: ( '\"type\" :' )
            // InternalToscaDsl.g:26:9: '\"type\" :'
            {
            match("\"type\" :"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:27:7: ( ',\\n\"instances\" : {' )
            // InternalToscaDsl.g:27:9: ',\\n\"instances\" : {'
            {
            match(",\n\"instances\" : {"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:28:7: ( ',\\n\"relationships\" :' )
            // InternalToscaDsl.g:28:9: ',\\n\"relationships\" :'
            {
            match(",\n\"relationships\" :"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:29:7: ( ',\\n\"interfaces\" :' )
            // InternalToscaDsl.g:29:9: ',\\n\"interfaces\" :'
            {
            match(",\n\"interfaces\" :"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:30:7: ( ',\\n\"properties\" :' )
            // InternalToscaDsl.g:30:9: ',\\n\"properties\" :'
            {
            match(",\n\"properties\" :"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:31:7: ( '\\n\"configuration\" : {' )
            // InternalToscaDsl.g:31:9: '\\n\"configuration\" : {'
            {
            match("\n\"configuration\" : {"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:32:7: ( ',\\n\"attributes\" :' )
            // InternalToscaDsl.g:32:9: ',\\n\"attributes\" :'
            {
            match(",\n\"attributes\" :"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:33:7: ( ',\\n\"requirements\" :' )
            // InternalToscaDsl.g:33:9: ',\\n\"requirements\" :'
            {
            match(",\n\"requirements\" :"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:34:7: ( ',\\n\"capabilities\" :' )
            // InternalToscaDsl.g:34:9: ',\\n\"capabilities\" :'
            {
            match(",\n\"capabilities\" :"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:35:7: ( '\\n' )
            // InternalToscaDsl.g:35:9: '\\n'
            {
            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:36:7: ( '\"deploy\" :' )
            // InternalToscaDsl.g:36:9: '\"deploy\" :'
            {
            match("\"deploy\" :"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:37:7: ( ',\\n\"target\" :' )
            // InternalToscaDsl.g:37:9: ',\\n\"target\" :'
            {
            match(",\n\"target\" :"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:38:7: ( ',\\n\"source_interfaces\" :' )
            // InternalToscaDsl.g:38:9: ',\\n\"source_interfaces\" :'
            {
            match(",\n\"source_interfaces\" :"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:39:7: ( ',\\n\"target_iterfaces\" :' )
            // InternalToscaDsl.g:39:9: ',\\n\"target_iterfaces\" :'
            {
            match(",\n\"target_iterfaces\" :"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:40:7: ( ',\\n\"targets\" :' )
            // InternalToscaDsl.g:40:9: ',\\n\"targets\" :'
            {
            match(",\n\"targets\" :"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:41:7: ( '\"capabiity\" :' )
            // InternalToscaDsl.g:41:9: '\"capabiity\" :'
            {
            match("\"capabiity\" :"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:42:7: ( ',\\n\"node\" :' )
            // InternalToscaDsl.g:42:9: ',\\n\"node\" :'
            {
            match(",\n\"node\" :"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:43:7: ( '\\n\"inputs\" :' )
            // InternalToscaDsl.g:43:9: '\\n\"inputs\" :'
            {
            match("\n\"inputs\" :"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:44:7: ( ',\\n\"resources\" :' )
            // InternalToscaDsl.g:44:9: ',\\n\"resources\" :'
            {
            match(",\n\"resources\" :"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:45:7: ( ', ' )
            // InternalToscaDsl.g:45:9: ', '
            {
            match(", "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:2677:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalToscaDsl.g:2677:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalToscaDsl.g:2677:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalToscaDsl.g:2677:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalToscaDsl.g:2677:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalToscaDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:2679:10: ( ( '0' .. '9' )+ )
            // InternalToscaDsl.g:2679:12: ( '0' .. '9' )+
            {
            // InternalToscaDsl.g:2679:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalToscaDsl.g:2679:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:2681:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalToscaDsl.g:2681:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalToscaDsl.g:2681:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalToscaDsl.g:2681:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalToscaDsl.g:2681:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalToscaDsl.g:2681:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalToscaDsl.g:2681:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalToscaDsl.g:2681:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalToscaDsl.g:2681:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalToscaDsl.g:2681:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalToscaDsl.g:2681:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:2683:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalToscaDsl.g:2683:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalToscaDsl.g:2683:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalToscaDsl.g:2683:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:2685:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalToscaDsl.g:2685:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalToscaDsl.g:2685:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalToscaDsl.g:2685:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalToscaDsl.g:2685:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalToscaDsl.g:2685:41: ( '\\r' )? '\\n'
                    {
                    // InternalToscaDsl.g:2685:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalToscaDsl.g:2685:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:2687:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalToscaDsl.g:2687:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalToscaDsl.g:2687:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalToscaDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:2689:16: ( . )
            // InternalToscaDsl.g:2689:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalToscaDsl.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=42;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalToscaDsl.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // InternalToscaDsl.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // InternalToscaDsl.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // InternalToscaDsl.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // InternalToscaDsl.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // InternalToscaDsl.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // InternalToscaDsl.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // InternalToscaDsl.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // InternalToscaDsl.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // InternalToscaDsl.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // InternalToscaDsl.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // InternalToscaDsl.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // InternalToscaDsl.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // InternalToscaDsl.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // InternalToscaDsl.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // InternalToscaDsl.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // InternalToscaDsl.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // InternalToscaDsl.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // InternalToscaDsl.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // InternalToscaDsl.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // InternalToscaDsl.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // InternalToscaDsl.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // InternalToscaDsl.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // InternalToscaDsl.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // InternalToscaDsl.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // InternalToscaDsl.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // InternalToscaDsl.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // InternalToscaDsl.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // InternalToscaDsl.g:1:178: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // InternalToscaDsl.g:1:184: T__40
                {
                mT__40(); 

                }
                break;
            case 31 :
                // InternalToscaDsl.g:1:190: T__41
                {
                mT__41(); 

                }
                break;
            case 32 :
                // InternalToscaDsl.g:1:196: T__42
                {
                mT__42(); 

                }
                break;
            case 33 :
                // InternalToscaDsl.g:1:202: T__43
                {
                mT__43(); 

                }
                break;
            case 34 :
                // InternalToscaDsl.g:1:208: T__44
                {
                mT__44(); 

                }
                break;
            case 35 :
                // InternalToscaDsl.g:1:214: T__45
                {
                mT__45(); 

                }
                break;
            case 36 :
                // InternalToscaDsl.g:1:220: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 37 :
                // InternalToscaDsl.g:1:228: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 38 :
                // InternalToscaDsl.g:1:237: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 39 :
                // InternalToscaDsl.g:1:249: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 40 :
                // InternalToscaDsl.g:1:265: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 41 :
                // InternalToscaDsl.g:1:281: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 42 :
                // InternalToscaDsl.g:1:289: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\2\uffff\1\17\1\27\4\uffff\1\35\1\17\2\uffff\2\17\67\uffff\1\24\22\uffff\1\24\16\uffff\1\24\20\uffff\1\24\1\uffff";
    static final String DFA12_eofS =
        "\172\uffff";
    static final String DFA12_minS =
        "\1\0\1\uffff\1\0\1\12\4\uffff\1\11\1\101\2\uffff\1\0\1\52\3\uffff\3\0\1\uffff\1\42\6\uffff\1\143\6\uffff\4\0\1\141\2\uffff\4\0\1\uffff\1\155\1\uffff\1\157\1\145\1\uffff\1\157\2\uffff\1\141\1\uffff\4\0\1\uffff\1\160\1\144\1\141\2\uffff\1\162\1\0\1\40\2\0\3\uffff\1\145\4\uffff\1\147\1\0\1\uffff\2\0\1\42\1\145\1\0\1\40\1\0\2\uffff\1\164\1\0\1\uffff\1\0\1\42\2\0\3\uffff\1\0\1\40\1\0\1\uffff\16\0\1\40\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\uffff\1\uffff\1\40\4\uffff\1\42\1\172\2\uffff\1\uffff\1\57\3\uffff\3\uffff\1\uffff\1\42\6\uffff\1\151\6\uffff\4\uffff\1\164\2\uffff\4\uffff\1\uffff\1\156\1\uffff\1\157\1\145\1\uffff\1\162\2\uffff\1\141\1\uffff\4\uffff\1\uffff\1\164\1\144\1\163\2\uffff\1\162\1\uffff\1\40\2\uffff\3\uffff\1\145\4\uffff\1\147\1\uffff\1\uffff\2\uffff\1\137\1\145\1\uffff\1\40\1\uffff\2\uffff\1\164\1\uffff\1\uffff\1\uffff\1\163\2\uffff\3\uffff\1\uffff\1\40\1\uffff\1\uffff\16\uffff\1\40\1\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\2\uffff\1\5\1\7\1\11\1\17\2\uffff\1\44\1\45\2\uffff\1\51\1\52\1\1\3\uffff\1\46\1\uffff\1\43\1\6\1\5\1\7\1\11\1\17\1\uffff\1\31\1\51\1\44\1\45\1\47\1\50\5\uffff\1\25\1\41\4\uffff\1\3\1\uffff\1\10\2\uffff\1\15\1\uffff\1\26\1\30\1\uffff\1\34\4\uffff\1\4\3\uffff\1\16\1\24\5\uffff\1\12\1\21\1\23\1\uffff\1\14\1\22\1\27\1\42\2\uffff\1\20\7\uffff\1\13\1\40\2\uffff\1\32\4\uffff\1\33\1\35\1\36\3\uffff\1\37\17\uffff\1\2";
    static final String DFA12_specialS =
        "\1\0\1\uffff\1\30\11\uffff\1\47\4\uffff\1\46\1\50\1\4\17\uffff\1\15\1\1\1\51\1\5\3\uffff\1\16\1\2\1\52\1\6\13\uffff\1\17\1\3\1\53\1\7\7\uffff\1\20\1\uffff\1\54\1\10\11\uffff\1\21\1\uffff\1\55\1\11\2\uffff\1\22\1\uffff\1\12\3\uffff\1\23\1\uffff\1\13\1\uffff\1\24\1\14\3\uffff\1\25\1\uffff\1\26\1\uffff\1\27\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\2\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\17\1\16\1\10\2\17\1\16\22\17\1\16\1\17\1\2\4\17\1\14\4\17\1\3\2\17\1\15\12\13\1\7\6\17\32\12\1\4\1\17\1\5\1\11\1\12\1\17\32\12\1\1\1\17\1\6\uff82\17",
            "",
            "\143\24\1\23\1\22\17\24\1\21\uff8b\24",
            "\1\25\25\uffff\1\26",
            "",
            "",
            "",
            "",
            "\2\36\2\uffff\1\36\22\uffff\1\36\1\uffff\1\34",
            "\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "\0\24",
            "\1\41\4\uffff\1\42",
            "",
            "",
            "",
            "\157\24\1\43\11\24\1\44\uff86\24",
            "\145\24\1\45\uff9a\24",
            "\141\24\1\46\uff9e\24",
            "",
            "\1\47",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\50\5\uffff\1\51",
            "",
            "",
            "",
            "",
            "",
            "",
            "\163\24\1\52\uff8c\24",
            "\160\24\1\53\uff8f\24",
            "\160\24\1\54\uff8f\24",
            "\160\24\1\55\uff8f\24",
            "\1\65\1\uffff\1\66\1\56\2\uffff\1\63\1\uffff\1\57\4\uffff\1\61\1\60\1\64\1\uffff\1\62\1\70\1\67",
            "",
            "",
            "\143\24\1\71\uff9c\24",
            "\145\24\1\72\uff9a\24",
            "\154\24\1\73\uff93\24",
            "\141\24\1\74\uff9e\24",
            "",
            "\1\75\1\76",
            "",
            "\1\77",
            "\1\100",
            "",
            "\1\101\2\uffff\1\102",
            "",
            "",
            "\1\103",
            "",
            "\141\24\1\104\uff9e\24",
            "\42\24\1\105\uffdd\24",
            "\157\24\1\106\uff90\24",
            "\142\24\1\107\uff9d\24",
            "",
            "\1\110\2\uffff\1\111\1\112",
            "\1\113",
            "\1\114\12\uffff\1\115\4\uffff\1\116\1\uffff\1\117",
            "",
            "",
            "\1\120",
            "\137\24\1\121\uffa0\24",
            "\1\122",
            "\171\24\1\123\uff86\24",
            "\151\24\1\124\uff96\24",
            "",
            "",
            "",
            "\1\125",
            "",
            "",
            "",
            "",
            "\1\126",
            "\144\24\1\127\uff9b\24",
            "",
            "\42\24\1\130\uffdd\24",
            "\151\24\1\131\uff96\24",
            "\1\133\74\uffff\1\132",
            "\1\134",
            "\145\24\1\135\uff9a\24",
            "\1\136",
            "\164\24\1\137\uff8b\24",
            "",
            "",
            "\1\140",
            "\146\24\1\141\uff99\24",
            "",
            "\171\24\1\142\uff86\24",
            "\1\143\74\uffff\1\144\23\uffff\1\145",
            "\151\24\1\146\uff96\24",
            "\42\24\1\147\uffdd\24",
            "",
            "",
            "",
            "\156\24\1\150\uff91\24",
            "\1\151",
            "\151\24\1\152\uff96\24",
            "",
            "\164\24\1\153\uff8b\24",
            "\151\24\1\154\uff96\24",
            "\157\24\1\155\uff90\24",
            "\156\24\1\156\uff91\24",
            "\163\24\1\157\uff8c\24",
            "\137\24\1\160\uffa0\24",
            "\166\24\1\161\uff89\24",
            "\145\24\1\162\uff9a\24",
            "\162\24\1\163\uff8d\24",
            "\163\24\1\164\uff8c\24",
            "\151\24\1\165\uff96\24",
            "\157\24\1\166\uff90\24",
            "\156\24\1\167\uff91\24",
            "\42\24\1\170\uffdd\24",
            "\1\171",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='{') ) {s = 1;}

                        else if ( (LA12_0=='\"') ) {s = 2;}

                        else if ( (LA12_0==',') ) {s = 3;}

                        else if ( (LA12_0=='[') ) {s = 4;}

                        else if ( (LA12_0==']') ) {s = 5;}

                        else if ( (LA12_0=='}') ) {s = 6;}

                        else if ( (LA12_0==':') ) {s = 7;}

                        else if ( (LA12_0=='\n') ) {s = 8;}

                        else if ( (LA12_0=='^') ) {s = 9;}

                        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='z')) ) {s = 10;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 11;}

                        else if ( (LA12_0=='\'') ) {s = 12;}

                        else if ( (LA12_0=='/') ) {s = 13;}

                        else if ( (LA12_0=='\t'||LA12_0=='\r'||LA12_0==' ') ) {s = 14;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='+')||(LA12_0>='-' && LA12_0<='.')||(LA12_0>=';' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 15;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_36 = input.LA(1);

                        s = -1;
                        if ( (LA12_36=='p') ) {s = 43;}

                        else if ( ((LA12_36>='\u0000' && LA12_36<='o')||(LA12_36>='q' && LA12_36<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_43 = input.LA(1);

                        s = -1;
                        if ( (LA12_43=='e') ) {s = 58;}

                        else if ( ((LA12_43>='\u0000' && LA12_43<='d')||(LA12_43>='f' && LA12_43<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA12_58 = input.LA(1);

                        s = -1;
                        if ( (LA12_58=='\"') ) {s = 69;}

                        else if ( ((LA12_58>='\u0000' && LA12_58<='!')||(LA12_58>='#' && LA12_58<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA12_19 = input.LA(1);

                        s = -1;
                        if ( (LA12_19=='a') ) {s = 38;}

                        else if ( ((LA12_19>='\u0000' && LA12_19<='`')||(LA12_19>='b' && LA12_19<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA12_38 = input.LA(1);

                        s = -1;
                        if ( (LA12_38=='p') ) {s = 45;}

                        else if ( ((LA12_38>='\u0000' && LA12_38<='o')||(LA12_38>='q' && LA12_38<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA12_45 = input.LA(1);

                        s = -1;
                        if ( (LA12_45=='a') ) {s = 60;}

                        else if ( ((LA12_45>='\u0000' && LA12_45<='`')||(LA12_45>='b' && LA12_45<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA12_60 = input.LA(1);

                        s = -1;
                        if ( (LA12_60=='b') ) {s = 71;}

                        else if ( ((LA12_60>='\u0000' && LA12_60<='a')||(LA12_60>='c' && LA12_60<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA12_71 = input.LA(1);

                        s = -1;
                        if ( (LA12_71=='i') ) {s = 84;}

                        else if ( ((LA12_71>='\u0000' && LA12_71<='h')||(LA12_71>='j' && LA12_71<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA12_84 = input.LA(1);

                        s = -1;
                        if ( (LA12_84=='i') ) {s = 89;}

                        else if ( ((LA12_84>='\u0000' && LA12_84<='h')||(LA12_84>='j' && LA12_84<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA12_89 = input.LA(1);

                        s = -1;
                        if ( (LA12_89=='t') ) {s = 95;}

                        else if ( ((LA12_89>='\u0000' && LA12_89<='s')||(LA12_89>='u' && LA12_89<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA12_95 = input.LA(1);

                        s = -1;
                        if ( (LA12_95=='y') ) {s = 98;}

                        else if ( ((LA12_95>='\u0000' && LA12_95<='x')||(LA12_95>='z' && LA12_95<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA12_98 = input.LA(1);

                        s = -1;
                        if ( (LA12_98=='\"') ) {s = 103;}

                        else if ( ((LA12_98>='\u0000' && LA12_98<='!')||(LA12_98>='#' && LA12_98<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA12_35 = input.LA(1);

                        s = -1;
                        if ( (LA12_35=='s') ) {s = 42;}

                        else if ( ((LA12_35>='\u0000' && LA12_35<='r')||(LA12_35>='t' && LA12_35<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA12_42 = input.LA(1);

                        s = -1;
                        if ( (LA12_42=='c') ) {s = 57;}

                        else if ( ((LA12_42>='\u0000' && LA12_42<='b')||(LA12_42>='d' && LA12_42<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA12_57 = input.LA(1);

                        s = -1;
                        if ( (LA12_57=='a') ) {s = 68;}

                        else if ( ((LA12_57>='\u0000' && LA12_57<='`')||(LA12_57>='b' && LA12_57<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA12_68 = input.LA(1);

                        s = -1;
                        if ( (LA12_68=='_') ) {s = 81;}

                        else if ( ((LA12_68>='\u0000' && LA12_68<='^')||(LA12_68>='`' && LA12_68<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA12_81 = input.LA(1);

                        s = -1;
                        if ( (LA12_81=='d') ) {s = 87;}

                        else if ( ((LA12_81>='\u0000' && LA12_81<='c')||(LA12_81>='e' && LA12_81<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA12_87 = input.LA(1);

                        s = -1;
                        if ( (LA12_87=='e') ) {s = 93;}

                        else if ( ((LA12_87>='\u0000' && LA12_87<='d')||(LA12_87>='f' && LA12_87<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA12_93 = input.LA(1);

                        s = -1;
                        if ( (LA12_93=='f') ) {s = 97;}

                        else if ( ((LA12_93>='\u0000' && LA12_93<='e')||(LA12_93>='g' && LA12_93<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA12_97 = input.LA(1);

                        s = -1;
                        if ( (LA12_97=='i') ) {s = 102;}

                        else if ( ((LA12_97>='\u0000' && LA12_97<='h')||(LA12_97>='j' && LA12_97<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA12_102 = input.LA(1);

                        s = -1;
                        if ( (LA12_102=='n') ) {s = 104;}

                        else if ( ((LA12_102>='\u0000' && LA12_102<='m')||(LA12_102>='o' && LA12_102<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA12_104 = input.LA(1);

                        s = -1;
                        if ( (LA12_104=='i') ) {s = 106;}

                        else if ( ((LA12_104>='\u0000' && LA12_104<='h')||(LA12_104>='j' && LA12_104<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA12_106 = input.LA(1);

                        s = -1;
                        if ( (LA12_106=='t') ) {s = 107;}

                        else if ( ((LA12_106>='\u0000' && LA12_106<='s')||(LA12_106>='u' && LA12_106<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA12_2 = input.LA(1);

                        s = -1;
                        if ( (LA12_2=='t') ) {s = 17;}

                        else if ( (LA12_2=='d') ) {s = 18;}

                        else if ( (LA12_2=='c') ) {s = 19;}

                        else if ( ((LA12_2>='\u0000' && LA12_2<='b')||(LA12_2>='e' && LA12_2<='s')||(LA12_2>='u' && LA12_2<='\uFFFF')) ) {s = 20;}

                        else s = 15;

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA12_107 = input.LA(1);

                        s = -1;
                        if ( (LA12_107=='i') ) {s = 108;}

                        else if ( ((LA12_107>='\u0000' && LA12_107<='h')||(LA12_107>='j' && LA12_107<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA12_108 = input.LA(1);

                        s = -1;
                        if ( (LA12_108=='o') ) {s = 109;}

                        else if ( ((LA12_108>='\u0000' && LA12_108<='n')||(LA12_108>='p' && LA12_108<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA12_109 = input.LA(1);

                        s = -1;
                        if ( (LA12_109=='n') ) {s = 110;}

                        else if ( ((LA12_109>='\u0000' && LA12_109<='m')||(LA12_109>='o' && LA12_109<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA12_110 = input.LA(1);

                        s = -1;
                        if ( (LA12_110=='s') ) {s = 111;}

                        else if ( ((LA12_110>='\u0000' && LA12_110<='r')||(LA12_110>='t' && LA12_110<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA12_111 = input.LA(1);

                        s = -1;
                        if ( (LA12_111=='_') ) {s = 112;}

                        else if ( ((LA12_111>='\u0000' && LA12_111<='^')||(LA12_111>='`' && LA12_111<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA12_112 = input.LA(1);

                        s = -1;
                        if ( (LA12_112=='v') ) {s = 113;}

                        else if ( ((LA12_112>='\u0000' && LA12_112<='u')||(LA12_112>='w' && LA12_112<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA12_113 = input.LA(1);

                        s = -1;
                        if ( (LA12_113=='e') ) {s = 114;}

                        else if ( ((LA12_113>='\u0000' && LA12_113<='d')||(LA12_113>='f' && LA12_113<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA12_114 = input.LA(1);

                        s = -1;
                        if ( (LA12_114=='r') ) {s = 115;}

                        else if ( ((LA12_114>='\u0000' && LA12_114<='q')||(LA12_114>='s' && LA12_114<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA12_115 = input.LA(1);

                        s = -1;
                        if ( (LA12_115=='s') ) {s = 116;}

                        else if ( ((LA12_115>='\u0000' && LA12_115<='r')||(LA12_115>='t' && LA12_115<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA12_116 = input.LA(1);

                        s = -1;
                        if ( (LA12_116=='i') ) {s = 117;}

                        else if ( ((LA12_116>='\u0000' && LA12_116<='h')||(LA12_116>='j' && LA12_116<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA12_117 = input.LA(1);

                        s = -1;
                        if ( (LA12_117=='o') ) {s = 118;}

                        else if ( ((LA12_117>='\u0000' && LA12_117<='n')||(LA12_117>='p' && LA12_117<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA12_118 = input.LA(1);

                        s = -1;
                        if ( (LA12_118=='n') ) {s = 119;}

                        else if ( ((LA12_118>='\u0000' && LA12_118<='m')||(LA12_118>='o' && LA12_118<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA12_119 = input.LA(1);

                        s = -1;
                        if ( (LA12_119=='\"') ) {s = 120;}

                        else if ( ((LA12_119>='\u0000' && LA12_119<='!')||(LA12_119>='#' && LA12_119<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA12_17 = input.LA(1);

                        s = -1;
                        if ( (LA12_17=='o') ) {s = 35;}

                        else if ( (LA12_17=='y') ) {s = 36;}

                        else if ( ((LA12_17>='\u0000' && LA12_17<='n')||(LA12_17>='p' && LA12_17<='x')||(LA12_17>='z' && LA12_17<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA12_12 = input.LA(1);

                        s = -1;
                        if ( ((LA12_12>='\u0000' && LA12_12<='\uFFFF')) ) {s = 20;}

                        else s = 15;

                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA12_18 = input.LA(1);

                        s = -1;
                        if ( (LA12_18=='e') ) {s = 37;}

                        else if ( ((LA12_18>='\u0000' && LA12_18<='d')||(LA12_18>='f' && LA12_18<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA12_37 = input.LA(1);

                        s = -1;
                        if ( (LA12_37=='p') ) {s = 44;}

                        else if ( ((LA12_37>='\u0000' && LA12_37<='o')||(LA12_37>='q' && LA12_37<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA12_44 = input.LA(1);

                        s = -1;
                        if ( (LA12_44=='l') ) {s = 59;}

                        else if ( ((LA12_44>='\u0000' && LA12_44<='k')||(LA12_44>='m' && LA12_44<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA12_59 = input.LA(1);

                        s = -1;
                        if ( (LA12_59=='o') ) {s = 70;}

                        else if ( ((LA12_59>='\u0000' && LA12_59<='n')||(LA12_59>='p' && LA12_59<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA12_70 = input.LA(1);

                        s = -1;
                        if ( (LA12_70=='y') ) {s = 83;}

                        else if ( ((LA12_70>='\u0000' && LA12_70<='x')||(LA12_70>='z' && LA12_70<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA12_83 = input.LA(1);

                        s = -1;
                        if ( (LA12_83=='\"') ) {s = 88;}

                        else if ( ((LA12_83>='\u0000' && LA12_83<='!')||(LA12_83>='#' && LA12_83<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}