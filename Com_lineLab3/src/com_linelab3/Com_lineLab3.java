package com_linelab3;

public class Com_lineLab3 {

    public static void main(String[] args) {
        
        //ComLineParserBase as = new ComLineParserBase(new String[]{"?","r","w" },new String[]{"/","-"});
        SimpleParser as;
        as = new SimpleParser();
        as.Parse(args);
        System.out.println(as.getInFile());
        System.out.println(as.getOutFile());
    }
    
}
