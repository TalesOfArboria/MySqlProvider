package com.jcwhatever.nucleus.providers.mysql.data.bytes;

import com.jcwhatever.nucleus.providers.mysql.data.AbstractDataType;
import com.jcwhatever.nucleus.utils.PreCon;

/*
 * 
 */
public class VarChar extends AbstractDataType {

    private final int _size;

    public VarChar (int size) {
        PreCon.positiveNumber(size);

        _size = size;
    }

    @Override
    public String getName() {
        return "VARCHAR";
    }

    @Override
    public int size() {
        return _size;
    }

    @Override
    public Class<?> getDataClass() {
        return String.class;
    }
}
