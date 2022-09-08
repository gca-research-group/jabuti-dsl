/**
 * generated by Xtext 2.25.0
 */
package br.edu.unijui.gca.smartce.generator;

import br.edu.unijui.gca.smartce.smartCE.BusinessDay;
import br.edu.unijui.gca.smartce.smartCE.Condition;
import br.edu.unijui.gca.smartce.smartCE.Contract;
import br.edu.unijui.gca.smartce.smartCE.MessageContent;
import br.edu.unijui.gca.smartce.smartCE.OperationLimit;
import br.edu.unijui.gca.smartce.smartCE.TimeInterval;
import br.edu.unijui.gca.smartce.smartCE.TimeUnit;
import br.edu.unijui.gca.smartce.smartCE.Timeout;
import br.edu.unijui.gca.smartce.smartCE.WeekDay;
import com.google.common.collect.Iterators;
import java.sql.Timestamp;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class SmartCEGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<Contract> _iterable = IteratorExtensions.<Contract>toIterable(Iterators.<Contract>filter(resource.getAllContents(), Contract.class));
    for (final Contract c : _iterable) {
      String _name = c.getName();
      String _plus = (_name + ".sol");
      fsa.generateFile(_plus, this.generateSolCode(c));
    }
  }
  
  public CharSequence generateSolCode(final Contract c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("//SPDX-License-Identifier: MIT");
    _builder.newLine();
    _builder.append("pragma solidity ^0.8.14;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import \"./libs/EAI_Domain.sol\";");
    _builder.newLine();
    _builder.newLine();
    _builder.append("contract ");
    String _name = c.getName();
    _builder.append(_name);
    _builder.append(" is EAI_Domain{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Party ");
    String _name_1 = c.getApplication().getName();
    _builder.append(_name_1, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("Party ");
    String _name_2 = c.getProcess().getName();
    _builder.append(_name_2, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _conditions = this.getConditions(c.getClauses().get(0).getCondition());
    _builder.append(_conditions, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("event ");
    String _name_3 = c.getClauses().get(0).getOnBreach().getAction().getName();
    _builder.append(_name_3, "\t");
    _builder.append("(string _logMessage);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("constructor(address _applicationWallet, address _processWallet){");
    _builder.newLine();
    _builder.append("    \t");
    String _name_4 = c.getApplication().getName();
    _builder.append(_name_4, "    \t");
    _builder.append(" = Party(\"");
    String _description = c.getProcess().getDescription();
    _builder.append(_description, "    \t");
    _builder.append(" \", _applicationWallet);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t    ");
    String _name_5 = c.getProcess().getName();
    _builder.append(_name_5, "\t    ");
    _builder.append(" = Party(\"");
    String _description_1 = c.getProcess().getDescription();
    _builder.append(_description_1, "\t    ");
    _builder.append("\", _processWallet);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("function ");
    String _name_6 = c.getClauses().get(0).getName();
    _builder.append(_name_6, "\t");
    _builder.append("(uint32 _accessDateTime, string memory _xPathContent, bool _xPathResult, address _performer) public returns(bool){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("bool isBreached=false;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if(");
    CharSequence _conditionals = this.getConditionals(c.getClauses().get(0).getCondition());
    _builder.append(_conditionals, "\t\t");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("operationLimit.requestsPerformed+=1;");
    _builder.newLine();
    _builder.append("        \t");
    _builder.append("return true;\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("emit ");
    String _name_7 = c.getClauses().get(0).getOnBreach().getAction().getName();
    _builder.append(_name_7, "\t\t");
    _builder.append(" (\"Request made outside of allowed hours or distance limit exceeded\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public long getTS(final String date) {
    long _time = Timestamp.valueOf(date).getTime();
    return (_time / 1000);
  }
  
  public CharSequence getConditions(final Condition condition) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(condition.eAllContents());
      for(final EObject c : _iterable) {
        {
          if ((c instanceof Timeout)) {
            _builder.append("Timeout public timeout = Timeout(");
            String _value = ((Timeout)c).getValue();
            _builder.append(_value);
            _builder.append(", 0);");
            _builder.newLineIfNotEmpty();
          } else {
            if ((c instanceof BusinessDay)) {
              _builder.append("BusinessDay public businessDay = BusinessDay(");
              WeekDay _start = ((BusinessDay)c).getStart();
              _builder.append(_start);
              _builder.append(", ");
              WeekDay _end = ((BusinessDay)c).getEnd();
              _builder.append(_end);
              _builder.append(");");
              _builder.newLineIfNotEmpty();
            } else {
              if ((c instanceof TimeInterval)) {
                _builder.append("TimeInterval public timeInterval = TimeInterval(");
                String _start_1 = ((TimeInterval)c).getStart();
                _builder.append(_start_1);
                _builder.append(", ");
                String _end_1 = ((TimeInterval)c).getEnd();
                _builder.append(_end_1);
                _builder.append(");");
                _builder.newLineIfNotEmpty();
              } else {
                if ((c instanceof OperationLimit)) {
                  _builder.append("OperationLimit public operationLimit = OperationLimit(");
                  int _operationsNumber = ((OperationLimit)c).getOperationsNumber();
                  _builder.append(_operationsNumber);
                  _builder.append(", ");
                  TimeUnit _timeUnit = ((OperationLimit)c).getTimeUnit();
                  _builder.append(_timeUnit);
                  _builder.append(", 0, 0);");
                  _builder.newLineIfNotEmpty();
                } else {
                  if ((c instanceof MessageContent)) {
                    _builder.append("MessageContent public messageContent = MessageContent(\"");
                    String _content = ((MessageContent)c).getContent();
                    _builder.append(_content);
                    _builder.append("\");");
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence getConditionals(final Condition condition) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(condition.eAllContents());
      for(final EObject c : _iterable) {
        {
          if ((c instanceof Timeout)) {
            _builder.append("!isTimeout(_accessDateTime, timeout.endTime) &&");
            _builder.newLine();
          } else {
            if ((c instanceof BusinessDay)) {
              _builder.append("isBusinessDay(_accessDateTime, businessDay) &&");
              _builder.newLine();
            } else {
              if ((c instanceof TimeInterval)) {
                _builder.append("isIntoTimeInterval(_accessDateTime, timeInterval) &&");
                _builder.newLine();
              } else {
                if ((c instanceof OperationLimit)) {
                  _builder.append("!isOperationLimitReached(_accessDateTime, operationLimit) &&");
                  _builder.newLine();
                }
              }
            }
          }
        }
      }
    }
    return _builder;
  }
}
