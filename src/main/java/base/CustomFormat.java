package base;

import java.beans.PropertyEditorSupport;

public class CustomFormat extends PropertyEditorSupport {

    @Override
    public void setAsText(String str) {

        Boolean check = str.matches("\\d+\\.?(\\d+)?");
        if (str.equals("") || !check)
            setValue(0.0d);
        else
            setValue(Double.parseDouble(str));
    }


    }