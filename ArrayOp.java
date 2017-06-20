class ArrayOp{
	public static void main(String[] args){
		if(args.length!=3){
			System.out.println("usage : java ArrayOp num1 OP(+,-,"*",/) num2");
			System.exit(0);
		}
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[2]);
		char op = args[1].charAt(0);
		//converting String input values to integer and char

		int result = 0;//init

		switch(op){

			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			case '*':
				result = num1 * num2;
				break;		
		}
	System.out.println("result : "+result);

	} 




		
	}
