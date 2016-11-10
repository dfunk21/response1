package com.company;

/**
 * Created by df377 on 11/10/16.
 */
public class Code {
    private String myCode;
    public String modCode;

    public Code(String code)
    {
        myCode = code;
    }

    public String getCode()
    {
        return myCode;
        for (int i = 0; i <= myCode.length(); i++) {
            modCode = modCode + "X";
        }
    }

    public void hide (int p1, int p2)
    {
        if(p1 >= 0 && p1 < p2 && p2 <= myCode.length()) {
            myCode = 
        }
    }

    public void recover(int p1 , int p2)
    {

    }
}
