public class Sintatico {

	private String lastToken = ".";

	/**
	 * Verificador simples baseado em PL/0 de Nikolas Wirth
	 */

	public Sintatico() {
		if (isProgram())
			success();
		else
			syntaxError("Program");
	}

	/**
	 * Rotinas de verificacao conforme os diagramas de sintaxe
	 */

	private boolean isProgram() {
		if (isBlock()) {
			if (getToken().equals(".")) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	private boolean isCondition() {
		String condition = getToken();

		if (condition.equals("ODD")) {
			if (isExpression()) {
				return true;
			}
		}

		if (isExpression()) {
			if (condition.equals("=") || condition.equals("#")
					|| condition.equals("<") || condition.equals("<=")
					|| condition.equals(">") || condition.equals(">=")) {
				if (isExpression()) {
					return true;
				}
			}
		}

		return false;
	}

	private boolean isExpression() {
		String expression = getToken();
		
		if(expression.equals("+") || expression.equals("-")) {
			if(isTerm()) {
				return true;
			}
		}
		
		return false;
	}

	private boolean isTerm() {
		String term = getToken();
		
		if(isFactor()) {
			return true;
		}
		
		if(term.equals("*") || term.equals("/")) {
			if(isFactor()) {
				return true;
			}
		}
		
		return false;
	}

	private boolean isFactor() {
		String factor = getToken();
		
		if(isIdent()) {
			return true;
		}
		
		if(isNumber()) {
			return true;
		}
		
		if(factor.equals("(")) {
			if(isExpression()) {
				if(factor.equals(")")) {
					return true;
				}
			}
		}
		
		return false;
	}

	private boolean isBlock() {
		String block = getToken();

		if (block.equals("CONST")) {
			if (isIdent()) {
				if (isNumber()) {
					if(block.equals(";") || block.equals(",")) {
						return true;
					}
				}
			}
		}

		if (block.equals("VAR")) {
			if (isIdent()) {
				if(block.equals(";") || block.equals(",")) {
					return true;
				}
			}
		}

		if (block.equals("PROCEDURE")) {
			if (isIdent()) {
				if(block.equals(";")) {
					if(isBlock()) {
						if(block.equals(";")) {
							return true;
						}
					}
				}
			}
		}

		if (isStatement()) {
			return true;
		}

		return false;
	}

	private boolean isStatement() {
		String statement = getToken();

		if (isIdent()) {
			if(statement.equals(":=")) {
				if (isExpression()) {
					return true;
				}				
			}
		}

		if (statement.equals("CALL")) {
			if (isIdent()) {
				return true;
			}
		}
		
		if(statement.equals("BEGIN")) {
			if(isStatement()) {
				if(statement.equals(";")) {
					if(isStatement()){
						return true;
					}
				} else {
					if(statement.equals("END")) {
						return true;
					}
				}
			}
		}

		if (statement.equals("IF")) {
			if (isCondition()) {
				if (statement.equals("THEN")) {
					if (isStatement()) {
						return true;
					}
				}
			}
		}

		if (statement.equals("WHILE")) {
			if (isCondition()) {
				if (statement.equals("DO")) {
					if (isStatement()) {
						return true;
					}
				}
			}
		}

		return false;
	}

	/**
	 * Rotinas adicionais necessarias
	 */

	private boolean isIdent() {
		return true;
	}

	private boolean isNumber() {
		try {
			Integer i = Integer.valueOf(getToken());
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	/**
	 * Devolucao do proximo token do codigo fonte analisado
	 */

	private String getToken() {
		lastToken = "";

		return lastToken;
	}

	/**
	 * Mensagens em console
	 */

	private void syntaxError(String msg) {
		System.out.println("Erro de sintaxe. [" + msg + "] esperado. ["
				+ lastToken + "] encontrado.");

		System.exit(0); // nao continuar a verificar, pois um erro jah foi
						// encontrado
	}

	private void success() {
		System.out
				.println("Codigo fonte verificado. Erros nao foram encontrados.");
	}

	/**
	 * Programa principal
	 */

	public static void main(String args[]) {
		new Sintatico();
	}
}