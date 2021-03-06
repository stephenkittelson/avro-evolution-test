/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package da.envelope;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class envelope extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 409540356564224368L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"envelope\",\"namespace\":\"da.envelope\",\"fields\":[{\"name\":\"schema_id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"error_msg\",\"type\":\"string\",\"default\":\"\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<envelope> ENCODER =
      new BinaryMessageEncoder<envelope>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<envelope> DECODER =
      new BinaryMessageDecoder<envelope>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<envelope> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<envelope> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<envelope> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<envelope>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this envelope to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a envelope from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a envelope instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static envelope fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.CharSequence schema_id;
   private java.lang.CharSequence name;
   private java.lang.CharSequence error_msg;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public envelope() {}

  /**
   * All-args constructor.
   * @param schema_id The new value for schema_id
   * @param name The new value for name
   * @param error_msg The new value for error_msg
   */
  public envelope(java.lang.CharSequence schema_id, java.lang.CharSequence name, java.lang.CharSequence error_msg) {
    this.schema_id = schema_id;
    this.name = name;
    this.error_msg = error_msg;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return schema_id;
    case 1: return name;
    case 2: return error_msg;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: schema_id = (java.lang.CharSequence)value$; break;
    case 1: name = (java.lang.CharSequence)value$; break;
    case 2: error_msg = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'schema_id' field.
   * @return The value of the 'schema_id' field.
   */
  public java.lang.CharSequence getSchemaId() {
    return schema_id;
  }


  /**
   * Sets the value of the 'schema_id' field.
   * @param value the value to set.
   */
  public void setSchemaId(java.lang.CharSequence value) {
    this.schema_id = value;
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }


  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'error_msg' field.
   * @return The value of the 'error_msg' field.
   */
  public java.lang.CharSequence getErrorMsg() {
    return error_msg;
  }


  /**
   * Sets the value of the 'error_msg' field.
   * @param value the value to set.
   */
  public void setErrorMsg(java.lang.CharSequence value) {
    this.error_msg = value;
  }

  /**
   * Creates a new envelope RecordBuilder.
   * @return A new envelope RecordBuilder
   */
  public static da.envelope.envelope.Builder newBuilder() {
    return new da.envelope.envelope.Builder();
  }

  /**
   * Creates a new envelope RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new envelope RecordBuilder
   */
  public static da.envelope.envelope.Builder newBuilder(da.envelope.envelope.Builder other) {
    if (other == null) {
      return new da.envelope.envelope.Builder();
    } else {
      return new da.envelope.envelope.Builder(other);
    }
  }

  /**
   * Creates a new envelope RecordBuilder by copying an existing envelope instance.
   * @param other The existing instance to copy.
   * @return A new envelope RecordBuilder
   */
  public static da.envelope.envelope.Builder newBuilder(da.envelope.envelope other) {
    if (other == null) {
      return new da.envelope.envelope.Builder();
    } else {
      return new da.envelope.envelope.Builder(other);
    }
  }

  /**
   * RecordBuilder for envelope instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<envelope>
    implements org.apache.avro.data.RecordBuilder<envelope> {

    private java.lang.CharSequence schema_id;
    private java.lang.CharSequence name;
    private java.lang.CharSequence error_msg;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(da.envelope.envelope.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.schema_id)) {
        this.schema_id = data().deepCopy(fields()[0].schema(), other.schema_id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.error_msg)) {
        this.error_msg = data().deepCopy(fields()[2].schema(), other.error_msg);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing envelope instance
     * @param other The existing instance to copy.
     */
    private Builder(da.envelope.envelope other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.schema_id)) {
        this.schema_id = data().deepCopy(fields()[0].schema(), other.schema_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.error_msg)) {
        this.error_msg = data().deepCopy(fields()[2].schema(), other.error_msg);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'schema_id' field.
      * @return The value.
      */
    public java.lang.CharSequence getSchemaId() {
      return schema_id;
    }


    /**
      * Sets the value of the 'schema_id' field.
      * @param value The value of 'schema_id'.
      * @return This builder.
      */
    public da.envelope.envelope.Builder setSchemaId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.schema_id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'schema_id' field has been set.
      * @return True if the 'schema_id' field has been set, false otherwise.
      */
    public boolean hasSchemaId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'schema_id' field.
      * @return This builder.
      */
    public da.envelope.envelope.Builder clearSchemaId() {
      schema_id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return name;
    }


    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public da.envelope.envelope.Builder setName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.name = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public da.envelope.envelope.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'error_msg' field.
      * @return The value.
      */
    public java.lang.CharSequence getErrorMsg() {
      return error_msg;
    }


    /**
      * Sets the value of the 'error_msg' field.
      * @param value The value of 'error_msg'.
      * @return This builder.
      */
    public da.envelope.envelope.Builder setErrorMsg(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.error_msg = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'error_msg' field has been set.
      * @return True if the 'error_msg' field has been set, false otherwise.
      */
    public boolean hasErrorMsg() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'error_msg' field.
      * @return This builder.
      */
    public da.envelope.envelope.Builder clearErrorMsg() {
      error_msg = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public envelope build() {
      try {
        envelope record = new envelope();
        record.schema_id = fieldSetFlags()[0] ? this.schema_id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.error_msg = fieldSetFlags()[2] ? this.error_msg : (java.lang.CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<envelope>
    WRITER$ = (org.apache.avro.io.DatumWriter<envelope>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<envelope>
    READER$ = (org.apache.avro.io.DatumReader<envelope>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.schema_id);

    out.writeString(this.name);

    out.writeString(this.error_msg);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.schema_id = in.readString(this.schema_id instanceof Utf8 ? (Utf8)this.schema_id : null);

      this.name = in.readString(this.name instanceof Utf8 ? (Utf8)this.name : null);

      this.error_msg = in.readString(this.error_msg instanceof Utf8 ? (Utf8)this.error_msg : null);

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.schema_id = in.readString(this.schema_id instanceof Utf8 ? (Utf8)this.schema_id : null);
          break;

        case 1:
          this.name = in.readString(this.name instanceof Utf8 ? (Utf8)this.name : null);
          break;

        case 2:
          this.error_msg = in.readString(this.error_msg instanceof Utf8 ? (Utf8)this.error_msg : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










