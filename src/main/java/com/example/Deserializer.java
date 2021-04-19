package com.example;

import org.apache.avro.io.DecoderFactory;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Deserializer<T> {
    private static final Logger log = LogManager.getLogger();

    public T deserialize(byte[] bytes, Class<T> type) throws IOException {
        T env = new SpecificDatumReader<>(type).read(null, DecoderFactory.get().directBinaryDecoder(new ByteArrayInputStream(bytes), null));
        log.debug("deserialized envelope: " + env);
        return env;
    }
}
