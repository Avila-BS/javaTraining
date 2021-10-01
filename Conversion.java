class Conversion{
	public static void main(String[] args)
	{
		//examples to convert string into byte
		//1
        String daysInALeapYearMonth="29";
        byte convertedDaysInALeapYear=Byte.parseByte(daysInALeapYearMonth);
		System.out.println(convertedDaysInALeapYear);
		
		//2
		String noOfDaysInAWeek="7";
		byte convertedNoOfDaysInAWeek=Byte.parseByte(noOfDaysInAWeek);
		System.out.println(convertedNoOfDaysInAWeek);
		
		//3
		String statesInIndia="29";
		byte convertedStatesInIndia=Byte.parseByte(statesInIndia);
		System.out.println(convertedStatesInIndia);
		
		//4
		String unionTerritoriesInIndia="7";
		byte convertedUnionTerritoriesInIndia=Byte.parseByte(unionTerritoriesInIndia);
		System.out.println(convertedUnionTerritoriesInIndia);
		
		//5
		String birthDate="12";
		byte convertedBirthDate=Byte.parseByte(birthDate);
		System.out.println(convertedBirthDate);
		System.out.println("===============================================");
		
		// Examples to convert String into short
		//1
		String carNumber="8647";
		short convertedCarNumber=Short.parseShort(carNumber);
		System.out.println(convertedCarNumber);
		
		//2
		String priceOfTelevision="20000";
		short convertedPriceOfTelevision=Short.parseShort(priceOfTelevision);
		System.out.println(convertedPriceOfTelevision);
		
		//3
		String receiptNumber="5147";
		short convertReceiptNumber=Short.parseShort(receiptNumber);
		System.out.println(convertReceiptNumber);
		
		//4
		String code="733";
		short convertedCode=Short.parseShort(code);
		System.out.println(convertedCode+convertedBirthDate);
		//5
		String year="2021";
		short convertedYear=Short.parseShort(year);
		System.out.println(convertedYear);
		
		System.out.println("======================================");
		
		//Examples to convert String into int
		
		String quantityOfRice="25";
		int convertedQuantityOfRice=Integer.parseInt(quantityOfRice);
		System.out.println(convertedQuantityOfRice);
		
		String pinCode="571218";
		int convertedPinCode=Integer.parseInt(pinCode);
		System.out.println(convertedPinCode);
		
		String population="1366400000";
		int convertedPopulation=Integer.parseInt(population);
		System.out.println(convertedPopulation+convertedQuantityOfRice);
		
		String datas="100";
		int convertedDatas=Integer.parseInt(datas);
		System.out.println(convertedDatas);
		
		String vowels="5";
		int convertedVowels=Integer.parseInt(vowels);
		System.out.println(convertedVowels);
		
		System.out.println("=======================================");
		
		//Examples to convert string into long
		
		String mobNum="9535536335";
		long convertedMobNum=Long.parseLong(mobNum);
		System.out.println(convertedMobNum);
		
		String aadharNum="834656476543";
		long convertedAadharNum=Long.parseLong(aadharNum);
		System.out.println(convertedAadharNum);
		
		String consonants="21";
		long convertedConsonants=Long.parseLong(consonants);
		System.out.println(convertedConsonants);
		
		String priceOfMob="30000";
		long convertedPriceOfMob=Long.parseLong(priceOfMob);
		System.out.println(convertedPriceOfMob);
		
		String birthYear="1999";
		long convertedBirthYear=Long.parseLong(birthYear);
		System.out.println(convertedBirthYear);
		
		System.out.println("====================================");
		
		//Examples to convert string into float
		
		String weight="48.90";
		float convertedWeight=Float.parseFloat(weight);
		System.out.println(convertedWeight);
		
		String pi="3.14515";
		float convertedPi=Float.parseFloat(pi);
		System.out.println(convertedPi);
		
		String penPrice="12.01";
		float convertedPenPrice=Float.parseFloat(penPrice);
		System.out.println(convertedPenPrice);
		
		String cgpa="8.34";
		float convertedCgpa=Float.parseFloat(cgpa);
		System.out.println(convertedCgpa);
		
		String percentage="78.65";
		float convertedPercentage=Float.parseFloat(percentage);
		System.out.println(convertedPercentage);
		
		System.out.println("======================================");
		//Examples to convert string into double
		
		String rootTwo="1.414213562373";
		double convertedRootTwo=Double.parseDouble(rootTwo);
		System.out.println(convertedRootTwo);
		
		String decimal="6.545363535866";
		double convertedDecimal=Double.parseDouble(decimal);
		System.out.println(convertedDecimal);
		
		String time="18.12";
		double convertedTime=Double.parseDouble(time);
		System.out.println(convertedTime);
		
		String rating="8.5";
		double convertedRating=Double.parseDouble(rating);
		System.out.println(convertedRating);
		
		String overs="18.2";
		double convertedOvers=Double.parseDouble(overs);
		System.out.println(convertedOvers);
		System.out.println("=====================================");
		
		//Examples to convert String into char
		
		String grade="A";
		char convertedGrade=grade.charAt(0);
		System.out.println(convertedGrade);
		
		String option="v";
		char convertedOption=option.charAt(0);
		System.out.println(convertedOption);
		
		String specialChar="i";
		char convertedSymbol=specialChar.charAt(0);
		System.out.println(convertedSymbol);
		
		String number="108";
		char convertedNumber=(char)Integer.parseInt(number);
		System.out.println(convertedNumber);
		
		String letter="a";
		char convertedLetter=letter.charAt(0);
		System.out.println(convertedLetter);
		System.out.println("=================================");
		
		//Examples to convert String into boolean
		
		String onLight="true";
		boolean convertedOnLight=Boolean.parseBoolean(onLight);
		System.out.println(convertedOnLight);
		
		String switchOn="false";
		boolean convertedSwitchOn=Boolean.parseBoolean(switchOn);
		System.out.println(convertedSwitchOn);
		
		String holiday="true";
		boolean convertedHoliday=Boolean.parseBoolean(holiday);
		System.out.println(convertedHoliday);
		
		String wednesday="false";
		boolean convertWednesday=Boolean.parseBoolean(wednesday);
		System.out.println(convertWednesday);
		
		String power="true";
		boolean convertedPower=Boolean.parseBoolean(power);
		System.out.println(convertedPower);
		
		
		System.out.println("=================================");
		
		
		
		System.out.println("======================================");
	}
}