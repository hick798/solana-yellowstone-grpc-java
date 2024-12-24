// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: geyser.proto

package geyser;

/**
 * Protobuf type {@code geyser.GetBlockHeightResponse}
 */
public final class GetBlockHeightResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:geyser.GetBlockHeightResponse)
    GetBlockHeightResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetBlockHeightResponse.newBuilder() to construct.
  private GetBlockHeightResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetBlockHeightResponse() {
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetBlockHeightResponse();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return GeyserOuterClass.internal_static_geyser_GetBlockHeightResponse_descriptor;
  }

  @Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return GeyserOuterClass.internal_static_geyser_GetBlockHeightResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            GetBlockHeightResponse.class, Builder.class);
  }

  public static final int BLOCK_HEIGHT_FIELD_NUMBER = 1;
  private long blockHeight_;
  /**
   * <code>uint64 block_height = 1;</code>
   * @return The blockHeight.
   */
  @Override
  public long getBlockHeight() {
    return blockHeight_;
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (blockHeight_ != 0L) {
      output.writeUInt64(1, blockHeight_);
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (blockHeight_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, blockHeight_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof GetBlockHeightResponse)) {
      return super.equals(obj);
    }
    GetBlockHeightResponse other = (GetBlockHeightResponse) obj;

    if (getBlockHeight()
        != other.getBlockHeight()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + BLOCK_HEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBlockHeight());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static GetBlockHeightResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static GetBlockHeightResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static GetBlockHeightResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static GetBlockHeightResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static GetBlockHeightResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static GetBlockHeightResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static GetBlockHeightResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static GetBlockHeightResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static GetBlockHeightResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static GetBlockHeightResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static GetBlockHeightResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static GetBlockHeightResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(GetBlockHeightResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code geyser.GetBlockHeightResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:geyser.GetBlockHeightResponse)
      GetBlockHeightResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return GeyserOuterClass.internal_static_geyser_GetBlockHeightResponse_descriptor;
    }

    @Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return GeyserOuterClass.internal_static_geyser_GetBlockHeightResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              GetBlockHeightResponse.class, Builder.class);
    }

    // Construct using geyser.GetBlockHeightResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @Override
    public Builder clear() {
      super.clear();
      blockHeight_ = 0L;

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return GeyserOuterClass.internal_static_geyser_GetBlockHeightResponse_descriptor;
    }

    @Override
    public GetBlockHeightResponse getDefaultInstanceForType() {
      return GetBlockHeightResponse.getDefaultInstance();
    }

    @Override
    public GetBlockHeightResponse build() {
      GetBlockHeightResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public GetBlockHeightResponse buildPartial() {
      GetBlockHeightResponse result = new GetBlockHeightResponse(this);
      result.blockHeight_ = blockHeight_;
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof GetBlockHeightResponse) {
        return mergeFrom((GetBlockHeightResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(GetBlockHeightResponse other) {
      if (other == GetBlockHeightResponse.getDefaultInstance()) return this;
      if (other.getBlockHeight() != 0L) {
        setBlockHeight(other.getBlockHeight());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              blockHeight_ = input.readUInt64();

              break;
            } // case 8
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private long blockHeight_ ;
    /**
     * <code>uint64 block_height = 1;</code>
     * @return The blockHeight.
     */
    @Override
    public long getBlockHeight() {
      return blockHeight_;
    }
    /**
     * <code>uint64 block_height = 1;</code>
     * @param value The blockHeight to set.
     * @return This builder for chaining.
     */
    public Builder setBlockHeight(long value) {
      
      blockHeight_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 block_height = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBlockHeight() {
      
      blockHeight_ = 0L;
      onChanged();
      return this;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:geyser.GetBlockHeightResponse)
  }

  // @@protoc_insertion_point(class_scope:geyser.GetBlockHeightResponse)
  private static final GetBlockHeightResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new GetBlockHeightResponse();
  }

  public static GetBlockHeightResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetBlockHeightResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetBlockHeightResponse>() {
    @Override
    public GetBlockHeightResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<GetBlockHeightResponse> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<GetBlockHeightResponse> getParserForType() {
    return PARSER;
  }

  @Override
  public GetBlockHeightResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

