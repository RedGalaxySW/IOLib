/*
 * Copyright (c) 2019 RedGalaxySW
 * Licensed under Apache Licence 2.0
 */

package net.rgsw.io.tag;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.function.Supplier;

public interface TagFormat {
    void writeID( Tag tag, DataOutput out ) throws IOException;
    void writeEnd( DataOutput out ) throws IOException;
    Supplier<Tag> constructor( DataInput input ) throws IOException;
    default Tag tag( DataInput input ) throws IOException {
        return constructor( input ).get();
    }
}
