/*
 * generated by Xtext 2.28.0
 */
package br.edu.unijui.gca.jabuti.generator

import br.edu.unijui.gca.jabuti.generator.entities.StructVar
import br.edu.unijui.gca.jabuti.generator.entities.VarExpr
import br.edu.unijui.gca.jabuti.generator.entities.VarTerm
import br.edu.unijui.gca.jabuti.generator.entities.terms.TermStruct
import br.edu.unijui.gca.jabuti.generator.entities.terms.TimeInterval_S
import br.edu.unijui.gca.jabuti.generator.entities.terms.MaxNumberOfOperationByTime_S
import br.edu.unijui.gca.jabuti.generator.entities.terms.MaxNumberOfOperation_S
import br.edu.unijui.gca.jabuti.generator.entities.terms.MessageContent_Boolean_S
import br.edu.unijui.gca.jabuti.generator.entities.terms.MessageContent_Number_PerTime_S
import br.edu.unijui.gca.jabuti.generator.entities.terms.MessageContent_Number_S
import br.edu.unijui.gca.jabuti.generator.entities.terms.MessageContent_String_S
import br.edu.unijui.gca.jabuti.generator.entities.terms.MessageContent_onlyXPath_Boolean_S
import br.edu.unijui.gca.jabuti.generator.entities.terms.MessageContent_onlyXPath_Number_S
import br.edu.unijui.gca.jabuti.generator.entities.terms.MessageContent_onlyXPath_String_S
import br.edu.unijui.gca.jabuti.generator.entities.terms.SessionInterval_S
import br.edu.unijui.gca.jabuti.generator.entities.terms.Timeout_S
//imports from Jabuti DSL
import br.edu.unijui.gca.jabuti.jabuti.BinaryOperator
import br.edu.unijui.gca.jabuti.jabuti.BinaryTermOperator
import br.edu.unijui.gca.jabuti.jabuti.Clause
import br.edu.unijui.gca.jabuti.jabuti.ConditionalExpression
import br.edu.unijui.gca.jabuti.jabuti.Contract
import br.edu.unijui.gca.jabuti.jabuti.DataType
import br.edu.unijui.gca.jabuti.jabuti.Expression
import br.edu.unijui.gca.jabuti.jabuti.ExpressionTerm
import br.edu.unijui.gca.jabuti.jabuti.LiteralValue
import br.edu.unijui.gca.jabuti.jabuti.MaxNumberOfOperation
import br.edu.unijui.gca.jabuti.jabuti.MessageContent
import br.edu.unijui.gca.jabuti.jabuti.NumericValue
import br.edu.unijui.gca.jabuti.jabuti.ParenthesizedExpression
import br.edu.unijui.gca.jabuti.jabuti.StringValue
import br.edu.unijui.gca.jabuti.jabuti.Term
import br.edu.unijui.gca.jabuti.jabuti.UnaryOperator
import br.edu.unijui.gca.jabuti.jabuti.UnaryTermOperator
import br.edu.unijui.gca.jabuti.jabuti.VariableValue
//imports from Java
import java.text.SimpleDateFormat
import java.util.ArrayList
import java.util.LinkedHashMap
import java.util.List
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import br.edu.unijui.gca.jabuti.jabuti.SessionInterval
import br.edu.unijui.gca.jabuti.jabuti.TimeInterval
// import of data libraries
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.LocalDate;
import br.edu.unijui.gca.jabuti.jabuti.Timeout
import br.edu.unijui.gca.jabuti.jabuti.WeekDaysInterval
import br.edu.unijui.gca.jabuti.generator.entities.terms.WeekDaysInterval_S
import br.edu.unijui.gca.jabuti.jabuti.Variable

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class JabutiGenerator extends AbstractGenerator {

//	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
////		fsa.generateFile('greetings.txt', 'People to greet: ' + 
////			resource.allContents
////				.filter(Greeting)
////				.map[name]
////				.join(', '))
//	}
	static var comparison_symbols = newArrayList
	static var logical_symbols = newArrayList
	static var math_symbols = newArrayList
	static var unary_symbols = newArrayList
	ArrayList<ClauseStruct> clauses

	LinkedHashMap<String, StructVar> variablesMap
	ArrayList<String> exprContent_temp
//	String exprVarName_temp	
	int counter;
//	ArrayList<String> terms = newArrayList
	ArrayList<String> termsTypesInUse = newArrayList

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for (c : resource.allContents.filter(Contract).toIterable) {
			fsa.generateFile(c.name + '.sol', generateSolCode(c))
		}

	}

	def generateSolCode(Contract ct) {

		comparison_symbols.addAll(#["<=", ">=", ">", "<", "!=", "=="])
		logical_symbols.addAll(#["AND", "OR"])
		math_symbols.addAll(#["+", "-", "*", "/"])
		unary_symbols.addAll(#["-", "!"])
		// variables_map.clear
		exprContent_temp = new ArrayList<String>
		variablesMap = new LinkedHashMap<String, StructVar>
		clauses = new ArrayList<ClauseStruct>

		if (ct !== null) {
			resetCounter // define um contador de clausula como zero, dentro do mapping ele será incrementado
			for (c : ct.clauses) {
				this.mappingClauses(c)
			}
			resetCounter // voltar o valor de counter para zero
			for (v : ct.variables) {
				if (v.term !== null) {
					v.term.getVariableContent_Term(v.name)
				} else if (v.expression !== null) {
					v.expression.getVariable_ExpressionType(v.name)
				}
			}

			getTheTypesOfTermsInUse // this method populate the arraylist termsTypesInUse
		}

//			«FOR c : ct.clauses»					
//					«mappingClauses(c)»
//				«ENDFOR»	
		'''
//SPDX-License-Identifier: MIT
pragma solidity ^0.8.14;
import "./libs/EAI_Domain.sol";

contract «ct.name» is EAI_Domain{
«"\n"»
«"\t"»uint32 beginDate; 
«"\t"»uint32 dueDate; 	
«"\t"»using EAI for EAI.Party;

«"\t"»EAI.Party application;
«"\t"»EAI.Party process;
«"\t"»mapping(address=>EAI.Party) mapParty;

«"\t"»event failEvent(string _logMessage);
«"\t"»event successEvent(string _logMessage);

/* --------------------------- END: commom code for all contracts ----------------------- */  

/* =========== BEGIN: codes generated based in specific jabuti contract =================== */
«IF ct !== null»

/*----------------- 1º STEP: ADD IMPORTS TO THE TERMS USED IN THE CONTRACT ---------------*/
 	«FOR t: termsTypesInUse»
 		using EAI for EAI.«t.removeTermSuffix»;
 	«ENDFOR»	
 	
/*-------------- 2º STEP: Create the variables (from variables and terms block) -------------------------*/		
	«FOR v : variablesMap.values»
		«IF v instanceof VarTerm»
			EAI.«v.type.removeTermSuffix» «v.name»;
		«ELSE»
			«v.type» «v.name»;
		«ENDIF»
	«ENDFOR»

/*---------------- 3º STEP: Identify and create variables referring to the clauses terms --------------*/  
	«FOR clause : clauses»
	
		//---------------- Vectors of terms related to the «clause.name» clause(_C«clause.id»). ---------------- 
		«FOR termType: clause.termsMap.keySet»			
			«"EAI."+termType.removeTermSuffix+"[]"» «termType.removeTermSuffix.toFirstLower+"_C"+ clause.id»;
		«ENDFOR»
	«ENDFOR»

/*---------------- 4º STEP: Create the constructor method ------------------------------------------*/

	constructor(address _applicationWallet){
		activated = true;
		// Catch the date from jabuti contract 
		beginDate = «ct.beginDate.toTimestamp»;
		dueDate = «ct.beginDate.toTimestamp»;
		// Catch the name of the part for create the parties
		application = EAI.createParty("«ct.application.name»", _applicationWallet, false);             
		process = EAI.createParty("«ct.process.name»", msg.sender, true);    
		mapParty[msg.sender] = process;
		mapParty[_applicationWallet] = application;

		// Create the terms of the clauses, (check if some of them use a variable from variable block)

	«««instanciar os variariaveis, atribuir os valores»»
	«FOR v : ct.variables»
		«IF v.term !== null»			
			«"\t"»«"\t"»«v.name» = «"EAI.create"+variablesMap.get(v.name).type.removeTermSuffix+"("+buildCode_addParameters(variablesMap.get(v.name).type, (variablesMap.get(v.name) as VarTerm).term)+"))"»;	
		«ELSEIF v.expression !== null»
			«"\t"»«"\t"»«v.name» = «(variablesMap.get(v.name) as VarExpr).content.join("")»;
		«ENDIF»
	«ENDFOR»
«««instanciar os termos e adicionar ao vetor das respectivas clausulas»»
	 «resetCounter»«««zera a variavel counter»
	«FOR clause : clauses»
	
	«incrementCounter»
			//---------------- Terms related to the «clause.name» clause (C«clause.id»). ----------------
		«FOR type: clause.termsMap.keySet»
			«FOR term: clause.getTerms(type)»
				«"\t"»«type.removeTermSuffix.toFirstLower+"_C"+counter+".push(EAI.create"+type.removeTermSuffix+"("+buildCode_addParameters(type, term)+"))"»;
			«ENDFOR»
		«ENDFOR»
	«ENDFOR»
	«resetCounter»
	}
	«««FIM DO METODO CONSTRUTOR»»
«ENDIF»	

/* -------------- END: codes generated based in specific jabuti contract ------------- 

/* --------------------------- END: code for all contracts ----------------------- */
'''
	}

// ----------------------------------------------------------------------------------
//======================================================================================================
// ========================= CREATE THE TERMS TO INSERT INTO THE CONSTRUCTOR ===========================
	def String buildCode_addParameters(String type, TermStruct term) {

		switch term {
			MaxNumberOfOperation_S: {
				return " " + term.amount + " "
			}
			MaxNumberOfOperationByTime_S: {
				return " " + term.amout + ", " + term.timeUnit + " "
			}
			MessageContent_Boolean_S: {
				var String xpath = term.xpath.addDoubleQuotesToXpath
				return " " + xpath + ", \"" + term.op + "\", " + term.content + " "
			}
			MessageContent_Number_PerTime_S: {
				var String xpath = term.xpath.addDoubleQuotesToXpath
				return " " + xpath + ", \"" + term.op + "\", " + term.amount + ", " + term.timeUnit + " "
			}
			MessageContent_Number_S: {				
				var String xpath = term.xpath.addDoubleQuotesToXpath
				return " " + xpath + ", \"" + term.op + "\", " + term.content + " "
			}
			MessageContent_onlyXPath_Boolean_S: {
				var String xpath = term.xpath.addDoubleQuotesToXpath
				return " " + xpath + " "
			}
			MessageContent_onlyXPath_Number_S: {
				var String xpath = term.xpath.addDoubleQuotesToXpath
				return " " + xpath + " "
			}
			MessageContent_onlyXPath_String_S: {
				var String xpath = term.xpath.addDoubleQuotesToXpath
				return " " + xpath + " "
			}
			MessageContent_String_S: {
				var String xpath = term.xpath.addDoubleQuotesToXpath
				return " " + xpath + ", \"" + term.op + "\", " + term.content + " "
			}
			SessionInterval_S: {
				return " " + term.duration + ", " + term.timeUnit + " "
			}
			TimeInterval_S: {
				return " " + term.start + ", " + term.end + " "
			}
			Timeout_S: {
				return " " + term.amountTime + " "
			}
			WeekDaysInterval_S: {
				return " " + term.start + ", " + term.end + " "
			}
			default: {
				return "unknown: " + term.class.simpleName
			}
		}

	}

	def String addDoubleQuotesToXpath(String xpath) {
		if (xpath.contains("/")) {
			return " \"" + xpath + "\""
		}
		return xpath
	}

//======================================================================================================
// ============================ MAPPING CLAUSES TO A HASH_MAP STRUCTURE ================================	
	def void mappingClauses(Clause c) {
		clauses.add(new ClauseStruct(counter + 1, c.name, c.rolePlayer.getName))
		addTermsIntoTheClauseMap(c.terms)
		incrementCounter;
	}

	// map the terms and the logical operators
	def void addTermsIntoTheClauseMap(ExpressionTerm exprTerm) {
		switch exprTerm {
			BinaryTermOperator: {
				addTermsIntoTheClauseMap(exprTerm.left)
				clauses.get(counter).addLogicalOperator(exprTerm.symbol)
				addTermsIntoTheClauseMap(exprTerm.right)
			}
			UnaryTermOperator: {
				clauses.get(counter).addLogicalOperator(exprTerm.symbol)
				var unary = exprTerm as UnaryTermOperator
				addTermsIntoTheClauseMap(unary.expressionTerm)
			}
			Term: {
				var term = exprTerm as Term
				var type = term.getTermType
				var TermStruct term_S = buildTheTermStruct_S(type, term)

				clauses.get(counter).addTerm(type, term_S)
			}
			ConditionalExpression: {
				println("ConditionalExpression") // fazer o tratamento para a conditional expression
			}
			default: {
				println("Unknown term type: " + exprTerm)
			}
		}
	}

	def TermStruct buildTheTermStruct_S(String typeTerm, Term term) {
		exprContent_temp.clear
		switch typeTerm {
			case "MaxNumberOfOperation_S": {
				var t = term as MaxNumberOfOperation
				return new MaxNumberOfOperation_S(t.operationsNumber)
			}
			case "MaxNumberOfOperationByTime_S": {
				var t = term as MaxNumberOfOperation
				return new MaxNumberOfOperationByTime_S(t.operationsNumber, t.perTime.timeUnit.toString.toUpperCase)
			}
			case "MessageContent_Boolean_S": {
				var t = term as MessageContent
				var String xpath = t.xpathFromMessageContent;
				var expression = t.expression.variableContent_Expression.join("") == "true" ? true : false
				return new MessageContent_Boolean_S(xpath, t.comparisonOperator.symbol, expression)
			}
			case "MessageContent_Number_PerTime_S": {
				var t = term as MessageContent
				var String xpath = t.xpathFromMessageContent;
				var expression = Integer.valueOf(t.expression.variableContent_Expression.join(""))
				return new MessageContent_Number_PerTime_S(xpath, t.comparisonOperator.symbol, expression,
					t.perTime.timeUnit.toString.toUpperCase)
			}
			case "MessageContent_Number_S": {
				var t = term as MessageContent
				var String xpath = t.xpathFromMessageContent;
				var expression = Integer.valueOf(t.expression.variableContent_Expression.join(""))
				return new MessageContent_Number_S(xpath, t.comparisonOperator.symbol, expression)

			// 'MessageContent' '(' returnType=DataType "("(content=STRING | variable=[Variable])")"
			// (comparisonOperator=ComparisonOperator expression=Expression (perTime=TimeUnitSpec)?)?  ')' 	
			}
			case "MessageContent_onlyXPath_Boolean_S": {
				var t = term as MessageContent
				var String xpath = t.xpathFromMessageContent;
				return new MessageContent_onlyXPath_Boolean_S(xpath)
			}
			case "MessageContent_onlyXPath_Number_S": {
				var t = term as MessageContent
				var String xpath = t.xpathFromMessageContent;
				return new MessageContent_onlyXPath_Number_S(xpath)
			}
			case "MessageContent_onlyXPath_String_S": {
				var t = term as MessageContent
				var String xpath = t.xpathFromMessageContent;
				return new MessageContent_onlyXPath_String_S(xpath)
			}
			case "MessageContent_String_S": {
				var t = term as MessageContent
				var String xpath = t.xpathFromMessageContent;
				var expression = t.expression.variableContent_Expression.join("")
				return new MessageContent_String_S(xpath, t.comparisonOperator.symbol, expression)
			}
			case "SessionInterval_S": {
				var t = term as SessionInterval
				return new SessionInterval_S(t.frequency, t.timeUnit.toString, t.value) // alem do value pode ser um messageContent ou uma variável
			}
			case "TimeInterval_S": {
				var t = term as TimeInterval
				return new TimeInterval_S(t.start.convertToSeconds, t.end.convertToSeconds)
			}
			case "Timeout_S": {
				var t = term as Timeout
				return new Timeout_S(t.seconds)
			}
			case "WeekDaysInterval_S": {
				var t = term as WeekDaysInterval
				return new WeekDaysInterval_S(t.start.toString, t.end.toString)
			}
			default: {
				println("unknown: " + typeTerm)
				return null;
			}
		}

	}

	def String getXpathFromMessageContent(MessageContent msgContent) {
		if (msgContent.variable !== null) {
			return msgContent.variable.name.toString
		} else if (msgContent.content !== null) {
			return msgContent.content.toString
		}
		return "Unknown"
	}

	// identify the type of the term and map from Jabuti Term to solidity struct type
	def static String getTermType(Term tm) {

		val termType = tm.eClass().getName()
		if (termType.equalsIgnoreCase("WeekDaysInterval") || termType.equalsIgnoreCase("TimeInterval") ||
			termType.equalsIgnoreCase("Timeout") || termType.equalsIgnoreCase("SessionInterval")) {
			return termType + "_S" // WeekDaysInterval | TimeInterval | Timeout | SessionInterval
		} // ================================= MaxNumberOfOperation	================================= 
		else if (termType.equalsIgnoreCase("MaxNumberOfOperation")) {
			val maxNumberOfOperation = tm as MaxNumberOfOperation

			if (maxNumberOfOperation.perTime !== null) {
				return termType + "ByTime_S" // MaxNumberOfOperationByTime
			}
			return termType + "_S" // MaxNumberOfOperation
		} // ================================= MessageContent =================================
		else if (termType.equalsIgnoreCase("MessageContent")) {

			// 'MessageContent' '(' returnType= DataType ":" (content=STRING | variable=[Variable]) (comparisonOperator=ComparisonOperator expression=Expression ('per' timeUnit=TimeUnit)?)?  ')' 
			val messageContent = tm as MessageContent

			if (messageContent.expression === null) {
				// if (messageContent.content !== null) {
				if (messageContent.returnType === DataType.TEXT) {
					return termType + "_onlyXPath_String_S" // MessageContent_onlyXPath_String
				} else if (messageContent.returnType === DataType.NUMERIC) {
					return termType + "_onlyXPath_Number_S" // MessageContent_onlyXPath_Number
				} else if (messageContent.returnType === DataType.BOOLEAN) {
					return termType + "_onlyXPath_Boolean_S" // MessageContent_onlyXPath_Boolean
				}
			} else if (messageContent.perTime === null) {
				if (messageContent.returnType === DataType.TEXT) {
					return termType + "_String_S" // MessageContent_String
				} else if (messageContent.returnType === DataType.NUMERIC) {
					return termType + "_Number_S" // MessageContent_Number
				} else if (messageContent.returnType === DataType.BOOLEAN) {
					return termType + "_Boolean_S" // MessageContent_Boolean
				}
			} else {
				if (messageContent.returnType === DataType.NUMERIC) {
					return termType + "_Number_PerTime_S" // MessageContent_Number_PerTime
				} else {
					return "//MessageContent_Number_PerTime is used only to numeric type"
				}
			}
		}
	}

//======================================================================================================
// ================================ GET THE VARIABLES FROM EXPRESSION ================================	
	def void getVariable_ExpressionType(Expression expr, String var_name) {
		exprContent_temp = newArrayList
		if (expr !== null) {
			expr.getVariableContent_Expression // neste ponto a variavel exprContent_temp recebe o conteúdo da expressão 
			variablesMap.put(var_name, new VarExpr(var_name, "unknown", exprContent_temp))

			// verify if the expression contains some logical, comparison o Negation operator			
			for (s : exprContent_temp) {
				if (comparison_symbols.contains(s) || logical_symbols.contains(s) || s.equals("!")) {
					variablesMap.get(var_name).type = "bool"
					return
				}
			}
			for (item : exprContent_temp) {
				if (item.contains("\"")) {
					variablesMap.get(var_name).type = "String"
					return
				}
			}
			variablesMap.get(var_name).type = "uint32"
			return
		}
	}

	def ArrayList<String> getVariableContent_Expression(Expression expr) {
		switch expr {
			ParenthesizedExpression: {
				exprContent_temp.add("(")
				getVariableContent_Expression(expr.expression)
				exprContent_temp.add(")")
			}
			BinaryOperator: {
				getVariableContent_Expression(expr.left)
				exprContent_temp.add(expr.symbol)
				getVariableContent_Expression(expr.right)
			}
			UnaryOperator: {
				exprContent_temp.add(expr.symbol)
				getVariableContent_Expression(expr.expression)
			}
			VariableValue: {
				exprContent_temp.add(expr.value.name)
			}
			LiteralValue: {
				if (expr instanceof StringValue) {
					var aux = expr as StringValue
					exprContent_temp.add("\"" + aux.value + "\"")
				} else if (expr instanceof NumericValue) {
					var aux = expr as NumericValue
					exprContent_temp.add(aux.value.toString)
				}
			}
			default: {
				exprContent_temp.add("unknown")
			}
		}
		// return adicionado para ser usando quando for chamado pelo função que cria termos
		return exprContent_temp
	}

// ===========================================================================================================
// ====================== GET VARIABLES BASED IN THE TERMS BLOCK)  ============================	
	def void getVariableContent_Term(Term term, String var_name) {
		if (term !== null) {
			val termType = term.getTermType // call the method to identify the type of the term
			var term_S = buildTheTermStruct_S(termType, term)
			variablesMap.put(var_name, new VarTerm(var_name, termType, term_S))
		}

	}

	def List<String> getTheTypesOfTermsInUse() {

		for (v : variablesMap.values) {
			if (v !== null) {
				if (v instanceof VarTerm) {
					val termTemp = v as VarTerm;
					if (!termsTypesInUse.contains(termTemp.type)) {
						termsTypesInUse.add(termTemp.type);
					}
				}
			}
		}

		// add the types of terms used in the clauses block
		for (cl : clauses) {
			cl.termsMap.keySet.forEach [ t |
				if (!termsTypesInUse.contains(t)) {
					termsTypesInUse.add(t);
				}
			]
		}

		return termsTypesInUse;
	}

	// ================================ General methods ============================
	def void incrementCounter() {
		counter++
	}

	def void resetCounter() {
		counter = 0;
	}

	def String removeTermSuffix(String str) {
		return str.substring(0, str.length - 2)
	}

	def long toTimestamp(String datetime) {
		val format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
		format.parse(datetime).time
	}

	def long convertToSeconds(String timeString) {
		val localTime = LocalTime.parse(timeString);
		val localDateTime = LocalDateTime.of(LocalDate.now(), localTime);
		val timestamp = Timestamp.valueOf(localDateTime);
		return timestamp.time
	}

//	def static boolean isNumeric(String str) {
//		try {
//			Integer.parseInt(str)
//			return true
//		} catch (NumberFormatException e) {
//			try {
//				Double.parseDouble(str)
//				return true
//			} catch (NumberFormatException e1) {
//				return false
//			}
//		}
//	}
// ===========================================================================================================
// ======================== METHODS PARA IMPRIMIR O CONTEUDO DAS VARIAVEIS E TERMOS ========================== 
	def void printClause() {
		clauses.forEach [ cl |
			println("termos:")
			cl.termsMap.entrySet.forEach [ entry |
				println(entry.key + " " + entry.value)
			]
			println("operadores lógicos:")
			cl.logicalOperators.forEach [ lp |
				println(lp)
			]
		]
	}

	def void printVariablesMapContent() {
		println("\n\n")
		println("----")
		variablesMap.forEach [ p1, p2 |
			if (p2 instanceof VarExpr) {
				print(p2.type + " " + p2.name + " = ")
				p2.content.forEach[p|print(" " + p.toString)]
			}
			if (p2 instanceof VarTerm) {
				(p2.term).printTermStruct
			}
			println("")
		]
		println("----")
	}

	def void printTermStruct(TermStruct term) {

		println("tipo da classe" + term.class.simpleName)

		switch term {
			MaxNumberOfOperation_S: {
				println("MaxNumberOfOperation_S")
			}
			MaxNumberOfOperationByTime_S: {
				println("MaxNumberOfOperationByTime_S")
			}
			MessageContent_Boolean_S: {
				println("MessageContent_Boolean_S")
			}
			MessageContent_Number_PerTime_S: {
				println("MessageContent_Number_PerTime_S")
			}
			MessageContent_Number_S: {
				println("MessageContent_Number_S")
			}
			MessageContent_onlyXPath_Boolean_S: {
				println("MessageContent_onlyXPath_Boolean_S")
			}
			MessageContent_onlyXPath_Number_S: {
				println("MessageContent_onlyXPath_Number_S")
			}
			MessageContent_onlyXPath_String_S: {
				println("MessageContent_onlyXPath_String_S")
			}
			MessageContent_String_S: {
				println("MessageContent_String_S")
			}
			SessionInterval_S: {
				println("SessionInterval_S")
			}
			TimeInterval_S: {
				println("TimeInterval_S")
			}
			Timeout_S: {
				println("Timeout_S")
			}
			default: {
				println("unknown: " + term.class.simpleName)
			}
		}

	}

//	def static String subTypeTer(Term tm){
//		val subTypeTermName=""
//		
//		// MessageContent
//		// SessionInterval | WeekDaysInterval | TimeInterval | Timeout | MaxNumberOfOperation | MessageContent
//		return subTypeTermName
//		
//	}
}
//				Party «ct.application.name»;
//				Party «ct.process.name»;
//				«getTerms(ct.clauses.get(0).terms)»
//				
//				
//				event «ct.clauses.get(0).name+"event"»(string _logMessage);
//				
//				constructor(address _applicationWallet, address _processWallet){
//			    	«ct.application.name» = Party("«ct.process.name» ", _applicationWallet);
//				    «ct.process.name» = Party("«ct.process.name»", _processWallet);
//				}
//				
//				function «ct.clauses.get(0).name»(uint32 _accessDateTime, string memory _xPathContent, bool _xPathResult, address _performer) public returns(bool){
//								
//					
//					bool isBreached=false;
//					
//					if(«getConditionals(ct.clauses.get(0).terms)») {
//						operationLimit.requestsPerformed+=1;
//			        	return true;	
//					}
//					
//					emit «ct.clauses.get(0).name+"event"» ("Request made outside of allowed hours or distance limit exceeded");
//					return false;
//				}
//			}
//		'''
//	}
//
//	def getTS(String date){
//		return (Timestamp.valueOf(date).getTime()/1000);
//	}
//	
//	def getTerms(Terms term){
//		'''
//			«FOR c: term.eAllContents.toIterable»
//				«IF(c instanceof Timeout)»
//					Timeout public timeout = Timeout(«c.seconds», 0);
//				«ELSEIF(c instanceof WeekDaysInterval)»
//					WeekDaysInterval public weekDaysInterval = WeekDaysInterval(«c.start», «c.end»);
//				«ELSEIF(c instanceof TimeInterval)»
//					TimeInterval public timeInterval = TimeInterval(«c.start», «c.end»);
//				«ELSEIF(c instanceof MaxNumberOfOperation)»
//					MaxNumberOfOperation public maxNumberOfOperation = MaxNumberOfOperation(«c.operationsNumber», «c.timeUnit», 0, 0);
//				«ELSEIF(c instanceof MessageContent)»
//					MessageContent public messageContent = MessageContent("«c.content»");
//				«ENDIF»
//			«ENDFOR»
//		'''
//	}
//	
//	def getConditionals(Terms terms){
//		'''	
//		«FOR c: terms.eAllContents.toIterable»
//			«IF(c instanceof Timeout)»
//				!isTimeout(_accessDateTime, timeout.endTime) &&
//			«ELSEIF(c instanceof WeekDaysInterval)»
//				isBusinessDay(_accessDateTime, businessDay) &&
//			«ELSEIF(c instanceof TimeInterval)»
//				isIntoTimeInterval(_accessDateTime, timeInterval) &&
//			«ELSEIF(c instanceof MaxNumberOfOperation)»
//				!isOperationLimitReached(_accessDateTime, operationLimit) &&
//			«ENDIF»
//		«ENDFOR»
//		'''
//}
