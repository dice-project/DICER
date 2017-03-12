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
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
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
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
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
            // InternalToscaDsl.g:26:7: ( '\\n\"value\": ' )
            // InternalToscaDsl.g:26:9: '\\n\"value\": '
            {
            match("\n\"value\": "); 


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
            // InternalToscaDsl.g:27:7: ( '\"type\" :' )
            // InternalToscaDsl.g:27:9: '\"type\" :'
            {
            match("\"type\" :"); 


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
            // InternalToscaDsl.g:28:7: ( ',\\n\"instances\" : {' )
            // InternalToscaDsl.g:28:9: ',\\n\"instances\" : {'
            {
            match(",\n\"instances\" : {"); 


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
            // InternalToscaDsl.g:29:7: ( ',\\n\"relationships\" :' )
            // InternalToscaDsl.g:29:9: ',\\n\"relationships\" :'
            {
            match(",\n\"relationships\" :"); 


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
            // InternalToscaDsl.g:30:7: ( ',\\n\"interfaces\" :' )
            // InternalToscaDsl.g:30:9: ',\\n\"interfaces\" :'
            {
            match(",\n\"interfaces\" :"); 


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
            // InternalToscaDsl.g:31:7: ( ',\\n\"properties\" :' )
            // InternalToscaDsl.g:31:9: ',\\n\"properties\" :'
            {
            match(",\n\"properties\" :"); 


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
            // InternalToscaDsl.g:32:7: ( '\\n\"configuration\" : {' )
            // InternalToscaDsl.g:32:9: '\\n\"configuration\" : {'
            {
            match("\n\"configuration\" : {"); 


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
            // InternalToscaDsl.g:33:7: ( ',\\n\"resources\" :' )
            // InternalToscaDsl.g:33:9: ',\\n\"resources\" :'
            {
            match(",\n\"resources\" :"); 


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
            // InternalToscaDsl.g:34:7: ( ',\\n\"rules\" :' )
            // InternalToscaDsl.g:34:9: ',\\n\"rules\" :'
            {
            match(",\n\"rules\" :"); 


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
            // InternalToscaDsl.g:35:7: ( ',\\n\"arguments\" :' )
            // InternalToscaDsl.g:35:9: ',\\n\"arguments\" :'
            {
            match(",\n\"arguments\" :"); 


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
            // InternalToscaDsl.g:36:7: ( ',\\n\"requirements\" :' )
            // InternalToscaDsl.g:36:9: ',\\n\"requirements\" :'
            {
            match(",\n\"requirements\" :"); 


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
            // InternalToscaDsl.g:37:7: ( ',\\n\"capabilities\" :' )
            // InternalToscaDsl.g:37:9: ',\\n\"capabilities\" :'
            {
            match(",\n\"capabilities\" :"); 


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
            // InternalToscaDsl.g:38:7: ( '\"remote_ip_prefix\": ' )
            // InternalToscaDsl.g:38:9: '\"remote_ip_prefix\": '
            {
            match("\"remote_ip_prefix\": "); 


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
            // InternalToscaDsl.g:39:7: ( '\"port\": ' )
            // InternalToscaDsl.g:39:9: '\"port\": '
            {
            match("\"port\": "); 


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
            // InternalToscaDsl.g:40:7: ( '\\n' )
            // InternalToscaDsl.g:40:9: '\\n'
            {
            match('\n'); 

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
            // InternalToscaDsl.g:41:7: ( '\"deploy\" :' )
            // InternalToscaDsl.g:41:9: '\"deploy\" :'
            {
            match("\"deploy\" :"); 


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
            // InternalToscaDsl.g:42:7: ( ',\\n\"target\" :' )
            // InternalToscaDsl.g:42:9: ',\\n\"target\" :'
            {
            match(",\n\"target\" :"); 


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
            // InternalToscaDsl.g:43:7: ( ',\\n\"source_interfaces\" :' )
            // InternalToscaDsl.g:43:9: ',\\n\"source_interfaces\" :'
            {
            match(",\n\"source_interfaces\" :"); 


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
            // InternalToscaDsl.g:44:7: ( ',\\n\"target_iterfaces\" :' )
            // InternalToscaDsl.g:44:9: ',\\n\"target_iterfaces\" :'
            {
            match(",\n\"target_iterfaces\" :"); 


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
            // InternalToscaDsl.g:45:7: ( ',\\n\"targets\" :' )
            // InternalToscaDsl.g:45:9: ',\\n\"targets\" :'
            {
            match(",\n\"targets\" :"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:46:7: ( '\"capabiity\" :' )
            // InternalToscaDsl.g:46:9: '\"capabiity\" :'
            {
            match("\"capabiity\" :"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:47:7: ( ',\\n\"node\" :' )
            // InternalToscaDsl.g:47:9: ',\\n\"node\" :'
            {
            match(",\n\"node\" :"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:48:7: ( '\\n\"inputs\" :' )
            // InternalToscaDsl.g:48:9: '\\n\"inputs\" :'
            {
            match("\n\"inputs\" :"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:49:7: ( ', ' )
            // InternalToscaDsl.g:49:9: ', '
            {
            match(", "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:50:7: ( 'Value' )
            // InternalToscaDsl.g:50:9: 'Value'
            {
            match("Value"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:51:7: ( 'Expression' )
            // InternalToscaDsl.g:51:9: 'Expression'
            {
            match("Expression"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:52:7: ( '\"get_attribute\":' )
            // InternalToscaDsl.g:52:9: '\"get_attribute\":'
            {
            match("\"get_attribute\":"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:3025:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalToscaDsl.g:3025:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalToscaDsl.g:3025:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalToscaDsl.g:3025:11: '^'
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

            // InternalToscaDsl.g:3025:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalToscaDsl.g:3027:10: ( ( '0' .. '9' )+ )
            // InternalToscaDsl.g:3027:12: ( '0' .. '9' )+
            {
            // InternalToscaDsl.g:3027:12: ( '0' .. '9' )+
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
            	    // InternalToscaDsl.g:3027:13: '0' .. '9'
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
            // InternalToscaDsl.g:3029:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalToscaDsl.g:3029:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalToscaDsl.g:3029:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalToscaDsl.g:3029:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalToscaDsl.g:3029:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalToscaDsl.g:3029:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalToscaDsl.g:3029:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalToscaDsl.g:3029:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalToscaDsl.g:3029:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalToscaDsl.g:3029:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalToscaDsl.g:3029:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalToscaDsl.g:3031:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalToscaDsl.g:3031:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalToscaDsl.g:3031:24: ( options {greedy=false; } : . )*
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
            	    // InternalToscaDsl.g:3031:52: .
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
            // InternalToscaDsl.g:3033:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalToscaDsl.g:3033:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalToscaDsl.g:3033:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalToscaDsl.g:3033:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalToscaDsl.g:3033:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalToscaDsl.g:3033:41: ( '\\r' )? '\\n'
                    {
                    // InternalToscaDsl.g:3033:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalToscaDsl.g:3033:41: '\\r'
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
            // InternalToscaDsl.g:3035:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalToscaDsl.g:3035:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalToscaDsl.g:3035:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalToscaDsl.g:3037:16: ( . )
            // InternalToscaDsl.g:3037:18: .
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
        // InternalToscaDsl.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=49;
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
                // InternalToscaDsl.g:1:220: T__46
                {
                mT__46(); 

                }
                break;
            case 37 :
                // InternalToscaDsl.g:1:226: T__47
                {
                mT__47(); 

                }
                break;
            case 38 :
                // InternalToscaDsl.g:1:232: T__48
                {
                mT__48(); 

                }
                break;
            case 39 :
                // InternalToscaDsl.g:1:238: T__49
                {
                mT__49(); 

                }
                break;
            case 40 :
                // InternalToscaDsl.g:1:244: T__50
                {
                mT__50(); 

                }
                break;
            case 41 :
                // InternalToscaDsl.g:1:250: T__51
                {
                mT__51(); 

                }
                break;
            case 42 :
                // InternalToscaDsl.g:1:256: T__52
                {
                mT__52(); 

                }
                break;
            case 43 :
                // InternalToscaDsl.g:1:262: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 44 :
                // InternalToscaDsl.g:1:270: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 45 :
                // InternalToscaDsl.g:1:279: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 46 :
                // InternalToscaDsl.g:1:291: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 47 :
                // InternalToscaDsl.g:1:307: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 48 :
                // InternalToscaDsl.g:1:323: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 49 :
                // InternalToscaDsl.g:1:331: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\2\uffff\1\21\1\34\4\uffff\1\42\2\45\1\21\2\uffff\2\21\24\uffff\1\45\1\uffff\1\45\16\uffff\2\45\22\uffff\2\45\17\uffff\1\154\1\45\1\uffff\1\31\1\uffff\1\31\15\uffff\1\45\11\uffff\1\45\2\uffff\1\31\5\uffff\1\45\6\uffff\1\45\7\uffff\1\u0094\2\uffff\1\31\16\uffff\1\31\6\uffff\1\31\11\uffff\1\31\1\uffff";
    static final String DFA12_eofS =
        "\u00b4\uffff";
    static final String DFA12_minS =
        "\1\0\1\uffff\1\0\1\12\4\uffff\1\11\1\141\1\170\1\101\2\uffff\1\0\1\52\3\uffff\6\0\1\uffff\1\42\6\uffff\1\143\2\uffff\1\154\1\uffff\1\160\3\uffff\7\0\1\141\3\uffff\1\165\1\162\7\0\1\uffff\1\155\1\uffff\1\157\1\145\1\uffff\1\157\2\uffff\1\141\1\uffff\2\145\7\0\1\uffff\1\160\1\144\1\141\3\uffff\1\162\1\60\1\163\1\0\1\40\1\0\1\72\3\0\3\uffff\1\145\4\uffff\1\147\1\uffff\1\163\1\0\1\uffff\1\0\1\uffff\3\0\1\42\1\145\1\151\2\0\1\40\2\0\2\uffff\1\164\1\157\2\0\1\uffff\2\0\1\42\1\156\4\0\3\uffff\1\60\2\0\1\40\1\0\1\uffff\2\0\1\uffff\11\0\1\72\2\0\1\uffff\3\0\1\72\1\0\1\uffff\7\0\1\40\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\uffff\1\uffff\1\40\4\uffff\1\42\1\141\1\170\1\172\2\uffff\1\uffff\1\57\3\uffff\6\uffff\1\uffff\1\42\6\uffff\1\166\2\uffff\1\154\1\uffff\1\160\3\uffff\7\uffff\1\164\3\uffff\1\165\1\162\7\uffff\1\uffff\1\156\1\uffff\1\157\1\165\1\uffff\1\162\2\uffff\1\141\1\uffff\2\145\7\uffff\1\uffff\1\164\1\144\1\163\3\uffff\1\162\1\172\1\163\1\uffff\1\40\1\uffff\1\72\3\uffff\3\uffff\1\145\4\uffff\1\147\1\uffff\1\163\1\uffff\1\uffff\1\uffff\1\uffff\3\uffff\1\137\1\145\1\151\2\uffff\1\40\2\uffff\2\uffff\1\164\1\157\2\uffff\1\uffff\2\uffff\1\163\1\156\4\uffff\3\uffff\1\172\2\uffff\1\40\1\uffff\1\uffff\2\uffff\1\uffff\11\uffff\1\72\2\uffff\1\uffff\3\uffff\1\72\1\uffff\1\uffff\7\uffff\1\40\1\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\2\uffff\1\5\1\7\1\11\1\17\4\uffff\1\53\1\54\2\uffff\1\60\1\61\1\1\6\uffff\1\55\1\uffff\1\47\1\6\1\5\1\7\1\11\1\17\1\uffff\1\36\1\60\1\uffff\1\53\1\uffff\1\54\1\56\1\57\10\uffff\1\20\1\26\1\46\11\uffff\1\3\1\uffff\1\10\2\uffff\1\15\1\uffff\1\31\1\33\1\uffff\1\41\11\uffff\1\4\3\uffff\1\30\1\16\1\25\12\uffff\1\12\1\22\1\24\1\uffff\1\14\1\23\1\27\1\32\1\uffff\1\50\2\uffff\1\21\1\uffff\1\35\13\uffff\1\13\1\45\4\uffff\1\37\10\uffff\1\40\1\42\1\43\5\uffff\1\51\2\uffff\1\44\14\uffff\1\52\5\uffff\1\34\10\uffff\1\2";
    static final String DFA12_specialS =
        "\1\6\1\uffff\1\53\13\uffff\1\113\4\uffff\1\116\1\16\1\36\1\42\1\104\1\0\21\uffff\1\54\1\50\1\17\1\37\1\43\1\105\1\1\6\uffff\1\55\1\51\1\20\1\40\1\44\1\106\1\2\15\uffff\1\56\1\52\1\21\1\41\1\45\1\107\1\3\12\uffff\1\57\1\uffff\1\22\1\uffff\1\46\1\110\1\4\13\uffff\1\60\1\uffff\1\23\1\uffff\1\47\1\111\1\5\3\uffff\1\61\1\24\1\uffff\1\112\1\7\4\uffff\1\62\1\25\1\uffff\1\114\1\10\2\uffff\1\63\1\26\1\115\1\11\4\uffff\1\64\1\27\1\uffff\1\12\1\uffff\1\65\1\30\1\uffff\1\13\1\66\1\31\1\14\1\67\1\32\1\15\1\70\1\33\1\uffff\1\71\1\34\1\uffff\1\72\1\35\1\73\1\uffff\1\74\1\uffff\1\75\1\76\1\77\1\100\1\101\1\102\1\103\2\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\21\1\20\1\10\2\21\1\20\22\21\1\20\1\21\1\2\4\21\1\16\4\21\1\3\2\21\1\17\12\15\1\7\6\21\4\14\1\12\20\14\1\11\4\14\1\4\1\21\1\5\1\13\1\14\1\21\32\14\1\1\1\21\1\6\uff82\21",
            "",
            "\143\31\1\27\1\26\2\31\1\30\10\31\1\25\1\31\1\24\1\31\1\23\uff8b\31",
            "\1\32\25\uffff\1\33",
            "",
            "",
            "",
            "",
            "\2\43\2\uffff\1\43\22\uffff\1\43\1\uffff\1\41",
            "\1\44",
            "\1\46",
            "\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "\0\31",
            "\1\50\4\uffff\1\51",
            "",
            "",
            "",
            "\157\31\1\52\11\31\1\53\uff86\31",
            "\145\31\1\54\uff9a\31",
            "\157\31\1\55\uff90\31",
            "\145\31\1\56\uff9a\31",
            "\141\31\1\57\uff9e\31",
            "\145\31\1\60\uff9a\31",
            "",
            "\1\61",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\63\5\uffff\1\64\14\uffff\1\62",
            "",
            "",
            "\1\65",
            "",
            "\1\66",
            "",
            "",
            "",
            "\163\31\1\67\uff8c\31",
            "\160\31\1\70\uff8f\31",
            "\155\31\1\71\uff92\31",
            "\162\31\1\72\uff8d\31",
            "\160\31\1\73\uff8f\31",
            "\160\31\1\74\uff8f\31",
            "\164\31\1\75\uff8b\31",
            "\1\105\1\uffff\1\106\1\76\2\uffff\1\103\1\uffff\1\77\4\uffff\1\101\1\100\1\104\1\uffff\1\102\1\110\1\107",
            "",
            "",
            "",
            "\1\111",
            "\1\112",
            "\143\31\1\113\uff9c\31",
            "\145\31\1\114\uff9a\31",
            "\157\31\1\115\uff90\31",
            "\164\31\1\116\uff8b\31",
            "\154\31\1\117\uff93\31",
            "\141\31\1\120\uff9e\31",
            "\137\31\1\121\uffa0\31",
            "",
            "\1\122\1\123",
            "",
            "\1\124",
            "\1\125\17\uffff\1\126",
            "",
            "\1\127\2\uffff\1\130",
            "",
            "",
            "\1\131",
            "",
            "\1\132",
            "\1\133",
            "\141\31\1\134\uff9e\31",
            "\42\31\1\135\uffdd\31",
            "\164\31\1\136\uff8b\31",
            "\42\31\1\137\uffdd\31",
            "\157\31\1\140\uff90\31",
            "\142\31\1\141\uff9d\31",
            "\141\31\1\142\uff9e\31",
            "",
            "\1\143\2\uffff\1\144\1\145",
            "\1\146",
            "\1\147\12\uffff\1\150\4\uffff\1\152\1\uffff\1\151",
            "",
            "",
            "",
            "\1\153",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\155",
            "\137\31\1\156\uffa0\31",
            "\1\157",
            "\145\31\1\160\uff9a\31",
            "\1\161",
            "\171\31\1\162\uff86\31",
            "\151\31\1\163\uff96\31",
            "\164\31\1\164\uff8b\31",
            "",
            "",
            "",
            "\1\165",
            "",
            "",
            "",
            "",
            "\1\166",
            "",
            "\1\167",
            "\144\31\1\170\uff9b\31",
            "",
            "\137\31\1\171\uffa0\31",
            "",
            "\42\31\1\172\uffdd\31",
            "\151\31\1\173\uff96\31",
            "\164\31\1\174\uff8b\31",
            "\1\176\74\uffff\1\175",
            "\1\177",
            "\1\u0080",
            "\145\31\1\u0081\uff9a\31",
            "\151\31\1\u0082\uff96\31",
            "\1\u0083",
            "\164\31\1\u0084\uff8b\31",
            "\162\31\1\u0085\uff8d\31",
            "",
            "",
            "\1\u0086",
            "\1\u0087",
            "\146\31\1\u0088\uff99\31",
            "\160\31\1\u0089\uff8f\31",
            "",
            "\171\31\1\u008a\uff86\31",
            "\151\31\1\u008b\uff96\31",
            "\1\u008c\74\uffff\1\u008d\23\uffff\1\u008e",
            "\1\u008f",
            "\151\31\1\u0090\uff96\31",
            "\137\31\1\u0091\uffa0\31",
            "\42\31\1\u0092\uffdd\31",
            "\142\31\1\u0093\uff9d\31",
            "",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\156\31\1\u0095\uff91\31",
            "\160\31\1\u0096\uff8f\31",
            "\1\u0097",
            "\165\31\1\u0098\uff8a\31",
            "",
            "\151\31\1\u0099\uff96\31",
            "\162\31\1\u009a\uff8d\31",
            "",
            "\164\31\1\u009b\uff8b\31",
            "\164\31\1\u009c\uff8b\31",
            "\145\31\1\u009d\uff9a\31",
            "\145\31\1\u009e\uff9a\31",
            "\151\31\1\u009f\uff96\31",
            "\146\31\1\u00a0\uff99\31",
            "\42\31\1\u00a1\uffdd\31",
            "\157\31\1\u00a2\uff90\31",
            "\151\31\1\u00a3\uff96\31",
            "\1\u00a4",
            "\156\31\1\u00a5\uff91\31",
            "\170\31\1\u00a6\uff87\31",
            "",
            "\163\31\1\u00a7\uff8c\31",
            "\42\31\1\u00a8\uffdd\31",
            "\137\31\1\u00a9\uffa0\31",
            "\1\u00aa",
            "\166\31\1\u00ab\uff89\31",
            "",
            "\145\31\1\u00ac\uff9a\31",
            "\162\31\1\u00ad\uff8d\31",
            "\163\31\1\u00ae\uff8c\31",
            "\151\31\1\u00af\uff96\31",
            "\157\31\1\u00b0\uff90\31",
            "\156\31\1\u00b1\uff91\31",
            "\42\31\1\u00b2\uffdd\31",
            "\1\u00b3",
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
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_24 = input.LA(1);

                        s = -1;
                        if ( (LA12_24=='e') ) {s = 48;}

                        else if ( ((LA12_24>='\u0000' && LA12_24<='d')||(LA12_24>='f' && LA12_24<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_48 = input.LA(1);

                        s = -1;
                        if ( (LA12_48=='t') ) {s = 61;}

                        else if ( ((LA12_48>='\u0000' && LA12_48<='s')||(LA12_48>='u' && LA12_48<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_61 = input.LA(1);

                        s = -1;
                        if ( (LA12_61=='_') ) {s = 81;}

                        else if ( ((LA12_61>='\u0000' && LA12_61<='^')||(LA12_61>='`' && LA12_61<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA12_81 = input.LA(1);

                        s = -1;
                        if ( (LA12_81=='a') ) {s = 98;}

                        else if ( ((LA12_81>='\u0000' && LA12_81<='`')||(LA12_81>='b' && LA12_81<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA12_98 = input.LA(1);

                        s = -1;
                        if ( (LA12_98=='t') ) {s = 116;}

                        else if ( ((LA12_98>='\u0000' && LA12_98<='s')||(LA12_98>='u' && LA12_98<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA12_116 = input.LA(1);

                        s = -1;
                        if ( (LA12_116=='t') ) {s = 124;}

                        else if ( ((LA12_116>='\u0000' && LA12_116<='s')||(LA12_116>='u' && LA12_116<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
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

                        else if ( (LA12_0=='V') ) {s = 9;}

                        else if ( (LA12_0=='E') ) {s = 10;}

                        else if ( (LA12_0=='^') ) {s = 11;}

                        else if ( ((LA12_0>='A' && LA12_0<='D')||(LA12_0>='F' && LA12_0<='U')||(LA12_0>='W' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='z')) ) {s = 12;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 13;}

                        else if ( (LA12_0=='\'') ) {s = 14;}

                        else if ( (LA12_0=='/') ) {s = 15;}

                        else if ( (LA12_0=='\t'||LA12_0=='\r'||LA12_0==' ') ) {s = 16;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='+')||(LA12_0>='-' && LA12_0<='.')||(LA12_0>=';' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 17;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA12_124 = input.LA(1);

                        s = -1;
                        if ( (LA12_124=='r') ) {s = 133;}

                        else if ( ((LA12_124>='\u0000' && LA12_124<='q')||(LA12_124>='s' && LA12_124<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA12_133 = input.LA(1);

                        s = -1;
                        if ( (LA12_133=='i') ) {s = 139;}

                        else if ( ((LA12_133>='\u0000' && LA12_133<='h')||(LA12_133>='j' && LA12_133<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA12_139 = input.LA(1);

                        s = -1;
                        if ( (LA12_139=='b') ) {s = 147;}

                        else if ( ((LA12_139>='\u0000' && LA12_139<='a')||(LA12_139>='c' && LA12_139<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA12_147 = input.LA(1);

                        s = -1;
                        if ( (LA12_147=='u') ) {s = 152;}

                        else if ( ((LA12_147>='\u0000' && LA12_147<='t')||(LA12_147>='v' && LA12_147<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA12_152 = input.LA(1);

                        s = -1;
                        if ( (LA12_152=='t') ) {s = 155;}

                        else if ( ((LA12_152>='\u0000' && LA12_152<='s')||(LA12_152>='u' && LA12_152<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA12_155 = input.LA(1);

                        s = -1;
                        if ( (LA12_155=='e') ) {s = 158;}

                        else if ( ((LA12_155>='\u0000' && LA12_155<='d')||(LA12_155>='f' && LA12_155<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA12_158 = input.LA(1);

                        s = -1;
                        if ( (LA12_158=='\"') ) {s = 161;}

                        else if ( ((LA12_158>='\u0000' && LA12_158<='!')||(LA12_158>='#' && LA12_158<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA12_20 = input.LA(1);

                        s = -1;
                        if ( (LA12_20=='e') ) {s = 44;}

                        else if ( ((LA12_20>='\u0000' && LA12_20<='d')||(LA12_20>='f' && LA12_20<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA12_44 = input.LA(1);

                        s = -1;
                        if ( (LA12_44=='m') ) {s = 57;}

                        else if ( ((LA12_44>='\u0000' && LA12_44<='l')||(LA12_44>='n' && LA12_44<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA12_57 = input.LA(1);

                        s = -1;
                        if ( (LA12_57=='o') ) {s = 77;}

                        else if ( ((LA12_57>='\u0000' && LA12_57<='n')||(LA12_57>='p' && LA12_57<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA12_77 = input.LA(1);

                        s = -1;
                        if ( (LA12_77=='t') ) {s = 94;}

                        else if ( ((LA12_77>='\u0000' && LA12_77<='s')||(LA12_77>='u' && LA12_77<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA12_94 = input.LA(1);

                        s = -1;
                        if ( (LA12_94=='e') ) {s = 112;}

                        else if ( ((LA12_94>='\u0000' && LA12_94<='d')||(LA12_94>='f' && LA12_94<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA12_112 = input.LA(1);

                        s = -1;
                        if ( (LA12_112=='_') ) {s = 121;}

                        else if ( ((LA12_112>='\u0000' && LA12_112<='^')||(LA12_112>='`' && LA12_112<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA12_121 = input.LA(1);

                        s = -1;
                        if ( (LA12_121=='i') ) {s = 130;}

                        else if ( ((LA12_121>='\u0000' && LA12_121<='h')||(LA12_121>='j' && LA12_121<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA12_130 = input.LA(1);

                        s = -1;
                        if ( (LA12_130=='p') ) {s = 137;}

                        else if ( ((LA12_130>='\u0000' && LA12_130<='o')||(LA12_130>='q' && LA12_130<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA12_137 = input.LA(1);

                        s = -1;
                        if ( (LA12_137=='_') ) {s = 145;}

                        else if ( ((LA12_137>='\u0000' && LA12_137<='^')||(LA12_137>='`' && LA12_137<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA12_145 = input.LA(1);

                        s = -1;
                        if ( (LA12_145=='p') ) {s = 150;}

                        else if ( ((LA12_145>='\u0000' && LA12_145<='o')||(LA12_145>='q' && LA12_145<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA12_150 = input.LA(1);

                        s = -1;
                        if ( (LA12_150=='r') ) {s = 154;}

                        else if ( ((LA12_150>='\u0000' && LA12_150<='q')||(LA12_150>='s' && LA12_150<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA12_154 = input.LA(1);

                        s = -1;
                        if ( (LA12_154=='e') ) {s = 157;}

                        else if ( ((LA12_154>='\u0000' && LA12_154<='d')||(LA12_154>='f' && LA12_154<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA12_157 = input.LA(1);

                        s = -1;
                        if ( (LA12_157=='f') ) {s = 160;}

                        else if ( ((LA12_157>='\u0000' && LA12_157<='e')||(LA12_157>='g' && LA12_157<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA12_160 = input.LA(1);

                        s = -1;
                        if ( (LA12_160=='i') ) {s = 163;}

                        else if ( ((LA12_160>='\u0000' && LA12_160<='h')||(LA12_160>='j' && LA12_160<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA12_163 = input.LA(1);

                        s = -1;
                        if ( (LA12_163=='x') ) {s = 166;}

                        else if ( ((LA12_163>='\u0000' && LA12_163<='w')||(LA12_163>='y' && LA12_163<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA12_166 = input.LA(1);

                        s = -1;
                        if ( (LA12_166=='\"') ) {s = 168;}

                        else if ( ((LA12_166>='\u0000' && LA12_166<='!')||(LA12_166>='#' && LA12_166<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA12_21 = input.LA(1);

                        s = -1;
                        if ( (LA12_21=='o') ) {s = 45;}

                        else if ( ((LA12_21>='\u0000' && LA12_21<='n')||(LA12_21>='p' && LA12_21<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA12_45 = input.LA(1);

                        s = -1;
                        if ( (LA12_45=='r') ) {s = 58;}

                        else if ( ((LA12_45>='\u0000' && LA12_45<='q')||(LA12_45>='s' && LA12_45<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA12_58 = input.LA(1);

                        s = -1;
                        if ( (LA12_58=='t') ) {s = 78;}

                        else if ( ((LA12_58>='\u0000' && LA12_58<='s')||(LA12_58>='u' && LA12_58<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA12_78 = input.LA(1);

                        s = -1;
                        if ( (LA12_78=='\"') ) {s = 95;}

                        else if ( ((LA12_78>='\u0000' && LA12_78<='!')||(LA12_78>='#' && LA12_78<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA12_22 = input.LA(1);

                        s = -1;
                        if ( (LA12_22=='e') ) {s = 46;}

                        else if ( ((LA12_22>='\u0000' && LA12_22<='d')||(LA12_22>='f' && LA12_22<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA12_46 = input.LA(1);

                        s = -1;
                        if ( (LA12_46=='p') ) {s = 59;}

                        else if ( ((LA12_46>='\u0000' && LA12_46<='o')||(LA12_46>='q' && LA12_46<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA12_59 = input.LA(1);

                        s = -1;
                        if ( (LA12_59=='l') ) {s = 79;}

                        else if ( ((LA12_59>='\u0000' && LA12_59<='k')||(LA12_59>='m' && LA12_59<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA12_79 = input.LA(1);

                        s = -1;
                        if ( (LA12_79=='o') ) {s = 96;}

                        else if ( ((LA12_79>='\u0000' && LA12_79<='n')||(LA12_79>='p' && LA12_79<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA12_96 = input.LA(1);

                        s = -1;
                        if ( (LA12_96=='y') ) {s = 114;}

                        else if ( ((LA12_96>='\u0000' && LA12_96<='x')||(LA12_96>='z' && LA12_96<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA12_114 = input.LA(1);

                        s = -1;
                        if ( (LA12_114=='\"') ) {s = 122;}

                        else if ( ((LA12_114>='\u0000' && LA12_114<='!')||(LA12_114>='#' && LA12_114<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA12_43 = input.LA(1);

                        s = -1;
                        if ( (LA12_43=='p') ) {s = 56;}

                        else if ( ((LA12_43>='\u0000' && LA12_43<='o')||(LA12_43>='q' && LA12_43<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA12_56 = input.LA(1);

                        s = -1;
                        if ( (LA12_56=='e') ) {s = 76;}

                        else if ( ((LA12_56>='\u0000' && LA12_56<='d')||(LA12_56>='f' && LA12_56<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA12_76 = input.LA(1);

                        s = -1;
                        if ( (LA12_76=='\"') ) {s = 93;}

                        else if ( ((LA12_76>='\u0000' && LA12_76<='!')||(LA12_76>='#' && LA12_76<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA12_2 = input.LA(1);

                        s = -1;
                        if ( (LA12_2=='t') ) {s = 19;}

                        else if ( (LA12_2=='r') ) {s = 20;}

                        else if ( (LA12_2=='p') ) {s = 21;}

                        else if ( (LA12_2=='d') ) {s = 22;}

                        else if ( (LA12_2=='c') ) {s = 23;}

                        else if ( (LA12_2=='g') ) {s = 24;}

                        else if ( ((LA12_2>='\u0000' && LA12_2<='b')||(LA12_2>='e' && LA12_2<='f')||(LA12_2>='h' && LA12_2<='o')||LA12_2=='q'||LA12_2=='s'||(LA12_2>='u' && LA12_2<='\uFFFF')) ) {s = 25;}

                        else s = 17;

                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA12_42 = input.LA(1);

                        s = -1;
                        if ( (LA12_42=='s') ) {s = 55;}

                        else if ( ((LA12_42>='\u0000' && LA12_42<='r')||(LA12_42>='t' && LA12_42<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA12_55 = input.LA(1);

                        s = -1;
                        if ( (LA12_55=='c') ) {s = 75;}

                        else if ( ((LA12_55>='\u0000' && LA12_55<='b')||(LA12_55>='d' && LA12_55<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA12_75 = input.LA(1);

                        s = -1;
                        if ( (LA12_75=='a') ) {s = 92;}

                        else if ( ((LA12_75>='\u0000' && LA12_75<='`')||(LA12_75>='b' && LA12_75<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA12_92 = input.LA(1);

                        s = -1;
                        if ( (LA12_92=='_') ) {s = 110;}

                        else if ( ((LA12_92>='\u0000' && LA12_92<='^')||(LA12_92>='`' && LA12_92<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA12_110 = input.LA(1);

                        s = -1;
                        if ( (LA12_110=='d') ) {s = 120;}

                        else if ( ((LA12_110>='\u0000' && LA12_110<='c')||(LA12_110>='e' && LA12_110<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA12_120 = input.LA(1);

                        s = -1;
                        if ( (LA12_120=='e') ) {s = 129;}

                        else if ( ((LA12_120>='\u0000' && LA12_120<='d')||(LA12_120>='f' && LA12_120<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA12_129 = input.LA(1);

                        s = -1;
                        if ( (LA12_129=='f') ) {s = 136;}

                        else if ( ((LA12_129>='\u0000' && LA12_129<='e')||(LA12_129>='g' && LA12_129<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA12_136 = input.LA(1);

                        s = -1;
                        if ( (LA12_136=='i') ) {s = 144;}

                        else if ( ((LA12_136>='\u0000' && LA12_136<='h')||(LA12_136>='j' && LA12_136<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA12_144 = input.LA(1);

                        s = -1;
                        if ( (LA12_144=='n') ) {s = 149;}

                        else if ( ((LA12_144>='\u0000' && LA12_144<='m')||(LA12_144>='o' && LA12_144<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA12_149 = input.LA(1);

                        s = -1;
                        if ( (LA12_149=='i') ) {s = 153;}

                        else if ( ((LA12_149>='\u0000' && LA12_149<='h')||(LA12_149>='j' && LA12_149<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA12_153 = input.LA(1);

                        s = -1;
                        if ( (LA12_153=='t') ) {s = 156;}

                        else if ( ((LA12_153>='\u0000' && LA12_153<='s')||(LA12_153>='u' && LA12_153<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA12_156 = input.LA(1);

                        s = -1;
                        if ( (LA12_156=='i') ) {s = 159;}

                        else if ( ((LA12_156>='\u0000' && LA12_156<='h')||(LA12_156>='j' && LA12_156<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA12_159 = input.LA(1);

                        s = -1;
                        if ( (LA12_159=='o') ) {s = 162;}

                        else if ( ((LA12_159>='\u0000' && LA12_159<='n')||(LA12_159>='p' && LA12_159<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA12_162 = input.LA(1);

                        s = -1;
                        if ( (LA12_162=='n') ) {s = 165;}

                        else if ( ((LA12_162>='\u0000' && LA12_162<='m')||(LA12_162>='o' && LA12_162<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA12_165 = input.LA(1);

                        s = -1;
                        if ( (LA12_165=='s') ) {s = 167;}

                        else if ( ((LA12_165>='\u0000' && LA12_165<='r')||(LA12_165>='t' && LA12_165<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA12_167 = input.LA(1);

                        s = -1;
                        if ( (LA12_167=='_') ) {s = 169;}

                        else if ( ((LA12_167>='\u0000' && LA12_167<='^')||(LA12_167>='`' && LA12_167<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA12_169 = input.LA(1);

                        s = -1;
                        if ( (LA12_169=='v') ) {s = 171;}

                        else if ( ((LA12_169>='\u0000' && LA12_169<='u')||(LA12_169>='w' && LA12_169<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA12_171 = input.LA(1);

                        s = -1;
                        if ( (LA12_171=='e') ) {s = 172;}

                        else if ( ((LA12_171>='\u0000' && LA12_171<='d')||(LA12_171>='f' && LA12_171<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA12_172 = input.LA(1);

                        s = -1;
                        if ( (LA12_172=='r') ) {s = 173;}

                        else if ( ((LA12_172>='\u0000' && LA12_172<='q')||(LA12_172>='s' && LA12_172<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA12_173 = input.LA(1);

                        s = -1;
                        if ( (LA12_173=='s') ) {s = 174;}

                        else if ( ((LA12_173>='\u0000' && LA12_173<='r')||(LA12_173>='t' && LA12_173<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA12_174 = input.LA(1);

                        s = -1;
                        if ( (LA12_174=='i') ) {s = 175;}

                        else if ( ((LA12_174>='\u0000' && LA12_174<='h')||(LA12_174>='j' && LA12_174<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA12_175 = input.LA(1);

                        s = -1;
                        if ( (LA12_175=='o') ) {s = 176;}

                        else if ( ((LA12_175>='\u0000' && LA12_175<='n')||(LA12_175>='p' && LA12_175<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        int LA12_176 = input.LA(1);

                        s = -1;
                        if ( (LA12_176=='n') ) {s = 177;}

                        else if ( ((LA12_176>='\u0000' && LA12_176<='m')||(LA12_176>='o' && LA12_176<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 67 : 
                        int LA12_177 = input.LA(1);

                        s = -1;
                        if ( (LA12_177=='\"') ) {s = 178;}

                        else if ( ((LA12_177>='\u0000' && LA12_177<='!')||(LA12_177>='#' && LA12_177<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 68 : 
                        int LA12_23 = input.LA(1);

                        s = -1;
                        if ( (LA12_23=='a') ) {s = 47;}

                        else if ( ((LA12_23>='\u0000' && LA12_23<='`')||(LA12_23>='b' && LA12_23<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 69 : 
                        int LA12_47 = input.LA(1);

                        s = -1;
                        if ( (LA12_47=='p') ) {s = 60;}

                        else if ( ((LA12_47>='\u0000' && LA12_47<='o')||(LA12_47>='q' && LA12_47<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 70 : 
                        int LA12_60 = input.LA(1);

                        s = -1;
                        if ( (LA12_60=='a') ) {s = 80;}

                        else if ( ((LA12_60>='\u0000' && LA12_60<='`')||(LA12_60>='b' && LA12_60<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 71 : 
                        int LA12_80 = input.LA(1);

                        s = -1;
                        if ( (LA12_80=='b') ) {s = 97;}

                        else if ( ((LA12_80>='\u0000' && LA12_80<='a')||(LA12_80>='c' && LA12_80<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 72 : 
                        int LA12_97 = input.LA(1);

                        s = -1;
                        if ( (LA12_97=='i') ) {s = 115;}

                        else if ( ((LA12_97>='\u0000' && LA12_97<='h')||(LA12_97>='j' && LA12_97<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 73 : 
                        int LA12_115 = input.LA(1);

                        s = -1;
                        if ( (LA12_115=='i') ) {s = 123;}

                        else if ( ((LA12_115>='\u0000' && LA12_115<='h')||(LA12_115>='j' && LA12_115<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 74 : 
                        int LA12_123 = input.LA(1);

                        s = -1;
                        if ( (LA12_123=='t') ) {s = 132;}

                        else if ( ((LA12_123>='\u0000' && LA12_123<='s')||(LA12_123>='u' && LA12_123<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 75 : 
                        int LA12_14 = input.LA(1);

                        s = -1;
                        if ( ((LA12_14>='\u0000' && LA12_14<='\uFFFF')) ) {s = 25;}

                        else s = 17;

                        if ( s>=0 ) return s;
                        break;
                    case 76 : 
                        int LA12_132 = input.LA(1);

                        s = -1;
                        if ( (LA12_132=='y') ) {s = 138;}

                        else if ( ((LA12_132>='\u0000' && LA12_132<='x')||(LA12_132>='z' && LA12_132<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 77 : 
                        int LA12_138 = input.LA(1);

                        s = -1;
                        if ( (LA12_138=='\"') ) {s = 146;}

                        else if ( ((LA12_138>='\u0000' && LA12_138<='!')||(LA12_138>='#' && LA12_138<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 78 : 
                        int LA12_19 = input.LA(1);

                        s = -1;
                        if ( (LA12_19=='o') ) {s = 42;}

                        else if ( (LA12_19=='y') ) {s = 43;}

                        else if ( ((LA12_19>='\u0000' && LA12_19<='n')||(LA12_19>='p' && LA12_19<='x')||(LA12_19>='z' && LA12_19<='\uFFFF')) ) {s = 25;}

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