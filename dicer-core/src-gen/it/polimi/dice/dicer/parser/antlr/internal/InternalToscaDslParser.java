package it.polimi.dice.dicer.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import it.polimi.dice.dicer.services.ToscaDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalToscaDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'\"tosca_definitions_version\" :'", "',\\n\"description\" :'", "',\\n\"imports\" :'", "'['", "','", "']'", "',\\n\"outputs\" :'", "'}'", "',\\n\"inputs\" :'", "',\\n\"node_templates\" :'", "',\\n\"realtionships\" :'", "',\\n\"groups\" :'", "',\\n\"policies\" :'", "':'", "'\\n\"value\": '", "'\"type\" :'", "',\\n\"instances\" : {'", "',\\n\"relationships\" :'", "',\\n\"interfaces\" :'", "',\\n\"properties\" :'", "'\\n\"monitoring\" : {'", "',\\n\"configuration\" : {'", "',\\n\"resources\" :'", "'\\n\"rules\" :'", "',\\n\"arguments\" :'", "',\\n\"requirements\" :'", "',\\n\"capabilities\" :'", "'\\n \"enabled\": true'", "'\\n \"enabled\": false'", "',\\n\"roles\" :'", "'\"remote_ip_prefix\": '", "'\"port\": '", "'\\n'", "'\"deploy\" :'", "',\\n\"target\" :'", "',\\n\"source_interfaces\" :'", "',\\n\"target_iterfaces\" :'", "',\\n\"targets\" :'", "'\"capabiity\" :'", "',\\n\"node\" :'", "'\\n\"inputs\" :'", "', '", "'Value'", "'Expression'", "'\"get_attribute\":'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__14=14;
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


        public InternalToscaDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalToscaDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalToscaDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalToscaDsl.g"; }



     	private ToscaDslGrammarAccess grammarAccess;

        public InternalToscaDslParser(TokenStream input, ToscaDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "TopologyTemplate";
       	}

       	@Override
       	protected ToscaDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTopologyTemplate"
    // InternalToscaDsl.g:64:1: entryRuleTopologyTemplate returns [EObject current=null] : iv_ruleTopologyTemplate= ruleTopologyTemplate EOF ;
    public final EObject entryRuleTopologyTemplate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopologyTemplate = null;


        try {
            // InternalToscaDsl.g:64:57: (iv_ruleTopologyTemplate= ruleTopologyTemplate EOF )
            // InternalToscaDsl.g:65:2: iv_ruleTopologyTemplate= ruleTopologyTemplate EOF
            {
             newCompositeNode(grammarAccess.getTopologyTemplateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTopologyTemplate=ruleTopologyTemplate();

            state._fsp--;

             current =iv_ruleTopologyTemplate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTopologyTemplate"


    // $ANTLR start "ruleTopologyTemplate"
    // InternalToscaDsl.g:71:1: ruleTopologyTemplate returns [EObject current=null] : (otherlv_0= '{' otherlv_1= '\"tosca_definitions_version\" :' ( (lv_tosca_definitions_version_2_0= RULE_STRING ) ) (otherlv_3= ',\\n\"description\" :' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= ',\\n\"imports\" :' otherlv_6= '[' ( (lv_imports_7_0= ruleImport ) ) (otherlv_8= ',' ( (lv_imports_9_0= ruleImport ) ) )* otherlv_10= ']' )? (otherlv_11= ',\\n\"outputs\" :' otherlv_12= '{' ( (lv_outputs_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_outputs_15_0= ruleParameter ) ) )* otherlv_16= '}' )? (otherlv_17= ',\\n\"inputs\" :' otherlv_18= '{' ( (lv_inputs_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_inputs_21_0= ruleParameter ) ) )* otherlv_22= '}' )? (otherlv_23= ',\\n\"node_templates\" :' otherlv_24= '{' ( (lv_nodeTemplates_25_0= ruleNodeTemplate ) ) (otherlv_26= ',' ( (lv_nodeTemplates_27_0= ruleNodeTemplate ) ) )* otherlv_28= '}' )? (otherlv_29= ',\\n\"realtionships\" :' otherlv_30= '{' ( (lv_realtionships_31_0= ruleRelationship ) ) (otherlv_32= ',' ( (lv_realtionships_33_0= ruleRelationship ) ) )* otherlv_34= '}' )? (otherlv_35= ',\\n\"groups\" :' otherlv_36= '{' ( (lv_groups_37_0= ruleGroup ) ) (otherlv_38= ',' ( (lv_groups_39_0= ruleGroup ) ) )* otherlv_40= '}' )? (otherlv_41= ',\\n\"policies\" :' otherlv_42= '{' ( (lv_policies_43_0= rulePolicy ) ) (otherlv_44= ',' ( (lv_policies_45_0= rulePolicy ) ) )* otherlv_46= '}' )? otherlv_47= '}' ) ;
    public final EObject ruleTopologyTemplate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_tosca_definitions_version_2_0=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token otherlv_44=null;
        Token otherlv_46=null;
        Token otherlv_47=null;
        EObject lv_imports_7_0 = null;

        EObject lv_imports_9_0 = null;

        EObject lv_outputs_13_0 = null;

        EObject lv_outputs_15_0 = null;

        EObject lv_inputs_19_0 = null;

        EObject lv_inputs_21_0 = null;

        EObject lv_nodeTemplates_25_0 = null;

        EObject lv_nodeTemplates_27_0 = null;

        EObject lv_realtionships_31_0 = null;

        EObject lv_realtionships_33_0 = null;

        EObject lv_groups_37_0 = null;

        EObject lv_groups_39_0 = null;

        EObject lv_policies_43_0 = null;

        EObject lv_policies_45_0 = null;



        	enterRule();

        try {
            // InternalToscaDsl.g:77:2: ( (otherlv_0= '{' otherlv_1= '\"tosca_definitions_version\" :' ( (lv_tosca_definitions_version_2_0= RULE_STRING ) ) (otherlv_3= ',\\n\"description\" :' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= ',\\n\"imports\" :' otherlv_6= '[' ( (lv_imports_7_0= ruleImport ) ) (otherlv_8= ',' ( (lv_imports_9_0= ruleImport ) ) )* otherlv_10= ']' )? (otherlv_11= ',\\n\"outputs\" :' otherlv_12= '{' ( (lv_outputs_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_outputs_15_0= ruleParameter ) ) )* otherlv_16= '}' )? (otherlv_17= ',\\n\"inputs\" :' otherlv_18= '{' ( (lv_inputs_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_inputs_21_0= ruleParameter ) ) )* otherlv_22= '}' )? (otherlv_23= ',\\n\"node_templates\" :' otherlv_24= '{' ( (lv_nodeTemplates_25_0= ruleNodeTemplate ) ) (otherlv_26= ',' ( (lv_nodeTemplates_27_0= ruleNodeTemplate ) ) )* otherlv_28= '}' )? (otherlv_29= ',\\n\"realtionships\" :' otherlv_30= '{' ( (lv_realtionships_31_0= ruleRelationship ) ) (otherlv_32= ',' ( (lv_realtionships_33_0= ruleRelationship ) ) )* otherlv_34= '}' )? (otherlv_35= ',\\n\"groups\" :' otherlv_36= '{' ( (lv_groups_37_0= ruleGroup ) ) (otherlv_38= ',' ( (lv_groups_39_0= ruleGroup ) ) )* otherlv_40= '}' )? (otherlv_41= ',\\n\"policies\" :' otherlv_42= '{' ( (lv_policies_43_0= rulePolicy ) ) (otherlv_44= ',' ( (lv_policies_45_0= rulePolicy ) ) )* otherlv_46= '}' )? otherlv_47= '}' ) )
            // InternalToscaDsl.g:78:2: (otherlv_0= '{' otherlv_1= '\"tosca_definitions_version\" :' ( (lv_tosca_definitions_version_2_0= RULE_STRING ) ) (otherlv_3= ',\\n\"description\" :' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= ',\\n\"imports\" :' otherlv_6= '[' ( (lv_imports_7_0= ruleImport ) ) (otherlv_8= ',' ( (lv_imports_9_0= ruleImport ) ) )* otherlv_10= ']' )? (otherlv_11= ',\\n\"outputs\" :' otherlv_12= '{' ( (lv_outputs_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_outputs_15_0= ruleParameter ) ) )* otherlv_16= '}' )? (otherlv_17= ',\\n\"inputs\" :' otherlv_18= '{' ( (lv_inputs_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_inputs_21_0= ruleParameter ) ) )* otherlv_22= '}' )? (otherlv_23= ',\\n\"node_templates\" :' otherlv_24= '{' ( (lv_nodeTemplates_25_0= ruleNodeTemplate ) ) (otherlv_26= ',' ( (lv_nodeTemplates_27_0= ruleNodeTemplate ) ) )* otherlv_28= '}' )? (otherlv_29= ',\\n\"realtionships\" :' otherlv_30= '{' ( (lv_realtionships_31_0= ruleRelationship ) ) (otherlv_32= ',' ( (lv_realtionships_33_0= ruleRelationship ) ) )* otherlv_34= '}' )? (otherlv_35= ',\\n\"groups\" :' otherlv_36= '{' ( (lv_groups_37_0= ruleGroup ) ) (otherlv_38= ',' ( (lv_groups_39_0= ruleGroup ) ) )* otherlv_40= '}' )? (otherlv_41= ',\\n\"policies\" :' otherlv_42= '{' ( (lv_policies_43_0= rulePolicy ) ) (otherlv_44= ',' ( (lv_policies_45_0= rulePolicy ) ) )* otherlv_46= '}' )? otherlv_47= '}' )
            {
            // InternalToscaDsl.g:78:2: (otherlv_0= '{' otherlv_1= '\"tosca_definitions_version\" :' ( (lv_tosca_definitions_version_2_0= RULE_STRING ) ) (otherlv_3= ',\\n\"description\" :' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= ',\\n\"imports\" :' otherlv_6= '[' ( (lv_imports_7_0= ruleImport ) ) (otherlv_8= ',' ( (lv_imports_9_0= ruleImport ) ) )* otherlv_10= ']' )? (otherlv_11= ',\\n\"outputs\" :' otherlv_12= '{' ( (lv_outputs_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_outputs_15_0= ruleParameter ) ) )* otherlv_16= '}' )? (otherlv_17= ',\\n\"inputs\" :' otherlv_18= '{' ( (lv_inputs_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_inputs_21_0= ruleParameter ) ) )* otherlv_22= '}' )? (otherlv_23= ',\\n\"node_templates\" :' otherlv_24= '{' ( (lv_nodeTemplates_25_0= ruleNodeTemplate ) ) (otherlv_26= ',' ( (lv_nodeTemplates_27_0= ruleNodeTemplate ) ) )* otherlv_28= '}' )? (otherlv_29= ',\\n\"realtionships\" :' otherlv_30= '{' ( (lv_realtionships_31_0= ruleRelationship ) ) (otherlv_32= ',' ( (lv_realtionships_33_0= ruleRelationship ) ) )* otherlv_34= '}' )? (otherlv_35= ',\\n\"groups\" :' otherlv_36= '{' ( (lv_groups_37_0= ruleGroup ) ) (otherlv_38= ',' ( (lv_groups_39_0= ruleGroup ) ) )* otherlv_40= '}' )? (otherlv_41= ',\\n\"policies\" :' otherlv_42= '{' ( (lv_policies_43_0= rulePolicy ) ) (otherlv_44= ',' ( (lv_policies_45_0= rulePolicy ) ) )* otherlv_46= '}' )? otherlv_47= '}' )
            // InternalToscaDsl.g:79:3: otherlv_0= '{' otherlv_1= '\"tosca_definitions_version\" :' ( (lv_tosca_definitions_version_2_0= RULE_STRING ) ) (otherlv_3= ',\\n\"description\" :' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= ',\\n\"imports\" :' otherlv_6= '[' ( (lv_imports_7_0= ruleImport ) ) (otherlv_8= ',' ( (lv_imports_9_0= ruleImport ) ) )* otherlv_10= ']' )? (otherlv_11= ',\\n\"outputs\" :' otherlv_12= '{' ( (lv_outputs_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_outputs_15_0= ruleParameter ) ) )* otherlv_16= '}' )? (otherlv_17= ',\\n\"inputs\" :' otherlv_18= '{' ( (lv_inputs_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_inputs_21_0= ruleParameter ) ) )* otherlv_22= '}' )? (otherlv_23= ',\\n\"node_templates\" :' otherlv_24= '{' ( (lv_nodeTemplates_25_0= ruleNodeTemplate ) ) (otherlv_26= ',' ( (lv_nodeTemplates_27_0= ruleNodeTemplate ) ) )* otherlv_28= '}' )? (otherlv_29= ',\\n\"realtionships\" :' otherlv_30= '{' ( (lv_realtionships_31_0= ruleRelationship ) ) (otherlv_32= ',' ( (lv_realtionships_33_0= ruleRelationship ) ) )* otherlv_34= '}' )? (otherlv_35= ',\\n\"groups\" :' otherlv_36= '{' ( (lv_groups_37_0= ruleGroup ) ) (otherlv_38= ',' ( (lv_groups_39_0= ruleGroup ) ) )* otherlv_40= '}' )? (otherlv_41= ',\\n\"policies\" :' otherlv_42= '{' ( (lv_policies_43_0= rulePolicy ) ) (otherlv_44= ',' ( (lv_policies_45_0= rulePolicy ) ) )* otherlv_46= '}' )? otherlv_47= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTopologyTemplateAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTopologyTemplateAccess().getTosca_definitions_versionKeyword_1());
            		
            // InternalToscaDsl.g:87:3: ( (lv_tosca_definitions_version_2_0= RULE_STRING ) )
            // InternalToscaDsl.g:88:4: (lv_tosca_definitions_version_2_0= RULE_STRING )
            {
            // InternalToscaDsl.g:88:4: (lv_tosca_definitions_version_2_0= RULE_STRING )
            // InternalToscaDsl.g:89:5: lv_tosca_definitions_version_2_0= RULE_STRING
            {
            lv_tosca_definitions_version_2_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_tosca_definitions_version_2_0, grammarAccess.getTopologyTemplateAccess().getTosca_definitions_versionSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTopologyTemplateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"tosca_definitions_version",
            						lv_tosca_definitions_version_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalToscaDsl.g:105:3: (otherlv_3= ',\\n\"description\" :' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalToscaDsl.g:106:4: otherlv_3= ',\\n\"description\" :' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getTopologyTemplateAccess().getDescriptionKeyword_3_0());
                    			
                    // InternalToscaDsl.g:110:4: ( (lv_description_4_0= RULE_STRING ) )
                    // InternalToscaDsl.g:111:5: (lv_description_4_0= RULE_STRING )
                    {
                    // InternalToscaDsl.g:111:5: (lv_description_4_0= RULE_STRING )
                    // InternalToscaDsl.g:112:6: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

                    						newLeafNode(lv_description_4_0, grammarAccess.getTopologyTemplateAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTopologyTemplateRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalToscaDsl.g:129:3: (otherlv_5= ',\\n\"imports\" :' otherlv_6= '[' ( (lv_imports_7_0= ruleImport ) ) (otherlv_8= ',' ( (lv_imports_9_0= ruleImport ) ) )* otherlv_10= ']' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalToscaDsl.g:130:4: otherlv_5= ',\\n\"imports\" :' otherlv_6= '[' ( (lv_imports_7_0= ruleImport ) ) (otherlv_8= ',' ( (lv_imports_9_0= ruleImport ) ) )* otherlv_10= ']'
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getTopologyTemplateAccess().getImportsKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getTopologyTemplateAccess().getLeftSquareBracketKeyword_4_1());
                    			
                    // InternalToscaDsl.g:138:4: ( (lv_imports_7_0= ruleImport ) )
                    // InternalToscaDsl.g:139:5: (lv_imports_7_0= ruleImport )
                    {
                    // InternalToscaDsl.g:139:5: (lv_imports_7_0= ruleImport )
                    // InternalToscaDsl.g:140:6: lv_imports_7_0= ruleImport
                    {

                    						newCompositeNode(grammarAccess.getTopologyTemplateAccess().getImportsImportParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_imports_7_0=ruleImport();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTopologyTemplateRule());
                    						}
                    						add(
                    							current,
                    							"imports",
                    							lv_imports_7_0,
                    							"it.polimi.dice.dicer.ToscaDsl.Import");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalToscaDsl.g:157:4: (otherlv_8= ',' ( (lv_imports_9_0= ruleImport ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==16) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalToscaDsl.g:158:5: otherlv_8= ',' ( (lv_imports_9_0= ruleImport ) )
                    	    {
                    	    otherlv_8=(Token)match(input,16,FOLLOW_8); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getTopologyTemplateAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalToscaDsl.g:162:5: ( (lv_imports_9_0= ruleImport ) )
                    	    // InternalToscaDsl.g:163:6: (lv_imports_9_0= ruleImport )
                    	    {
                    	    // InternalToscaDsl.g:163:6: (lv_imports_9_0= ruleImport )
                    	    // InternalToscaDsl.g:164:7: lv_imports_9_0= ruleImport
                    	    {

                    	    							newCompositeNode(grammarAccess.getTopologyTemplateAccess().getImportsImportParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_imports_9_0=ruleImport();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTopologyTemplateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"imports",
                    	    								lv_imports_9_0,
                    	    								"it.polimi.dice.dicer.ToscaDsl.Import");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_10, grammarAccess.getTopologyTemplateAccess().getRightSquareBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalToscaDsl.g:187:3: (otherlv_11= ',\\n\"outputs\" :' otherlv_12= '{' ( (lv_outputs_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_outputs_15_0= ruleParameter ) ) )* otherlv_16= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalToscaDsl.g:188:4: otherlv_11= ',\\n\"outputs\" :' otherlv_12= '{' ( (lv_outputs_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_outputs_15_0= ruleParameter ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_11, grammarAccess.getTopologyTemplateAccess().getOutputsKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getTopologyTemplateAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalToscaDsl.g:196:4: ( (lv_outputs_13_0= ruleParameter ) )
                    // InternalToscaDsl.g:197:5: (lv_outputs_13_0= ruleParameter )
                    {
                    // InternalToscaDsl.g:197:5: (lv_outputs_13_0= ruleParameter )
                    // InternalToscaDsl.g:198:6: lv_outputs_13_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getTopologyTemplateAccess().getOutputsParameterParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_outputs_13_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTopologyTemplateRule());
                    						}
                    						add(
                    							current,
                    							"outputs",
                    							lv_outputs_13_0,
                    							"it.polimi.dice.dicer.ToscaDsl.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalToscaDsl.g:215:4: (otherlv_14= ',' ( (lv_outputs_15_0= ruleParameter ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==16) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalToscaDsl.g:216:5: otherlv_14= ',' ( (lv_outputs_15_0= ruleParameter ) )
                    	    {
                    	    otherlv_14=(Token)match(input,16,FOLLOW_4); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getTopologyTemplateAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalToscaDsl.g:220:5: ( (lv_outputs_15_0= ruleParameter ) )
                    	    // InternalToscaDsl.g:221:6: (lv_outputs_15_0= ruleParameter )
                    	    {
                    	    // InternalToscaDsl.g:221:6: (lv_outputs_15_0= ruleParameter )
                    	    // InternalToscaDsl.g:222:7: lv_outputs_15_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getTopologyTemplateAccess().getOutputsParameterParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_outputs_15_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTopologyTemplateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"outputs",
                    	    								lv_outputs_15_0,
                    	    								"it.polimi.dice.dicer.ToscaDsl.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_16, grammarAccess.getTopologyTemplateAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalToscaDsl.g:245:3: (otherlv_17= ',\\n\"inputs\" :' otherlv_18= '{' ( (lv_inputs_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_inputs_21_0= ruleParameter ) ) )* otherlv_22= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalToscaDsl.g:246:4: otherlv_17= ',\\n\"inputs\" :' otherlv_18= '{' ( (lv_inputs_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_inputs_21_0= ruleParameter ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,20,FOLLOW_11); 

                    				newLeafNode(otherlv_17, grammarAccess.getTopologyTemplateAccess().getInputsKeyword_6_0());
                    			
                    otherlv_18=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_18, grammarAccess.getTopologyTemplateAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalToscaDsl.g:254:4: ( (lv_inputs_19_0= ruleParameter ) )
                    // InternalToscaDsl.g:255:5: (lv_inputs_19_0= ruleParameter )
                    {
                    // InternalToscaDsl.g:255:5: (lv_inputs_19_0= ruleParameter )
                    // InternalToscaDsl.g:256:6: lv_inputs_19_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getTopologyTemplateAccess().getInputsParameterParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_inputs_19_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTopologyTemplateRule());
                    						}
                    						add(
                    							current,
                    							"inputs",
                    							lv_inputs_19_0,
                    							"it.polimi.dice.dicer.ToscaDsl.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalToscaDsl.g:273:4: (otherlv_20= ',' ( (lv_inputs_21_0= ruleParameter ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==16) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalToscaDsl.g:274:5: otherlv_20= ',' ( (lv_inputs_21_0= ruleParameter ) )
                    	    {
                    	    otherlv_20=(Token)match(input,16,FOLLOW_4); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getTopologyTemplateAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalToscaDsl.g:278:5: ( (lv_inputs_21_0= ruleParameter ) )
                    	    // InternalToscaDsl.g:279:6: (lv_inputs_21_0= ruleParameter )
                    	    {
                    	    // InternalToscaDsl.g:279:6: (lv_inputs_21_0= ruleParameter )
                    	    // InternalToscaDsl.g:280:7: lv_inputs_21_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getTopologyTemplateAccess().getInputsParameterParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_inputs_21_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTopologyTemplateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"inputs",
                    	    								lv_inputs_21_0,
                    	    								"it.polimi.dice.dicer.ToscaDsl.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_22, grammarAccess.getTopologyTemplateAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalToscaDsl.g:303:3: (otherlv_23= ',\\n\"node_templates\" :' otherlv_24= '{' ( (lv_nodeTemplates_25_0= ruleNodeTemplate ) ) (otherlv_26= ',' ( (lv_nodeTemplates_27_0= ruleNodeTemplate ) ) )* otherlv_28= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalToscaDsl.g:304:4: otherlv_23= ',\\n\"node_templates\" :' otherlv_24= '{' ( (lv_nodeTemplates_25_0= ruleNodeTemplate ) ) (otherlv_26= ',' ( (lv_nodeTemplates_27_0= ruleNodeTemplate ) ) )* otherlv_28= '}'
                    {
                    otherlv_23=(Token)match(input,21,FOLLOW_11); 

                    				newLeafNode(otherlv_23, grammarAccess.getTopologyTemplateAccess().getNode_templatesKeyword_7_0());
                    			
                    otherlv_24=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_24, grammarAccess.getTopologyTemplateAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalToscaDsl.g:312:4: ( (lv_nodeTemplates_25_0= ruleNodeTemplate ) )
                    // InternalToscaDsl.g:313:5: (lv_nodeTemplates_25_0= ruleNodeTemplate )
                    {
                    // InternalToscaDsl.g:313:5: (lv_nodeTemplates_25_0= ruleNodeTemplate )
                    // InternalToscaDsl.g:314:6: lv_nodeTemplates_25_0= ruleNodeTemplate
                    {

                    						newCompositeNode(grammarAccess.getTopologyTemplateAccess().getNodeTemplatesNodeTemplateParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_nodeTemplates_25_0=ruleNodeTemplate();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTopologyTemplateRule());
                    						}
                    						add(
                    							current,
                    							"nodeTemplates",
                    							lv_nodeTemplates_25_0,
                    							"it.polimi.dice.dicer.ToscaDsl.NodeTemplate");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalToscaDsl.g:331:4: (otherlv_26= ',' ( (lv_nodeTemplates_27_0= ruleNodeTemplate ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==16) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalToscaDsl.g:332:5: otherlv_26= ',' ( (lv_nodeTemplates_27_0= ruleNodeTemplate ) )
                    	    {
                    	    otherlv_26=(Token)match(input,16,FOLLOW_4); 

                    	    					newLeafNode(otherlv_26, grammarAccess.getTopologyTemplateAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalToscaDsl.g:336:5: ( (lv_nodeTemplates_27_0= ruleNodeTemplate ) )
                    	    // InternalToscaDsl.g:337:6: (lv_nodeTemplates_27_0= ruleNodeTemplate )
                    	    {
                    	    // InternalToscaDsl.g:337:6: (lv_nodeTemplates_27_0= ruleNodeTemplate )
                    	    // InternalToscaDsl.g:338:7: lv_nodeTemplates_27_0= ruleNodeTemplate
                    	    {

                    	    							newCompositeNode(grammarAccess.getTopologyTemplateAccess().getNodeTemplatesNodeTemplateParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_nodeTemplates_27_0=ruleNodeTemplate();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTopologyTemplateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"nodeTemplates",
                    	    								lv_nodeTemplates_27_0,
                    	    								"it.polimi.dice.dicer.ToscaDsl.NodeTemplate");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,19,FOLLOW_15); 

                    				newLeafNode(otherlv_28, grammarAccess.getTopologyTemplateAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalToscaDsl.g:361:3: (otherlv_29= ',\\n\"realtionships\" :' otherlv_30= '{' ( (lv_realtionships_31_0= ruleRelationship ) ) (otherlv_32= ',' ( (lv_realtionships_33_0= ruleRelationship ) ) )* otherlv_34= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalToscaDsl.g:362:4: otherlv_29= ',\\n\"realtionships\" :' otherlv_30= '{' ( (lv_realtionships_31_0= ruleRelationship ) ) (otherlv_32= ',' ( (lv_realtionships_33_0= ruleRelationship ) ) )* otherlv_34= '}'
                    {
                    otherlv_29=(Token)match(input,22,FOLLOW_11); 

                    				newLeafNode(otherlv_29, grammarAccess.getTopologyTemplateAccess().getRealtionshipsKeyword_8_0());
                    			
                    otherlv_30=(Token)match(input,11,FOLLOW_11); 

                    				newLeafNode(otherlv_30, grammarAccess.getTopologyTemplateAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalToscaDsl.g:370:4: ( (lv_realtionships_31_0= ruleRelationship ) )
                    // InternalToscaDsl.g:371:5: (lv_realtionships_31_0= ruleRelationship )
                    {
                    // InternalToscaDsl.g:371:5: (lv_realtionships_31_0= ruleRelationship )
                    // InternalToscaDsl.g:372:6: lv_realtionships_31_0= ruleRelationship
                    {

                    						newCompositeNode(grammarAccess.getTopologyTemplateAccess().getRealtionshipsRelationshipParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_realtionships_31_0=ruleRelationship();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTopologyTemplateRule());
                    						}
                    						add(
                    							current,
                    							"realtionships",
                    							lv_realtionships_31_0,
                    							"it.polimi.dice.dicer.ToscaDsl.Relationship");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalToscaDsl.g:389:4: (otherlv_32= ',' ( (lv_realtionships_33_0= ruleRelationship ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==16) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalToscaDsl.g:390:5: otherlv_32= ',' ( (lv_realtionships_33_0= ruleRelationship ) )
                    	    {
                    	    otherlv_32=(Token)match(input,16,FOLLOW_11); 

                    	    					newLeafNode(otherlv_32, grammarAccess.getTopologyTemplateAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalToscaDsl.g:394:5: ( (lv_realtionships_33_0= ruleRelationship ) )
                    	    // InternalToscaDsl.g:395:6: (lv_realtionships_33_0= ruleRelationship )
                    	    {
                    	    // InternalToscaDsl.g:395:6: (lv_realtionships_33_0= ruleRelationship )
                    	    // InternalToscaDsl.g:396:7: lv_realtionships_33_0= ruleRelationship
                    	    {

                    	    							newCompositeNode(grammarAccess.getTopologyTemplateAccess().getRealtionshipsRelationshipParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_realtionships_33_0=ruleRelationship();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTopologyTemplateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"realtionships",
                    	    								lv_realtionships_33_0,
                    	    								"it.polimi.dice.dicer.ToscaDsl.Relationship");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_34=(Token)match(input,19,FOLLOW_16); 

                    				newLeafNode(otherlv_34, grammarAccess.getTopologyTemplateAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalToscaDsl.g:419:3: (otherlv_35= ',\\n\"groups\" :' otherlv_36= '{' ( (lv_groups_37_0= ruleGroup ) ) (otherlv_38= ',' ( (lv_groups_39_0= ruleGroup ) ) )* otherlv_40= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalToscaDsl.g:420:4: otherlv_35= ',\\n\"groups\" :' otherlv_36= '{' ( (lv_groups_37_0= ruleGroup ) ) (otherlv_38= ',' ( (lv_groups_39_0= ruleGroup ) ) )* otherlv_40= '}'
                    {
                    otherlv_35=(Token)match(input,23,FOLLOW_11); 

                    				newLeafNode(otherlv_35, grammarAccess.getTopologyTemplateAccess().getGroupsKeyword_9_0());
                    			
                    otherlv_36=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_36, grammarAccess.getTopologyTemplateAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalToscaDsl.g:428:4: ( (lv_groups_37_0= ruleGroup ) )
                    // InternalToscaDsl.g:429:5: (lv_groups_37_0= ruleGroup )
                    {
                    // InternalToscaDsl.g:429:5: (lv_groups_37_0= ruleGroup )
                    // InternalToscaDsl.g:430:6: lv_groups_37_0= ruleGroup
                    {

                    						newCompositeNode(grammarAccess.getTopologyTemplateAccess().getGroupsGroupParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_groups_37_0=ruleGroup();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTopologyTemplateRule());
                    						}
                    						add(
                    							current,
                    							"groups",
                    							lv_groups_37_0,
                    							"it.polimi.dice.dicer.ToscaDsl.Group");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalToscaDsl.g:447:4: (otherlv_38= ',' ( (lv_groups_39_0= ruleGroup ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==16) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalToscaDsl.g:448:5: otherlv_38= ',' ( (lv_groups_39_0= ruleGroup ) )
                    	    {
                    	    otherlv_38=(Token)match(input,16,FOLLOW_4); 

                    	    					newLeafNode(otherlv_38, grammarAccess.getTopologyTemplateAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalToscaDsl.g:452:5: ( (lv_groups_39_0= ruleGroup ) )
                    	    // InternalToscaDsl.g:453:6: (lv_groups_39_0= ruleGroup )
                    	    {
                    	    // InternalToscaDsl.g:453:6: (lv_groups_39_0= ruleGroup )
                    	    // InternalToscaDsl.g:454:7: lv_groups_39_0= ruleGroup
                    	    {

                    	    							newCompositeNode(grammarAccess.getTopologyTemplateAccess().getGroupsGroupParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_groups_39_0=ruleGroup();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTopologyTemplateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"groups",
                    	    								lv_groups_39_0,
                    	    								"it.polimi.dice.dicer.ToscaDsl.Group");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_40=(Token)match(input,19,FOLLOW_17); 

                    				newLeafNode(otherlv_40, grammarAccess.getTopologyTemplateAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalToscaDsl.g:477:3: (otherlv_41= ',\\n\"policies\" :' otherlv_42= '{' ( (lv_policies_43_0= rulePolicy ) ) (otherlv_44= ',' ( (lv_policies_45_0= rulePolicy ) ) )* otherlv_46= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalToscaDsl.g:478:4: otherlv_41= ',\\n\"policies\" :' otherlv_42= '{' ( (lv_policies_43_0= rulePolicy ) ) (otherlv_44= ',' ( (lv_policies_45_0= rulePolicy ) ) )* otherlv_46= '}'
                    {
                    otherlv_41=(Token)match(input,24,FOLLOW_11); 

                    				newLeafNode(otherlv_41, grammarAccess.getTopologyTemplateAccess().getPoliciesKeyword_10_0());
                    			
                    otherlv_42=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_42, grammarAccess.getTopologyTemplateAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalToscaDsl.g:486:4: ( (lv_policies_43_0= rulePolicy ) )
                    // InternalToscaDsl.g:487:5: (lv_policies_43_0= rulePolicy )
                    {
                    // InternalToscaDsl.g:487:5: (lv_policies_43_0= rulePolicy )
                    // InternalToscaDsl.g:488:6: lv_policies_43_0= rulePolicy
                    {

                    						newCompositeNode(grammarAccess.getTopologyTemplateAccess().getPoliciesPolicyParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_policies_43_0=rulePolicy();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTopologyTemplateRule());
                    						}
                    						add(
                    							current,
                    							"policies",
                    							lv_policies_43_0,
                    							"it.polimi.dice.dicer.ToscaDsl.Policy");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalToscaDsl.g:505:4: (otherlv_44= ',' ( (lv_policies_45_0= rulePolicy ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==16) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalToscaDsl.g:506:5: otherlv_44= ',' ( (lv_policies_45_0= rulePolicy ) )
                    	    {
                    	    otherlv_44=(Token)match(input,16,FOLLOW_4); 

                    	    					newLeafNode(otherlv_44, grammarAccess.getTopologyTemplateAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalToscaDsl.g:510:5: ( (lv_policies_45_0= rulePolicy ) )
                    	    // InternalToscaDsl.g:511:6: (lv_policies_45_0= rulePolicy )
                    	    {
                    	    // InternalToscaDsl.g:511:6: (lv_policies_45_0= rulePolicy )
                    	    // InternalToscaDsl.g:512:7: lv_policies_45_0= rulePolicy
                    	    {

                    	    							newCompositeNode(grammarAccess.getTopologyTemplateAccess().getPoliciesPolicyParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_policies_45_0=rulePolicy();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTopologyTemplateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"policies",
                    	    								lv_policies_45_0,
                    	    								"it.polimi.dice.dicer.ToscaDsl.Policy");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_46=(Token)match(input,19,FOLLOW_18); 

                    				newLeafNode(otherlv_46, grammarAccess.getTopologyTemplateAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            otherlv_47=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_47, grammarAccess.getTopologyTemplateAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTopologyTemplate"


    // $ANTLR start "entryRuleEString"
    // InternalToscaDsl.g:543:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalToscaDsl.g:543:47: (iv_ruleEString= ruleEString EOF )
            // InternalToscaDsl.g:544:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalToscaDsl.g:550:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalToscaDsl.g:556:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalToscaDsl.g:557:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalToscaDsl.g:557:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ID) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalToscaDsl.g:558:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalToscaDsl.g:566:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleImport"
    // InternalToscaDsl.g:577:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalToscaDsl.g:577:47: (iv_ruleImport= ruleImport EOF )
            // InternalToscaDsl.g:578:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalToscaDsl.g:584:1: ruleImport returns [EObject current=null] : ( () ( (lv_file_1_0= RULE_STRING ) )? ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token lv_file_1_0=null;


        	enterRule();

        try {
            // InternalToscaDsl.g:590:2: ( ( () ( (lv_file_1_0= RULE_STRING ) )? ) )
            // InternalToscaDsl.g:591:2: ( () ( (lv_file_1_0= RULE_STRING ) )? )
            {
            // InternalToscaDsl.g:591:2: ( () ( (lv_file_1_0= RULE_STRING ) )? )
            // InternalToscaDsl.g:592:3: () ( (lv_file_1_0= RULE_STRING ) )?
            {
            // InternalToscaDsl.g:592:3: ()
            // InternalToscaDsl.g:593:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getImportAccess().getImportAction_0(),
            					current);
            			

            }

            // InternalToscaDsl.g:599:3: ( (lv_file_1_0= RULE_STRING ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalToscaDsl.g:600:4: (lv_file_1_0= RULE_STRING )
                    {
                    // InternalToscaDsl.g:600:4: (lv_file_1_0= RULE_STRING )
                    // InternalToscaDsl.g:601:5: lv_file_1_0= RULE_STRING
                    {
                    lv_file_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_file_1_0, grammarAccess.getImportAccess().getFileSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getImportRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"file",
                    						lv_file_1_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleParameter"
    // InternalToscaDsl.g:621:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalToscaDsl.g:621:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalToscaDsl.g:622:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalToscaDsl.g:628:1: ruleParameter returns [EObject current=null] : ( () ( (lv_parameter_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= '\\n\"value\": ' ( (lv_parameter_value_5_0= ruleValue ) ) otherlv_6= '}' ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_parameter_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_parameter_value_5_0 = null;



        	enterRule();

        try {
            // InternalToscaDsl.g:634:2: ( ( () ( (lv_parameter_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= '\\n\"value\": ' ( (lv_parameter_value_5_0= ruleValue ) ) otherlv_6= '}' ) )
            // InternalToscaDsl.g:635:2: ( () ( (lv_parameter_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= '\\n\"value\": ' ( (lv_parameter_value_5_0= ruleValue ) ) otherlv_6= '}' )
            {
            // InternalToscaDsl.g:635:2: ( () ( (lv_parameter_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= '\\n\"value\": ' ( (lv_parameter_value_5_0= ruleValue ) ) otherlv_6= '}' )
            // InternalToscaDsl.g:636:3: () ( (lv_parameter_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= '\\n\"value\": ' ( (lv_parameter_value_5_0= ruleValue ) ) otherlv_6= '}'
            {
            // InternalToscaDsl.g:636:3: ()
            // InternalToscaDsl.g:637:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAccess().getParameterAction_0(),
            					current);
            			

            }

            // InternalToscaDsl.g:643:3: ( (lv_parameter_name_1_0= RULE_STRING ) )
            // InternalToscaDsl.g:644:4: (lv_parameter_name_1_0= RULE_STRING )
            {
            // InternalToscaDsl.g:644:4: (lv_parameter_name_1_0= RULE_STRING )
            // InternalToscaDsl.g:645:5: lv_parameter_name_1_0= RULE_STRING
            {
            lv_parameter_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_parameter_name_1_0, grammarAccess.getParameterAccess().getParameter_nameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"parameter_name",
            						lv_parameter_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,11,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,26,FOLLOW_21); 

            			newLeafNode(otherlv_4, grammarAccess.getParameterAccess().getValueKeyword_4());
            		
            // InternalToscaDsl.g:673:3: ( (lv_parameter_value_5_0= ruleValue ) )
            // InternalToscaDsl.g:674:4: (lv_parameter_value_5_0= ruleValue )
            {
            // InternalToscaDsl.g:674:4: (lv_parameter_value_5_0= ruleValue )
            // InternalToscaDsl.g:675:5: lv_parameter_value_5_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getParameter_valueValueParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_18);
            lv_parameter_value_5_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"parameter_value",
            						lv_parameter_value_5_0,
            						"it.polimi.dice.dicer.ToscaDsl.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleNodeTemplate"
    // InternalToscaDsl.g:700:1: entryRuleNodeTemplate returns [EObject current=null] : iv_ruleNodeTemplate= ruleNodeTemplate EOF ;
    public final EObject entryRuleNodeTemplate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeTemplate = null;


        try {
            // InternalToscaDsl.g:700:53: (iv_ruleNodeTemplate= ruleNodeTemplate EOF )
            // InternalToscaDsl.g:701:2: iv_ruleNodeTemplate= ruleNodeTemplate EOF
            {
             newCompositeNode(grammarAccess.getNodeTemplateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNodeTemplate=ruleNodeTemplate();

            state._fsp--;

             current =iv_ruleNodeTemplate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNodeTemplate"


    // $ANTLR start "ruleNodeTemplate"
    // InternalToscaDsl.g:707:1: ruleNodeTemplate returns [EObject current=null] : ( () ( (lv_node_template_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= '\"type\" :' ( (lv_type_5_0= RULE_STRING ) ) (otherlv_6= ',\\n\"instances\" : {' ( (lv_instances_7_0= ruleInstances ) ) otherlv_8= '}' )? (otherlv_9= ',\\n\"description\" :' ( (lv_description_10_0= RULE_STRING ) ) )? (otherlv_11= ',\\n\"relationships\" :' otherlv_12= '[' ( (lv_relationships_13_0= ruleRelationship ) ) (otherlv_14= ',' ( (lv_relationships_15_0= ruleRelationship ) ) )* otherlv_16= ']' )? (otherlv_17= ',\\n\"interfaces\" :' otherlv_18= '{' ( (lv_interfaces_19_0= ruleInterface ) ) (otherlv_20= ',' ( (lv_interfaces_21_0= ruleInterface ) ) )* otherlv_22= '}' )? otherlv_23= ',\\n\"properties\" :' otherlv_24= '{' ( (otherlv_25= '\\n\"monitoring\" : {' ( (lv_monitoring_26_0= ruleMonitoringProperty ) ) otherlv_27= '}' )? (otherlv_28= ',\\n\"configuration\" : {' ( (lv_configurations_29_0= ruleConfiguration ) ) (otherlv_30= ',' ( (lv_configurations_31_0= ruleConfiguration ) ) )* otherlv_32= '}' )? (otherlv_33= ',\\n\"resources\" :' otherlv_34= '[' ( (lv_resources_35_0= RULE_STRING ) ) (otherlv_36= ',' ( (lv_resources_37_0= RULE_STRING ) ) )* otherlv_38= ']' )? (otherlv_39= '\\n\"rules\" :' otherlv_40= '[' ( (lv_rules_41_0= ruleFirewallRule ) ) (otherlv_42= ',' ( (lv_rules_43_0= ruleFirewallRule ) ) )* otherlv_44= ']' )? (otherlv_45= ',\\n\"arguments\" :' otherlv_46= '[' ( (lv_arguments_47_0= ruleArgument ) ) (otherlv_48= ',' ( (lv_arguments_49_0= ruleArgument ) ) )* otherlv_50= ']' )? (otherlv_51= ',' ( (lv_properties_52_0= ruleProperty ) ) (otherlv_53= ',' ( (lv_properties_54_0= ruleProperty ) ) )* )? ) otherlv_55= '}' (otherlv_56= ',\\n\"requirements\" :' otherlv_57= '{' ( (lv_requirements_58_0= ruleRequirement ) ) (otherlv_59= ',' ( (lv_requirements_60_0= ruleRequirement ) ) )* otherlv_61= '}' )? (otherlv_62= ',\\n\"capabilities\" :' otherlv_63= '{' ( (lv_capabilities_64_0= ruleCapability ) ) (otherlv_65= ',' ( (lv_capabilities_66_0= ruleCapability ) ) )* otherlv_67= '}' )? otherlv_68= '}' ) ;
    public final EObject ruleNodeTemplate() throws RecognitionException {
        EObject current = null;

        Token lv_node_template_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_type_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_description_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token lv_resources_35_0=null;
        Token otherlv_36=null;
        Token lv_resources_37_0=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token otherlv_42=null;
        Token otherlv_44=null;
        Token otherlv_45=null;
        Token otherlv_46=null;
        Token otherlv_48=null;
        Token otherlv_50=null;
        Token otherlv_51=null;
        Token otherlv_53=null;
        Token otherlv_55=null;
        Token otherlv_56=null;
        Token otherlv_57=null;
        Token otherlv_59=null;
        Token otherlv_61=null;
        Token otherlv_62=null;
        Token otherlv_63=null;
        Token otherlv_65=null;
        Token otherlv_67=null;
        Token otherlv_68=null;
        EObject lv_instances_7_0 = null;

        EObject lv_relationships_13_0 = null;

        EObject lv_relationships_15_0 = null;

        EObject lv_interfaces_19_0 = null;

        EObject lv_interfaces_21_0 = null;

        EObject lv_monitoring_26_0 = null;

        EObject lv_configurations_29_0 = null;

        EObject lv_configurations_31_0 = null;

        EObject lv_rules_41_0 = null;

        EObject lv_rules_43_0 = null;

        EObject lv_arguments_47_0 = null;

        EObject lv_arguments_49_0 = null;

        EObject lv_properties_52_0 = null;

        EObject lv_properties_54_0 = null;

        EObject lv_requirements_58_0 = null;

        EObject lv_requirements_60_0 = null;

        EObject lv_capabilities_64_0 = null;

        EObject lv_capabilities_66_0 = null;



        	enterRule();

        try {
            // InternalToscaDsl.g:713:2: ( ( () ( (lv_node_template_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= '\"type\" :' ( (lv_type_5_0= RULE_STRING ) ) (otherlv_6= ',\\n\"instances\" : {' ( (lv_instances_7_0= ruleInstances ) ) otherlv_8= '}' )? (otherlv_9= ',\\n\"description\" :' ( (lv_description_10_0= RULE_STRING ) ) )? (otherlv_11= ',\\n\"relationships\" :' otherlv_12= '[' ( (lv_relationships_13_0= ruleRelationship ) ) (otherlv_14= ',' ( (lv_relationships_15_0= ruleRelationship ) ) )* otherlv_16= ']' )? (otherlv_17= ',\\n\"interfaces\" :' otherlv_18= '{' ( (lv_interfaces_19_0= ruleInterface ) ) (otherlv_20= ',' ( (lv_interfaces_21_0= ruleInterface ) ) )* otherlv_22= '}' )? otherlv_23= ',\\n\"properties\" :' otherlv_24= '{' ( (otherlv_25= '\\n\"monitoring\" : {' ( (lv_monitoring_26_0= ruleMonitoringProperty ) ) otherlv_27= '}' )? (otherlv_28= ',\\n\"configuration\" : {' ( (lv_configurations_29_0= ruleConfiguration ) ) (otherlv_30= ',' ( (lv_configurations_31_0= ruleConfiguration ) ) )* otherlv_32= '}' )? (otherlv_33= ',\\n\"resources\" :' otherlv_34= '[' ( (lv_resources_35_0= RULE_STRING ) ) (otherlv_36= ',' ( (lv_resources_37_0= RULE_STRING ) ) )* otherlv_38= ']' )? (otherlv_39= '\\n\"rules\" :' otherlv_40= '[' ( (lv_rules_41_0= ruleFirewallRule ) ) (otherlv_42= ',' ( (lv_rules_43_0= ruleFirewallRule ) ) )* otherlv_44= ']' )? (otherlv_45= ',\\n\"arguments\" :' otherlv_46= '[' ( (lv_arguments_47_0= ruleArgument ) ) (otherlv_48= ',' ( (lv_arguments_49_0= ruleArgument ) ) )* otherlv_50= ']' )? (otherlv_51= ',' ( (lv_properties_52_0= ruleProperty ) ) (otherlv_53= ',' ( (lv_properties_54_0= ruleProperty ) ) )* )? ) otherlv_55= '}' (otherlv_56= ',\\n\"requirements\" :' otherlv_57= '{' ( (lv_requirements_58_0= ruleRequirement ) ) (otherlv_59= ',' ( (lv_requirements_60_0= ruleRequirement ) ) )* otherlv_61= '}' )? (otherlv_62= ',\\n\"capabilities\" :' otherlv_63= '{' ( (lv_capabilities_64_0= ruleCapability ) ) (otherlv_65= ',' ( (lv_capabilities_66_0= ruleCapability ) ) )* otherlv_67= '}' )? otherlv_68= '}' ) )
            // InternalToscaDsl.g:714:2: ( () ( (lv_node_template_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= '\"type\" :' ( (lv_type_5_0= RULE_STRING ) ) (otherlv_6= ',\\n\"instances\" : {' ( (lv_instances_7_0= ruleInstances ) ) otherlv_8= '}' )? (otherlv_9= ',\\n\"description\" :' ( (lv_description_10_0= RULE_STRING ) ) )? (otherlv_11= ',\\n\"relationships\" :' otherlv_12= '[' ( (lv_relationships_13_0= ruleRelationship ) ) (otherlv_14= ',' ( (lv_relationships_15_0= ruleRelationship ) ) )* otherlv_16= ']' )? (otherlv_17= ',\\n\"interfaces\" :' otherlv_18= '{' ( (lv_interfaces_19_0= ruleInterface ) ) (otherlv_20= ',' ( (lv_interfaces_21_0= ruleInterface ) ) )* otherlv_22= '}' )? otherlv_23= ',\\n\"properties\" :' otherlv_24= '{' ( (otherlv_25= '\\n\"monitoring\" : {' ( (lv_monitoring_26_0= ruleMonitoringProperty ) ) otherlv_27= '}' )? (otherlv_28= ',\\n\"configuration\" : {' ( (lv_configurations_29_0= ruleConfiguration ) ) (otherlv_30= ',' ( (lv_configurations_31_0= ruleConfiguration ) ) )* otherlv_32= '}' )? (otherlv_33= ',\\n\"resources\" :' otherlv_34= '[' ( (lv_resources_35_0= RULE_STRING ) ) (otherlv_36= ',' ( (lv_resources_37_0= RULE_STRING ) ) )* otherlv_38= ']' )? (otherlv_39= '\\n\"rules\" :' otherlv_40= '[' ( (lv_rules_41_0= ruleFirewallRule ) ) (otherlv_42= ',' ( (lv_rules_43_0= ruleFirewallRule ) ) )* otherlv_44= ']' )? (otherlv_45= ',\\n\"arguments\" :' otherlv_46= '[' ( (lv_arguments_47_0= ruleArgument ) ) (otherlv_48= ',' ( (lv_arguments_49_0= ruleArgument ) ) )* otherlv_50= ']' )? (otherlv_51= ',' ( (lv_properties_52_0= ruleProperty ) ) (otherlv_53= ',' ( (lv_properties_54_0= ruleProperty ) ) )* )? ) otherlv_55= '}' (otherlv_56= ',\\n\"requirements\" :' otherlv_57= '{' ( (lv_requirements_58_0= ruleRequirement ) ) (otherlv_59= ',' ( (lv_requirements_60_0= ruleRequirement ) ) )* otherlv_61= '}' )? (otherlv_62= ',\\n\"capabilities\" :' otherlv_63= '{' ( (lv_capabilities_64_0= ruleCapability ) ) (otherlv_65= ',' ( (lv_capabilities_66_0= ruleCapability ) ) )* otherlv_67= '}' )? otherlv_68= '}' )
            {
            // InternalToscaDsl.g:714:2: ( () ( (lv_node_template_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= '\"type\" :' ( (lv_type_5_0= RULE_STRING ) ) (otherlv_6= ',\\n\"instances\" : {' ( (lv_instances_7_0= ruleInstances ) ) otherlv_8= '}' )? (otherlv_9= ',\\n\"description\" :' ( (lv_description_10_0= RULE_STRING ) ) )? (otherlv_11= ',\\n\"relationships\" :' otherlv_12= '[' ( (lv_relationships_13_0= ruleRelationship ) ) (otherlv_14= ',' ( (lv_relationships_15_0= ruleRelationship ) ) )* otherlv_16= ']' )? (otherlv_17= ',\\n\"interfaces\" :' otherlv_18= '{' ( (lv_interfaces_19_0= ruleInterface ) ) (otherlv_20= ',' ( (lv_interfaces_21_0= ruleInterface ) ) )* otherlv_22= '}' )? otherlv_23= ',\\n\"properties\" :' otherlv_24= '{' ( (otherlv_25= '\\n\"monitoring\" : {' ( (lv_monitoring_26_0= ruleMonitoringProperty ) ) otherlv_27= '}' )? (otherlv_28= ',\\n\"configuration\" : {' ( (lv_configurations_29_0= ruleConfiguration ) ) (otherlv_30= ',' ( (lv_configurations_31_0= ruleConfiguration ) ) )* otherlv_32= '}' )? (otherlv_33= ',\\n\"resources\" :' otherlv_34= '[' ( (lv_resources_35_0= RULE_STRING ) ) (otherlv_36= ',' ( (lv_resources_37_0= RULE_STRING ) ) )* otherlv_38= ']' )? (otherlv_39= '\\n\"rules\" :' otherlv_40= '[' ( (lv_rules_41_0= ruleFirewallRule ) ) (otherlv_42= ',' ( (lv_rules_43_0= ruleFirewallRule ) ) )* otherlv_44= ']' )? (otherlv_45= ',\\n\"arguments\" :' otherlv_46= '[' ( (lv_arguments_47_0= ruleArgument ) ) (otherlv_48= ',' ( (lv_arguments_49_0= ruleArgument ) ) )* otherlv_50= ']' )? (otherlv_51= ',' ( (lv_properties_52_0= ruleProperty ) ) (otherlv_53= ',' ( (lv_properties_54_0= ruleProperty ) ) )* )? ) otherlv_55= '}' (otherlv_56= ',\\n\"requirements\" :' otherlv_57= '{' ( (lv_requirements_58_0= ruleRequirement ) ) (otherlv_59= ',' ( (lv_requirements_60_0= ruleRequirement ) ) )* otherlv_61= '}' )? (otherlv_62= ',\\n\"capabilities\" :' otherlv_63= '{' ( (lv_capabilities_64_0= ruleCapability ) ) (otherlv_65= ',' ( (lv_capabilities_66_0= ruleCapability ) ) )* otherlv_67= '}' )? otherlv_68= '}' )
            // InternalToscaDsl.g:715:3: () ( (lv_node_template_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= '\"type\" :' ( (lv_type_5_0= RULE_STRING ) ) (otherlv_6= ',\\n\"instances\" : {' ( (lv_instances_7_0= ruleInstances ) ) otherlv_8= '}' )? (otherlv_9= ',\\n\"description\" :' ( (lv_description_10_0= RULE_STRING ) ) )? (otherlv_11= ',\\n\"relationships\" :' otherlv_12= '[' ( (lv_relationships_13_0= ruleRelationship ) ) (otherlv_14= ',' ( (lv_relationships_15_0= ruleRelationship ) ) )* otherlv_16= ']' )? (otherlv_17= ',\\n\"interfaces\" :' otherlv_18= '{' ( (lv_interfaces_19_0= ruleInterface ) ) (otherlv_20= ',' ( (lv_interfaces_21_0= ruleInterface ) ) )* otherlv_22= '}' )? otherlv_23= ',\\n\"properties\" :' otherlv_24= '{' ( (otherlv_25= '\\n\"monitoring\" : {' ( (lv_monitoring_26_0= ruleMonitoringProperty ) ) otherlv_27= '}' )? (otherlv_28= ',\\n\"configuration\" : {' ( (lv_configurations_29_0= ruleConfiguration ) ) (otherlv_30= ',' ( (lv_configurations_31_0= ruleConfiguration ) ) )* otherlv_32= '}' )? (otherlv_33= ',\\n\"resources\" :' otherlv_34= '[' ( (lv_resources_35_0= RULE_STRING ) ) (otherlv_36= ',' ( (lv_resources_37_0= RULE_STRING ) ) )* otherlv_38= ']' )? (otherlv_39= '\\n\"rules\" :' otherlv_40= '[' ( (lv_rules_41_0= ruleFirewallRule ) ) (otherlv_42= ',' ( (lv_rules_43_0= ruleFirewallRule ) ) )* otherlv_44= ']' )? (otherlv_45= ',\\n\"arguments\" :' otherlv_46= '[' ( (lv_arguments_47_0= ruleArgument ) ) (otherlv_48= ',' ( (lv_arguments_49_0= ruleArgument ) ) )* otherlv_50= ']' )? (otherlv_51= ',' ( (lv_properties_52_0= ruleProperty ) ) (otherlv_53= ',' ( (lv_properties_54_0= ruleProperty ) ) )* )? ) otherlv_55= '}' (otherlv_56= ',\\n\"requirements\" :' otherlv_57= '{' ( (lv_requirements_58_0= ruleRequirement ) ) (otherlv_59= ',' ( (lv_requirements_60_0= ruleRequirement ) ) )* otherlv_61= '}' )? (otherlv_62= ',\\n\"capabilities\" :' otherlv_63= '{' ( (lv_capabilities_64_0= ruleCapability ) ) (otherlv_65= ',' ( (lv_capabilities_66_0= ruleCapability ) ) )* otherlv_67= '}' )? otherlv_68= '}'
            {
            // InternalToscaDsl.g:715:3: ()
            // InternalToscaDsl.g:716:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNodeTemplateAccess().getNodeTemplateAction_0(),
            					current);
            			

            }

            // InternalToscaDsl.g:722:3: ( (lv_node_template_name_1_0= RULE_STRING ) )
            // InternalToscaDsl.g:723:4: (lv_node_template_name_1_0= RULE_STRING )
            {
            // InternalToscaDsl.g:723:4: (lv_node_template_name_1_0= RULE_STRING )
            // InternalToscaDsl.g:724:5: lv_node_template_name_1_0= RULE_STRING
            {
            lv_node_template_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_node_template_name_1_0, grammarAccess.getNodeTemplateAccess().getNode_template_nameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeTemplateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"node_template_name",
            						lv_node_template_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getNodeTemplateAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,11,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getNodeTemplateAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getNodeTemplateAccess().getTypeKeyword_4());
            		
            // InternalToscaDsl.g:752:3: ( (lv_type_5_0= RULE_STRING ) )
            // InternalToscaDsl.g:753:4: (lv_type_5_0= RULE_STRING )
            {
            // InternalToscaDsl.g:753:4: (lv_type_5_0= RULE_STRING )
            // InternalToscaDsl.g:754:5: lv_type_5_0= RULE_STRING
            {
            lv_type_5_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

            					newLeafNode(lv_type_5_0, grammarAccess.getNodeTemplateAccess().getTypeSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeTemplateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalToscaDsl.g:770:3: (otherlv_6= ',\\n\"instances\" : {' ( (lv_instances_7_0= ruleInstances ) ) otherlv_8= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalToscaDsl.g:771:4: otherlv_6= ',\\n\"instances\" : {' ( (lv_instances_7_0= ruleInstances ) ) otherlv_8= '}'
                    {
                    otherlv_6=(Token)match(input,28,FOLLOW_24); 

                    				newLeafNode(otherlv_6, grammarAccess.getNodeTemplateAccess().getInstancesKeyword_6_0());
                    			
                    // InternalToscaDsl.g:775:4: ( (lv_instances_7_0= ruleInstances ) )
                    // InternalToscaDsl.g:776:5: (lv_instances_7_0= ruleInstances )
                    {
                    // InternalToscaDsl.g:776:5: (lv_instances_7_0= ruleInstances )
                    // InternalToscaDsl.g:777:6: lv_instances_7_0= ruleInstances
                    {

                    						newCompositeNode(grammarAccess.getNodeTemplateAccess().getInstancesInstancesParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_instances_7_0=ruleInstances();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNodeTemplateRule());
                    						}
                    						set(
                    							current,
                    							"instances",
                    							lv_instances_7_0,
                    							"it.polimi.dice.dicer.ToscaDsl.Instances");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,19,FOLLOW_25); 

                    				newLeafNode(otherlv_8, grammarAccess.getNodeTemplateAccess().getRightCurlyBracketKeyword_6_2());
                    			

                    }
                    break;

            }

            // InternalToscaDsl.g:799:3: (otherlv_9= ',\\n\"description\" :' ( (lv_description_10_0= RULE_STRING ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==13) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalToscaDsl.g:800:4: otherlv_9= ',\\n\"description\" :' ( (lv_description_10_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getNodeTemplateAccess().getDescriptionKeyword_7_0());
                    			
                    // InternalToscaDsl.g:804:4: ( (lv_description_10_0= RULE_STRING ) )
                    // InternalToscaDsl.g:805:5: (lv_description_10_0= RULE_STRING )
                    {
                    // InternalToscaDsl.g:805:5: (lv_description_10_0= RULE_STRING )
                    // InternalToscaDsl.g:806:6: lv_description_10_0= RULE_STRING
                    {
                    lv_description_10_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

                    						newLeafNode(lv_description_10_0, grammarAccess.getNodeTemplateAccess().getDescriptionSTRINGTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNodeTemplateRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_10_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalToscaDsl.g:823:3: (otherlv_11= ',\\n\"relationships\" :' otherlv_12= '[' ( (lv_relationships_13_0= ruleRelationship ) ) (otherlv_14= ',' ( (lv_relationships_15_0= ruleRelationship ) ) )* otherlv_16= ']' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==29) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalToscaDsl.g:824:4: otherlv_11= ',\\n\"relationships\" :' otherlv_12= '[' ( (lv_relationships_13_0= ruleRelationship ) ) (otherlv_14= ',' ( (lv_relationships_15_0= ruleRelationship ) ) )* otherlv_16= ']'
                    {
                    otherlv_11=(Token)match(input,29,FOLLOW_7); 

                    				newLeafNode(otherlv_11, grammarAccess.getNodeTemplateAccess().getRelationshipsKeyword_8_0());
                    			
                    otherlv_12=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_12, grammarAccess.getNodeTemplateAccess().getLeftSquareBracketKeyword_8_1());
                    			
                    // InternalToscaDsl.g:832:4: ( (lv_relationships_13_0= ruleRelationship ) )
                    // InternalToscaDsl.g:833:5: (lv_relationships_13_0= ruleRelationship )
                    {
                    // InternalToscaDsl.g:833:5: (lv_relationships_13_0= ruleRelationship )
                    // InternalToscaDsl.g:834:6: lv_relationships_13_0= ruleRelationship
                    {

                    						newCompositeNode(grammarAccess.getNodeTemplateAccess().getRelationshipsRelationshipParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_relationships_13_0=ruleRelationship();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNodeTemplateRule());
                    						}
                    						add(
                    							current,
                    							"relationships",
                    							lv_relationships_13_0,
                    							"it.polimi.dice.dicer.ToscaDsl.Relationship");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalToscaDsl.g:851:4: (otherlv_14= ',' ( (lv_relationships_15_0= ruleRelationship ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==16) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalToscaDsl.g:852:5: otherlv_14= ',' ( (lv_relationships_15_0= ruleRelationship ) )
                    	    {
                    	    otherlv_14=(Token)match(input,16,FOLLOW_11); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getNodeTemplateAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalToscaDsl.g:856:5: ( (lv_relationships_15_0= ruleRelationship ) )
                    	    // InternalToscaDsl.g:857:6: (lv_relationships_15_0= ruleRelationship )
                    	    {
                    	    // InternalToscaDsl.g:857:6: (lv_relationships_15_0= ruleRelationship )
                    	    // InternalToscaDsl.g:858:7: lv_relationships_15_0= ruleRelationship
                    	    {

                    	    							newCompositeNode(grammarAccess.getNodeTemplateAccess().getRelationshipsRelationshipParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_relationships_15_0=ruleRelationship();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNodeTemplateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"relationships",
                    	    								lv_relationships_15_0,
                    	    								"it.polimi.dice.dicer.ToscaDsl.Relationship");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,17,FOLLOW_27); 

                    				newLeafNode(otherlv_16, grammarAccess.getNodeTemplateAccess().getRightSquareBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalToscaDsl.g:881:3: (otherlv_17= ',\\n\"interfaces\" :' otherlv_18= '{' ( (lv_interfaces_19_0= ruleInterface ) ) (otherlv_20= ',' ( (lv_interfaces_21_0= ruleInterface ) ) )* otherlv_22= '}' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==30) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalToscaDsl.g:882:4: otherlv_17= ',\\n\"interfaces\" :' otherlv_18= '{' ( (lv_interfaces_19_0= ruleInterface ) ) (otherlv_20= ',' ( (lv_interfaces_21_0= ruleInterface ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,30,FOLLOW_11); 

                    				newLeafNode(otherlv_17, grammarAccess.getNodeTemplateAccess().getInterfacesKeyword_9_0());
                    			
                    otherlv_18=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_18, grammarAccess.getNodeTemplateAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalToscaDsl.g:890:4: ( (lv_interfaces_19_0= ruleInterface ) )
                    // InternalToscaDsl.g:891:5: (lv_interfaces_19_0= ruleInterface )
                    {
                    // InternalToscaDsl.g:891:5: (lv_interfaces_19_0= ruleInterface )
                    // InternalToscaDsl.g:892:6: lv_interfaces_19_0= ruleInterface
                    {

                    						newCompositeNode(grammarAccess.getNodeTemplateAccess().getInterfacesInterfaceParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_interfaces_19_0=ruleInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNodeTemplateRule());
                    						}
                    						add(
                    							current,
                    							"interfaces",
                    							lv_interfaces_19_0,
                    							"it.polimi.dice.dicer.ToscaDsl.Interface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalToscaDsl.g:909:4: (otherlv_20= ',' ( (lv_interfaces_21_0= ruleInterface ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==16) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalToscaDsl.g:910:5: otherlv_20= ',' ( (lv_interfaces_21_0= ruleInterface ) )
                    	    {
                    	    otherlv_20=(Token)match(input,16,FOLLOW_4); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getNodeTemplateAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalToscaDsl.g:914:5: ( (lv_interfaces_21_0= ruleInterface ) )
                    	    // InternalToscaDsl.g:915:6: (lv_interfaces_21_0= ruleInterface )
                    	    {
                    	    // InternalToscaDsl.g:915:6: (lv_interfaces_21_0= ruleInterface )
                    	    // InternalToscaDsl.g:916:7: lv_interfaces_21_0= ruleInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getNodeTemplateAccess().getInterfacesInterfaceParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_interfaces_21_0=ruleInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNodeTemplateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"interfaces",
                    	    								lv_interfaces_21_0,
                    	    								"it.polimi.dice.dicer.ToscaDsl.Interface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,19,FOLLOW_28); 

                    				newLeafNode(otherlv_22, grammarAccess.getNodeTemplateAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            otherlv_23=(Token)match(input,31,FOLLOW_11); 

            			newLeafNode(otherlv_23, grammarAccess.getNodeTemplateAccess().getPropertiesKeyword_10());
            		
            otherlv_24=(Token)match(input,11,FOLLOW_29); 

            			newLeafNode(otherlv_24, grammarAccess.getNodeTemplateAccess().getLeftCurlyBracketKeyword_11());
            		
            // InternalToscaDsl.g:947:3: ( (otherlv_25= '\\n\"monitoring\" : {' ( (lv_monitoring_26_0= ruleMonitoringProperty ) ) otherlv_27= '}' )? (otherlv_28= ',\\n\"configuration\" : {' ( (lv_configurations_29_0= ruleConfiguration ) ) (otherlv_30= ',' ( (lv_configurations_31_0= ruleConfiguration ) ) )* otherlv_32= '}' )? (otherlv_33= ',\\n\"resources\" :' otherlv_34= '[' ( (lv_resources_35_0= RULE_STRING ) ) (otherlv_36= ',' ( (lv_resources_37_0= RULE_STRING ) ) )* otherlv_38= ']' )? (otherlv_39= '\\n\"rules\" :' otherlv_40= '[' ( (lv_rules_41_0= ruleFirewallRule ) ) (otherlv_42= ',' ( (lv_rules_43_0= ruleFirewallRule ) ) )* otherlv_44= ']' )? (otherlv_45= ',\\n\"arguments\" :' otherlv_46= '[' ( (lv_arguments_47_0= ruleArgument ) ) (otherlv_48= ',' ( (lv_arguments_49_0= ruleArgument ) ) )* otherlv_50= ']' )? (otherlv_51= ',' ( (lv_properties_52_0= ruleProperty ) ) (otherlv_53= ',' ( (lv_properties_54_0= ruleProperty ) ) )* )? )
            // InternalToscaDsl.g:948:4: (otherlv_25= '\\n\"monitoring\" : {' ( (lv_monitoring_26_0= ruleMonitoringProperty ) ) otherlv_27= '}' )? (otherlv_28= ',\\n\"configuration\" : {' ( (lv_configurations_29_0= ruleConfiguration ) ) (otherlv_30= ',' ( (lv_configurations_31_0= ruleConfiguration ) ) )* otherlv_32= '}' )? (otherlv_33= ',\\n\"resources\" :' otherlv_34= '[' ( (lv_resources_35_0= RULE_STRING ) ) (otherlv_36= ',' ( (lv_resources_37_0= RULE_STRING ) ) )* otherlv_38= ']' )? (otherlv_39= '\\n\"rules\" :' otherlv_40= '[' ( (lv_rules_41_0= ruleFirewallRule ) ) (otherlv_42= ',' ( (lv_rules_43_0= ruleFirewallRule ) ) )* otherlv_44= ']' )? (otherlv_45= ',\\n\"arguments\" :' otherlv_46= '[' ( (lv_arguments_47_0= ruleArgument ) ) (otherlv_48= ',' ( (lv_arguments_49_0= ruleArgument ) ) )* otherlv_50= ']' )? (otherlv_51= ',' ( (lv_properties_52_0= ruleProperty ) ) (otherlv_53= ',' ( (lv_properties_54_0= ruleProperty ) ) )* )?
            {
            // InternalToscaDsl.g:948:4: (otherlv_25= '\\n\"monitoring\" : {' ( (lv_monitoring_26_0= ruleMonitoringProperty ) ) otherlv_27= '}' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==32) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalToscaDsl.g:949:5: otherlv_25= '\\n\"monitoring\" : {' ( (lv_monitoring_26_0= ruleMonitoringProperty ) ) otherlv_27= '}'
                    {
                    otherlv_25=(Token)match(input,32,FOLLOW_30); 

                    					newLeafNode(otherlv_25, grammarAccess.getNodeTemplateAccess().getMonitoringKeyword_12_0_0());
                    				
                    // InternalToscaDsl.g:953:5: ( (lv_monitoring_26_0= ruleMonitoringProperty ) )
                    // InternalToscaDsl.g:954:6: (lv_monitoring_26_0= ruleMonitoringProperty )
                    {
                    // InternalToscaDsl.g:954:6: (lv_monitoring_26_0= ruleMonitoringProperty )
                    // InternalToscaDsl.g:955:7: lv_monitoring_26_0= ruleMonitoringProperty
                    {

                    							newCompositeNode(grammarAccess.getNodeTemplateAccess().getMonitoringMonitoringPropertyParserRuleCall_12_0_1_0());
                    						
                    pushFollow(FOLLOW_18);
                    lv_monitoring_26_0=ruleMonitoringProperty();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getNodeTemplateRule());
                    							}
                    							set(
                    								current,
                    								"monitoring",
                    								lv_monitoring_26_0,
                    								"it.polimi.dice.dicer.ToscaDsl.MonitoringProperty");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_27=(Token)match(input,19,FOLLOW_31); 

                    					newLeafNode(otherlv_27, grammarAccess.getNodeTemplateAccess().getRightCurlyBracketKeyword_12_0_2());
                    				

                    }
                    break;

            }

            // InternalToscaDsl.g:977:4: (otherlv_28= ',\\n\"configuration\" : {' ( (lv_configurations_29_0= ruleConfiguration ) ) (otherlv_30= ',' ( (lv_configurations_31_0= ruleConfiguration ) ) )* otherlv_32= '}' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==33) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalToscaDsl.g:978:5: otherlv_28= ',\\n\"configuration\" : {' ( (lv_configurations_29_0= ruleConfiguration ) ) (otherlv_30= ',' ( (lv_configurations_31_0= ruleConfiguration ) ) )* otherlv_32= '}'
                    {
                    otherlv_28=(Token)match(input,33,FOLLOW_32); 

                    					newLeafNode(otherlv_28, grammarAccess.getNodeTemplateAccess().getConfigurationKeyword_12_1_0());
                    				
                    // InternalToscaDsl.g:982:5: ( (lv_configurations_29_0= ruleConfiguration ) )
                    // InternalToscaDsl.g:983:6: (lv_configurations_29_0= ruleConfiguration )
                    {
                    // InternalToscaDsl.g:983:6: (lv_configurations_29_0= ruleConfiguration )
                    // InternalToscaDsl.g:984:7: lv_configurations_29_0= ruleConfiguration
                    {

                    							newCompositeNode(grammarAccess.getNodeTemplateAccess().getConfigurationsConfigurationParserRuleCall_12_1_1_0());
                    						
                    pushFollow(FOLLOW_12);
                    lv_configurations_29_0=ruleConfiguration();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getNodeTemplateRule());
                    							}
                    							add(
                    								current,
                    								"configurations",
                    								lv_configurations_29_0,
                    								"it.polimi.dice.dicer.ToscaDsl.Configuration");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalToscaDsl.g:1001:5: (otherlv_30= ',' ( (lv_configurations_31_0= ruleConfiguration ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==16) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalToscaDsl.g:1002:6: otherlv_30= ',' ( (lv_configurations_31_0= ruleConfiguration ) )
                    	    {
                    	    otherlv_30=(Token)match(input,16,FOLLOW_32); 

                    	    						newLeafNode(otherlv_30, grammarAccess.getNodeTemplateAccess().getCommaKeyword_12_1_2_0());
                    	    					
                    	    // InternalToscaDsl.g:1006:6: ( (lv_configurations_31_0= ruleConfiguration ) )
                    	    // InternalToscaDsl.g:1007:7: (lv_configurations_31_0= ruleConfiguration )
                    	    {
                    	    // InternalToscaDsl.g:1007:7: (lv_configurations_31_0= ruleConfiguration )
                    	    // InternalToscaDsl.g:1008:8: lv_configurations_31_0= ruleConfiguration
                    	    {

                    	    								newCompositeNode(grammarAccess.getNodeTemplateAccess().getConfigurationsConfigurationParserRuleCall_12_1_2_1_0());
                    	    							
                    	    pushFollow(FOLLOW_12);
                    	    lv_configurations_31_0=ruleConfiguration();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getNodeTemplateRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"configurations",
                    	    									lv_configurations_31_0,
                    	    									"it.polimi.dice.dicer.ToscaDsl.Configuration");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_32=(Token)match(input,19,FOLLOW_33); 

                    					newLeafNode(otherlv_32, grammarAccess.getNodeTemplateAccess().getRightCurlyBracketKeyword_12_1_3());
                    				

                    }
                    break;

            }

            // InternalToscaDsl.g:1031:4: (otherlv_33= ',\\n\"resources\" :' otherlv_34= '[' ( (lv_resources_35_0= RULE_STRING ) ) (otherlv_36= ',' ( (lv_resources_37_0= RULE_STRING ) ) )* otherlv_38= ']' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==34) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalToscaDsl.g:1032:5: otherlv_33= ',\\n\"resources\" :' otherlv_34= '[' ( (lv_resources_35_0= RULE_STRING ) ) (otherlv_36= ',' ( (lv_resources_37_0= RULE_STRING ) ) )* otherlv_38= ']'
                    {
                    otherlv_33=(Token)match(input,34,FOLLOW_7); 

                    					newLeafNode(otherlv_33, grammarAccess.getNodeTemplateAccess().getResourcesKeyword_12_2_0());
                    				
                    otherlv_34=(Token)match(input,15,FOLLOW_4); 

                    					newLeafNode(otherlv_34, grammarAccess.getNodeTemplateAccess().getLeftSquareBracketKeyword_12_2_1());
                    				
                    // InternalToscaDsl.g:1040:5: ( (lv_resources_35_0= RULE_STRING ) )
                    // InternalToscaDsl.g:1041:6: (lv_resources_35_0= RULE_STRING )
                    {
                    // InternalToscaDsl.g:1041:6: (lv_resources_35_0= RULE_STRING )
                    // InternalToscaDsl.g:1042:7: lv_resources_35_0= RULE_STRING
                    {
                    lv_resources_35_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    							newLeafNode(lv_resources_35_0, grammarAccess.getNodeTemplateAccess().getResourcesSTRINGTerminalRuleCall_12_2_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getNodeTemplateRule());
                    							}
                    							addWithLastConsumed(
                    								current,
                    								"resources",
                    								lv_resources_35_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }

                    // InternalToscaDsl.g:1058:5: (otherlv_36= ',' ( (lv_resources_37_0= RULE_STRING ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==16) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalToscaDsl.g:1059:6: otherlv_36= ',' ( (lv_resources_37_0= RULE_STRING ) )
                    	    {
                    	    otherlv_36=(Token)match(input,16,FOLLOW_4); 

                    	    						newLeafNode(otherlv_36, grammarAccess.getNodeTemplateAccess().getCommaKeyword_12_2_3_0());
                    	    					
                    	    // InternalToscaDsl.g:1063:6: ( (lv_resources_37_0= RULE_STRING ) )
                    	    // InternalToscaDsl.g:1064:7: (lv_resources_37_0= RULE_STRING )
                    	    {
                    	    // InternalToscaDsl.g:1064:7: (lv_resources_37_0= RULE_STRING )
                    	    // InternalToscaDsl.g:1065:8: lv_resources_37_0= RULE_STRING
                    	    {
                    	    lv_resources_37_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    	    								newLeafNode(lv_resources_37_0, grammarAccess.getNodeTemplateAccess().getResourcesSTRINGTerminalRuleCall_12_2_3_1_0());
                    	    							

                    	    								if (current==null) {
                    	    									current = createModelElement(grammarAccess.getNodeTemplateRule());
                    	    								}
                    	    								addWithLastConsumed(
                    	    									current,
                    	    									"resources",
                    	    									lv_resources_37_0,
                    	    									"org.eclipse.xtext.common.Terminals.STRING");
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_38=(Token)match(input,17,FOLLOW_34); 

                    					newLeafNode(otherlv_38, grammarAccess.getNodeTemplateAccess().getRightSquareBracketKeyword_12_2_4());
                    				

                    }
                    break;

            }

            // InternalToscaDsl.g:1087:4: (otherlv_39= '\\n\"rules\" :' otherlv_40= '[' ( (lv_rules_41_0= ruleFirewallRule ) ) (otherlv_42= ',' ( (lv_rules_43_0= ruleFirewallRule ) ) )* otherlv_44= ']' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==35) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalToscaDsl.g:1088:5: otherlv_39= '\\n\"rules\" :' otherlv_40= '[' ( (lv_rules_41_0= ruleFirewallRule ) ) (otherlv_42= ',' ( (lv_rules_43_0= ruleFirewallRule ) ) )* otherlv_44= ']'
                    {
                    otherlv_39=(Token)match(input,35,FOLLOW_7); 

                    					newLeafNode(otherlv_39, grammarAccess.getNodeTemplateAccess().getRulesKeyword_12_3_0());
                    				
                    otherlv_40=(Token)match(input,15,FOLLOW_11); 

                    					newLeafNode(otherlv_40, grammarAccess.getNodeTemplateAccess().getLeftSquareBracketKeyword_12_3_1());
                    				
                    // InternalToscaDsl.g:1096:5: ( (lv_rules_41_0= ruleFirewallRule ) )
                    // InternalToscaDsl.g:1097:6: (lv_rules_41_0= ruleFirewallRule )
                    {
                    // InternalToscaDsl.g:1097:6: (lv_rules_41_0= ruleFirewallRule )
                    // InternalToscaDsl.g:1098:7: lv_rules_41_0= ruleFirewallRule
                    {

                    							newCompositeNode(grammarAccess.getNodeTemplateAccess().getRulesFirewallRuleParserRuleCall_12_3_2_0());
                    						
                    pushFollow(FOLLOW_9);
                    lv_rules_41_0=ruleFirewallRule();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getNodeTemplateRule());
                    							}
                    							add(
                    								current,
                    								"rules",
                    								lv_rules_41_0,
                    								"it.polimi.dice.dicer.ToscaDsl.FirewallRule");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalToscaDsl.g:1115:5: (otherlv_42= ',' ( (lv_rules_43_0= ruleFirewallRule ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==16) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalToscaDsl.g:1116:6: otherlv_42= ',' ( (lv_rules_43_0= ruleFirewallRule ) )
                    	    {
                    	    otherlv_42=(Token)match(input,16,FOLLOW_11); 

                    	    						newLeafNode(otherlv_42, grammarAccess.getNodeTemplateAccess().getCommaKeyword_12_3_3_0());
                    	    					
                    	    // InternalToscaDsl.g:1120:6: ( (lv_rules_43_0= ruleFirewallRule ) )
                    	    // InternalToscaDsl.g:1121:7: (lv_rules_43_0= ruleFirewallRule )
                    	    {
                    	    // InternalToscaDsl.g:1121:7: (lv_rules_43_0= ruleFirewallRule )
                    	    // InternalToscaDsl.g:1122:8: lv_rules_43_0= ruleFirewallRule
                    	    {

                    	    								newCompositeNode(grammarAccess.getNodeTemplateAccess().getRulesFirewallRuleParserRuleCall_12_3_3_1_0());
                    	    							
                    	    pushFollow(FOLLOW_9);
                    	    lv_rules_43_0=ruleFirewallRule();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getNodeTemplateRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"rules",
                    	    									lv_rules_43_0,
                    	    									"it.polimi.dice.dicer.ToscaDsl.FirewallRule");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_44=(Token)match(input,17,FOLLOW_35); 

                    					newLeafNode(otherlv_44, grammarAccess.getNodeTemplateAccess().getRightSquareBracketKeyword_12_3_4());
                    				

                    }
                    break;

            }

            // InternalToscaDsl.g:1145:4: (otherlv_45= ',\\n\"arguments\" :' otherlv_46= '[' ( (lv_arguments_47_0= ruleArgument ) ) (otherlv_48= ',' ( (lv_arguments_49_0= ruleArgument ) ) )* otherlv_50= ']' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==36) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalToscaDsl.g:1146:5: otherlv_45= ',\\n\"arguments\" :' otherlv_46= '[' ( (lv_arguments_47_0= ruleArgument ) ) (otherlv_48= ',' ( (lv_arguments_49_0= ruleArgument ) ) )* otherlv_50= ']'
                    {
                    otherlv_45=(Token)match(input,36,FOLLOW_7); 

                    					newLeafNode(otherlv_45, grammarAccess.getNodeTemplateAccess().getArgumentsKeyword_12_4_0());
                    				
                    otherlv_46=(Token)match(input,15,FOLLOW_21); 

                    					newLeafNode(otherlv_46, grammarAccess.getNodeTemplateAccess().getLeftSquareBracketKeyword_12_4_1());
                    				
                    // InternalToscaDsl.g:1154:5: ( (lv_arguments_47_0= ruleArgument ) )
                    // InternalToscaDsl.g:1155:6: (lv_arguments_47_0= ruleArgument )
                    {
                    // InternalToscaDsl.g:1155:6: (lv_arguments_47_0= ruleArgument )
                    // InternalToscaDsl.g:1156:7: lv_arguments_47_0= ruleArgument
                    {

                    							newCompositeNode(grammarAccess.getNodeTemplateAccess().getArgumentsArgumentParserRuleCall_12_4_2_0());
                    						
                    pushFollow(FOLLOW_9);
                    lv_arguments_47_0=ruleArgument();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getNodeTemplateRule());
                    							}
                    							add(
                    								current,
                    								"arguments",
                    								lv_arguments_47_0,
                    								"it.polimi.dice.dicer.ToscaDsl.Argument");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalToscaDsl.g:1173:5: (otherlv_48= ',' ( (lv_arguments_49_0= ruleArgument ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==16) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalToscaDsl.g:1174:6: otherlv_48= ',' ( (lv_arguments_49_0= ruleArgument ) )
                    	    {
                    	    otherlv_48=(Token)match(input,16,FOLLOW_21); 

                    	    						newLeafNode(otherlv_48, grammarAccess.getNodeTemplateAccess().getCommaKeyword_12_4_3_0());
                    	    					
                    	    // InternalToscaDsl.g:1178:6: ( (lv_arguments_49_0= ruleArgument ) )
                    	    // InternalToscaDsl.g:1179:7: (lv_arguments_49_0= ruleArgument )
                    	    {
                    	    // InternalToscaDsl.g:1179:7: (lv_arguments_49_0= ruleArgument )
                    	    // InternalToscaDsl.g:1180:8: lv_arguments_49_0= ruleArgument
                    	    {

                    	    								newCompositeNode(grammarAccess.getNodeTemplateAccess().getArgumentsArgumentParserRuleCall_12_4_3_1_0());
                    	    							
                    	    pushFollow(FOLLOW_9);
                    	    lv_arguments_49_0=ruleArgument();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getNodeTemplateRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"arguments",
                    	    									lv_arguments_49_0,
                    	    									"it.polimi.dice.dicer.ToscaDsl.Argument");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_50=(Token)match(input,17,FOLLOW_12); 

                    					newLeafNode(otherlv_50, grammarAccess.getNodeTemplateAccess().getRightSquareBracketKeyword_12_4_4());
                    				

                    }
                    break;

            }

            // InternalToscaDsl.g:1203:4: (otherlv_51= ',' ( (lv_properties_52_0= ruleProperty ) ) (otherlv_53= ',' ( (lv_properties_54_0= ruleProperty ) ) )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==16) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalToscaDsl.g:1204:5: otherlv_51= ',' ( (lv_properties_52_0= ruleProperty ) ) (otherlv_53= ',' ( (lv_properties_54_0= ruleProperty ) ) )*
                    {
                    otherlv_51=(Token)match(input,16,FOLLOW_32); 

                    					newLeafNode(otherlv_51, grammarAccess.getNodeTemplateAccess().getCommaKeyword_12_5_0());
                    				
                    // InternalToscaDsl.g:1208:5: ( (lv_properties_52_0= ruleProperty ) )
                    // InternalToscaDsl.g:1209:6: (lv_properties_52_0= ruleProperty )
                    {
                    // InternalToscaDsl.g:1209:6: (lv_properties_52_0= ruleProperty )
                    // InternalToscaDsl.g:1210:7: lv_properties_52_0= ruleProperty
                    {

                    							newCompositeNode(grammarAccess.getNodeTemplateAccess().getPropertiesPropertyParserRuleCall_12_5_1_0());
                    						
                    pushFollow(FOLLOW_12);
                    lv_properties_52_0=ruleProperty();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getNodeTemplateRule());
                    							}
                    							add(
                    								current,
                    								"properties",
                    								lv_properties_52_0,
                    								"it.polimi.dice.dicer.ToscaDsl.Property");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalToscaDsl.g:1227:5: (otherlv_53= ',' ( (lv_properties_54_0= ruleProperty ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==16) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalToscaDsl.g:1228:6: otherlv_53= ',' ( (lv_properties_54_0= ruleProperty ) )
                    	    {
                    	    otherlv_53=(Token)match(input,16,FOLLOW_32); 

                    	    						newLeafNode(otherlv_53, grammarAccess.getNodeTemplateAccess().getCommaKeyword_12_5_2_0());
                    	    					
                    	    // InternalToscaDsl.g:1232:6: ( (lv_properties_54_0= ruleProperty ) )
                    	    // InternalToscaDsl.g:1233:7: (lv_properties_54_0= ruleProperty )
                    	    {
                    	    // InternalToscaDsl.g:1233:7: (lv_properties_54_0= ruleProperty )
                    	    // InternalToscaDsl.g:1234:8: lv_properties_54_0= ruleProperty
                    	    {

                    	    								newCompositeNode(grammarAccess.getNodeTemplateAccess().getPropertiesPropertyParserRuleCall_12_5_2_1_0());
                    	    							
                    	    pushFollow(FOLLOW_12);
                    	    lv_properties_54_0=ruleProperty();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getNodeTemplateRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"properties",
                    	    									lv_properties_54_0,
                    	    									"it.polimi.dice.dicer.ToscaDsl.Property");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            otherlv_55=(Token)match(input,19,FOLLOW_36); 

            			newLeafNode(otherlv_55, grammarAccess.getNodeTemplateAccess().getRightCurlyBracketKeyword_13());
            		
            // InternalToscaDsl.g:1258:3: (otherlv_56= ',\\n\"requirements\" :' otherlv_57= '{' ( (lv_requirements_58_0= ruleRequirement ) ) (otherlv_59= ',' ( (lv_requirements_60_0= ruleRequirement ) ) )* otherlv_61= '}' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==37) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalToscaDsl.g:1259:4: otherlv_56= ',\\n\"requirements\" :' otherlv_57= '{' ( (lv_requirements_58_0= ruleRequirement ) ) (otherlv_59= ',' ( (lv_requirements_60_0= ruleRequirement ) ) )* otherlv_61= '}'
                    {
                    otherlv_56=(Token)match(input,37,FOLLOW_11); 

                    				newLeafNode(otherlv_56, grammarAccess.getNodeTemplateAccess().getRequirementsKeyword_14_0());
                    			
                    otherlv_57=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_57, grammarAccess.getNodeTemplateAccess().getLeftCurlyBracketKeyword_14_1());
                    			
                    // InternalToscaDsl.g:1267:4: ( (lv_requirements_58_0= ruleRequirement ) )
                    // InternalToscaDsl.g:1268:5: (lv_requirements_58_0= ruleRequirement )
                    {
                    // InternalToscaDsl.g:1268:5: (lv_requirements_58_0= ruleRequirement )
                    // InternalToscaDsl.g:1269:6: lv_requirements_58_0= ruleRequirement
                    {

                    						newCompositeNode(grammarAccess.getNodeTemplateAccess().getRequirementsRequirementParserRuleCall_14_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_requirements_58_0=ruleRequirement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNodeTemplateRule());
                    						}
                    						add(
                    							current,
                    							"requirements",
                    							lv_requirements_58_0,
                    							"it.polimi.dice.dicer.ToscaDsl.Requirement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalToscaDsl.g:1286:4: (otherlv_59= ',' ( (lv_requirements_60_0= ruleRequirement ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==16) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalToscaDsl.g:1287:5: otherlv_59= ',' ( (lv_requirements_60_0= ruleRequirement ) )
                    	    {
                    	    otherlv_59=(Token)match(input,16,FOLLOW_4); 

                    	    					newLeafNode(otherlv_59, grammarAccess.getNodeTemplateAccess().getCommaKeyword_14_3_0());
                    	    				
                    	    // InternalToscaDsl.g:1291:5: ( (lv_requirements_60_0= ruleRequirement ) )
                    	    // InternalToscaDsl.g:1292:6: (lv_requirements_60_0= ruleRequirement )
                    	    {
                    	    // InternalToscaDsl.g:1292:6: (lv_requirements_60_0= ruleRequirement )
                    	    // InternalToscaDsl.g:1293:7: lv_requirements_60_0= ruleRequirement
                    	    {

                    	    							newCompositeNode(grammarAccess.getNodeTemplateAccess().getRequirementsRequirementParserRuleCall_14_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_requirements_60_0=ruleRequirement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNodeTemplateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"requirements",
                    	    								lv_requirements_60_0,
                    	    								"it.polimi.dice.dicer.ToscaDsl.Requirement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    otherlv_61=(Token)match(input,19,FOLLOW_37); 

                    				newLeafNode(otherlv_61, grammarAccess.getNodeTemplateAccess().getRightCurlyBracketKeyword_14_4());
                    			

                    }
                    break;

            }

            // InternalToscaDsl.g:1316:3: (otherlv_62= ',\\n\"capabilities\" :' otherlv_63= '{' ( (lv_capabilities_64_0= ruleCapability ) ) (otherlv_65= ',' ( (lv_capabilities_66_0= ruleCapability ) ) )* otherlv_67= '}' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==38) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalToscaDsl.g:1317:4: otherlv_62= ',\\n\"capabilities\" :' otherlv_63= '{' ( (lv_capabilities_64_0= ruleCapability ) ) (otherlv_65= ',' ( (lv_capabilities_66_0= ruleCapability ) ) )* otherlv_67= '}'
                    {
                    otherlv_62=(Token)match(input,38,FOLLOW_11); 

                    				newLeafNode(otherlv_62, grammarAccess.getNodeTemplateAccess().getCapabilitiesKeyword_15_0());
                    			
                    otherlv_63=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_63, grammarAccess.getNodeTemplateAccess().getLeftCurlyBracketKeyword_15_1());
                    			
                    // InternalToscaDsl.g:1325:4: ( (lv_capabilities_64_0= ruleCapability ) )
                    // InternalToscaDsl.g:1326:5: (lv_capabilities_64_0= ruleCapability )
                    {
                    // InternalToscaDsl.g:1326:5: (lv_capabilities_64_0= ruleCapability )
                    // InternalToscaDsl.g:1327:6: lv_capabilities_64_0= ruleCapability
                    {

                    						newCompositeNode(grammarAccess.getNodeTemplateAccess().getCapabilitiesCapabilityParserRuleCall_15_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_capabilities_64_0=ruleCapability();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNodeTemplateRule());
                    						}
                    						add(
                    							current,
                    							"capabilities",
                    							lv_capabilities_64_0,
                    							"it.polimi.dice.dicer.ToscaDsl.Capability");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalToscaDsl.g:1344:4: (otherlv_65= ',' ( (lv_capabilities_66_0= ruleCapability ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==16) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalToscaDsl.g:1345:5: otherlv_65= ',' ( (lv_capabilities_66_0= ruleCapability ) )
                    	    {
                    	    otherlv_65=(Token)match(input,16,FOLLOW_4); 

                    	    					newLeafNode(otherlv_65, grammarAccess.getNodeTemplateAccess().getCommaKeyword_15_3_0());
                    	    				
                    	    // InternalToscaDsl.g:1349:5: ( (lv_capabilities_66_0= ruleCapability ) )
                    	    // InternalToscaDsl.g:1350:6: (lv_capabilities_66_0= ruleCapability )
                    	    {
                    	    // InternalToscaDsl.g:1350:6: (lv_capabilities_66_0= ruleCapability )
                    	    // InternalToscaDsl.g:1351:7: lv_capabilities_66_0= ruleCapability
                    	    {

                    	    							newCompositeNode(grammarAccess.getNodeTemplateAccess().getCapabilitiesCapabilityParserRuleCall_15_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_capabilities_66_0=ruleCapability();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNodeTemplateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"capabilities",
                    	    								lv_capabilities_66_0,
                    	    								"it.polimi.dice.dicer.ToscaDsl.Capability");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    otherlv_67=(Token)match(input,19,FOLLOW_18); 

                    				newLeafNode(otherlv_67, grammarAccess.getNodeTemplateAccess().getRightCurlyBracketKeyword_15_4());
                    			

                    }
                    break;

            }

            otherlv_68=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_68, grammarAccess.getNodeTemplateAccess().getRightCurlyBracketKeyword_16());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNodeTemplate"


    // $ANTLR start "entryRuleMonitoringProperty"
    // InternalToscaDsl.g:1382:1: entryRuleMonitoringProperty returns [EObject current=null] : iv_ruleMonitoringProperty= ruleMonitoringProperty EOF ;
    public final EObject entryRuleMonitoringProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonitoringProperty = null;


        try {
            // InternalToscaDsl.g:1382:59: (iv_ruleMonitoringProperty= ruleMonitoringProperty EOF )
            // InternalToscaDsl.g:1383:2: iv_ruleMonitoringProperty= ruleMonitoringProperty EOF
            {
             newCompositeNode(grammarAccess.getMonitoringPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMonitoringProperty=ruleMonitoringProperty();

            state._fsp--;

             current =iv_ruleMonitoringProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMonitoringProperty"


    // $ANTLR start "ruleMonitoringProperty"
    // InternalToscaDsl.g:1389:1: ruleMonitoringProperty returns [EObject current=null] : ( () ( ( (lv_enabled_1_0= '\\n \"enabled\": true' ) ) | otherlv_2= '\\n \"enabled\": false' ) (otherlv_3= ',\\n\"roles\" :' otherlv_4= '[' ( (lv_roles_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_roles_7_0= RULE_STRING ) ) )* otherlv_8= ']' )? ) ;
    public final EObject ruleMonitoringProperty() throws RecognitionException {
        EObject current = null;

        Token lv_enabled_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_roles_5_0=null;
        Token otherlv_6=null;
        Token lv_roles_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalToscaDsl.g:1395:2: ( ( () ( ( (lv_enabled_1_0= '\\n \"enabled\": true' ) ) | otherlv_2= '\\n \"enabled\": false' ) (otherlv_3= ',\\n\"roles\" :' otherlv_4= '[' ( (lv_roles_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_roles_7_0= RULE_STRING ) ) )* otherlv_8= ']' )? ) )
            // InternalToscaDsl.g:1396:2: ( () ( ( (lv_enabled_1_0= '\\n \"enabled\": true' ) ) | otherlv_2= '\\n \"enabled\": false' ) (otherlv_3= ',\\n\"roles\" :' otherlv_4= '[' ( (lv_roles_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_roles_7_0= RULE_STRING ) ) )* otherlv_8= ']' )? )
            {
            // InternalToscaDsl.g:1396:2: ( () ( ( (lv_enabled_1_0= '\\n \"enabled\": true' ) ) | otherlv_2= '\\n \"enabled\": false' ) (otherlv_3= ',\\n\"roles\" :' otherlv_4= '[' ( (lv_roles_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_roles_7_0= RULE_STRING ) ) )* otherlv_8= ']' )? )
            // InternalToscaDsl.g:1397:3: () ( ( (lv_enabled_1_0= '\\n \"enabled\": true' ) ) | otherlv_2= '\\n \"enabled\": false' ) (otherlv_3= ',\\n\"roles\" :' otherlv_4= '[' ( (lv_roles_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_roles_7_0= RULE_STRING ) ) )* otherlv_8= ']' )?
            {
            // InternalToscaDsl.g:1397:3: ()
            // InternalToscaDsl.g:1398:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMonitoringPropertyAccess().getMonitoringPropertyAction_0(),
            					current);
            			

            }

            // InternalToscaDsl.g:1404:3: ( ( (lv_enabled_1_0= '\\n \"enabled\": true' ) ) | otherlv_2= '\\n \"enabled\": false' )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==39) ) {
                alt39=1;
            }
            else if ( (LA39_0==40) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalToscaDsl.g:1405:4: ( (lv_enabled_1_0= '\\n \"enabled\": true' ) )
                    {
                    // InternalToscaDsl.g:1405:4: ( (lv_enabled_1_0= '\\n \"enabled\": true' ) )
                    // InternalToscaDsl.g:1406:5: (lv_enabled_1_0= '\\n \"enabled\": true' )
                    {
                    // InternalToscaDsl.g:1406:5: (lv_enabled_1_0= '\\n \"enabled\": true' )
                    // InternalToscaDsl.g:1407:6: lv_enabled_1_0= '\\n \"enabled\": true'
                    {
                    lv_enabled_1_0=(Token)match(input,39,FOLLOW_38); 

                    						newLeafNode(lv_enabled_1_0, grammarAccess.getMonitoringPropertyAccess().getEnabledEnabledTrueKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMonitoringPropertyRule());
                    						}
                    						setWithLastConsumed(current, "enabled", true, "\n \"enabled\": true");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalToscaDsl.g:1420:4: otherlv_2= '\\n \"enabled\": false'
                    {
                    otherlv_2=(Token)match(input,40,FOLLOW_38); 

                    				newLeafNode(otherlv_2, grammarAccess.getMonitoringPropertyAccess().getEnabledFalseKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalToscaDsl.g:1425:3: (otherlv_3= ',\\n\"roles\" :' otherlv_4= '[' ( (lv_roles_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_roles_7_0= RULE_STRING ) ) )* otherlv_8= ']' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==41) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalToscaDsl.g:1426:4: otherlv_3= ',\\n\"roles\" :' otherlv_4= '[' ( (lv_roles_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_roles_7_0= RULE_STRING ) ) )* otherlv_8= ']'
                    {
                    otherlv_3=(Token)match(input,41,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getMonitoringPropertyAccess().getRolesKeyword_2_0());
                    			
                    otherlv_4=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getMonitoringPropertyAccess().getLeftSquareBracketKeyword_2_1());
                    			
                    // InternalToscaDsl.g:1434:4: ( (lv_roles_5_0= RULE_STRING ) )
                    // InternalToscaDsl.g:1435:5: (lv_roles_5_0= RULE_STRING )
                    {
                    // InternalToscaDsl.g:1435:5: (lv_roles_5_0= RULE_STRING )
                    // InternalToscaDsl.g:1436:6: lv_roles_5_0= RULE_STRING
                    {
                    lv_roles_5_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    						newLeafNode(lv_roles_5_0, grammarAccess.getMonitoringPropertyAccess().getRolesSTRINGTerminalRuleCall_2_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMonitoringPropertyRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"roles",
                    							lv_roles_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalToscaDsl.g:1452:4: (otherlv_6= ',' ( (lv_roles_7_0= RULE_STRING ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==16) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalToscaDsl.g:1453:5: otherlv_6= ',' ( (lv_roles_7_0= RULE_STRING ) )
                    	    {
                    	    otherlv_6=(Token)match(input,16,FOLLOW_4); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getMonitoringPropertyAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalToscaDsl.g:1457:5: ( (lv_roles_7_0= RULE_STRING ) )
                    	    // InternalToscaDsl.g:1458:6: (lv_roles_7_0= RULE_STRING )
                    	    {
                    	    // InternalToscaDsl.g:1458:6: (lv_roles_7_0= RULE_STRING )
                    	    // InternalToscaDsl.g:1459:7: lv_roles_7_0= RULE_STRING
                    	    {
                    	    lv_roles_7_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    	    							newLeafNode(lv_roles_7_0, grammarAccess.getMonitoringPropertyAccess().getRolesSTRINGTerminalRuleCall_2_3_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getMonitoringPropertyRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"roles",
                    	    								lv_roles_7_0,
                    	    								"org.eclipse.xtext.common.Terminals.STRING");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getMonitoringPropertyAccess().getRightSquareBracketKeyword_2_4());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMonitoringProperty"


    // $ANTLR start "entryRuleFirewallRule"
    // InternalToscaDsl.g:1485:1: entryRuleFirewallRule returns [EObject current=null] : iv_ruleFirewallRule= ruleFirewallRule EOF ;
    public final EObject entryRuleFirewallRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFirewallRule = null;


        try {
            // InternalToscaDsl.g:1485:53: (iv_ruleFirewallRule= ruleFirewallRule EOF )
            // InternalToscaDsl.g:1486:2: iv_ruleFirewallRule= ruleFirewallRule EOF
            {
             newCompositeNode(grammarAccess.getFirewallRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFirewallRule=ruleFirewallRule();

            state._fsp--;

             current =iv_ruleFirewallRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFirewallRule"


    // $ANTLR start "ruleFirewallRule"
    // InternalToscaDsl.g:1492:1: ruleFirewallRule returns [EObject current=null] : ( () otherlv_1= '{' otherlv_2= '\"remote_ip_prefix\": ' ( (lv_remote_ip_prefix_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= '\"port\": ' ( (lv_port_6_0= RULE_STRING ) ) otherlv_7= '}' ) ;
    public final EObject ruleFirewallRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_remote_ip_prefix_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_port_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalToscaDsl.g:1498:2: ( ( () otherlv_1= '{' otherlv_2= '\"remote_ip_prefix\": ' ( (lv_remote_ip_prefix_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= '\"port\": ' ( (lv_port_6_0= RULE_STRING ) ) otherlv_7= '}' ) )
            // InternalToscaDsl.g:1499:2: ( () otherlv_1= '{' otherlv_2= '\"remote_ip_prefix\": ' ( (lv_remote_ip_prefix_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= '\"port\": ' ( (lv_port_6_0= RULE_STRING ) ) otherlv_7= '}' )
            {
            // InternalToscaDsl.g:1499:2: ( () otherlv_1= '{' otherlv_2= '\"remote_ip_prefix\": ' ( (lv_remote_ip_prefix_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= '\"port\": ' ( (lv_port_6_0= RULE_STRING ) ) otherlv_7= '}' )
            // InternalToscaDsl.g:1500:3: () otherlv_1= '{' otherlv_2= '\"remote_ip_prefix\": ' ( (lv_remote_ip_prefix_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= '\"port\": ' ( (lv_port_6_0= RULE_STRING ) ) otherlv_7= '}'
            {
            // InternalToscaDsl.g:1500:3: ()
            // InternalToscaDsl.g:1501:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFirewallRuleAccess().getFirewallRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getFirewallRuleAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,42,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getFirewallRuleAccess().getRemote_ip_prefixKeyword_2());
            		
            // InternalToscaDsl.g:1515:3: ( (lv_remote_ip_prefix_3_0= RULE_STRING ) )
            // InternalToscaDsl.g:1516:4: (lv_remote_ip_prefix_3_0= RULE_STRING )
            {
            // InternalToscaDsl.g:1516:4: (lv_remote_ip_prefix_3_0= RULE_STRING )
            // InternalToscaDsl.g:1517:5: lv_remote_ip_prefix_3_0= RULE_STRING
            {
            lv_remote_ip_prefix_3_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

            					newLeafNode(lv_remote_ip_prefix_3_0, grammarAccess.getFirewallRuleAccess().getRemote_ip_prefixSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFirewallRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"remote_ip_prefix",
            						lv_remote_ip_prefix_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_41); 

            			newLeafNode(otherlv_4, grammarAccess.getFirewallRuleAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,43,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getFirewallRuleAccess().getPortKeyword_5());
            		
            // InternalToscaDsl.g:1541:3: ( (lv_port_6_0= RULE_STRING ) )
            // InternalToscaDsl.g:1542:4: (lv_port_6_0= RULE_STRING )
            {
            // InternalToscaDsl.g:1542:4: (lv_port_6_0= RULE_STRING )
            // InternalToscaDsl.g:1543:5: lv_port_6_0= RULE_STRING
            {
            lv_port_6_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(lv_port_6_0, grammarAccess.getFirewallRuleAccess().getPortSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFirewallRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"port",
            						lv_port_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getFirewallRuleAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFirewallRule"


    // $ANTLR start "entryRuleConfiguration"
    // InternalToscaDsl.g:1567:1: entryRuleConfiguration returns [EObject current=null] : iv_ruleConfiguration= ruleConfiguration EOF ;
    public final EObject entryRuleConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfiguration = null;


        try {
            // InternalToscaDsl.g:1567:54: (iv_ruleConfiguration= ruleConfiguration EOF )
            // InternalToscaDsl.g:1568:2: iv_ruleConfiguration= ruleConfiguration EOF
            {
             newCompositeNode(grammarAccess.getConfigurationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfiguration=ruleConfiguration();

            state._fsp--;

             current =iv_ruleConfiguration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConfiguration"


    // $ANTLR start "ruleConfiguration"
    // InternalToscaDsl.g:1574:1: ruleConfiguration returns [EObject current=null] : ( () otherlv_1= '\\n' ( (lv_property_name_2_0= RULE_STRING ) ) otherlv_3= ':' ( (lv_value_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_property_name_2_0=null;
        Token otherlv_3=null;
        Token lv_value_4_0=null;


        	enterRule();

        try {
            // InternalToscaDsl.g:1580:2: ( ( () otherlv_1= '\\n' ( (lv_property_name_2_0= RULE_STRING ) ) otherlv_3= ':' ( (lv_value_4_0= RULE_STRING ) ) ) )
            // InternalToscaDsl.g:1581:2: ( () otherlv_1= '\\n' ( (lv_property_name_2_0= RULE_STRING ) ) otherlv_3= ':' ( (lv_value_4_0= RULE_STRING ) ) )
            {
            // InternalToscaDsl.g:1581:2: ( () otherlv_1= '\\n' ( (lv_property_name_2_0= RULE_STRING ) ) otherlv_3= ':' ( (lv_value_4_0= RULE_STRING ) ) )
            // InternalToscaDsl.g:1582:3: () otherlv_1= '\\n' ( (lv_property_name_2_0= RULE_STRING ) ) otherlv_3= ':' ( (lv_value_4_0= RULE_STRING ) )
            {
            // InternalToscaDsl.g:1582:3: ()
            // InternalToscaDsl.g:1583:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConfigurationAccess().getConfigurationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getConfigurationAccess().getControl000aKeyword_1());
            		
            // InternalToscaDsl.g:1593:3: ( (lv_property_name_2_0= RULE_STRING ) )
            // InternalToscaDsl.g:1594:4: (lv_property_name_2_0= RULE_STRING )
            {
            // InternalToscaDsl.g:1594:4: (lv_property_name_2_0= RULE_STRING )
            // InternalToscaDsl.g:1595:5: lv_property_name_2_0= RULE_STRING
            {
            lv_property_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_property_name_2_0, grammarAccess.getConfigurationAccess().getProperty_nameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConfigurationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"property_name",
            						lv_property_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getConfigurationAccess().getColonKeyword_3());
            		
            // InternalToscaDsl.g:1615:3: ( (lv_value_4_0= RULE_STRING ) )
            // InternalToscaDsl.g:1616:4: (lv_value_4_0= RULE_STRING )
            {
            // InternalToscaDsl.g:1616:4: (lv_value_4_0= RULE_STRING )
            // InternalToscaDsl.g:1617:5: lv_value_4_0= RULE_STRING
            {
            lv_value_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_4_0, grammarAccess.getConfigurationAccess().getValueSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConfigurationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConfiguration"


    // $ANTLR start "entryRuleInstances"
    // InternalToscaDsl.g:1637:1: entryRuleInstances returns [EObject current=null] : iv_ruleInstances= ruleInstances EOF ;
    public final EObject entryRuleInstances() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstances = null;


        try {
            // InternalToscaDsl.g:1637:50: (iv_ruleInstances= ruleInstances EOF )
            // InternalToscaDsl.g:1638:2: iv_ruleInstances= ruleInstances EOF
            {
             newCompositeNode(grammarAccess.getInstancesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstances=ruleInstances();

            state._fsp--;

             current =iv_ruleInstances; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstances"


    // $ANTLR start "ruleInstances"
    // InternalToscaDsl.g:1644:1: ruleInstances returns [EObject current=null] : ( () otherlv_1= '\"deploy\" :' ( (lv_deploy_2_0= RULE_INT ) ) ) ;
    public final EObject ruleInstances() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_deploy_2_0=null;


        	enterRule();

        try {
            // InternalToscaDsl.g:1650:2: ( ( () otherlv_1= '\"deploy\" :' ( (lv_deploy_2_0= RULE_INT ) ) ) )
            // InternalToscaDsl.g:1651:2: ( () otherlv_1= '\"deploy\" :' ( (lv_deploy_2_0= RULE_INT ) ) )
            {
            // InternalToscaDsl.g:1651:2: ( () otherlv_1= '\"deploy\" :' ( (lv_deploy_2_0= RULE_INT ) ) )
            // InternalToscaDsl.g:1652:3: () otherlv_1= '\"deploy\" :' ( (lv_deploy_2_0= RULE_INT ) )
            {
            // InternalToscaDsl.g:1652:3: ()
            // InternalToscaDsl.g:1653:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInstancesAccess().getInstancesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,45,FOLLOW_42); 

            			newLeafNode(otherlv_1, grammarAccess.getInstancesAccess().getDeployKeyword_1());
            		
            // InternalToscaDsl.g:1663:3: ( (lv_deploy_2_0= RULE_INT ) )
            // InternalToscaDsl.g:1664:4: (lv_deploy_2_0= RULE_INT )
            {
            // InternalToscaDsl.g:1664:4: (lv_deploy_2_0= RULE_INT )
            // InternalToscaDsl.g:1665:5: lv_deploy_2_0= RULE_INT
            {
            lv_deploy_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_deploy_2_0, grammarAccess.getInstancesAccess().getDeployINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstancesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"deploy",
            						lv_deploy_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstances"


    // $ANTLR start "entryRuleRelationship"
    // InternalToscaDsl.g:1685:1: entryRuleRelationship returns [EObject current=null] : iv_ruleRelationship= ruleRelationship EOF ;
    public final EObject entryRuleRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship = null;


        try {
            // InternalToscaDsl.g:1685:53: (iv_ruleRelationship= ruleRelationship EOF )
            // InternalToscaDsl.g:1686:2: iv_ruleRelationship= ruleRelationship EOF
            {
             newCompositeNode(grammarAccess.getRelationshipRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationship=ruleRelationship();

            state._fsp--;

             current =iv_ruleRelationship; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationship"


    // $ANTLR start "ruleRelationship"
    // InternalToscaDsl.g:1692:1: ruleRelationship returns [EObject current=null] : ( () otherlv_1= '{' otherlv_2= '\"type\" :' ( (lv_type_3_0= RULE_STRING ) ) (otherlv_4= ',\\n\"target\" :' ( (lv_target_5_0= RULE_STRING ) ) )? (otherlv_6= ',\\n\"interfaces\" :' otherlv_7= '{' ( (lv_interfaces_8_0= ruleInterface ) ) (otherlv_9= ',' ( (lv_interfaces_10_0= ruleInterface ) ) )* otherlv_11= '}' )? (otherlv_12= ',\\n\"properties\" :' otherlv_13= '{' ( (lv_properties_14_0= ruleProperty ) ) (otherlv_15= ',' ( (lv_properties_16_0= ruleProperty ) ) )* otherlv_17= '}' )? (otherlv_18= ',\\n\"source_interfaces\" :' otherlv_19= '{' ( (lv_source_interfaces_20_0= ruleInterface ) ) (otherlv_21= ',' ( (lv_source_interfaces_22_0= ruleInterface ) ) )* otherlv_23= '}' )? (otherlv_24= ',\\n\"target_iterfaces\" :' otherlv_25= '{' ( (lv_target_interfaces_26_0= ruleInterface ) ) (otherlv_27= ',' ( (lv_target_interfaces_28_0= ruleInterface ) ) )* otherlv_29= '}' )? otherlv_30= '}' ) ;
    public final EObject ruleRelationship() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_type_3_0=null;
        Token otherlv_4=null;
        Token lv_target_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        EObject lv_interfaces_8_0 = null;

        EObject lv_interfaces_10_0 = null;

        EObject lv_properties_14_0 = null;

        EObject lv_properties_16_0 = null;

        EObject lv_source_interfaces_20_0 = null;

        EObject lv_source_interfaces_22_0 = null;

        EObject lv_target_interfaces_26_0 = null;

        EObject lv_target_interfaces_28_0 = null;



        	enterRule();

        try {
            // InternalToscaDsl.g:1698:2: ( ( () otherlv_1= '{' otherlv_2= '\"type\" :' ( (lv_type_3_0= RULE_STRING ) ) (otherlv_4= ',\\n\"target\" :' ( (lv_target_5_0= RULE_STRING ) ) )? (otherlv_6= ',\\n\"interfaces\" :' otherlv_7= '{' ( (lv_interfaces_8_0= ruleInterface ) ) (otherlv_9= ',' ( (lv_interfaces_10_0= ruleInterface ) ) )* otherlv_11= '}' )? (otherlv_12= ',\\n\"properties\" :' otherlv_13= '{' ( (lv_properties_14_0= ruleProperty ) ) (otherlv_15= ',' ( (lv_properties_16_0= ruleProperty ) ) )* otherlv_17= '}' )? (otherlv_18= ',\\n\"source_interfaces\" :' otherlv_19= '{' ( (lv_source_interfaces_20_0= ruleInterface ) ) (otherlv_21= ',' ( (lv_source_interfaces_22_0= ruleInterface ) ) )* otherlv_23= '}' )? (otherlv_24= ',\\n\"target_iterfaces\" :' otherlv_25= '{' ( (lv_target_interfaces_26_0= ruleInterface ) ) (otherlv_27= ',' ( (lv_target_interfaces_28_0= ruleInterface ) ) )* otherlv_29= '}' )? otherlv_30= '}' ) )
            // InternalToscaDsl.g:1699:2: ( () otherlv_1= '{' otherlv_2= '\"type\" :' ( (lv_type_3_0= RULE_STRING ) ) (otherlv_4= ',\\n\"target\" :' ( (lv_target_5_0= RULE_STRING ) ) )? (otherlv_6= ',\\n\"interfaces\" :' otherlv_7= '{' ( (lv_interfaces_8_0= ruleInterface ) ) (otherlv_9= ',' ( (lv_interfaces_10_0= ruleInterface ) ) )* otherlv_11= '}' )? (otherlv_12= ',\\n\"properties\" :' otherlv_13= '{' ( (lv_properties_14_0= ruleProperty ) ) (otherlv_15= ',' ( (lv_properties_16_0= ruleProperty ) ) )* otherlv_17= '}' )? (otherlv_18= ',\\n\"source_interfaces\" :' otherlv_19= '{' ( (lv_source_interfaces_20_0= ruleInterface ) ) (otherlv_21= ',' ( (lv_source_interfaces_22_0= ruleInterface ) ) )* otherlv_23= '}' )? (otherlv_24= ',\\n\"target_iterfaces\" :' otherlv_25= '{' ( (lv_target_interfaces_26_0= ruleInterface ) ) (otherlv_27= ',' ( (lv_target_interfaces_28_0= ruleInterface ) ) )* otherlv_29= '}' )? otherlv_30= '}' )
            {
            // InternalToscaDsl.g:1699:2: ( () otherlv_1= '{' otherlv_2= '\"type\" :' ( (lv_type_3_0= RULE_STRING ) ) (otherlv_4= ',\\n\"target\" :' ( (lv_target_5_0= RULE_STRING ) ) )? (otherlv_6= ',\\n\"interfaces\" :' otherlv_7= '{' ( (lv_interfaces_8_0= ruleInterface ) ) (otherlv_9= ',' ( (lv_interfaces_10_0= ruleInterface ) ) )* otherlv_11= '}' )? (otherlv_12= ',\\n\"properties\" :' otherlv_13= '{' ( (lv_properties_14_0= ruleProperty ) ) (otherlv_15= ',' ( (lv_properties_16_0= ruleProperty ) ) )* otherlv_17= '}' )? (otherlv_18= ',\\n\"source_interfaces\" :' otherlv_19= '{' ( (lv_source_interfaces_20_0= ruleInterface ) ) (otherlv_21= ',' ( (lv_source_interfaces_22_0= ruleInterface ) ) )* otherlv_23= '}' )? (otherlv_24= ',\\n\"target_iterfaces\" :' otherlv_25= '{' ( (lv_target_interfaces_26_0= ruleInterface ) ) (otherlv_27= ',' ( (lv_target_interfaces_28_0= ruleInterface ) ) )* otherlv_29= '}' )? otherlv_30= '}' )
            // InternalToscaDsl.g:1700:3: () otherlv_1= '{' otherlv_2= '\"type\" :' ( (lv_type_3_0= RULE_STRING ) ) (otherlv_4= ',\\n\"target\" :' ( (lv_target_5_0= RULE_STRING ) ) )? (otherlv_6= ',\\n\"interfaces\" :' otherlv_7= '{' ( (lv_interfaces_8_0= ruleInterface ) ) (otherlv_9= ',' ( (lv_interfaces_10_0= ruleInterface ) ) )* otherlv_11= '}' )? (otherlv_12= ',\\n\"properties\" :' otherlv_13= '{' ( (lv_properties_14_0= ruleProperty ) ) (otherlv_15= ',' ( (lv_properties_16_0= ruleProperty ) ) )* otherlv_17= '}' )? (otherlv_18= ',\\n\"source_interfaces\" :' otherlv_19= '{' ( (lv_source_interfaces_20_0= ruleInterface ) ) (otherlv_21= ',' ( (lv_source_interfaces_22_0= ruleInterface ) ) )* otherlv_23= '}' )? (otherlv_24= ',\\n\"target_iterfaces\" :' otherlv_25= '{' ( (lv_target_interfaces_26_0= ruleInterface ) ) (otherlv_27= ',' ( (lv_target_interfaces_28_0= ruleInterface ) ) )* otherlv_29= '}' )? otherlv_30= '}'
            {
            // InternalToscaDsl.g:1700:3: ()
            // InternalToscaDsl.g:1701:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRelationshipAccess().getRelationshipAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getRelationshipAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getRelationshipAccess().getTypeKeyword_2());
            		
            // InternalToscaDsl.g:1715:3: ( (lv_type_3_0= RULE_STRING ) )
            // InternalToscaDsl.g:1716:4: (lv_type_3_0= RULE_STRING )
            {
            // InternalToscaDsl.g:1716:4: (lv_type_3_0= RULE_STRING )
            // InternalToscaDsl.g:1717:5: lv_type_3_0= RULE_STRING
            {
            lv_type_3_0=(Token)match(input,RULE_STRING,FOLLOW_43); 

            					newLeafNode(lv_type_3_0, grammarAccess.getRelationshipAccess().getTypeSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationshipRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalToscaDsl.g:1733:3: (otherlv_4= ',\\n\"target\" :' ( (lv_target_5_0= RULE_STRING ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==46) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalToscaDsl.g:1734:4: otherlv_4= ',\\n\"target\" :' ( (lv_target_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,46,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getRelationshipAccess().getTargetKeyword_4_0());
                    			
                    // InternalToscaDsl.g:1738:4: ( (lv_target_5_0= RULE_STRING ) )
                    // InternalToscaDsl.g:1739:5: (lv_target_5_0= RULE_STRING )
                    {
                    // InternalToscaDsl.g:1739:5: (lv_target_5_0= RULE_STRING )
                    // InternalToscaDsl.g:1740:6: lv_target_5_0= RULE_STRING
                    {
                    lv_target_5_0=(Token)match(input,RULE_STRING,FOLLOW_44); 

                    						newLeafNode(lv_target_5_0, grammarAccess.getRelationshipAccess().getTargetSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRelationshipRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"target",
                    							lv_target_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalToscaDsl.g:1757:3: (otherlv_6= ',\\n\"interfaces\" :' otherlv_7= '{' ( (lv_interfaces_8_0= ruleInterface ) ) (otherlv_9= ',' ( (lv_interfaces_10_0= ruleInterface ) ) )* otherlv_11= '}' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==30) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalToscaDsl.g:1758:4: otherlv_6= ',\\n\"interfaces\" :' otherlv_7= '{' ( (lv_interfaces_8_0= ruleInterface ) ) (otherlv_9= ',' ( (lv_interfaces_10_0= ruleInterface ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,30,FOLLOW_11); 

                    				newLeafNode(otherlv_6, grammarAccess.getRelationshipAccess().getInterfacesKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getRelationshipAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalToscaDsl.g:1766:4: ( (lv_interfaces_8_0= ruleInterface ) )
                    // InternalToscaDsl.g:1767:5: (lv_interfaces_8_0= ruleInterface )
                    {
                    // InternalToscaDsl.g:1767:5: (lv_interfaces_8_0= ruleInterface )
                    // InternalToscaDsl.g:1768:6: lv_interfaces_8_0= ruleInterface
                    {

                    						newCompositeNode(grammarAccess.getRelationshipAccess().getInterfacesInterfaceParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_interfaces_8_0=ruleInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRelationshipRule());
                    						}
                    						add(
                    							current,
                    							"interfaces",
                    							lv_interfaces_8_0,
                    							"it.polimi.dice.dicer.ToscaDsl.Interface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalToscaDsl.g:1785:4: (otherlv_9= ',' ( (lv_interfaces_10_0= ruleInterface ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==16) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalToscaDsl.g:1786:5: otherlv_9= ',' ( (lv_interfaces_10_0= ruleInterface ) )
                    	    {
                    	    otherlv_9=(Token)match(input,16,FOLLOW_4); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getRelationshipAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalToscaDsl.g:1790:5: ( (lv_interfaces_10_0= ruleInterface ) )
                    	    // InternalToscaDsl.g:1791:6: (lv_interfaces_10_0= ruleInterface )
                    	    {
                    	    // InternalToscaDsl.g:1791:6: (lv_interfaces_10_0= ruleInterface )
                    	    // InternalToscaDsl.g:1792:7: lv_interfaces_10_0= ruleInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getRelationshipAccess().getInterfacesInterfaceParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_interfaces_10_0=ruleInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRelationshipRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"interfaces",
                    	    								lv_interfaces_10_0,
                    	    								"it.polimi.dice.dicer.ToscaDsl.Interface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,19,FOLLOW_45); 

                    				newLeafNode(otherlv_11, grammarAccess.getRelationshipAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalToscaDsl.g:1815:3: (otherlv_12= ',\\n\"properties\" :' otherlv_13= '{' ( (lv_properties_14_0= ruleProperty ) ) (otherlv_15= ',' ( (lv_properties_16_0= ruleProperty ) ) )* otherlv_17= '}' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==31) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalToscaDsl.g:1816:4: otherlv_12= ',\\n\"properties\" :' otherlv_13= '{' ( (lv_properties_14_0= ruleProperty ) ) (otherlv_15= ',' ( (lv_properties_16_0= ruleProperty ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,31,FOLLOW_11); 

                    				newLeafNode(otherlv_12, grammarAccess.getRelationshipAccess().getPropertiesKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,11,FOLLOW_32); 

                    				newLeafNode(otherlv_13, grammarAccess.getRelationshipAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalToscaDsl.g:1824:4: ( (lv_properties_14_0= ruleProperty ) )
                    // InternalToscaDsl.g:1825:5: (lv_properties_14_0= ruleProperty )
                    {
                    // InternalToscaDsl.g:1825:5: (lv_properties_14_0= ruleProperty )
                    // InternalToscaDsl.g:1826:6: lv_properties_14_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getRelationshipAccess().getPropertiesPropertyParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_properties_14_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRelationshipRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_14_0,
                    							"it.polimi.dice.dicer.ToscaDsl.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalToscaDsl.g:1843:4: (otherlv_15= ',' ( (lv_properties_16_0= ruleProperty ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==16) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalToscaDsl.g:1844:5: otherlv_15= ',' ( (lv_properties_16_0= ruleProperty ) )
                    	    {
                    	    otherlv_15=(Token)match(input,16,FOLLOW_32); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getRelationshipAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalToscaDsl.g:1848:5: ( (lv_properties_16_0= ruleProperty ) )
                    	    // InternalToscaDsl.g:1849:6: (lv_properties_16_0= ruleProperty )
                    	    {
                    	    // InternalToscaDsl.g:1849:6: (lv_properties_16_0= ruleProperty )
                    	    // InternalToscaDsl.g:1850:7: lv_properties_16_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getRelationshipAccess().getPropertiesPropertyParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_properties_16_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRelationshipRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_16_0,
                    	    								"it.polimi.dice.dicer.ToscaDsl.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,19,FOLLOW_46); 

                    				newLeafNode(otherlv_17, grammarAccess.getRelationshipAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalToscaDsl.g:1873:3: (otherlv_18= ',\\n\"source_interfaces\" :' otherlv_19= '{' ( (lv_source_interfaces_20_0= ruleInterface ) ) (otherlv_21= ',' ( (lv_source_interfaces_22_0= ruleInterface ) ) )* otherlv_23= '}' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==47) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalToscaDsl.g:1874:4: otherlv_18= ',\\n\"source_interfaces\" :' otherlv_19= '{' ( (lv_source_interfaces_20_0= ruleInterface ) ) (otherlv_21= ',' ( (lv_source_interfaces_22_0= ruleInterface ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,47,FOLLOW_11); 

                    				newLeafNode(otherlv_18, grammarAccess.getRelationshipAccess().getSource_interfacesKeyword_7_0());
                    			
                    otherlv_19=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_19, grammarAccess.getRelationshipAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalToscaDsl.g:1882:4: ( (lv_source_interfaces_20_0= ruleInterface ) )
                    // InternalToscaDsl.g:1883:5: (lv_source_interfaces_20_0= ruleInterface )
                    {
                    // InternalToscaDsl.g:1883:5: (lv_source_interfaces_20_0= ruleInterface )
                    // InternalToscaDsl.g:1884:6: lv_source_interfaces_20_0= ruleInterface
                    {

                    						newCompositeNode(grammarAccess.getRelationshipAccess().getSource_interfacesInterfaceParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_source_interfaces_20_0=ruleInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRelationshipRule());
                    						}
                    						add(
                    							current,
                    							"source_interfaces",
                    							lv_source_interfaces_20_0,
                    							"it.polimi.dice.dicer.ToscaDsl.Interface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalToscaDsl.g:1901:4: (otherlv_21= ',' ( (lv_source_interfaces_22_0= ruleInterface ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==16) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalToscaDsl.g:1902:5: otherlv_21= ',' ( (lv_source_interfaces_22_0= ruleInterface ) )
                    	    {
                    	    otherlv_21=(Token)match(input,16,FOLLOW_4); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getRelationshipAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalToscaDsl.g:1906:5: ( (lv_source_interfaces_22_0= ruleInterface ) )
                    	    // InternalToscaDsl.g:1907:6: (lv_source_interfaces_22_0= ruleInterface )
                    	    {
                    	    // InternalToscaDsl.g:1907:6: (lv_source_interfaces_22_0= ruleInterface )
                    	    // InternalToscaDsl.g:1908:7: lv_source_interfaces_22_0= ruleInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getRelationshipAccess().getSource_interfacesInterfaceParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_source_interfaces_22_0=ruleInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRelationshipRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"source_interfaces",
                    	    								lv_source_interfaces_22_0,
                    	    								"it.polimi.dice.dicer.ToscaDsl.Interface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,19,FOLLOW_47); 

                    				newLeafNode(otherlv_23, grammarAccess.getRelationshipAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalToscaDsl.g:1931:3: (otherlv_24= ',\\n\"target_iterfaces\" :' otherlv_25= '{' ( (lv_target_interfaces_26_0= ruleInterface ) ) (otherlv_27= ',' ( (lv_target_interfaces_28_0= ruleInterface ) ) )* otherlv_29= '}' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==48) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalToscaDsl.g:1932:4: otherlv_24= ',\\n\"target_iterfaces\" :' otherlv_25= '{' ( (lv_target_interfaces_26_0= ruleInterface ) ) (otherlv_27= ',' ( (lv_target_interfaces_28_0= ruleInterface ) ) )* otherlv_29= '}'
                    {
                    otherlv_24=(Token)match(input,48,FOLLOW_11); 

                    				newLeafNode(otherlv_24, grammarAccess.getRelationshipAccess().getTarget_iterfacesKeyword_8_0());
                    			
                    otherlv_25=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_25, grammarAccess.getRelationshipAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalToscaDsl.g:1940:4: ( (lv_target_interfaces_26_0= ruleInterface ) )
                    // InternalToscaDsl.g:1941:5: (lv_target_interfaces_26_0= ruleInterface )
                    {
                    // InternalToscaDsl.g:1941:5: (lv_target_interfaces_26_0= ruleInterface )
                    // InternalToscaDsl.g:1942:6: lv_target_interfaces_26_0= ruleInterface
                    {

                    						newCompositeNode(grammarAccess.getRelationshipAccess().getTarget_interfacesInterfaceParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_target_interfaces_26_0=ruleInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRelationshipRule());
                    						}
                    						add(
                    							current,
                    							"target_interfaces",
                    							lv_target_interfaces_26_0,
                    							"it.polimi.dice.dicer.ToscaDsl.Interface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalToscaDsl.g:1959:4: (otherlv_27= ',' ( (lv_target_interfaces_28_0= ruleInterface ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==16) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalToscaDsl.g:1960:5: otherlv_27= ',' ( (lv_target_interfaces_28_0= ruleInterface ) )
                    	    {
                    	    otherlv_27=(Token)match(input,16,FOLLOW_4); 

                    	    					newLeafNode(otherlv_27, grammarAccess.getRelationshipAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalToscaDsl.g:1964:5: ( (lv_target_interfaces_28_0= ruleInterface ) )
                    	    // InternalToscaDsl.g:1965:6: (lv_target_interfaces_28_0= ruleInterface )
                    	    {
                    	    // InternalToscaDsl.g:1965:6: (lv_target_interfaces_28_0= ruleInterface )
                    	    // InternalToscaDsl.g:1966:7: lv_target_interfaces_28_0= ruleInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getRelationshipAccess().getTarget_interfacesInterfaceParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_target_interfaces_28_0=ruleInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRelationshipRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"target_interfaces",
                    	    								lv_target_interfaces_28_0,
                    	    								"it.polimi.dice.dicer.ToscaDsl.Interface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,19,FOLLOW_18); 

                    				newLeafNode(otherlv_29, grammarAccess.getRelationshipAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_30=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_30, grammarAccess.getRelationshipAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationship"


    // $ANTLR start "entryRuleGroup"
    // InternalToscaDsl.g:1997:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // InternalToscaDsl.g:1997:46: (iv_ruleGroup= ruleGroup EOF )
            // InternalToscaDsl.g:1998:2: iv_ruleGroup= ruleGroup EOF
            {
             newCompositeNode(grammarAccess.getGroupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGroup=ruleGroup();

            state._fsp--;

             current =iv_ruleGroup; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGroup"


    // $ANTLR start "ruleGroup"
    // InternalToscaDsl.g:2004:1: ruleGroup returns [EObject current=null] : ( () ( (lv_group_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= '\"type\" :' ( (lv_type_5_0= RULE_STRING ) ) (otherlv_6= ',\\n\"description\" :' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= ',\\n\"targets\" :' otherlv_9= '{' ( (lv_targets_10_0= ruleEString ) ) (otherlv_11= ',' ( (lv_targets_12_0= RULE_STRING ) ) )* otherlv_13= '}' )? (otherlv_14= ',\\n\"properties\" :' ( (lv_properties_15_0= ruleProperty ) ) )? (otherlv_16= ',\\n\"interfaces\" :' otherlv_17= '{' ( (lv_interfaces_18_0= ruleInterface ) ) (otherlv_19= ',' ( (lv_interfaces_20_0= ruleInterface ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) ;
    public final EObject ruleGroup() throws RecognitionException {
        EObject current = null;

        Token lv_group_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_type_5_0=null;
        Token otherlv_6=null;
        Token lv_description_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token lv_targets_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_targets_10_0 = null;

        EObject lv_properties_15_0 = null;

        EObject lv_interfaces_18_0 = null;

        EObject lv_interfaces_20_0 = null;



        	enterRule();

        try {
            // InternalToscaDsl.g:2010:2: ( ( () ( (lv_group_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= '\"type\" :' ( (lv_type_5_0= RULE_STRING ) ) (otherlv_6= ',\\n\"description\" :' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= ',\\n\"targets\" :' otherlv_9= '{' ( (lv_targets_10_0= ruleEString ) ) (otherlv_11= ',' ( (lv_targets_12_0= RULE_STRING ) ) )* otherlv_13= '}' )? (otherlv_14= ',\\n\"properties\" :' ( (lv_properties_15_0= ruleProperty ) ) )? (otherlv_16= ',\\n\"interfaces\" :' otherlv_17= '{' ( (lv_interfaces_18_0= ruleInterface ) ) (otherlv_19= ',' ( (lv_interfaces_20_0= ruleInterface ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) )
            // InternalToscaDsl.g:2011:2: ( () ( (lv_group_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= '\"type\" :' ( (lv_type_5_0= RULE_STRING ) ) (otherlv_6= ',\\n\"description\" :' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= ',\\n\"targets\" :' otherlv_9= '{' ( (lv_targets_10_0= ruleEString ) ) (otherlv_11= ',' ( (lv_targets_12_0= RULE_STRING ) ) )* otherlv_13= '}' )? (otherlv_14= ',\\n\"properties\" :' ( (lv_properties_15_0= ruleProperty ) ) )? (otherlv_16= ',\\n\"interfaces\" :' otherlv_17= '{' ( (lv_interfaces_18_0= ruleInterface ) ) (otherlv_19= ',' ( (lv_interfaces_20_0= ruleInterface ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            {
            // InternalToscaDsl.g:2011:2: ( () ( (lv_group_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= '\"type\" :' ( (lv_type_5_0= RULE_STRING ) ) (otherlv_6= ',\\n\"description\" :' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= ',\\n\"targets\" :' otherlv_9= '{' ( (lv_targets_10_0= ruleEString ) ) (otherlv_11= ',' ( (lv_targets_12_0= RULE_STRING ) ) )* otherlv_13= '}' )? (otherlv_14= ',\\n\"properties\" :' ( (lv_properties_15_0= ruleProperty ) ) )? (otherlv_16= ',\\n\"interfaces\" :' otherlv_17= '{' ( (lv_interfaces_18_0= ruleInterface ) ) (otherlv_19= ',' ( (lv_interfaces_20_0= ruleInterface ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            // InternalToscaDsl.g:2012:3: () ( (lv_group_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= '\"type\" :' ( (lv_type_5_0= RULE_STRING ) ) (otherlv_6= ',\\n\"description\" :' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= ',\\n\"targets\" :' otherlv_9= '{' ( (lv_targets_10_0= ruleEString ) ) (otherlv_11= ',' ( (lv_targets_12_0= RULE_STRING ) ) )* otherlv_13= '}' )? (otherlv_14= ',\\n\"properties\" :' ( (lv_properties_15_0= ruleProperty ) ) )? (otherlv_16= ',\\n\"interfaces\" :' otherlv_17= '{' ( (lv_interfaces_18_0= ruleInterface ) ) (otherlv_19= ',' ( (lv_interfaces_20_0= ruleInterface ) ) )* otherlv_21= '}' )? otherlv_22= '}'
            {
            // InternalToscaDsl.g:2012:3: ()
            // InternalToscaDsl.g:2013:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGroupAccess().getGroupAction_0(),
            					current);
            			

            }

            // InternalToscaDsl.g:2019:3: ( (lv_group_name_1_0= RULE_STRING ) )
            // InternalToscaDsl.g:2020:4: (lv_group_name_1_0= RULE_STRING )
            {
            // InternalToscaDsl.g:2020:4: (lv_group_name_1_0= RULE_STRING )
            // InternalToscaDsl.g:2021:5: lv_group_name_1_0= RULE_STRING
            {
            lv_group_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_group_name_1_0, grammarAccess.getGroupAccess().getGroup_nameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGroupRule());
            					}
            					setWithLastConsumed(
            						current,
            						"group_name",
            						lv_group_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getGroupAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,11,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getGroupAccess().getTypeKeyword_4());
            		
            // InternalToscaDsl.g:2049:3: ( (lv_type_5_0= RULE_STRING ) )
            // InternalToscaDsl.g:2050:4: (lv_type_5_0= RULE_STRING )
            {
            // InternalToscaDsl.g:2050:4: (lv_type_5_0= RULE_STRING )
            // InternalToscaDsl.g:2051:5: lv_type_5_0= RULE_STRING
            {
            lv_type_5_0=(Token)match(input,RULE_STRING,FOLLOW_48); 

            					newLeafNode(lv_type_5_0, grammarAccess.getGroupAccess().getTypeSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGroupRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalToscaDsl.g:2067:3: (otherlv_6= ',\\n\"description\" :' ( (lv_description_7_0= RULE_STRING ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==13) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalToscaDsl.g:2068:4: otherlv_6= ',\\n\"description\" :' ( (lv_description_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getGroupAccess().getDescriptionKeyword_6_0());
                    			
                    // InternalToscaDsl.g:2072:4: ( (lv_description_7_0= RULE_STRING ) )
                    // InternalToscaDsl.g:2073:5: (lv_description_7_0= RULE_STRING )
                    {
                    // InternalToscaDsl.g:2073:5: (lv_description_7_0= RULE_STRING )
                    // InternalToscaDsl.g:2074:6: lv_description_7_0= RULE_STRING
                    {
                    lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_49); 

                    						newLeafNode(lv_description_7_0, grammarAccess.getGroupAccess().getDescriptionSTRINGTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGroupRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalToscaDsl.g:2091:3: (otherlv_8= ',\\n\"targets\" :' otherlv_9= '{' ( (lv_targets_10_0= ruleEString ) ) (otherlv_11= ',' ( (lv_targets_12_0= RULE_STRING ) ) )* otherlv_13= '}' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==49) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalToscaDsl.g:2092:4: otherlv_8= ',\\n\"targets\" :' otherlv_9= '{' ( (lv_targets_10_0= ruleEString ) ) (otherlv_11= ',' ( (lv_targets_12_0= RULE_STRING ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,49,FOLLOW_11); 

                    				newLeafNode(otherlv_8, grammarAccess.getGroupAccess().getTargetsKeyword_7_0());
                    			
                    otherlv_9=(Token)match(input,11,FOLLOW_50); 

                    				newLeafNode(otherlv_9, grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalToscaDsl.g:2100:4: ( (lv_targets_10_0= ruleEString ) )
                    // InternalToscaDsl.g:2101:5: (lv_targets_10_0= ruleEString )
                    {
                    // InternalToscaDsl.g:2101:5: (lv_targets_10_0= ruleEString )
                    // InternalToscaDsl.g:2102:6: lv_targets_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGroupAccess().getTargetsEStringParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_targets_10_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGroupRule());
                    						}
                    						add(
                    							current,
                    							"targets",
                    							lv_targets_10_0,
                    							"it.polimi.dice.dicer.ToscaDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalToscaDsl.g:2119:4: (otherlv_11= ',' ( (lv_targets_12_0= RULE_STRING ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==16) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // InternalToscaDsl.g:2120:5: otherlv_11= ',' ( (lv_targets_12_0= RULE_STRING ) )
                    	    {
                    	    otherlv_11=(Token)match(input,16,FOLLOW_4); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getGroupAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalToscaDsl.g:2124:5: ( (lv_targets_12_0= RULE_STRING ) )
                    	    // InternalToscaDsl.g:2125:6: (lv_targets_12_0= RULE_STRING )
                    	    {
                    	    // InternalToscaDsl.g:2125:6: (lv_targets_12_0= RULE_STRING )
                    	    // InternalToscaDsl.g:2126:7: lv_targets_12_0= RULE_STRING
                    	    {
                    	    lv_targets_12_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

                    	    							newLeafNode(lv_targets_12_0, grammarAccess.getGroupAccess().getTargetsSTRINGTerminalRuleCall_7_3_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getGroupRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"targets",
                    	    								lv_targets_12_0,
                    	    								"org.eclipse.xtext.common.Terminals.STRING");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,19,FOLLOW_51); 

                    				newLeafNode(otherlv_13, grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalToscaDsl.g:2148:3: (otherlv_14= ',\\n\"properties\" :' ( (lv_properties_15_0= ruleProperty ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==31) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalToscaDsl.g:2149:4: otherlv_14= ',\\n\"properties\" :' ( (lv_properties_15_0= ruleProperty ) )
                    {
                    otherlv_14=(Token)match(input,31,FOLLOW_32); 

                    				newLeafNode(otherlv_14, grammarAccess.getGroupAccess().getPropertiesKeyword_8_0());
                    			
                    // InternalToscaDsl.g:2153:4: ( (lv_properties_15_0= ruleProperty ) )
                    // InternalToscaDsl.g:2154:5: (lv_properties_15_0= ruleProperty )
                    {
                    // InternalToscaDsl.g:2154:5: (lv_properties_15_0= ruleProperty )
                    // InternalToscaDsl.g:2155:6: lv_properties_15_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getGroupAccess().getPropertiesPropertyParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_52);
                    lv_properties_15_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGroupRule());
                    						}
                    						set(
                    							current,
                    							"properties",
                    							lv_properties_15_0,
                    							"it.polimi.dice.dicer.ToscaDsl.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalToscaDsl.g:2173:3: (otherlv_16= ',\\n\"interfaces\" :' otherlv_17= '{' ( (lv_interfaces_18_0= ruleInterface ) ) (otherlv_19= ',' ( (lv_interfaces_20_0= ruleInterface ) ) )* otherlv_21= '}' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==30) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalToscaDsl.g:2174:4: otherlv_16= ',\\n\"interfaces\" :' otherlv_17= '{' ( (lv_interfaces_18_0= ruleInterface ) ) (otherlv_19= ',' ( (lv_interfaces_20_0= ruleInterface ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,30,FOLLOW_11); 

                    				newLeafNode(otherlv_16, grammarAccess.getGroupAccess().getInterfacesKeyword_9_0());
                    			
                    otherlv_17=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_17, grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalToscaDsl.g:2182:4: ( (lv_interfaces_18_0= ruleInterface ) )
                    // InternalToscaDsl.g:2183:5: (lv_interfaces_18_0= ruleInterface )
                    {
                    // InternalToscaDsl.g:2183:5: (lv_interfaces_18_0= ruleInterface )
                    // InternalToscaDsl.g:2184:6: lv_interfaces_18_0= ruleInterface
                    {

                    						newCompositeNode(grammarAccess.getGroupAccess().getInterfacesInterfaceParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_interfaces_18_0=ruleInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGroupRule());
                    						}
                    						add(
                    							current,
                    							"interfaces",
                    							lv_interfaces_18_0,
                    							"it.polimi.dice.dicer.ToscaDsl.Interface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalToscaDsl.g:2201:4: (otherlv_19= ',' ( (lv_interfaces_20_0= ruleInterface ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==16) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // InternalToscaDsl.g:2202:5: otherlv_19= ',' ( (lv_interfaces_20_0= ruleInterface ) )
                    	    {
                    	    otherlv_19=(Token)match(input,16,FOLLOW_4); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getGroupAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalToscaDsl.g:2206:5: ( (lv_interfaces_20_0= ruleInterface ) )
                    	    // InternalToscaDsl.g:2207:6: (lv_interfaces_20_0= ruleInterface )
                    	    {
                    	    // InternalToscaDsl.g:2207:6: (lv_interfaces_20_0= ruleInterface )
                    	    // InternalToscaDsl.g:2208:7: lv_interfaces_20_0= ruleInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getGroupAccess().getInterfacesInterfaceParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_interfaces_20_0=ruleInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGroupRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"interfaces",
                    	    								lv_interfaces_20_0,
                    	    								"it.polimi.dice.dicer.ToscaDsl.Interface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop55;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,19,FOLLOW_18); 

                    				newLeafNode(otherlv_21, grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            otherlv_22=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGroup"


    // $ANTLR start "entryRulePolicy"
    // InternalToscaDsl.g:2239:1: entryRulePolicy returns [EObject current=null] : iv_rulePolicy= rulePolicy EOF ;
    public final EObject entryRulePolicy() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolicy = null;


        try {
            // InternalToscaDsl.g:2239:47: (iv_rulePolicy= rulePolicy EOF )
            // InternalToscaDsl.g:2240:2: iv_rulePolicy= rulePolicy EOF
            {
             newCompositeNode(grammarAccess.getPolicyRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePolicy=rulePolicy();

            state._fsp--;

             current =iv_rulePolicy; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePolicy"


    // $ANTLR start "rulePolicy"
    // InternalToscaDsl.g:2246:1: rulePolicy returns [EObject current=null] : ( () ( (lv_policy_name_1_0= RULE_STRING ) ) otherlv_2= ':' ) ;
    public final EObject rulePolicy() throws RecognitionException {
        EObject current = null;

        Token lv_policy_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalToscaDsl.g:2252:2: ( ( () ( (lv_policy_name_1_0= RULE_STRING ) ) otherlv_2= ':' ) )
            // InternalToscaDsl.g:2253:2: ( () ( (lv_policy_name_1_0= RULE_STRING ) ) otherlv_2= ':' )
            {
            // InternalToscaDsl.g:2253:2: ( () ( (lv_policy_name_1_0= RULE_STRING ) ) otherlv_2= ':' )
            // InternalToscaDsl.g:2254:3: () ( (lv_policy_name_1_0= RULE_STRING ) ) otherlv_2= ':'
            {
            // InternalToscaDsl.g:2254:3: ()
            // InternalToscaDsl.g:2255:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPolicyAccess().getPolicyAction_0(),
            					current);
            			

            }

            // InternalToscaDsl.g:2261:3: ( (lv_policy_name_1_0= RULE_STRING ) )
            // InternalToscaDsl.g:2262:4: (lv_policy_name_1_0= RULE_STRING )
            {
            // InternalToscaDsl.g:2262:4: (lv_policy_name_1_0= RULE_STRING )
            // InternalToscaDsl.g:2263:5: lv_policy_name_1_0= RULE_STRING
            {
            lv_policy_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_policy_name_1_0, grammarAccess.getPolicyAccess().getPolicy_nameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPolicyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"policy_name",
            						lv_policy_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getPolicyAccess().getColonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePolicy"


    // $ANTLR start "entryRuleInterface"
    // InternalToscaDsl.g:2287:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // InternalToscaDsl.g:2287:50: (iv_ruleInterface= ruleInterface EOF )
            // InternalToscaDsl.g:2288:2: iv_ruleInterface= ruleInterface EOF
            {
             newCompositeNode(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterface=ruleInterface();

            state._fsp--;

             current =iv_ruleInterface; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // InternalToscaDsl.g:2294:1: ruleInterface returns [EObject current=null] : ( () ( (lv_type_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' ( ( (lv_operations_4_0= ruleOperation ) ) (otherlv_5= ',' ( (lv_operations_6_0= ruleOperation ) ) )* )? otherlv_7= '}' ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_operations_4_0 = null;

        EObject lv_operations_6_0 = null;



        	enterRule();

        try {
            // InternalToscaDsl.g:2300:2: ( ( () ( (lv_type_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' ( ( (lv_operations_4_0= ruleOperation ) ) (otherlv_5= ',' ( (lv_operations_6_0= ruleOperation ) ) )* )? otherlv_7= '}' ) )
            // InternalToscaDsl.g:2301:2: ( () ( (lv_type_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' ( ( (lv_operations_4_0= ruleOperation ) ) (otherlv_5= ',' ( (lv_operations_6_0= ruleOperation ) ) )* )? otherlv_7= '}' )
            {
            // InternalToscaDsl.g:2301:2: ( () ( (lv_type_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' ( ( (lv_operations_4_0= ruleOperation ) ) (otherlv_5= ',' ( (lv_operations_6_0= ruleOperation ) ) )* )? otherlv_7= '}' )
            // InternalToscaDsl.g:2302:3: () ( (lv_type_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' ( ( (lv_operations_4_0= ruleOperation ) ) (otherlv_5= ',' ( (lv_operations_6_0= ruleOperation ) ) )* )? otherlv_7= '}'
            {
            // InternalToscaDsl.g:2302:3: ()
            // InternalToscaDsl.g:2303:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInterfaceAccess().getInterfaceAction_0(),
            					current);
            			

            }

            // InternalToscaDsl.g:2309:3: ( (lv_type_1_0= RULE_STRING ) )
            // InternalToscaDsl.g:2310:4: (lv_type_1_0= RULE_STRING )
            {
            // InternalToscaDsl.g:2310:4: (lv_type_1_0= RULE_STRING )
            // InternalToscaDsl.g:2311:5: lv_type_1_0= RULE_STRING
            {
            lv_type_1_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_type_1_0, grammarAccess.getInterfaceAccess().getTypeSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInterfaceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getInterfaceAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,11,FOLLOW_53); 

            			newLeafNode(otherlv_3, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalToscaDsl.g:2335:3: ( ( (lv_operations_4_0= ruleOperation ) ) (otherlv_5= ',' ( (lv_operations_6_0= ruleOperation ) ) )* )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_STRING) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalToscaDsl.g:2336:4: ( (lv_operations_4_0= ruleOperation ) ) (otherlv_5= ',' ( (lv_operations_6_0= ruleOperation ) ) )*
                    {
                    // InternalToscaDsl.g:2336:4: ( (lv_operations_4_0= ruleOperation ) )
                    // InternalToscaDsl.g:2337:5: (lv_operations_4_0= ruleOperation )
                    {
                    // InternalToscaDsl.g:2337:5: (lv_operations_4_0= ruleOperation )
                    // InternalToscaDsl.g:2338:6: lv_operations_4_0= ruleOperation
                    {

                    						newCompositeNode(grammarAccess.getInterfaceAccess().getOperationsOperationParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_operations_4_0=ruleOperation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInterfaceRule());
                    						}
                    						add(
                    							current,
                    							"operations",
                    							lv_operations_4_0,
                    							"it.polimi.dice.dicer.ToscaDsl.Operation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalToscaDsl.g:2355:4: (otherlv_5= ',' ( (lv_operations_6_0= ruleOperation ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==16) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // InternalToscaDsl.g:2356:5: otherlv_5= ',' ( (lv_operations_6_0= ruleOperation ) )
                    	    {
                    	    otherlv_5=(Token)match(input,16,FOLLOW_4); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getInterfaceAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalToscaDsl.g:2360:5: ( (lv_operations_6_0= ruleOperation ) )
                    	    // InternalToscaDsl.g:2361:6: (lv_operations_6_0= ruleOperation )
                    	    {
                    	    // InternalToscaDsl.g:2361:6: (lv_operations_6_0= ruleOperation )
                    	    // InternalToscaDsl.g:2362:7: lv_operations_6_0= ruleOperation
                    	    {

                    	    							newCompositeNode(grammarAccess.getInterfaceAccess().getOperationsOperationParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_operations_6_0=ruleOperation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInterfaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"operations",
                    	    								lv_operations_6_0,
                    	    								"it.polimi.dice.dicer.ToscaDsl.Operation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleProperty"
    // InternalToscaDsl.g:2389:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalToscaDsl.g:2389:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalToscaDsl.g:2390:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalToscaDsl.g:2396:1: ruleProperty returns [EObject current=null] : ( () otherlv_1= '\\n' ( (lv_property_name_2_0= RULE_STRING ) ) otherlv_3= ':' ( (lv_value_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_property_name_2_0=null;
        Token otherlv_3=null;
        Token lv_value_4_0=null;


        	enterRule();

        try {
            // InternalToscaDsl.g:2402:2: ( ( () otherlv_1= '\\n' ( (lv_property_name_2_0= RULE_STRING ) ) otherlv_3= ':' ( (lv_value_4_0= RULE_STRING ) ) ) )
            // InternalToscaDsl.g:2403:2: ( () otherlv_1= '\\n' ( (lv_property_name_2_0= RULE_STRING ) ) otherlv_3= ':' ( (lv_value_4_0= RULE_STRING ) ) )
            {
            // InternalToscaDsl.g:2403:2: ( () otherlv_1= '\\n' ( (lv_property_name_2_0= RULE_STRING ) ) otherlv_3= ':' ( (lv_value_4_0= RULE_STRING ) ) )
            // InternalToscaDsl.g:2404:3: () otherlv_1= '\\n' ( (lv_property_name_2_0= RULE_STRING ) ) otherlv_3= ':' ( (lv_value_4_0= RULE_STRING ) )
            {
            // InternalToscaDsl.g:2404:3: ()
            // InternalToscaDsl.g:2405:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPropertyAccess().getPropertyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getControl000aKeyword_1());
            		
            // InternalToscaDsl.g:2415:3: ( (lv_property_name_2_0= RULE_STRING ) )
            // InternalToscaDsl.g:2416:4: (lv_property_name_2_0= RULE_STRING )
            {
            // InternalToscaDsl.g:2416:4: (lv_property_name_2_0= RULE_STRING )
            // InternalToscaDsl.g:2417:5: lv_property_name_2_0= RULE_STRING
            {
            lv_property_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_property_name_2_0, grammarAccess.getPropertyAccess().getProperty_nameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"property_name",
            						lv_property_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getPropertyAccess().getColonKeyword_3());
            		
            // InternalToscaDsl.g:2437:3: ( (lv_value_4_0= RULE_STRING ) )
            // InternalToscaDsl.g:2438:4: (lv_value_4_0= RULE_STRING )
            {
            // InternalToscaDsl.g:2438:4: (lv_value_4_0= RULE_STRING )
            // InternalToscaDsl.g:2439:5: lv_value_4_0= RULE_STRING
            {
            lv_value_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_4_0, grammarAccess.getPropertyAccess().getValueSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleRequirement"
    // InternalToscaDsl.g:2459:1: entryRuleRequirement returns [EObject current=null] : iv_ruleRequirement= ruleRequirement EOF ;
    public final EObject entryRuleRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirement = null;


        try {
            // InternalToscaDsl.g:2459:52: (iv_ruleRequirement= ruleRequirement EOF )
            // InternalToscaDsl.g:2460:2: iv_ruleRequirement= ruleRequirement EOF
            {
             newCompositeNode(grammarAccess.getRequirementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequirement=ruleRequirement();

            state._fsp--;

             current =iv_ruleRequirement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequirement"


    // $ANTLR start "ruleRequirement"
    // InternalToscaDsl.g:2466:1: ruleRequirement returns [EObject current=null] : ( ( (lv_requirement_name_0_0= RULE_STRING ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= '\"capabiity\" :' ( (lv_capabiity_4_0= RULE_STRING ) ) (otherlv_5= ',\\n\"node\" :' ( (lv_node_6_0= RULE_STRING ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleRequirement() throws RecognitionException {
        EObject current = null;

        Token lv_requirement_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_capabiity_4_0=null;
        Token otherlv_5=null;
        Token lv_node_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalToscaDsl.g:2472:2: ( ( ( (lv_requirement_name_0_0= RULE_STRING ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= '\"capabiity\" :' ( (lv_capabiity_4_0= RULE_STRING ) ) (otherlv_5= ',\\n\"node\" :' ( (lv_node_6_0= RULE_STRING ) ) )? otherlv_7= '}' ) )
            // InternalToscaDsl.g:2473:2: ( ( (lv_requirement_name_0_0= RULE_STRING ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= '\"capabiity\" :' ( (lv_capabiity_4_0= RULE_STRING ) ) (otherlv_5= ',\\n\"node\" :' ( (lv_node_6_0= RULE_STRING ) ) )? otherlv_7= '}' )
            {
            // InternalToscaDsl.g:2473:2: ( ( (lv_requirement_name_0_0= RULE_STRING ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= '\"capabiity\" :' ( (lv_capabiity_4_0= RULE_STRING ) ) (otherlv_5= ',\\n\"node\" :' ( (lv_node_6_0= RULE_STRING ) ) )? otherlv_7= '}' )
            // InternalToscaDsl.g:2474:3: ( (lv_requirement_name_0_0= RULE_STRING ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= '\"capabiity\" :' ( (lv_capabiity_4_0= RULE_STRING ) ) (otherlv_5= ',\\n\"node\" :' ( (lv_node_6_0= RULE_STRING ) ) )? otherlv_7= '}'
            {
            // InternalToscaDsl.g:2474:3: ( (lv_requirement_name_0_0= RULE_STRING ) )
            // InternalToscaDsl.g:2475:4: (lv_requirement_name_0_0= RULE_STRING )
            {
            // InternalToscaDsl.g:2475:4: (lv_requirement_name_0_0= RULE_STRING )
            // InternalToscaDsl.g:2476:5: lv_requirement_name_0_0= RULE_STRING
            {
            lv_requirement_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_requirement_name_0_0, grammarAccess.getRequirementAccess().getRequirement_nameSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequirementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"requirement_name",
            						lv_requirement_name_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getRequirementAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_54); 

            			newLeafNode(otherlv_2, grammarAccess.getRequirementAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,50,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getRequirementAccess().getCapabiityKeyword_3());
            		
            // InternalToscaDsl.g:2504:3: ( (lv_capabiity_4_0= RULE_STRING ) )
            // InternalToscaDsl.g:2505:4: (lv_capabiity_4_0= RULE_STRING )
            {
            // InternalToscaDsl.g:2505:4: (lv_capabiity_4_0= RULE_STRING )
            // InternalToscaDsl.g:2506:5: lv_capabiity_4_0= RULE_STRING
            {
            lv_capabiity_4_0=(Token)match(input,RULE_STRING,FOLLOW_55); 

            					newLeafNode(lv_capabiity_4_0, grammarAccess.getRequirementAccess().getCapabiitySTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequirementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"capabiity",
            						lv_capabiity_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalToscaDsl.g:2522:3: (otherlv_5= ',\\n\"node\" :' ( (lv_node_6_0= RULE_STRING ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==51) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalToscaDsl.g:2523:4: otherlv_5= ',\\n\"node\" :' ( (lv_node_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,51,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getRequirementAccess().getNodeKeyword_5_0());
                    			
                    // InternalToscaDsl.g:2527:4: ( (lv_node_6_0= RULE_STRING ) )
                    // InternalToscaDsl.g:2528:5: (lv_node_6_0= RULE_STRING )
                    {
                    // InternalToscaDsl.g:2528:5: (lv_node_6_0= RULE_STRING )
                    // InternalToscaDsl.g:2529:6: lv_node_6_0= RULE_STRING
                    {
                    lv_node_6_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

                    						newLeafNode(lv_node_6_0, grammarAccess.getRequirementAccess().getNodeSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRequirementRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"node",
                    							lv_node_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getRequirementAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequirement"


    // $ANTLR start "entryRuleCapability"
    // InternalToscaDsl.g:2554:1: entryRuleCapability returns [EObject current=null] : iv_ruleCapability= ruleCapability EOF ;
    public final EObject entryRuleCapability() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCapability = null;


        try {
            // InternalToscaDsl.g:2554:51: (iv_ruleCapability= ruleCapability EOF )
            // InternalToscaDsl.g:2555:2: iv_ruleCapability= ruleCapability EOF
            {
             newCompositeNode(grammarAccess.getCapabilityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCapability=ruleCapability();

            state._fsp--;

             current =iv_ruleCapability; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCapability"


    // $ANTLR start "ruleCapability"
    // InternalToscaDsl.g:2561:1: ruleCapability returns [EObject current=null] : ( ( (lv_capability_name_0_0= RULE_STRING ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= '\"type\" :' ( (lv_type_4_0= RULE_STRING ) ) (otherlv_5= ',\\n\"description\" :' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= ',\\n\"properties\" :' otherlv_8= '{' ( (lv_properties_9_0= ruleProperty ) ) (otherlv_10= ',' ( (lv_properties_11_0= ruleProperty ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) ;
    public final EObject ruleCapability() throws RecognitionException {
        EObject current = null;

        Token lv_capability_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_type_4_0=null;
        Token otherlv_5=null;
        Token lv_description_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_properties_9_0 = null;

        EObject lv_properties_11_0 = null;



        	enterRule();

        try {
            // InternalToscaDsl.g:2567:2: ( ( ( (lv_capability_name_0_0= RULE_STRING ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= '\"type\" :' ( (lv_type_4_0= RULE_STRING ) ) (otherlv_5= ',\\n\"description\" :' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= ',\\n\"properties\" :' otherlv_8= '{' ( (lv_properties_9_0= ruleProperty ) ) (otherlv_10= ',' ( (lv_properties_11_0= ruleProperty ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) )
            // InternalToscaDsl.g:2568:2: ( ( (lv_capability_name_0_0= RULE_STRING ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= '\"type\" :' ( (lv_type_4_0= RULE_STRING ) ) (otherlv_5= ',\\n\"description\" :' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= ',\\n\"properties\" :' otherlv_8= '{' ( (lv_properties_9_0= ruleProperty ) ) (otherlv_10= ',' ( (lv_properties_11_0= ruleProperty ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            {
            // InternalToscaDsl.g:2568:2: ( ( (lv_capability_name_0_0= RULE_STRING ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= '\"type\" :' ( (lv_type_4_0= RULE_STRING ) ) (otherlv_5= ',\\n\"description\" :' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= ',\\n\"properties\" :' otherlv_8= '{' ( (lv_properties_9_0= ruleProperty ) ) (otherlv_10= ',' ( (lv_properties_11_0= ruleProperty ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            // InternalToscaDsl.g:2569:3: ( (lv_capability_name_0_0= RULE_STRING ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= '\"type\" :' ( (lv_type_4_0= RULE_STRING ) ) (otherlv_5= ',\\n\"description\" :' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= ',\\n\"properties\" :' otherlv_8= '{' ( (lv_properties_9_0= ruleProperty ) ) (otherlv_10= ',' ( (lv_properties_11_0= ruleProperty ) ) )* otherlv_12= '}' )? otherlv_13= '}'
            {
            // InternalToscaDsl.g:2569:3: ( (lv_capability_name_0_0= RULE_STRING ) )
            // InternalToscaDsl.g:2570:4: (lv_capability_name_0_0= RULE_STRING )
            {
            // InternalToscaDsl.g:2570:4: (lv_capability_name_0_0= RULE_STRING )
            // InternalToscaDsl.g:2571:5: lv_capability_name_0_0= RULE_STRING
            {
            lv_capability_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_capability_name_0_0, grammarAccess.getCapabilityAccess().getCapability_nameSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCapabilityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"capability_name",
            						lv_capability_name_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getCapabilityAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getCapabilityAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getCapabilityAccess().getTypeKeyword_3());
            		
            // InternalToscaDsl.g:2599:3: ( (lv_type_4_0= RULE_STRING ) )
            // InternalToscaDsl.g:2600:4: (lv_type_4_0= RULE_STRING )
            {
            // InternalToscaDsl.g:2600:4: (lv_type_4_0= RULE_STRING )
            // InternalToscaDsl.g:2601:5: lv_type_4_0= RULE_STRING
            {
            lv_type_4_0=(Token)match(input,RULE_STRING,FOLLOW_56); 

            					newLeafNode(lv_type_4_0, grammarAccess.getCapabilityAccess().getTypeSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCapabilityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalToscaDsl.g:2617:3: (otherlv_5= ',\\n\"description\" :' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==13) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalToscaDsl.g:2618:4: otherlv_5= ',\\n\"description\" :' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getCapabilityAccess().getDescriptionKeyword_5_0());
                    			
                    // InternalToscaDsl.g:2622:4: ( (lv_description_6_0= RULE_STRING ) )
                    // InternalToscaDsl.g:2623:5: (lv_description_6_0= RULE_STRING )
                    {
                    // InternalToscaDsl.g:2623:5: (lv_description_6_0= RULE_STRING )
                    // InternalToscaDsl.g:2624:6: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_57); 

                    						newLeafNode(lv_description_6_0, grammarAccess.getCapabilityAccess().getDescriptionSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCapabilityRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalToscaDsl.g:2641:3: (otherlv_7= ',\\n\"properties\" :' otherlv_8= '{' ( (lv_properties_9_0= ruleProperty ) ) (otherlv_10= ',' ( (lv_properties_11_0= ruleProperty ) ) )* otherlv_12= '}' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==31) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalToscaDsl.g:2642:4: otherlv_7= ',\\n\"properties\" :' otherlv_8= '{' ( (lv_properties_9_0= ruleProperty ) ) (otherlv_10= ',' ( (lv_properties_11_0= ruleProperty ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,31,FOLLOW_11); 

                    				newLeafNode(otherlv_7, grammarAccess.getCapabilityAccess().getPropertiesKeyword_6_0());
                    			
                    otherlv_8=(Token)match(input,11,FOLLOW_32); 

                    				newLeafNode(otherlv_8, grammarAccess.getCapabilityAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalToscaDsl.g:2650:4: ( (lv_properties_9_0= ruleProperty ) )
                    // InternalToscaDsl.g:2651:5: (lv_properties_9_0= ruleProperty )
                    {
                    // InternalToscaDsl.g:2651:5: (lv_properties_9_0= ruleProperty )
                    // InternalToscaDsl.g:2652:6: lv_properties_9_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getCapabilityAccess().getPropertiesPropertyParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_properties_9_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCapabilityRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_9_0,
                    							"it.polimi.dice.dicer.ToscaDsl.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalToscaDsl.g:2669:4: (otherlv_10= ',' ( (lv_properties_11_0= ruleProperty ) ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==16) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // InternalToscaDsl.g:2670:5: otherlv_10= ',' ( (lv_properties_11_0= ruleProperty ) )
                    	    {
                    	    otherlv_10=(Token)match(input,16,FOLLOW_32); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getCapabilityAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalToscaDsl.g:2674:5: ( (lv_properties_11_0= ruleProperty ) )
                    	    // InternalToscaDsl.g:2675:6: (lv_properties_11_0= ruleProperty )
                    	    {
                    	    // InternalToscaDsl.g:2675:6: (lv_properties_11_0= ruleProperty )
                    	    // InternalToscaDsl.g:2676:7: lv_properties_11_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getCapabilityAccess().getPropertiesPropertyParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_properties_11_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCapabilityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_11_0,
                    	    								"it.polimi.dice.dicer.ToscaDsl.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop61;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,19,FOLLOW_18); 

                    				newLeafNode(otherlv_12, grammarAccess.getCapabilityAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_13=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getCapabilityAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCapability"


    // $ANTLR start "entryRuleOperation"
    // InternalToscaDsl.g:2707:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalToscaDsl.g:2707:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalToscaDsl.g:2708:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalToscaDsl.g:2714:1: ruleOperation returns [EObject current=null] : ( () ( (lv_operation_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' (otherlv_4= '\\n\"inputs\" :' otherlv_5= '{' ( (lv_inputs_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_inputs_8_0= ruleProperty ) ) )* (otherlv_9= ',\\n\"resources\" :' otherlv_10= '[' ( (lv_dependentArtifacts_11_0= RULE_STRING ) ) (otherlv_12= ', ' ( (lv_dependentArtifacts_13_0= RULE_STRING ) ) )* otherlv_14= ']' )? otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token lv_operation_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_dependentArtifacts_11_0=null;
        Token otherlv_12=null;
        Token lv_dependentArtifacts_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        EObject lv_inputs_6_0 = null;

        EObject lv_inputs_8_0 = null;



        	enterRule();

        try {
            // InternalToscaDsl.g:2720:2: ( ( () ( (lv_operation_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' (otherlv_4= '\\n\"inputs\" :' otherlv_5= '{' ( (lv_inputs_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_inputs_8_0= ruleProperty ) ) )* (otherlv_9= ',\\n\"resources\" :' otherlv_10= '[' ( (lv_dependentArtifacts_11_0= RULE_STRING ) ) (otherlv_12= ', ' ( (lv_dependentArtifacts_13_0= RULE_STRING ) ) )* otherlv_14= ']' )? otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalToscaDsl.g:2721:2: ( () ( (lv_operation_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' (otherlv_4= '\\n\"inputs\" :' otherlv_5= '{' ( (lv_inputs_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_inputs_8_0= ruleProperty ) ) )* (otherlv_9= ',\\n\"resources\" :' otherlv_10= '[' ( (lv_dependentArtifacts_11_0= RULE_STRING ) ) (otherlv_12= ', ' ( (lv_dependentArtifacts_13_0= RULE_STRING ) ) )* otherlv_14= ']' )? otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalToscaDsl.g:2721:2: ( () ( (lv_operation_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' (otherlv_4= '\\n\"inputs\" :' otherlv_5= '{' ( (lv_inputs_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_inputs_8_0= ruleProperty ) ) )* (otherlv_9= ',\\n\"resources\" :' otherlv_10= '[' ( (lv_dependentArtifacts_11_0= RULE_STRING ) ) (otherlv_12= ', ' ( (lv_dependentArtifacts_13_0= RULE_STRING ) ) )* otherlv_14= ']' )? otherlv_15= '}' )? otherlv_16= '}' )
            // InternalToscaDsl.g:2722:3: () ( (lv_operation_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' (otherlv_4= '\\n\"inputs\" :' otherlv_5= '{' ( (lv_inputs_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_inputs_8_0= ruleProperty ) ) )* (otherlv_9= ',\\n\"resources\" :' otherlv_10= '[' ( (lv_dependentArtifacts_11_0= RULE_STRING ) ) (otherlv_12= ', ' ( (lv_dependentArtifacts_13_0= RULE_STRING ) ) )* otherlv_14= ']' )? otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalToscaDsl.g:2722:3: ()
            // InternalToscaDsl.g:2723:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOperationAccess().getOperationAction_0(),
            					current);
            			

            }

            // InternalToscaDsl.g:2729:3: ( (lv_operation_name_1_0= RULE_STRING ) )
            // InternalToscaDsl.g:2730:4: (lv_operation_name_1_0= RULE_STRING )
            {
            // InternalToscaDsl.g:2730:4: (lv_operation_name_1_0= RULE_STRING )
            // InternalToscaDsl.g:2731:5: lv_operation_name_1_0= RULE_STRING
            {
            lv_operation_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_operation_name_1_0, grammarAccess.getOperationAccess().getOperation_nameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"operation_name",
            						lv_operation_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getOperationAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,11,FOLLOW_58); 

            			newLeafNode(otherlv_3, grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalToscaDsl.g:2755:3: (otherlv_4= '\\n\"inputs\" :' otherlv_5= '{' ( (lv_inputs_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_inputs_8_0= ruleProperty ) ) )* (otherlv_9= ',\\n\"resources\" :' otherlv_10= '[' ( (lv_dependentArtifacts_11_0= RULE_STRING ) ) (otherlv_12= ', ' ( (lv_dependentArtifacts_13_0= RULE_STRING ) ) )* otherlv_14= ']' )? otherlv_15= '}' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==52) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalToscaDsl.g:2756:4: otherlv_4= '\\n\"inputs\" :' otherlv_5= '{' ( (lv_inputs_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_inputs_8_0= ruleProperty ) ) )* (otherlv_9= ',\\n\"resources\" :' otherlv_10= '[' ( (lv_dependentArtifacts_11_0= RULE_STRING ) ) (otherlv_12= ', ' ( (lv_dependentArtifacts_13_0= RULE_STRING ) ) )* otherlv_14= ']' )? otherlv_15= '}'
                    {
                    otherlv_4=(Token)match(input,52,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getOperationAccess().getInputsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,11,FOLLOW_32); 

                    				newLeafNode(otherlv_5, grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalToscaDsl.g:2764:4: ( (lv_inputs_6_0= ruleProperty ) )
                    // InternalToscaDsl.g:2765:5: (lv_inputs_6_0= ruleProperty )
                    {
                    // InternalToscaDsl.g:2765:5: (lv_inputs_6_0= ruleProperty )
                    // InternalToscaDsl.g:2766:6: lv_inputs_6_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getOperationAccess().getInputsPropertyParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_59);
                    lv_inputs_6_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOperationRule());
                    						}
                    						add(
                    							current,
                    							"inputs",
                    							lv_inputs_6_0,
                    							"it.polimi.dice.dicer.ToscaDsl.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalToscaDsl.g:2783:4: (otherlv_7= ',' ( (lv_inputs_8_0= ruleProperty ) ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==16) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // InternalToscaDsl.g:2784:5: otherlv_7= ',' ( (lv_inputs_8_0= ruleProperty ) )
                    	    {
                    	    otherlv_7=(Token)match(input,16,FOLLOW_32); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getOperationAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalToscaDsl.g:2788:5: ( (lv_inputs_8_0= ruleProperty ) )
                    	    // InternalToscaDsl.g:2789:6: (lv_inputs_8_0= ruleProperty )
                    	    {
                    	    // InternalToscaDsl.g:2789:6: (lv_inputs_8_0= ruleProperty )
                    	    // InternalToscaDsl.g:2790:7: lv_inputs_8_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getOperationAccess().getInputsPropertyParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_59);
                    	    lv_inputs_8_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOperationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"inputs",
                    	    								lv_inputs_8_0,
                    	    								"it.polimi.dice.dicer.ToscaDsl.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop63;
                        }
                    } while (true);

                    // InternalToscaDsl.g:2808:4: (otherlv_9= ',\\n\"resources\" :' otherlv_10= '[' ( (lv_dependentArtifacts_11_0= RULE_STRING ) ) (otherlv_12= ', ' ( (lv_dependentArtifacts_13_0= RULE_STRING ) ) )* otherlv_14= ']' )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==34) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // InternalToscaDsl.g:2809:5: otherlv_9= ',\\n\"resources\" :' otherlv_10= '[' ( (lv_dependentArtifacts_11_0= RULE_STRING ) ) (otherlv_12= ', ' ( (lv_dependentArtifacts_13_0= RULE_STRING ) ) )* otherlv_14= ']'
                            {
                            otherlv_9=(Token)match(input,34,FOLLOW_7); 

                            					newLeafNode(otherlv_9, grammarAccess.getOperationAccess().getResourcesKeyword_4_4_0());
                            				
                            otherlv_10=(Token)match(input,15,FOLLOW_4); 

                            					newLeafNode(otherlv_10, grammarAccess.getOperationAccess().getLeftSquareBracketKeyword_4_4_1());
                            				
                            // InternalToscaDsl.g:2817:5: ( (lv_dependentArtifacts_11_0= RULE_STRING ) )
                            // InternalToscaDsl.g:2818:6: (lv_dependentArtifacts_11_0= RULE_STRING )
                            {
                            // InternalToscaDsl.g:2818:6: (lv_dependentArtifacts_11_0= RULE_STRING )
                            // InternalToscaDsl.g:2819:7: lv_dependentArtifacts_11_0= RULE_STRING
                            {
                            lv_dependentArtifacts_11_0=(Token)match(input,RULE_STRING,FOLLOW_60); 

                            							newLeafNode(lv_dependentArtifacts_11_0, grammarAccess.getOperationAccess().getDependentArtifactsSTRINGTerminalRuleCall_4_4_2_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getOperationRule());
                            							}
                            							addWithLastConsumed(
                            								current,
                            								"dependentArtifacts",
                            								lv_dependentArtifacts_11_0,
                            								"org.eclipse.xtext.common.Terminals.STRING");
                            						

                            }


                            }

                            // InternalToscaDsl.g:2835:5: (otherlv_12= ', ' ( (lv_dependentArtifacts_13_0= RULE_STRING ) ) )*
                            loop64:
                            do {
                                int alt64=2;
                                int LA64_0 = input.LA(1);

                                if ( (LA64_0==53) ) {
                                    alt64=1;
                                }


                                switch (alt64) {
                            	case 1 :
                            	    // InternalToscaDsl.g:2836:6: otherlv_12= ', ' ( (lv_dependentArtifacts_13_0= RULE_STRING ) )
                            	    {
                            	    otherlv_12=(Token)match(input,53,FOLLOW_4); 

                            	    						newLeafNode(otherlv_12, grammarAccess.getOperationAccess().getCommaSpaceKeyword_4_4_3_0());
                            	    					
                            	    // InternalToscaDsl.g:2840:6: ( (lv_dependentArtifacts_13_0= RULE_STRING ) )
                            	    // InternalToscaDsl.g:2841:7: (lv_dependentArtifacts_13_0= RULE_STRING )
                            	    {
                            	    // InternalToscaDsl.g:2841:7: (lv_dependentArtifacts_13_0= RULE_STRING )
                            	    // InternalToscaDsl.g:2842:8: lv_dependentArtifacts_13_0= RULE_STRING
                            	    {
                            	    lv_dependentArtifacts_13_0=(Token)match(input,RULE_STRING,FOLLOW_60); 

                            	    								newLeafNode(lv_dependentArtifacts_13_0, grammarAccess.getOperationAccess().getDependentArtifactsSTRINGTerminalRuleCall_4_4_3_1_0());
                            	    							

                            	    								if (current==null) {
                            	    									current = createModelElement(grammarAccess.getOperationRule());
                            	    								}
                            	    								addWithLastConsumed(
                            	    									current,
                            	    									"dependentArtifacts",
                            	    									lv_dependentArtifacts_13_0,
                            	    									"org.eclipse.xtext.common.Terminals.STRING");
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop64;
                                }
                            } while (true);

                            otherlv_14=(Token)match(input,17,FOLLOW_18); 

                            					newLeafNode(otherlv_14, grammarAccess.getOperationAccess().getRightSquareBracketKeyword_4_4_4());
                            				

                            }
                            break;

                    }

                    otherlv_15=(Token)match(input,19,FOLLOW_18); 

                    				newLeafNode(otherlv_15, grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_4_5());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleValue"
    // InternalToscaDsl.g:2877:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalToscaDsl.g:2877:46: (iv_ruleValue= ruleValue EOF )
            // InternalToscaDsl.g:2878:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalToscaDsl.g:2884:1: ruleValue returns [EObject current=null] : (this_Value_Impl_0= ruleValue_Impl | this_Expression_Impl_1= ruleExpression_Impl | this_SimpleValue_2= ruleSimpleValue | this_GetAttribute_3= ruleGetAttribute ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_Value_Impl_0 = null;

        EObject this_Expression_Impl_1 = null;

        EObject this_SimpleValue_2 = null;

        EObject this_GetAttribute_3 = null;



        	enterRule();

        try {
            // InternalToscaDsl.g:2890:2: ( (this_Value_Impl_0= ruleValue_Impl | this_Expression_Impl_1= ruleExpression_Impl | this_SimpleValue_2= ruleSimpleValue | this_GetAttribute_3= ruleGetAttribute ) )
            // InternalToscaDsl.g:2891:2: (this_Value_Impl_0= ruleValue_Impl | this_Expression_Impl_1= ruleExpression_Impl | this_SimpleValue_2= ruleSimpleValue | this_GetAttribute_3= ruleGetAttribute )
            {
            // InternalToscaDsl.g:2891:2: (this_Value_Impl_0= ruleValue_Impl | this_Expression_Impl_1= ruleExpression_Impl | this_SimpleValue_2= ruleSimpleValue | this_GetAttribute_3= ruleGetAttribute )
            int alt67=4;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt67=1;
                }
                break;
            case 55:
                {
                alt67=2;
                }
                break;
            case RULE_STRING:
                {
                alt67=3;
                }
                break;
            case 11:
                {
                alt67=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }

            switch (alt67) {
                case 1 :
                    // InternalToscaDsl.g:2892:3: this_Value_Impl_0= ruleValue_Impl
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getValue_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Value_Impl_0=ruleValue_Impl();

                    state._fsp--;


                    			current = this_Value_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalToscaDsl.g:2901:3: this_Expression_Impl_1= ruleExpression_Impl
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getExpression_ImplParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Expression_Impl_1=ruleExpression_Impl();

                    state._fsp--;


                    			current = this_Expression_Impl_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalToscaDsl.g:2910:3: this_SimpleValue_2= ruleSimpleValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getSimpleValueParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleValue_2=ruleSimpleValue();

                    state._fsp--;


                    			current = this_SimpleValue_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalToscaDsl.g:2919:3: this_GetAttribute_3= ruleGetAttribute
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getGetAttributeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_GetAttribute_3=ruleGetAttribute();

                    state._fsp--;


                    			current = this_GetAttribute_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleArgument"
    // InternalToscaDsl.g:2931:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // InternalToscaDsl.g:2931:49: (iv_ruleArgument= ruleArgument EOF )
            // InternalToscaDsl.g:2932:2: iv_ruleArgument= ruleArgument EOF
            {
             newCompositeNode(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArgument=ruleArgument();

            state._fsp--;

             current =iv_ruleArgument; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArgument"


    // $ANTLR start "ruleArgument"
    // InternalToscaDsl.g:2938:1: ruleArgument returns [EObject current=null] : ( (lv_argument_value_0_0= ruleValue ) ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        EObject lv_argument_value_0_0 = null;



        	enterRule();

        try {
            // InternalToscaDsl.g:2944:2: ( ( (lv_argument_value_0_0= ruleValue ) ) )
            // InternalToscaDsl.g:2945:2: ( (lv_argument_value_0_0= ruleValue ) )
            {
            // InternalToscaDsl.g:2945:2: ( (lv_argument_value_0_0= ruleValue ) )
            // InternalToscaDsl.g:2946:3: (lv_argument_value_0_0= ruleValue )
            {
            // InternalToscaDsl.g:2946:3: (lv_argument_value_0_0= ruleValue )
            // InternalToscaDsl.g:2947:4: lv_argument_value_0_0= ruleValue
            {

            				newCompositeNode(grammarAccess.getArgumentAccess().getArgument_valueValueParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_argument_value_0_0=ruleValue();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getArgumentRule());
            				}
            				set(
            					current,
            					"argument_value",
            					lv_argument_value_0_0,
            					"it.polimi.dice.dicer.ToscaDsl.Value");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArgument"


    // $ANTLR start "entryRuleValue_Impl"
    // InternalToscaDsl.g:2967:1: entryRuleValue_Impl returns [EObject current=null] : iv_ruleValue_Impl= ruleValue_Impl EOF ;
    public final EObject entryRuleValue_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue_Impl = null;


        try {
            // InternalToscaDsl.g:2967:51: (iv_ruleValue_Impl= ruleValue_Impl EOF )
            // InternalToscaDsl.g:2968:2: iv_ruleValue_Impl= ruleValue_Impl EOF
            {
             newCompositeNode(grammarAccess.getValue_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue_Impl=ruleValue_Impl();

            state._fsp--;

             current =iv_ruleValue_Impl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValue_Impl"


    // $ANTLR start "ruleValue_Impl"
    // InternalToscaDsl.g:2974:1: ruleValue_Impl returns [EObject current=null] : ( () otherlv_1= 'Value' ) ;
    public final EObject ruleValue_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalToscaDsl.g:2980:2: ( ( () otherlv_1= 'Value' ) )
            // InternalToscaDsl.g:2981:2: ( () otherlv_1= 'Value' )
            {
            // InternalToscaDsl.g:2981:2: ( () otherlv_1= 'Value' )
            // InternalToscaDsl.g:2982:3: () otherlv_1= 'Value'
            {
            // InternalToscaDsl.g:2982:3: ()
            // InternalToscaDsl.g:2983:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getValue_ImplAccess().getValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,54,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getValue_ImplAccess().getValueKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValue_Impl"


    // $ANTLR start "entryRuleExpression_Impl"
    // InternalToscaDsl.g:2997:1: entryRuleExpression_Impl returns [EObject current=null] : iv_ruleExpression_Impl= ruleExpression_Impl EOF ;
    public final EObject entryRuleExpression_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression_Impl = null;


        try {
            // InternalToscaDsl.g:2997:56: (iv_ruleExpression_Impl= ruleExpression_Impl EOF )
            // InternalToscaDsl.g:2998:2: iv_ruleExpression_Impl= ruleExpression_Impl EOF
            {
             newCompositeNode(grammarAccess.getExpression_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression_Impl=ruleExpression_Impl();

            state._fsp--;

             current =iv_ruleExpression_Impl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression_Impl"


    // $ANTLR start "ruleExpression_Impl"
    // InternalToscaDsl.g:3004:1: ruleExpression_Impl returns [EObject current=null] : ( () otherlv_1= 'Expression' ) ;
    public final EObject ruleExpression_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalToscaDsl.g:3010:2: ( ( () otherlv_1= 'Expression' ) )
            // InternalToscaDsl.g:3011:2: ( () otherlv_1= 'Expression' )
            {
            // InternalToscaDsl.g:3011:2: ( () otherlv_1= 'Expression' )
            // InternalToscaDsl.g:3012:3: () otherlv_1= 'Expression'
            {
            // InternalToscaDsl.g:3012:3: ()
            // InternalToscaDsl.g:3013:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExpression_ImplAccess().getExpressionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,55,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getExpression_ImplAccess().getExpressionKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression_Impl"


    // $ANTLR start "entryRuleSimpleValue"
    // InternalToscaDsl.g:3027:1: entryRuleSimpleValue returns [EObject current=null] : iv_ruleSimpleValue= ruleSimpleValue EOF ;
    public final EObject entryRuleSimpleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleValue = null;


        try {
            // InternalToscaDsl.g:3027:52: (iv_ruleSimpleValue= ruleSimpleValue EOF )
            // InternalToscaDsl.g:3028:2: iv_ruleSimpleValue= ruleSimpleValue EOF
            {
             newCompositeNode(grammarAccess.getSimpleValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleValue=ruleSimpleValue();

            state._fsp--;

             current =iv_ruleSimpleValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleValue"


    // $ANTLR start "ruleSimpleValue"
    // InternalToscaDsl.g:3034:1: ruleSimpleValue returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleSimpleValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalToscaDsl.g:3040:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalToscaDsl.g:3041:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalToscaDsl.g:3041:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalToscaDsl.g:3042:3: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // InternalToscaDsl.g:3042:3: ()
            // InternalToscaDsl.g:3043:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSimpleValueAccess().getSimpleValueAction_0(),
            					current);
            			

            }

            // InternalToscaDsl.g:3049:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalToscaDsl.g:3050:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalToscaDsl.g:3050:4: (lv_value_1_0= RULE_STRING )
            // InternalToscaDsl.g:3051:5: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getSimpleValueAccess().getValueSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSimpleValueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleValue"


    // $ANTLR start "entryRuleGetAttribute"
    // InternalToscaDsl.g:3071:1: entryRuleGetAttribute returns [EObject current=null] : iv_ruleGetAttribute= ruleGetAttribute EOF ;
    public final EObject entryRuleGetAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetAttribute = null;


        try {
            // InternalToscaDsl.g:3071:53: (iv_ruleGetAttribute= ruleGetAttribute EOF )
            // InternalToscaDsl.g:3072:2: iv_ruleGetAttribute= ruleGetAttribute EOF
            {
             newCompositeNode(grammarAccess.getGetAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGetAttribute=ruleGetAttribute();

            state._fsp--;

             current =iv_ruleGetAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGetAttribute"


    // $ANTLR start "ruleGetAttribute"
    // InternalToscaDsl.g:3078:1: ruleGetAttribute returns [EObject current=null] : ( () otherlv_1= '{' otherlv_2= '\"get_attribute\":' otherlv_3= '[' ( (lv_node_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_attribute_6_0= RULE_STRING ) ) otherlv_7= ']' otherlv_8= '}' ) ;
    public final EObject ruleGetAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_node_4_0=null;
        Token otherlv_5=null;
        Token lv_attribute_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalToscaDsl.g:3084:2: ( ( () otherlv_1= '{' otherlv_2= '\"get_attribute\":' otherlv_3= '[' ( (lv_node_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_attribute_6_0= RULE_STRING ) ) otherlv_7= ']' otherlv_8= '}' ) )
            // InternalToscaDsl.g:3085:2: ( () otherlv_1= '{' otherlv_2= '\"get_attribute\":' otherlv_3= '[' ( (lv_node_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_attribute_6_0= RULE_STRING ) ) otherlv_7= ']' otherlv_8= '}' )
            {
            // InternalToscaDsl.g:3085:2: ( () otherlv_1= '{' otherlv_2= '\"get_attribute\":' otherlv_3= '[' ( (lv_node_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_attribute_6_0= RULE_STRING ) ) otherlv_7= ']' otherlv_8= '}' )
            // InternalToscaDsl.g:3086:3: () otherlv_1= '{' otherlv_2= '\"get_attribute\":' otherlv_3= '[' ( (lv_node_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_attribute_6_0= RULE_STRING ) ) otherlv_7= ']' otherlv_8= '}'
            {
            // InternalToscaDsl.g:3086:3: ()
            // InternalToscaDsl.g:3087:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGetAttributeAccess().getGetAttributeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_61); 

            			newLeafNode(otherlv_1, grammarAccess.getGetAttributeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,56,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getGetAttributeAccess().getGet_attributeKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getGetAttributeAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalToscaDsl.g:3105:3: ( (lv_node_4_0= RULE_STRING ) )
            // InternalToscaDsl.g:3106:4: (lv_node_4_0= RULE_STRING )
            {
            // InternalToscaDsl.g:3106:4: (lv_node_4_0= RULE_STRING )
            // InternalToscaDsl.g:3107:5: lv_node_4_0= RULE_STRING
            {
            lv_node_4_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

            					newLeafNode(lv_node_4_0, grammarAccess.getGetAttributeAccess().getNodeSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGetAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"node",
            						lv_node_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getGetAttributeAccess().getCommaKeyword_5());
            		
            // InternalToscaDsl.g:3127:3: ( (lv_attribute_6_0= RULE_STRING ) )
            // InternalToscaDsl.g:3128:4: (lv_attribute_6_0= RULE_STRING )
            {
            // InternalToscaDsl.g:3128:4: (lv_attribute_6_0= RULE_STRING )
            // InternalToscaDsl.g:3129:5: lv_attribute_6_0= RULE_STRING
            {
            lv_attribute_6_0=(Token)match(input,RULE_STRING,FOLLOW_62); 

            					newLeafNode(lv_attribute_6_0, grammarAccess.getGetAttributeAccess().getAttributeSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGetAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"attribute",
            						lv_attribute_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,17,FOLLOW_18); 

            			newLeafNode(otherlv_7, grammarAccess.getGetAttributeAccess().getRightSquareBracketKeyword_7());
            		
            otherlv_8=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getGetAttributeAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGetAttribute"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001FC6000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001FC4000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000030010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001FC0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001F80000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001E80000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001C80000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001880000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00C0000000000810L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000F0002000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000000E0002000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001F00090000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001E00090000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001C00090000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001800090000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001000090000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000006000080000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000004000080000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0001C000C0080000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x00018000C0080000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0001800080080000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0001800000080000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0001000000080000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x00020000C0082000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x00020000C0080000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x00000000C0080000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0008000000080000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000080082000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000080080000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0010000000080000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000400090000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0020000000020000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000020000L});

}