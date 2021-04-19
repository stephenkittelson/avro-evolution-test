package com.example;

import org.apache.avro.Schema;
import org.apache.avro.io.BinaryEncoder;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.io.EncoderFactory;
import org.apache.avro.specific.SpecificDatumWriter;
import org.apache.avro.specific.SpecificRecord;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class DeserializerTest {

    @Test
    public void deserialize_v1WithV1_nameMatches() throws IOException {
        byte[] rawBytes = serializeMessage(v1.da.envelope.envelope.newBuilder()
                .setSchemaId("mySchema.v1")
                .setName("John Doe")
                .build(), v1.da.envelope.envelope.getClassSchema());
        v1.da.envelope.envelope deserialized = new Deserializer<v1.da.envelope.envelope>().deserialize(rawBytes, v1.da.envelope.envelope.class);
        Assertions.assertEquals("John Doe", deserialized.getName().toString(), "name should match");
    }

    @Test
    public void deserialize_v1WithV2_nameMatches() throws IOException {
        byte[] rawBytes = serializeMessage(v1.da.envelope.envelope.newBuilder()
                .setSchemaId("mySchema.v1")
                .setName("John Doe")
                .build(), v1.da.envelope.envelope.getClassSchema());
        da.envelope.envelope deserialized = new Deserializer<da.envelope.envelope>().deserialize(rawBytes, da.envelope.envelope.class);
        Assertions.assertEquals("John Doe", deserialized.getName().toString(), "name should match");
    }

    public static byte[] serializeMessage(SpecificRecord message, Schema schema) throws IOException {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        BinaryEncoder encoder = EncoderFactory.get().directBinaryEncoder(outputStream, null);
        DatumWriter<Object> writer = new SpecificDatumWriter<>(schema);
        writer.write(message, encoder);
        encoder.flush();
        return outputStream.toByteArray();
    }
}
