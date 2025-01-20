public static String reverseSubstring(String input){
	
	StringBuilder output = new StringBuilder();

	for(int i = 0; i < input.length(); i++) {

		if(input.charAt(i) == '(') {

			//append open parentheses
			output.append(input.charAt(i));
			//find matched closed parentheses
			int closedParentheses = input.indexOf(')', i);
			//reverse substring
			StringBuilder stringToBeReversed = new StringBuilder(input.substring(i + 1, closedParentheses));
			output.append(stringToBeReversed.reverse());
			i = closedParentheses;
			//append closed parentheses
			output.append(input.charAt(i));
		} else {

			output.append(input.charAt(i));
		}
	}
	return output.toString();
}