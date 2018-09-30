package org.eureka.client.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
*@author   created by hanzhuofan  2018.09.29
*/
public class Regex {

	public static void main(String[] args) {
		String summaryString = "兑换周卡100张，兑换月卡10张，兑换季卡1张 1 cat cat cat cattie cat";
		String regEx = "(\\D*)(\\d+)(.*)";
		Pattern pattern = Pattern.compile(regEx);
		Matcher matcher = pattern.matcher(summaryString);
		int count = 0;
		int countall = matcher.groupCount()+1;
		System.out.println(countall);
		while (matcher.find( )) {
			count++;
			System.out.println(count);
			System.out.println(matcher.start());
			System.out.println(matcher.end());
			for (int i = 0; i <countall ; i++) {
                System.out.println(String.format("第%s组的结果是:%s",i+1,matcher.group(i)));
            }
		}
		if (!matcher.find( )) {
			System.out.println("NO MATCH CARD");
		}
	}
}
