package kr.or.ytc.mychat.team2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class SlangFilter {
	private static Map<String, String> slangList = new HashMap<>();
	
	static {
		slangList.put("»õ³¢", "°­¾ÆÁö");
		slangList.put("¤µ¤²", "»ç¶ûÇØ");
	}

	private SlangFilter() {}

	private static void replaceAll(StringBuilder builder, String from, String to)
	{
	    int index = builder.indexOf(from);
	    while (index != -1)
	    {
	        builder.replace(index, index + from.length(), to);
	        index += to.length(); 
	        index = builder.indexOf(from, index);
	    }
	}
	
	public static String purify(String str) {
		StringBuilder sb = new StringBuilder(str);
		
		Iterator<String> it = slangList.keySet().iterator();
		
		while (it.hasNext()) {
			String slang = it.next();
			if(sb.indexOf(slang) != -1) { 
				replaceAll(sb, slang, slangList.get(slang));
			}
		}
		return sb.toString();
	}
}
