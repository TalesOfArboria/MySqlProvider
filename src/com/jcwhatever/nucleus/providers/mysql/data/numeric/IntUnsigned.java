package com.jcwhatever.nucleus.providers.mysql.data.numeric;

import com.jcwhatever.nucleus.providers.mysql.data.AbstractDataType;

/*
 * 
 */
public class IntUnsigned  extends AbstractDataType {

    @Override
    public String getName() {
        return "INT UNSIGNED";
    }

    @Override
    public Class<?> getDataClass() {
        return long.class;
    }
}
