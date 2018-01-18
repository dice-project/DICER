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
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
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
            // InternalToscaDsl.g:32:7: ( '\\n\"monitoring\" : {' )
            // InternalToscaDsl.g:32:9: '\\n\"monitoring\" : {'
            {
            match("\n\"monitoring\" : {"); 


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
            // InternalToscaDsl.g:33:7: ( ',\\n\"configuration\" : {' )
            // InternalToscaDsl.g:33:9: ',\\n\"configuration\" : {'
            {
            match(",\n\"configuration\" : {"); 


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
            // InternalToscaDsl.g:34:7: ( ',\\n\"resources\" :' )
            // InternalToscaDsl.g:34:9: ',\\n\"resources\" :'
            {
            match(",\n\"resources\" :"); 


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
            // InternalToscaDsl.g:35:7: ( ',\\n\"port_mapping\" :' )
            // InternalToscaDsl.g:35:9: ',\\n\"port_mapping\" :'
            {
            match(",\n\"port_mapping\" :"); 


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
            // InternalToscaDsl.g:36:7: ( '\\n\"rules\" :' )
            // InternalToscaDsl.g:36:9: '\\n\"rules\" :'
            {
            match("\n\"rules\" :"); 


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
            // InternalToscaDsl.g:37:7: ( ',\\n\"arguments\" :' )
            // InternalToscaDsl.g:37:9: ',\\n\"arguments\" :'
            {
            match(",\n\"arguments\" :"); 


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
            // InternalToscaDsl.g:38:7: ( ',\\n\"environment\" :' )
            // InternalToscaDsl.g:38:9: ',\\n\"environment\" :'
            {
            match(",\n\"environment\" :"); 


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
            // InternalToscaDsl.g:39:7: ( ',\\n\"requirements\" :' )
            // InternalToscaDsl.g:39:9: ',\\n\"requirements\" :'
            {
            match(",\n\"requirements\" :"); 


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
            // InternalToscaDsl.g:40:7: ( ',\\n\"capabilities\" :' )
            // InternalToscaDsl.g:40:9: ',\\n\"capabilities\" :'
            {
            match(",\n\"capabilities\" :"); 


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
            // InternalToscaDsl.g:41:7: ( '\\n \"enabled\": true' )
            // InternalToscaDsl.g:41:9: '\\n \"enabled\": true'
            {
            match("\n \"enabled\": true"); 


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
            // InternalToscaDsl.g:42:7: ( '\\n \"enabled\": false' )
            // InternalToscaDsl.g:42:9: '\\n \"enabled\": false'
            {
            match("\n \"enabled\": false"); 


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
            // InternalToscaDsl.g:43:7: ( ',\\n\"roles\" :' )
            // InternalToscaDsl.g:43:9: ',\\n\"roles\" :'
            {
            match(",\n\"roles\" :"); 


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
            // InternalToscaDsl.g:44:7: ( '\"ip_prefix\": ' )
            // InternalToscaDsl.g:44:9: '\"ip_prefix\": '
            {
            match("\"ip_prefix\": "); 


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
            // InternalToscaDsl.g:45:7: ( '\"protocol\": ' )
            // InternalToscaDsl.g:45:9: '\"protocol\": '
            {
            match("\"protocol\": "); 


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
            // InternalToscaDsl.g:46:7: ( '\"port\": ' )
            // InternalToscaDsl.g:46:9: '\"port\": '
            {
            match("\"port\": "); 


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
            // InternalToscaDsl.g:47:7: ( '\\n' )
            // InternalToscaDsl.g:47:9: '\\n'
            {
            match('\n'); 

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
            // InternalToscaDsl.g:48:7: ( '\"deploy\" :' )
            // InternalToscaDsl.g:48:9: '\"deploy\" :'
            {
            match("\"deploy\" :"); 


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
            // InternalToscaDsl.g:49:7: ( ',\\n\"target\" :' )
            // InternalToscaDsl.g:49:9: ',\\n\"target\" :'
            {
            match(",\n\"target\" :"); 


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
            // InternalToscaDsl.g:50:7: ( ',\\n\"source_interfaces\" :' )
            // InternalToscaDsl.g:50:9: ',\\n\"source_interfaces\" :'
            {
            match(",\n\"source_interfaces\" :"); 


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
            // InternalToscaDsl.g:51:7: ( ',\\n\"target_iterfaces\" :' )
            // InternalToscaDsl.g:51:9: ',\\n\"target_iterfaces\" :'
            {
            match(",\n\"target_iterfaces\" :"); 


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
            // InternalToscaDsl.g:52:7: ( ',\\n\"targets\" :' )
            // InternalToscaDsl.g:52:9: ',\\n\"targets\" :'
            {
            match(",\n\"targets\" :"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:53:7: ( '\"capabiity\" :' )
            // InternalToscaDsl.g:53:9: '\"capabiity\" :'
            {
            match("\"capabiity\" :"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:54:7: ( ',\\n\"node\" :' )
            // InternalToscaDsl.g:54:9: ',\\n\"node\" :'
            {
            match(",\n\"node\" :"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:55:7: ( '\\n\"inputs\" :' )
            // InternalToscaDsl.g:55:9: '\\n\"inputs\" :'
            {
            match("\n\"inputs\" :"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:56:7: ( ', ' )
            // InternalToscaDsl.g:56:9: ', '
            {
            match(", "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:57:7: ( 'Value' )
            // InternalToscaDsl.g:57:9: 'Value'
            {
            match("Value"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:58:7: ( 'Expression' )
            // InternalToscaDsl.g:58:9: 'Expression'
            {
            match("Expression"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:59:7: ( '\"get_attribute\":' )
            // InternalToscaDsl.g:59:9: '\"get_attribute\":'
            {
            match("\"get_attribute\":"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToscaDsl.g:3362:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalToscaDsl.g:3362:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalToscaDsl.g:3362:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalToscaDsl.g:3362:11: '^'
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

            // InternalToscaDsl.g:3362:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalToscaDsl.g:3364:10: ( ( '0' .. '9' )+ )
            // InternalToscaDsl.g:3364:12: ( '0' .. '9' )+
            {
            // InternalToscaDsl.g:3364:12: ( '0' .. '9' )+
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
            	    // InternalToscaDsl.g:3364:13: '0' .. '9'
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
            // InternalToscaDsl.g:3366:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalToscaDsl.g:3366:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalToscaDsl.g:3366:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalToscaDsl.g:3366:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalToscaDsl.g:3366:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalToscaDsl.g:3366:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalToscaDsl.g:3366:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalToscaDsl.g:3366:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalToscaDsl.g:3366:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalToscaDsl.g:3366:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalToscaDsl.g:3366:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalToscaDsl.g:3368:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalToscaDsl.g:3368:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalToscaDsl.g:3368:24: ( options {greedy=false; } : . )*
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
            	    // InternalToscaDsl.g:3368:52: .
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
            // InternalToscaDsl.g:3370:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalToscaDsl.g:3370:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalToscaDsl.g:3370:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalToscaDsl.g:3370:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalToscaDsl.g:3370:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalToscaDsl.g:3370:41: ( '\\r' )? '\\n'
                    {
                    // InternalToscaDsl.g:3370:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalToscaDsl.g:3370:41: '\\r'
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
            // InternalToscaDsl.g:3372:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalToscaDsl.g:3372:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalToscaDsl.g:3372:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalToscaDsl.g:3374:16: ( . )
            // InternalToscaDsl.g:3374:18: .
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
        // InternalToscaDsl.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=56;
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
                // InternalToscaDsl.g:1:262: T__53
                {
                mT__53(); 

                }
                break;
            case 44 :
                // InternalToscaDsl.g:1:268: T__54
                {
                mT__54(); 

                }
                break;
            case 45 :
                // InternalToscaDsl.g:1:274: T__55
                {
                mT__55(); 

                }
                break;
            case 46 :
                // InternalToscaDsl.g:1:280: T__56
                {
                mT__56(); 

                }
                break;
            case 47 :
                // InternalToscaDsl.g:1:286: T__57
                {
                mT__57(); 

                }
                break;
            case 48 :
                // InternalToscaDsl.g:1:292: T__58
                {
                mT__58(); 

                }
                break;
            case 49 :
                // InternalToscaDsl.g:1:298: T__59
                {
                mT__59(); 

                }
                break;
            case 50 :
                // InternalToscaDsl.g:1:304: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 51 :
                // InternalToscaDsl.g:1:312: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 52 :
                // InternalToscaDsl.g:1:321: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 53 :
                // InternalToscaDsl.g:1:333: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 54 :
                // InternalToscaDsl.g:1:349: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 55 :
                // InternalToscaDsl.g:1:365: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 56 :
                // InternalToscaDsl.g:1:373: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\2\uffff\1\21\1\34\4\uffff\1\43\2\46\1\21\2\uffff\2\21\22\uffff\1\44\2\uffff\1\46\1\uffff\1\46\21\uffff\2\46\25\uffff\2\46\23\uffff\1\173\1\46\1\uffff\1\31\2\uffff\1\31\20\uffff\1\46\13\uffff\1\46\3\uffff\1\31\6\uffff\1\46\10\uffff\1\46\2\uffff\1\31\6\uffff\1\u00ad\1\uffff\1\31\1\uffff\1\31\20\uffff\1\31\14\uffff\1\31\1\uffff";
    static final String DFA12_eofS =
        "\u00ca\uffff";
    static final String DFA12_minS =
        "\1\0\1\uffff\1\0\1\12\4\uffff\1\11\1\141\1\170\1\101\2\uffff\1\0\1\52\3\uffff\6\0\1\uffff\1\42\6\uffff\1\151\1\42\2\uffff\1\154\1\uffff\1\160\3\uffff\10\0\1\141\4\uffff\1\145\1\165\1\162\10\0\1\uffff\1\155\1\uffff\1\157\1\145\1\uffff\1\157\1\141\2\uffff\1\141\1\uffff\1\156\2\145\10\0\1\uffff\1\160\1\144\1\141\1\uffff\1\154\3\uffff\1\162\1\141\1\60\1\163\1\0\1\40\2\0\1\72\3\0\3\uffff\1\145\6\uffff\1\147\1\142\1\uffff\1\163\1\0\1\uffff\2\0\1\uffff\3\0\1\42\1\145\1\154\1\151\3\0\1\40\2\0\2\uffff\1\164\1\145\1\157\3\0\1\uffff\2\0\1\42\1\144\1\156\2\0\1\72\2\0\3\uffff\1\42\1\60\1\0\1\72\1\uffff\1\40\1\0\1\72\1\uffff\1\0\2\uffff\1\0\1\40\2\0\1\146\2\0\2\uffff\1\0\1\72\1\0\1\uffff\12\0\1\40\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\uffff\1\uffff\1\40\4\uffff\1\42\1\141\1\170\1\172\2\uffff\1\uffff\1\57\3\uffff\6\uffff\1\uffff\1\42\6\uffff\1\166\1\42\2\uffff\1\154\1\uffff\1\160\3\uffff\10\uffff\1\164\4\uffff\1\145\1\165\1\162\10\uffff\1\uffff\1\156\1\uffff\2\157\1\uffff\1\162\1\157\2\uffff\1\141\1\uffff\1\156\2\145\10\uffff\1\uffff\1\164\1\144\1\163\1\uffff\1\162\3\uffff\1\162\1\141\1\172\1\163\1\uffff\1\40\2\uffff\1\72\3\uffff\3\uffff\1\145\6\uffff\1\147\1\142\1\uffff\1\163\1\uffff\1\uffff\2\uffff\1\uffff\3\uffff\1\137\1\145\1\154\1\151\3\uffff\1\40\2\uffff\2\uffff\1\164\1\145\1\157\3\uffff\1\uffff\2\uffff\1\163\1\144\1\156\2\uffff\1\72\2\uffff\3\uffff\1\42\1\172\1\uffff\1\72\1\uffff\1\40\1\uffff\1\72\1\uffff\1\uffff\2\uffff\1\uffff\1\40\2\uffff\1\164\2\uffff\2\uffff\1\uffff\1\72\1\uffff\1\uffff\12\uffff\1\40\1\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\2\uffff\1\5\1\7\1\11\1\17\4\uffff\1\62\1\63\2\uffff\1\67\1\70\1\1\6\uffff\1\64\1\uffff\1\56\1\6\1\5\1\7\1\11\1\17\2\uffff\1\45\1\67\1\uffff\1\62\1\uffff\1\63\1\65\1\66\11\uffff\1\20\1\26\1\32\1\55\13\uffff\1\3\1\uffff\1\10\2\uffff\1\15\2\uffff\1\33\1\34\1\uffff\1\50\13\uffff\1\4\3\uffff\1\41\1\uffff\1\25\1\27\1\36\14\uffff\1\12\1\22\1\24\1\uffff\1\14\1\23\1\30\1\35\1\16\1\31\2\uffff\1\57\2\uffff\1\21\2\uffff\1\44\15\uffff\1\13\1\54\6\uffff\1\46\12\uffff\1\47\1\51\1\52\4\uffff\1\43\3\uffff\1\60\1\uffff\1\42\1\53\7\uffff\1\37\1\40\3\uffff\1\61\13\uffff\1\2";
    static final String DFA12_specialS =
        "\1\76\1\uffff\1\34\13\uffff\1\33\4\uffff\1\32\1\57\1\11\1\111\1\0\1\15\22\uffff\1\35\1\12\1\61\1\77\1\106\1\112\1\1\1\16\10\uffff\1\36\1\13\1\63\1\100\1\107\1\113\1\2\1\17\17\uffff\1\37\1\14\1\65\1\101\1\110\1\114\1\3\1\20\15\uffff\1\40\1\uffff\1\67\1\102\1\uffff\1\115\1\4\1\21\16\uffff\1\41\1\uffff\1\71\1\103\1\uffff\1\116\1\5\1\22\4\uffff\1\42\1\73\1\104\1\uffff\1\6\1\23\5\uffff\1\43\1\74\1\105\1\uffff\1\7\1\24\3\uffff\1\44\1\75\1\uffff\1\10\1\25\5\uffff\1\45\3\uffff\1\26\2\uffff\1\46\2\uffff\1\27\1\uffff\1\47\1\30\1\uffff\1\50\1\31\2\uffff\1\51\1\uffff\1\52\1\uffff\1\53\1\54\1\55\1\56\1\60\1\62\1\64\1\66\1\70\1\72\2\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\21\1\20\1\10\2\21\1\20\22\21\1\20\1\21\1\2\4\21\1\16\4\21\1\3\2\21\1\17\12\15\1\7\6\21\4\14\1\12\20\14\1\11\4\14\1\4\1\21\1\5\1\13\1\14\1\21\32\14\1\1\1\21\1\6\uff82\21",
            "",
            "\143\31\1\27\1\26\2\31\1\30\1\31\1\24\6\31\1\25\3\31\1\23\uff8b\31",
            "\1\32\25\uffff\1\33",
            "",
            "",
            "",
            "",
            "\2\44\2\uffff\1\44\22\uffff\1\42\1\uffff\1\41",
            "\1\45",
            "\1\47",
            "\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\0\31",
            "\1\51\4\uffff\1\52",
            "",
            "",
            "",
            "\157\31\1\53\11\31\1\54\uff86\31",
            "\160\31\1\55\uff8f\31",
            "\157\31\1\57\2\31\1\56\uff8d\31",
            "\145\31\1\60\uff9a\31",
            "\141\31\1\61\uff9e\31",
            "\145\31\1\62\uff9a\31",
            "",
            "\1\63",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\67\3\uffff\1\65\4\uffff\1\66\3\uffff\1\64",
            "\1\70",
            "",
            "",
            "\1\71",
            "",
            "\1\72",
            "",
            "",
            "",
            "\163\31\1\73\uff8c\31",
            "\160\31\1\74\uff8f\31",
            "\137\31\1\75\uffa0\31",
            "\157\31\1\76\uff90\31",
            "\162\31\1\77\uff8d\31",
            "\160\31\1\100\uff8f\31",
            "\160\31\1\101\uff8f\31",
            "\164\31\1\102\uff8b\31",
            "\1\113\1\uffff\1\112\1\103\1\114\1\uffff\1\110\1\uffff\1\104\4\uffff\1\106\1\105\1\111\1\uffff\1\107\1\116\1\115",
            "",
            "",
            "",
            "",
            "\1\117",
            "\1\120",
            "\1\121",
            "\143\31\1\122\uff9c\31",
            "\145\31\1\123\uff9a\31",
            "\160\31\1\124\uff8f\31",
            "\164\31\1\125\uff8b\31",
            "\164\31\1\126\uff8b\31",
            "\154\31\1\127\uff93\31",
            "\141\31\1\130\uff9e\31",
            "\137\31\1\131\uffa0\31",
            "",
            "\1\132\1\133",
            "",
            "\1\134",
            "\1\135\11\uffff\1\136",
            "",
            "\1\137\2\uffff\1\140",
            "\1\142\15\uffff\1\141",
            "",
            "",
            "\1\143",
            "",
            "\1\144",
            "\1\145",
            "\1\146",
            "\141\31\1\147\uff9e\31",
            "\42\31\1\150\uffdd\31",
            "\162\31\1\151\uff8d\31",
            "\157\31\1\152\uff90\31",
            "\42\31\1\153\uffdd\31",
            "\157\31\1\154\uff90\31",
            "\142\31\1\155\uff9d\31",
            "\141\31\1\156\uff9e\31",
            "",
            "\1\157\2\uffff\1\160\1\161",
            "\1\162",
            "\1\163\12\uffff\1\164\4\uffff\1\166\1\uffff\1\165",
            "",
            "\1\167\5\uffff\1\170",
            "",
            "",
            "",
            "\1\171",
            "\1\172",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\174",
            "\137\31\1\175\uffa0\31",
            "\1\176",
            "\145\31\1\177\uff9a\31",
            "\143\31\1\u0080\uff9c\31",
            "\1\u0081",
            "\171\31\1\u0082\uff86\31",
            "\151\31\1\u0083\uff96\31",
            "\164\31\1\u0084\uff8b\31",
            "",
            "",
            "",
            "\1\u0085",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0086",
            "\1\u0087",
            "",
            "\1\u0088",
            "\144\31\1\u0089\uff9b\31",
            "",
            "\146\31\1\u008a\uff99\31",
            "\157\31\1\u008b\uff90\31",
            "",
            "\42\31\1\u008c\uffdd\31",
            "\151\31\1\u008d\uff96\31",
            "\164\31\1\u008e\uff8b\31",
            "\1\u0090\74\uffff\1\u008f",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\145\31\1\u0094\uff9a\31",
            "\151\31\1\u0095\uff96\31",
            "\154\31\1\u0096\uff93\31",
            "\1\u0097",
            "\164\31\1\u0098\uff8b\31",
            "\162\31\1\u0099\uff8d\31",
            "",
            "",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\146\31\1\u009d\uff99\31",
            "\170\31\1\u009e\uff87\31",
            "\42\31\1\u009f\uffdd\31",
            "",
            "\171\31\1\u00a0\uff86\31",
            "\151\31\1\u00a1\uff96\31",
            "\1\u00a2\74\uffff\1\u00a3\23\uffff\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\151\31\1\u00a7\uff96\31",
            "\42\31\1\u00a8\uffdd\31",
            "\1\u00a9",
            "\42\31\1\u00aa\uffdd\31",
            "\142\31\1\u00ab\uff9d\31",
            "",
            "",
            "",
            "\1\u00ac",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\156\31\1\u00ae\uff91\31",
            "\1\u00af",
            "",
            "\1\u00b0",
            "\165\31\1\u00b1\uff8a\31",
            "\1\u00b2",
            "",
            "\151\31\1\u00b3\uff96\31",
            "",
            "",
            "\164\31\1\u00b4\uff8b\31",
            "\1\u00b5",
            "\164\31\1\u00b6\uff8b\31",
            "\145\31\1\u00b7\uff9a\31",
            "\1\u00b9\15\uffff\1\u00b8",
            "\151\31\1\u00ba\uff96\31",
            "\42\31\1\u00bb\uffdd\31",
            "",
            "",
            "\157\31\1\u00bc\uff90\31",
            "\1\u00bd",
            "\156\31\1\u00be\uff91\31",
            "",
            "\163\31\1\u00bf\uff8c\31",
            "\137\31\1\u00c0\uffa0\31",
            "\166\31\1\u00c1\uff89\31",
            "\145\31\1\u00c2\uff9a\31",
            "\162\31\1\u00c3\uff8d\31",
            "\163\31\1\u00c4\uff8c\31",
            "\151\31\1\u00c5\uff96\31",
            "\157\31\1\u00c6\uff90\31",
            "\156\31\1\u00c7\uff91\31",
            "\42\31\1\u00c8\uffdd\31",
            "\1\u00c9",
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
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_23 = input.LA(1);

                        s = -1;
                        if ( (LA12_23=='a') ) {s = 49;}

                        else if ( ((LA12_23>='\u0000' && LA12_23<='`')||(LA12_23>='b' && LA12_23<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_49 = input.LA(1);

                        s = -1;
                        if ( (LA12_49=='p') ) {s = 65;}

                        else if ( ((LA12_49>='\u0000' && LA12_49<='o')||(LA12_49>='q' && LA12_49<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_65 = input.LA(1);

                        s = -1;
                        if ( (LA12_65=='a') ) {s = 88;}

                        else if ( ((LA12_65>='\u0000' && LA12_65<='`')||(LA12_65>='b' && LA12_65<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA12_88 = input.LA(1);

                        s = -1;
                        if ( (LA12_88=='b') ) {s = 109;}

                        else if ( ((LA12_88>='\u0000' && LA12_88<='a')||(LA12_88>='c' && LA12_88<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA12_109 = input.LA(1);

                        s = -1;
                        if ( (LA12_109=='i') ) {s = 131;}

                        else if ( ((LA12_109>='\u0000' && LA12_109<='h')||(LA12_109>='j' && LA12_109<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA12_131 = input.LA(1);

                        s = -1;
                        if ( (LA12_131=='i') ) {s = 141;}

                        else if ( ((LA12_131>='\u0000' && LA12_131<='h')||(LA12_131>='j' && LA12_131<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA12_141 = input.LA(1);

                        s = -1;
                        if ( (LA12_141=='t') ) {s = 152;}

                        else if ( ((LA12_141>='\u0000' && LA12_141<='s')||(LA12_141>='u' && LA12_141<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA12_152 = input.LA(1);

                        s = -1;
                        if ( (LA12_152=='y') ) {s = 160;}

                        else if ( ((LA12_152>='\u0000' && LA12_152<='x')||(LA12_152>='z' && LA12_152<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA12_160 = input.LA(1);

                        s = -1;
                        if ( (LA12_160=='\"') ) {s = 170;}

                        else if ( ((LA12_160>='\u0000' && LA12_160<='!')||(LA12_160>='#' && LA12_160<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA12_21 = input.LA(1);

                        s = -1;
                        if ( (LA12_21=='r') ) {s = 46;}

                        else if ( (LA12_21=='o') ) {s = 47;}

                        else if ( ((LA12_21>='\u0000' && LA12_21<='n')||(LA12_21>='p' && LA12_21<='q')||(LA12_21>='s' && LA12_21<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA12_44 = input.LA(1);

                        s = -1;
                        if ( (LA12_44=='p') ) {s = 60;}

                        else if ( ((LA12_44>='\u0000' && LA12_44<='o')||(LA12_44>='q' && LA12_44<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA12_60 = input.LA(1);

                        s = -1;
                        if ( (LA12_60=='e') ) {s = 83;}

                        else if ( ((LA12_60>='\u0000' && LA12_60<='d')||(LA12_60>='f' && LA12_60<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA12_83 = input.LA(1);

                        s = -1;
                        if ( (LA12_83=='\"') ) {s = 104;}

                        else if ( ((LA12_83>='\u0000' && LA12_83<='!')||(LA12_83>='#' && LA12_83<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA12_24 = input.LA(1);

                        s = -1;
                        if ( (LA12_24=='e') ) {s = 50;}

                        else if ( ((LA12_24>='\u0000' && LA12_24<='d')||(LA12_24>='f' && LA12_24<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA12_50 = input.LA(1);

                        s = -1;
                        if ( (LA12_50=='t') ) {s = 66;}

                        else if ( ((LA12_50>='\u0000' && LA12_50<='s')||(LA12_50>='u' && LA12_50<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA12_66 = input.LA(1);

                        s = -1;
                        if ( (LA12_66=='_') ) {s = 89;}

                        else if ( ((LA12_66>='\u0000' && LA12_66<='^')||(LA12_66>='`' && LA12_66<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA12_89 = input.LA(1);

                        s = -1;
                        if ( (LA12_89=='a') ) {s = 110;}

                        else if ( ((LA12_89>='\u0000' && LA12_89<='`')||(LA12_89>='b' && LA12_89<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA12_110 = input.LA(1);

                        s = -1;
                        if ( (LA12_110=='t') ) {s = 132;}

                        else if ( ((LA12_110>='\u0000' && LA12_110<='s')||(LA12_110>='u' && LA12_110<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA12_132 = input.LA(1);

                        s = -1;
                        if ( (LA12_132=='t') ) {s = 142;}

                        else if ( ((LA12_132>='\u0000' && LA12_132<='s')||(LA12_132>='u' && LA12_132<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA12_142 = input.LA(1);

                        s = -1;
                        if ( (LA12_142=='r') ) {s = 153;}

                        else if ( ((LA12_142>='\u0000' && LA12_142<='q')||(LA12_142>='s' && LA12_142<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA12_153 = input.LA(1);

                        s = -1;
                        if ( (LA12_153=='i') ) {s = 161;}

                        else if ( ((LA12_153>='\u0000' && LA12_153<='h')||(LA12_153>='j' && LA12_153<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA12_161 = input.LA(1);

                        s = -1;
                        if ( (LA12_161=='b') ) {s = 171;}

                        else if ( ((LA12_161>='\u0000' && LA12_161<='a')||(LA12_161>='c' && LA12_161<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA12_171 = input.LA(1);

                        s = -1;
                        if ( (LA12_171=='u') ) {s = 177;}

                        else if ( ((LA12_171>='\u0000' && LA12_171<='t')||(LA12_171>='v' && LA12_171<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA12_177 = input.LA(1);

                        s = -1;
                        if ( (LA12_177=='t') ) {s = 180;}

                        else if ( ((LA12_177>='\u0000' && LA12_177<='s')||(LA12_177>='u' && LA12_177<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA12_180 = input.LA(1);

                        s = -1;
                        if ( (LA12_180=='e') ) {s = 183;}

                        else if ( ((LA12_180>='\u0000' && LA12_180<='d')||(LA12_180>='f' && LA12_180<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA12_183 = input.LA(1);

                        s = -1;
                        if ( (LA12_183=='\"') ) {s = 187;}

                        else if ( ((LA12_183>='\u0000' && LA12_183<='!')||(LA12_183>='#' && LA12_183<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA12_19 = input.LA(1);

                        s = -1;
                        if ( (LA12_19=='o') ) {s = 43;}

                        else if ( (LA12_19=='y') ) {s = 44;}

                        else if ( ((LA12_19>='\u0000' && LA12_19<='n')||(LA12_19>='p' && LA12_19<='x')||(LA12_19>='z' && LA12_19<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA12_14 = input.LA(1);

                        s = -1;
                        if ( ((LA12_14>='\u0000' && LA12_14<='\uFFFF')) ) {s = 25;}

                        else s = 17;

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA12_2 = input.LA(1);

                        s = -1;
                        if ( (LA12_2=='t') ) {s = 19;}

                        else if ( (LA12_2=='i') ) {s = 20;}

                        else if ( (LA12_2=='p') ) {s = 21;}

                        else if ( (LA12_2=='d') ) {s = 22;}

                        else if ( (LA12_2=='c') ) {s = 23;}

                        else if ( (LA12_2=='g') ) {s = 24;}

                        else if ( ((LA12_2>='\u0000' && LA12_2<='b')||(LA12_2>='e' && LA12_2<='f')||LA12_2=='h'||(LA12_2>='j' && LA12_2<='o')||(LA12_2>='q' && LA12_2<='s')||(LA12_2>='u' && LA12_2<='\uFFFF')) ) {s = 25;}

                        else s = 17;

                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA12_43 = input.LA(1);

                        s = -1;
                        if ( (LA12_43=='s') ) {s = 59;}

                        else if ( ((LA12_43>='\u0000' && LA12_43<='r')||(LA12_43>='t' && LA12_43<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA12_59 = input.LA(1);

                        s = -1;
                        if ( (LA12_59=='c') ) {s = 82;}

                        else if ( ((LA12_59>='\u0000' && LA12_59<='b')||(LA12_59>='d' && LA12_59<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA12_82 = input.LA(1);

                        s = -1;
                        if ( (LA12_82=='a') ) {s = 103;}

                        else if ( ((LA12_82>='\u0000' && LA12_82<='`')||(LA12_82>='b' && LA12_82<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA12_103 = input.LA(1);

                        s = -1;
                        if ( (LA12_103=='_') ) {s = 125;}

                        else if ( ((LA12_103>='\u0000' && LA12_103<='^')||(LA12_103>='`' && LA12_103<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA12_125 = input.LA(1);

                        s = -1;
                        if ( (LA12_125=='d') ) {s = 137;}

                        else if ( ((LA12_125>='\u0000' && LA12_125<='c')||(LA12_125>='e' && LA12_125<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA12_137 = input.LA(1);

                        s = -1;
                        if ( (LA12_137=='e') ) {s = 148;}

                        else if ( ((LA12_137>='\u0000' && LA12_137<='d')||(LA12_137>='f' && LA12_137<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA12_148 = input.LA(1);

                        s = -1;
                        if ( (LA12_148=='f') ) {s = 157;}

                        else if ( ((LA12_148>='\u0000' && LA12_148<='e')||(LA12_148>='g' && LA12_148<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA12_157 = input.LA(1);

                        s = -1;
                        if ( (LA12_157=='i') ) {s = 167;}

                        else if ( ((LA12_157>='\u0000' && LA12_157<='h')||(LA12_157>='j' && LA12_157<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA12_167 = input.LA(1);

                        s = -1;
                        if ( (LA12_167=='n') ) {s = 174;}

                        else if ( ((LA12_167>='\u0000' && LA12_167<='m')||(LA12_167>='o' && LA12_167<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA12_174 = input.LA(1);

                        s = -1;
                        if ( (LA12_174=='i') ) {s = 179;}

                        else if ( ((LA12_174>='\u0000' && LA12_174<='h')||(LA12_174>='j' && LA12_174<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA12_179 = input.LA(1);

                        s = -1;
                        if ( (LA12_179=='t') ) {s = 182;}

                        else if ( ((LA12_179>='\u0000' && LA12_179<='s')||(LA12_179>='u' && LA12_179<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA12_182 = input.LA(1);

                        s = -1;
                        if ( (LA12_182=='i') ) {s = 186;}

                        else if ( ((LA12_182>='\u0000' && LA12_182<='h')||(LA12_182>='j' && LA12_182<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA12_186 = input.LA(1);

                        s = -1;
                        if ( (LA12_186=='o') ) {s = 188;}

                        else if ( ((LA12_186>='\u0000' && LA12_186<='n')||(LA12_186>='p' && LA12_186<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA12_188 = input.LA(1);

                        s = -1;
                        if ( (LA12_188=='n') ) {s = 190;}

                        else if ( ((LA12_188>='\u0000' && LA12_188<='m')||(LA12_188>='o' && LA12_188<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA12_190 = input.LA(1);

                        s = -1;
                        if ( (LA12_190=='s') ) {s = 191;}

                        else if ( ((LA12_190>='\u0000' && LA12_190<='r')||(LA12_190>='t' && LA12_190<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA12_191 = input.LA(1);

                        s = -1;
                        if ( (LA12_191=='_') ) {s = 192;}

                        else if ( ((LA12_191>='\u0000' && LA12_191<='^')||(LA12_191>='`' && LA12_191<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA12_192 = input.LA(1);

                        s = -1;
                        if ( (LA12_192=='v') ) {s = 193;}

                        else if ( ((LA12_192>='\u0000' && LA12_192<='u')||(LA12_192>='w' && LA12_192<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA12_193 = input.LA(1);

                        s = -1;
                        if ( (LA12_193=='e') ) {s = 194;}

                        else if ( ((LA12_193>='\u0000' && LA12_193<='d')||(LA12_193>='f' && LA12_193<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA12_20 = input.LA(1);

                        s = -1;
                        if ( (LA12_20=='p') ) {s = 45;}

                        else if ( ((LA12_20>='\u0000' && LA12_20<='o')||(LA12_20>='q' && LA12_20<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA12_194 = input.LA(1);

                        s = -1;
                        if ( (LA12_194=='r') ) {s = 195;}

                        else if ( ((LA12_194>='\u0000' && LA12_194<='q')||(LA12_194>='s' && LA12_194<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA12_45 = input.LA(1);

                        s = -1;
                        if ( (LA12_45=='_') ) {s = 61;}

                        else if ( ((LA12_45>='\u0000' && LA12_45<='^')||(LA12_45>='`' && LA12_45<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA12_195 = input.LA(1);

                        s = -1;
                        if ( (LA12_195=='s') ) {s = 196;}

                        else if ( ((LA12_195>='\u0000' && LA12_195<='r')||(LA12_195>='t' && LA12_195<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA12_61 = input.LA(1);

                        s = -1;
                        if ( (LA12_61=='p') ) {s = 84;}

                        else if ( ((LA12_61>='\u0000' && LA12_61<='o')||(LA12_61>='q' && LA12_61<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA12_196 = input.LA(1);

                        s = -1;
                        if ( (LA12_196=='i') ) {s = 197;}

                        else if ( ((LA12_196>='\u0000' && LA12_196<='h')||(LA12_196>='j' && LA12_196<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA12_84 = input.LA(1);

                        s = -1;
                        if ( (LA12_84=='r') ) {s = 105;}

                        else if ( ((LA12_84>='\u0000' && LA12_84<='q')||(LA12_84>='s' && LA12_84<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA12_197 = input.LA(1);

                        s = -1;
                        if ( (LA12_197=='o') ) {s = 198;}

                        else if ( ((LA12_197>='\u0000' && LA12_197<='n')||(LA12_197>='p' && LA12_197<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA12_105 = input.LA(1);

                        s = -1;
                        if ( (LA12_105=='e') ) {s = 127;}

                        else if ( ((LA12_105>='\u0000' && LA12_105<='d')||(LA12_105>='f' && LA12_105<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA12_198 = input.LA(1);

                        s = -1;
                        if ( (LA12_198=='n') ) {s = 199;}

                        else if ( ((LA12_198>='\u0000' && LA12_198<='m')||(LA12_198>='o' && LA12_198<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA12_127 = input.LA(1);

                        s = -1;
                        if ( (LA12_127=='f') ) {s = 138;}

                        else if ( ((LA12_127>='\u0000' && LA12_127<='e')||(LA12_127>='g' && LA12_127<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA12_199 = input.LA(1);

                        s = -1;
                        if ( (LA12_199=='\"') ) {s = 200;}

                        else if ( ((LA12_199>='\u0000' && LA12_199<='!')||(LA12_199>='#' && LA12_199<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA12_138 = input.LA(1);

                        s = -1;
                        if ( (LA12_138=='i') ) {s = 149;}

                        else if ( ((LA12_138>='\u0000' && LA12_138<='h')||(LA12_138>='j' && LA12_138<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA12_149 = input.LA(1);

                        s = -1;
                        if ( (LA12_149=='x') ) {s = 158;}

                        else if ( ((LA12_149>='\u0000' && LA12_149<='w')||(LA12_149>='y' && LA12_149<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA12_158 = input.LA(1);

                        s = -1;
                        if ( (LA12_158=='\"') ) {s = 168;}

                        else if ( ((LA12_158>='\u0000' && LA12_158<='!')||(LA12_158>='#' && LA12_158<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
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
                    case 63 : 
                        int LA12_46 = input.LA(1);

                        s = -1;
                        if ( (LA12_46=='o') ) {s = 62;}

                        else if ( ((LA12_46>='\u0000' && LA12_46<='n')||(LA12_46>='p' && LA12_46<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA12_62 = input.LA(1);

                        s = -1;
                        if ( (LA12_62=='t') ) {s = 85;}

                        else if ( ((LA12_62>='\u0000' && LA12_62<='s')||(LA12_62>='u' && LA12_62<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA12_85 = input.LA(1);

                        s = -1;
                        if ( (LA12_85=='o') ) {s = 106;}

                        else if ( ((LA12_85>='\u0000' && LA12_85<='n')||(LA12_85>='p' && LA12_85<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        int LA12_106 = input.LA(1);

                        s = -1;
                        if ( (LA12_106=='c') ) {s = 128;}

                        else if ( ((LA12_106>='\u0000' && LA12_106<='b')||(LA12_106>='d' && LA12_106<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 67 : 
                        int LA12_128 = input.LA(1);

                        s = -1;
                        if ( (LA12_128=='o') ) {s = 139;}

                        else if ( ((LA12_128>='\u0000' && LA12_128<='n')||(LA12_128>='p' && LA12_128<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 68 : 
                        int LA12_139 = input.LA(1);

                        s = -1;
                        if ( (LA12_139=='l') ) {s = 150;}

                        else if ( ((LA12_139>='\u0000' && LA12_139<='k')||(LA12_139>='m' && LA12_139<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 69 : 
                        int LA12_150 = input.LA(1);

                        s = -1;
                        if ( (LA12_150=='\"') ) {s = 159;}

                        else if ( ((LA12_150>='\u0000' && LA12_150<='!')||(LA12_150>='#' && LA12_150<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 70 : 
                        int LA12_47 = input.LA(1);

                        s = -1;
                        if ( (LA12_47=='r') ) {s = 63;}

                        else if ( ((LA12_47>='\u0000' && LA12_47<='q')||(LA12_47>='s' && LA12_47<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 71 : 
                        int LA12_63 = input.LA(1);

                        s = -1;
                        if ( (LA12_63=='t') ) {s = 86;}

                        else if ( ((LA12_63>='\u0000' && LA12_63<='s')||(LA12_63>='u' && LA12_63<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 72 : 
                        int LA12_86 = input.LA(1);

                        s = -1;
                        if ( (LA12_86=='\"') ) {s = 107;}

                        else if ( ((LA12_86>='\u0000' && LA12_86<='!')||(LA12_86>='#' && LA12_86<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 73 : 
                        int LA12_22 = input.LA(1);

                        s = -1;
                        if ( (LA12_22=='e') ) {s = 48;}

                        else if ( ((LA12_22>='\u0000' && LA12_22<='d')||(LA12_22>='f' && LA12_22<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 74 : 
                        int LA12_48 = input.LA(1);

                        s = -1;
                        if ( (LA12_48=='p') ) {s = 64;}

                        else if ( ((LA12_48>='\u0000' && LA12_48<='o')||(LA12_48>='q' && LA12_48<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 75 : 
                        int LA12_64 = input.LA(1);

                        s = -1;
                        if ( (LA12_64=='l') ) {s = 87;}

                        else if ( ((LA12_64>='\u0000' && LA12_64<='k')||(LA12_64>='m' && LA12_64<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 76 : 
                        int LA12_87 = input.LA(1);

                        s = -1;
                        if ( (LA12_87=='o') ) {s = 108;}

                        else if ( ((LA12_87>='\u0000' && LA12_87<='n')||(LA12_87>='p' && LA12_87<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 77 : 
                        int LA12_108 = input.LA(1);

                        s = -1;
                        if ( (LA12_108=='y') ) {s = 130;}

                        else if ( ((LA12_108>='\u0000' && LA12_108<='x')||(LA12_108>='z' && LA12_108<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 78 : 
                        int LA12_130 = input.LA(1);

                        s = -1;
                        if ( (LA12_130=='\"') ) {s = 140;}

                        else if ( ((LA12_130>='\u0000' && LA12_130<='!')||(LA12_130>='#' && LA12_130<='\uFFFF')) ) {s = 25;}

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